# TODO

* Fix VIP timings
* VSU
* Fix exceptions
* BitString
* General CPU completeness pass
* Fix Display Ready bit

# ROM compatibility

| Title | Notes
| --- | ---
| 3D Tetris (U) | Bitstring (VSU)
| affine_demo_1 | ✓
| affine_demo_2 | ✓
| Blox V1.0 by KR155E (PD) | Too fast, some missing graphics?
| Blox V1.1 by KR155E (PD) | ✓ (VSU)
| Bound High! (JU) | Various VIP glitches/issues: horizontal stripes, glitchy game screens. CAXI (VSU)
| Croach, The (PD) | Nothing happens (waiting for drawing status to change while drawing is disabled?)
| Etch-A-Sketch by Pat Daderko (PD) | ✓
| Framebuffer Drawing Demo by Pat Daderko (PD) | Strange band at the top
| Galactic Pinball (JU) | glitchy (probably bad VIP timings) (VSU)
| GLOW Demo by KR155E (PD) [a1] | ✓
| GLOW Demo by KR155E (PD) | ✓
| Golf (U) | Bitstring
| Hello, World! Demo V1.0 by Amos Bieler (PD) | Displays dead data from fb (waiting for display *not* ready?)
| Hello, World! Demo V1.1 by Amos Bieler (PD) | Displays dead data from fb (waiting for display *not* ready?)
| Insmouse No Yakata (J) / Insane Mouse Mansion (J) | Password screen does not display correctly, bubbles are not working properly
| Jack Bros (J) | Glitchy/non functional instructions screen (VSU)
| Jack Bros (U) | Glitchy/non functional instructions screen (VSU)
| Mario Clash (JU) | No character in game?
| Mario Flying Demo by Frostgiant (PD) | ✓ (Seems to use uninitialized memory as a "black" char)
| Mario's Tennis (JU) [a1] | Glitchy graphics (VIP memory corruption?)
| Mario's Tennis (JU) | illegal instruction?
| Matrix, The by Cooler (PD) | Glitchy, way too fast
| Nester's Funky Bowling (U) [a1] | bitstring
| Nester's Funky Bowling (U) | bitstring
| OBJ Pointer Demo by Dan Bergman (PD) | ✓
| Panic Bomber (J) | Some graphics are missing (VSU)
| Panic Bomber (U) | Some graphics are missing (VSU)
| pong | nothing happens (waiting for drawing status to change while drawing is disabled?)
| Reality Boy Demo 1 (PD) | ✓
| Reality Boy Demo 2 (PD) | Link
| Red Alarm (J) | Hangs after some intro screens (waiting for an interrupt?) (VSU)
| Red Alarm (U) | Hangs after some intro screens (waiting for an interrupt?) (VSU)
| Scaling Demo by Parasyte (PD) | ✓ (Does not initialize window param memory properly, use `-Djvb.ram.init=0`)
| SD Gundam Dimension War (J) | Glitchy graphics/hangs
| Simon by Pat Daderko (PD) | ✓
| Space Invaders: Virtual Collection (J) | Glitchy graphics, seems to wait for interrupt
| Space Squash (J) | Hangs (VSU)
| Super Fighter Demo by KR155E (PD) | Displays dead data from fb (waiting for display *not* ready?)
| Teleroboxer (JU) [T+Ger.4b_KR155E] | Stuck after instructions (Waiting for interrupt?) (VSU)
| Teleroboxer (JU) | Stuck after instructions (Waiting for interrupt?) (VSU)
| T&E Virtual Golf (J) | Bitstring
| Tic Tac Toe by Pat Daderko (PD) | Link
| Tron VB by Pat Daderko (PD) | Link
| VB Rocks! Demo by KR155E (PD) | Displays dead data from fb (waiting for display *not* ready?)
| vb_test_2 | ✓
| VeeBee Cursor Demo by David Williamson (PD) | Displays dead data from fb (waiting for display *not* ready?)
| Vertical Force (J) | Stuck after instructions (waiting for display *not* ready?) (VSU)
| Vertical Force (U) | Stuck after instructions (waiting for display *not* ready?) (VSU)
| Virtual Bowling (J) | VIP crash (oob read in bg/param ram)
| Virtual Boy Wario Land (JU) | Nothing happens after instruction & focus screen
| Virtual-E Cursor Demo (PD) [a1] | Nothing happens (waiting for display *not* ready?) 
| Virtual-E Cursor Demo (PD) | Bad rom?
| Virtual Fishing (J) | Crash/reset after game's splash screen.
| Virtual Lab (J) | Falling pieces are not displayed
| Virtual League Baseball (U) [a1] | Controls don't always seem to work in menus
| Virtual League Baseball (U) | illegal op?
| Virtual Pong (PD) | Nothing happens (waiting for drawing status to change while drawing is disabled?)
| Virtual Pro Yakyuu '95 (J) | Controls don't always seem to work in menus
| V Tetris (J) | ✓ (VSU)
| Waterworld (U) | display stops during intro