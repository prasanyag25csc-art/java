import java.util.HashSet;
import java.util.Set;
public class day11 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        set.add("grapes");
        System.out.println(set);
        for(String S:set){
        System.out.println(S);
    }
}
}
