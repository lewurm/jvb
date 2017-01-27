package gd.twohundred.jvb;

public class VirtualBoy implements Emulable {
    private final CPU cpu;
    private final HardwareTimer timer;
    private final VirtualImageProcessor vip;
    private final VirtualSoundUnit vsu;

    public VirtualBoy(Screen screen, CartridgeROM rom) {
        timer = new HardwareTimer();
        vip = new VirtualImageProcessor(screen);
        vsu = new VirtualSoundUnit();
        HardwareControlRegisters controlRegisters = new HardwareControlRegisters(timer);
        Bus bus = new Bus(rom, null, vip, controlRegisters, vsu);
        cpu = new CPU(bus);
    }

    @Override
    public int tick(int targetCycles) {
        int cycles = 0;
        while (cycles < targetCycles) {
            int actualCycles = cpu.tick(targetCycles);
            timer.tickExact(actualCycles);
            vip.tickExact(actualCycles);
            vsu.tickExact(actualCycles);
            cycles += actualCycles;
        }
        return cycles;
    }

    @Override
    public void reset() {
        cpu.reset();
        timer.reset();
        vip.reset();
        vsu.reset();
    }
}
