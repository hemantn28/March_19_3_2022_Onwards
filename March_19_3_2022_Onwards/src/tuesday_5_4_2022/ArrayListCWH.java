package tuesday_5_4_2022;
import java.util.*;

public class ArrayListCWH {
    public static void main(String[] args) {
       ArrayList<Integer>l1=new ArrayList<>();
       ArrayList<Integer>l2=new ArrayList<>(5);

       l2.add(15);
       l2.add(11);
       l2.add(18);

       l1.add(6);
       l1.add(4);
       l1.add(7);
       l1.add(1);
       l1.add(6);
       l1.add(0,5);
       l1.add(0,1);
       l1.addAll(0,l2);




        //System.out.println(l1.contains(3));

        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        System.out.println(l1.remove(2));
        l1.set(1,566);





        for (int i=0;i< l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(",");
        }





    }
}
