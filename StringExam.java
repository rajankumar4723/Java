import java.util.*;

public class StringExam {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Happy");
        System.out.println(sb);
sb.append("K");
sb.append("u");
sb.append("m");
sb.append("a");
sb.append("r");
//insert fucatino

        //char at index0
        System.out.println(sb.charAt(0));
        //set char at index
        sb.insert(0, 'M');
       // sb.setCharAt(0,'P');
       sb.delete(0, 1);
        System.out.println(sb);

    }
}