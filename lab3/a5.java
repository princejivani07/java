import java.util.Scanner;

public class a5 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("enter the first num");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter the second num");
        int b = sc.nextInt();
        System.out.println("enter the third num");
        int c = sc.nextInt();
        sc.close();
        
        if (a>b) {
            if (a>c) {
                System.out.println("largest number = "+a);
                
            }else{
                 System.out.println("largest number = "+c);
            }
            
    }else{
        if (b>c) {
             System.out.println("largest number = "+b);
        }else{
             System.out.println("largest number = "+c);

        }
    }

    }
    
}
