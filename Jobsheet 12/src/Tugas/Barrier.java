package Tugas;
public class Barrier implements Destroyable {
    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void destroy() {
        // Implementation of barrier destruction
        strength -= 0.1 * strength;
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + strength;
    }

    @Override
    public void destroyed() {
        destroy();
    }
}
