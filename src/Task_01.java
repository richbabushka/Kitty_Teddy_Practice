import java.util.Scanner;

public class Task_01 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = input.nextInt();
            if (number %2==0){
                System.out.println("identify("+number+") -> \"Odd\"");
            }else{
                System.out.println("identify("+number+") -> \"Even\"");
            }

        }
    }

    
