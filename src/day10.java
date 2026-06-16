/*import java.util.ArrayList;
public class day10 {
    static void main(){
        String[] Student={"aishu","pras","gopz","ijk","mon"};
        ArrayList<String>list= new ArrayList();
        list.add("aishu");
        list.add("pras");
        list.add("gopz");
        list.add("ijk");
        list.add("mon");
        for(String s: list) {
            System.out.println(s);
    }
        list.remove("mon");
        System.out.println();
        for(String s: list) {
            System.out.println(s);

        }


}
}*/
import java.util.LinkedList;
public class day10 {
    static void main() {
        LinkedList<String> queue = new LinkedList<String>();
        queue.add("pras");
        queue.add("aishu");
        queue.add("gopi");
        queue.add("yaz");
        queue.add("moni");
        while(!queue.isEmpty()) {
            process(queue);
        }
    }
    static void process(LinkedList<String> queue){
        String removed=queue.removeFirst();
        System.out.println("Removed:"+removed);

    }
}