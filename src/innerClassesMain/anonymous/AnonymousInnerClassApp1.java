package innerClassesMain.anonymous;

public class AnonymousInnerClassApp1 {

    public static void main(String[] args) {

        // class HiMessage implements Message {

        // @Override
        // public String get() {
        // return "Hi";
        // }
        // }

        // HiMessage hiMessage = new HiMessage();
        // System.out.println( hiMessage.get() );

        Message message = new Message() {

            @Override
            public String get() {
                return "Hi";
            }
        };

        System.out.println( message.get() );
    }
}
