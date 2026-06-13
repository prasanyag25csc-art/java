public class day1 {
    /*void main(){
    int n=5;
    for(int row=1;row<=5;row++){
        for(int column=1;column<=row;column++){
            System.out.print(column);
        }
            System.out.println();
    }
}*/

    void main() {
        int[] marks = {87, 32, 44, 89, 23};
        System.out.println("pass mark");
        for (int mark : marks) {
            if (mark > 40) {
                System.out.println(mark + "");
            }
        }
        System.out.println("pass mark");
        for (int mark : marks) {
            if (mark > 40) {
                System.out.println(mark + "");



            }
        }
    }

}
