
/*public class day8 {

    interface Employee {
        String Name();
        String id();
        String Salary();
    }

    static class BankEmployee implements Employee {

        @Override
        public String Name() {
            return "prasanya";
        }

        @Override
        public String id() {
            return "101";
        }

        @Override
        public String Salary() {
            return "50000";
        }

        public String solveprogram() {
            System.out.println("solution");
            return "solution";
        }
    }

    static class CheckingEmployee implements Employee {

        @Override
        public String Name() {
            return "aishu";
        }

        @Override
        public String id() {
            return "102";
        }

        @Override
        public String Salary() {
            return "45000";
        }

        public String work() {
            System.out.println("process");
            return "process";
        }
    }

    public static void main(String[] args) {

        BankEmployee bank = new BankEmployee();

        System.out.println("Name : " + bank.Name());
        System.out.println("ID : " + bank.id());
        System.out.println("Salary : " + bank.Salary());
        bank.solveprogram();

        System.out.println();

        CheckingEmployee checking = new CheckingEmployee();

        System.out.println("Name : " + checking.Name());
        System.out.println("ID : " + checking.id());
        System.out.println("Salary : " + checking.Salary());
        checking.work();
    }
} */


/*public class day8{
    record CourseRecord(int course,int dept){
    }
    static void main(){
        CourseRecord courserecord=new CourseRecord(123,34);
        System.out.println(courserecord.course());
        System.out.println(courserecord.dept());
    }
}
*/

public class day8 {
    enum LANGUAGE{
        EN("english"),
        GR("German"),
        JP("Japanese"),
        TA("Tamil");
        String value;
        LANGUAGE(String value){
            this.value=value;
        }
    }
    static void main(){
        System.out.println(LANGUAGE.EN.value);
        System.out.println(LANGUAGE.TA.value);
        System.out.println(LANGUAGE.GR.value);
        System.out.println(LANGUAGE.TA.value);
    }
}