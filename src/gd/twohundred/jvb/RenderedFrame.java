package gd.twohundred.jvb;

import static gd.twohundred.jvb.components.interfaces.Screen.HEIGHT;
import static gd.twohundred.jvb.components.interfaces.Screen.WIDTH;

public class RenderedFrame {
    private final byte[] data;

    public RenderedFrame() {
        this.data = new byte[HEIGHT * WIDTH];
    }

    public byte getPixel(int row, int col) {
        return data[row + col * HEIGHT];
    }

    public void setPixel(int row, int col, byte intensity) {
        setPixel(row + col * HEIGHT, intensity);
    }

    public void setPixel(int addr, byte intensity) {
        data[addr] = (byte) (intensity << 1); // FIXME: this is a hack, need gamma
    }
}
