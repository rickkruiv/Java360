package innerClassesMain.regular;

public class Hero {

    private int ammo;

    public Hero( int ammo ) {
        this.ammo = ammo;
    }

    public int getAmmo() {
        return ammo;
    }

    public class Weapon {

        public void shoot() {
            ammo--;
        }
    }
}
