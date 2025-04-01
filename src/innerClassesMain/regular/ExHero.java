package innerClassesMain.regular;

public class ExHero {

    public static void main(String[] args) {
        
        Hero hero = new Hero( 20 );
        Hero.Weapon weapon = hero.new Weapon();

        System.out.println( hero.getAmmo() );
        weapon.shoot();
        System.out.println( hero.getAmmo() );
        weapon.shoot();
        System.out.println( hero.getAmmo() );
    }
}
