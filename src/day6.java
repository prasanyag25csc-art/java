/*static class Attributes {
            String Name;
            String regno;
            String dept;
            String Mathsmarks;
            String Physicsmark;
            String csemarks;
            Attributes() {
                System.out.println("Constructor called");
            }
            Attributes(String Name, String regno, String dept, String Mathsmarks, String Physcismark, String csemarks) {
                this.Name = Name;
                this.regno = regno;
                this.Mathsmarks = Mathsmarks;
                this.Physicsmark = Physcismark;
                this.csemarks = csemarks;
            }
            void printDetails() {
                System.out.println("name:" + Name);
                System.out.println("reg no:" + regno);
                System.out.println("maths mark:" + Mathsmarks);
                System.out.println("phy mark:" + Physicsmark);
                System.out.println("cse mark:" + csemarks);
            }
        }
    }*/

public class Usefull {
    static class Request {
        String name;
        String date;
        String reason;

        Request(String name, String date, String reason){
            this.name = name;
            this.date = date;
            this.reason = reason;
        }

        void approve() {
            System.out.println("Approving request");
        }
        void reject() {
            System.out.println("Reject request");
        }
    }

    static class LeaveRequest extends Request {

        LeaveRequest(String name, String date, String reason) {
            super(name, date, reason);
        }
        void approveLeaveRequest() {
            System.out.println("Approving leave request");
        }
        void rejectLeaveRequest() {
            System.out.println("Reject leave request");
        }
    }
    static class OnDutyRequest extends Request {

        OnDutyRequest(String name, String date, String reason) {
            super(name, date, reason);
        }
        void approveOnDutyRequest() {
            System.out.println("Approving on duty request");
        }
        void rejectOnDutyRequest() {
            System.out.println("Reject on duty request");
        }
    }

    static void main() {
        LeaveRequest leaveRequest = new LeaveRequest("Aravindh","21-10-7888","Fever");
        leaveRequest.approveLeaveRequest();
        OnDutyRequest onDutyRequest = new OnDutyRequest("Aravindh","21-10-5676","Culturals");
        onDutyRequest.rejectOnDutyRequest();
    }
}


