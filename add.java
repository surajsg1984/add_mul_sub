import java.util.Scanner;

class Calc {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  

        System.out.println("Enter first number (a):");  
        int a = sc.nextInt();  

        System.out.println("Enter second number (b):");  
        int b = sc.nextInt();  

        int c = a + b;  
        System.out.println("Addition is: " + c);  

        sc.close(); // Closing Scanner to prevent memory leaks
    }  
}


