package exception_handling;

public class Try_Catch_CWH {
    public static void main(String[] args) {
        int a=6000;
        int b=0;
        //without try
       /* int c=a/b;
        System.out.println("The result is: "+c);*/
        //with try
        try {
            int c=a/b;
            System.out.println("The result is: "+c);
        }
        catch (Exception e){
            System.out.println("We failed to divide. Reason");
            System.out.println(e);
        }
        System.out.println("End of the programme");

    }
}
