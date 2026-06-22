public class Day14Factory {
    interface Notification {
        void send(String to, String message);
    }

    class CreditNotification implements Notification {
        @Override
        public void send(String to, String message) {
            System.out.println("Sending Credit: " + message + ", to " + to);
        }
    }

    class DebitNotification implements Notification {
        @Override
        public void send(String to, String message) {
            System.out.println("Sending Debit: " + message + ", to " + to);
        }
    }

    static Notification getNotification(Day14Factory factory, String type) {
        return switch (type) {
            case "Credit" -> factory.new CreditNotification();
            case "Debit" -> factory.new DebitNotification();
            default -> throw new IllegalArgumentException(
                    "Invalid notification type: " + type);
        };
    }

    public static void main(String[] args) {
        Day14Factory factory = new Day14Factory();

        String type = "Credit";
        getNotification(factory, type)
                .send("240824", "Amount 800 Credited");
    }
}
