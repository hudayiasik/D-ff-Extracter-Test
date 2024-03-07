public class main{
    public static void main(String[] args) {


        System.out.println("Hi World!");
        int num1 = 0;
        factorial(num1);

    }
    static void factorial(int num){
        int fact = 1;
        for(int i = 2; i <= num;i++){
            fact *= i;
        }
        System.out.println("The factorial of " + num + " is " + fact);
    }
}