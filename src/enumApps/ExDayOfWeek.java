package enumApps;

public class ExDayOfWeek {

    public enum DayOfWeek {
        DOMINGO(null),
        SABADO(DOMINGO),
        SEXTA(SABADO),
        QUINTA(SEXTA),
        QUARTA(QUINTA),
        TERCA(QUARTA),
        SEGUNDA(TERCA);

        private final DayOfWeek next;

        DayOfWeek(DayOfWeek next) {
            this.next = next;
        }

        public DayOfWeek next() {
            return this.next == null ? SEGUNDA : this.next;
        }
    }

    public static void main(String[] args) {

        DayOfWeek dow = DayOfWeek.SEGUNDA;
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

        dow = dow.next();
        System.out.println(dow);

    }
}
