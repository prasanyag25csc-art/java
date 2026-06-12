public class day6 {
    /* static class Car {
        String Brand;
        String Color;
        int Speed;
        int Fuel;

        Car() {
            System.out.println("constructor called");
        }

        Car(String Brand, String Color, int Speed, int Fuel) {
            this.Brand = Brand;
            this.Color = Color;
            this.Speed = Speed;
            this.Fuel = Fuel;
        }

        void accelarate(int speed) {
            this.Speed += speed;
            //this.Speed=Speed;
        }

        void declarate(int speed) {
            this.Speed -= speed;
        }

        void refill(int fuel) {
            this.Fuel += fuel;
        }

        void showFuel() {
            System.out.println("Your Fuel is : " + Fuel);
        }

        void printDetails() {
            System.out.println("Brand" + Brand);
            System.out.println("Color" + Color);
            System.out.println("Speed" + Speed);
            System.out.println("Fuel" + Fuel);
        }
    }
    public static void main(String[] args) {
        Car car = new Car("Mahendra", "Black", 500, 90);
        // car.Speed(500);
        car.printDetails();
        car.accelarate(500);
        car.declarate(40);
        car.refill(20);
        car.printDetails();
    }
}*/


/*void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("class definition");
    String defition= sc.nextLine();
    System.out.print("enter attribute:");
    String attribute = sc.nextLine();
    System.out.print("enter name");
    String name = sc.nextLine();
    System.out.print("enter reg no");
    String reg= sc.nextLine();
    System.out.print("enter department");
    String department= sc.nextLine();
    System.out.print("enter maths mark");
    String maths= sc.nextLine();

    sc.nextLine();
}*/

        static class Attributes {
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
    }
