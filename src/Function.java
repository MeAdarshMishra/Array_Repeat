import java.util.Scanner;
//public class Function{
//    public static void sayMyName(String name){
//        System.out.println(name);
//        return;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String name=sc.next();
//        sayMyName(name);
//    }
//}

//public class Function{
//    public static int mulNumber(int a, int b){
//        int c=a*b;
//        return c;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b= sc.nextInt();
//        int c=mulNumber(a,b);
//        System.out.println(c);
//    }
//}
//public class Function{
//    public static int sum(int a,int b){
//        int c=a+b;
//        System.out.println(c);
//        return c;
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sum(a,b);
//        //System.out.println(c);
//    }
//}
public class Function{
    public static void printFactorial(int n){
        int factorial=1;
        for (int i = n; i>=1 ; i--) {
            factorial=factorial*i;
            System.out.println(factorial);
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printFactorial(n);

    }
}