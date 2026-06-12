/*public class day7 {
    static class request{
        private String to;
        request(String to){
            this.to=to;
        }
        void send(){
        }
    }
    static class leaveRequest extends request{
        leaveRequest(String to){
            super(to);
        }
        void sendLeaveRequest(){
            System.out.println("Name:");
            System.out.println("Date:");
            System.out.println("Reason:");
        }
        static class OnDutyRequest(){
            OnDutyRequest(String to){
                super(to);
            }
            void OnDutyRequest(){
                System.out.println("Name:");
                System.out.println("Date:");
                System.out.println("Request:");
            }
        }
        static class
    }
}*/

public  class Day7 {
    static class Request {
        String name;
        String date;
        String reason;

        Request(String name, String date, String reason) {
            this.name = name;
            this.date = date;
            this.reason = reason;
        }
    }
}