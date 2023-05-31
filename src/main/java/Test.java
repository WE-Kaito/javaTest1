import java.util.Scanner;

public class Test {
    public static void main(String[] args){
    alarm(alertLevel(22));
    alarm("blue");
    }

   /* public static void inputSum(){
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
    */

    public static String alertLevel(int people){
        if (people > 30){
           return "green";
        } else if (people < 30) {
            return "red";
        }
        else{
            return "yellow";
        }
    }

    public static void alarm(String alertLevel){
        switch (alertLevel){
            case "green":
                System.out.println("Max 60 people allowed");
                break;
            case "yellow":
                System.out.println("30 people allowed");
                break;
            case "red":
                System.out.println("no people allowed");
                break;
            default:
                System.out.println("alarm is broken");
        }
    }


}
