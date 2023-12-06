package Tugas;
public class Zombie implements Destroyable {
    private int health;
    private int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
        // Implementation of healing based on zombie level
        if (level == 1) {
            health += 0.2 * health;
        } else if (level == 2) {
            health += 0.3 * health;
        } else if (level == 3) {
            health += 0.4 * health;
        }
    }

    public void destroyed() {
        // Implementation of destruction based on zombie type
        if (this instanceof WalkingZombie) {
            health -= 0.02 * health;
        } else if (this instanceof JumpingZombie) {
            health -= 0.01 * health;
        }
    }

    public String getZombieInfo() {
        return "Health = " + health + "\nLevel = " + level;
    }
}
