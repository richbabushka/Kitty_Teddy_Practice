
public class FINRA {

    public static void main(String []args) {
        System.out.println("\nPrint numbers from 1 : 30");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 && i % 5 == 0) { // find numbers which are a multiple of both 3 and 5
                System.out.print("FINRA \n"); // print "FINRA" instead of the number

            } else if (i % 5 == 0) { //find numbers which are a multiple of 5
                System.out.print("RA \n"); //  print "RA" instead of the number

            } else if (i % 3 == 0) { // find numbers which are a multiple of 3
                System.out.print("FIN \n");// print "FIN" instead of the number
            } else {
                System.out.println(i);
            }
        }
    }
}

/*
Write a method which prints out the numbers from 1 to 30
 but
 1. for numbers which are a multiple of 3print "FIN" instead of the number
  and
  2. for numbers which are a multiple of 5, print "RA" instead of the number.
  3. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */
