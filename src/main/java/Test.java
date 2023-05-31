import java.util.Scanner;

public class Test {
    public static void main(String[] args){

        inputSum();
        System.out.println("hello");

    }
    public static void inputSum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie einen Text ein und drücken Sie ENTER:");
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        System.out.println("\n" + "Summe: " +(input1+input2));
    }


    public static int returnSum(int num1, int num2){
        return num1+num2;
    }
    public static String sumString(int num1, int num2){
        return "Summe: "+ (num1+num2);
    }

    public static int fak(int value){
        int result = value;
        for(int i=value-1; i>=1; i--){
            result = result * i;
        }
        return result;
    }

    public static int fak2(int value){
        int result = value;
        int i = value -1;
        while(i>=1){
            result = result * i;
            i--;
        }
        return result;
    }

}
