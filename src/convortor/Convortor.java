/*
 *these are words
 *these are also words
 *so are these.
 */
package convortor;

import java.util.Scanner;

/**
 *
 * @author nbelovoskey8981 also jacob, too, as well, too, in addition to nick.
 */
public class Convortor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("What conversion do you want to do? \n"
                + "1. K -> C \n"
                + "2. K -> F \n"
                + "3. C -> F \n"
                + "4. C -> K \n"
                + "5. F -> K \n"
                + "6. F -> C \n"
                + "7. Miles^2 -> Km^2 \n"
                + "8. Km^2 -> Miles^2\n");
        Scanner scans = new Scanner(System.in);
        int i = scans.nextInt();
        switch(i){                      //tis is an switch statement
            
            case 1:
                System.out.println("What is your Kelvin?");
                Scanner scans1 = new Scanner(System.in);
                int test1 = (int)scans1.nextDouble();
                //System.out.println(test1);
//                double doubles = 0.0;
//                if(test1 == scans1.nextDouble()){
//                    test1 = (int)test1;
//                    System.out.println("metods");
                int Pepperoni = test1 -273;
           
                
                break;
            case 2:
                System.out.println("What is your Kelvin?");
                Scanner scans2 = new Scanner(System.in);
                 int test2 = (int)scans2.nextDouble();
                 double doible = ((test2 - 273) * 1.8) + 32;
                 
                 System.out.println((int)doible);
                break;
            case 3:
                System.out.println("What is your Celcius/Centigrade? (if u r an brit)");
                Scanner scans3 = new Scanner(System.in);
                 int test3 = (int)scans3.nextDouble();
                 double tony = ( test3 - 32 ) / 1.8;
                 System.out.println((int)tony);
                         
                break;
            case 4:
                System.out.println("What is your Centigrade?");
                Scanner scans4 = new Scanner(System.in);
                int test4 = (int)scans4.nextDouble();
                double penguin = test4 +273;
                System.out.println((int)penguin);
                break;
            case 5:
                System.out.println("What is your Fahrenheit?");
                Scanner scans5 = new Scanner(System.in);
                int test5 = (int)scans5.nextDouble();
                double bockser = ((test5- 32) / 1.8) +273 ;
                System.out.println((int)bockser);
                break;
            case 6:
                System.out.println("What is your Fahrenheit?");
                Scanner scans6 = new Scanner(System.in);
                int test6 = (int)scans6.nextDouble();
                double riperino = ((test6 - 32) / 1.8);
                System.out.print((int)riperino);
                break;
            case 7:
                System.out.println("What is your Area in (Mi^2)?");
                Scanner scans7 = new Scanner(System.in);
                int test7 = (int)scans7.nextDouble();
                double miles = (test7 * 2.58999);
                System.out.print((int)miles);
                break;
            case 8:
                System.out.println("What is your Area in Kilometers?");
                Scanner scans8 = new Scanner(System.in);
                int test8 = (int)scans8.nextDouble();
                double acres = (test8 / 2.58999);
                System.out.print((int)acres);
                break;
                
        }
                        System.out.print("\n");
    }
    
}
