/*  Math.random 1-100, användaren gissar på talet
    Benjamin Bylund
    2017-11-06
*/

import java.util.Scanner;

public class TestIDE {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tal = (int)(Math.random()*101);


        while (true) {
            int svar = sc.nextInt();
            if(tal == svar){
                System.out.println("Rätt");
                break;
            }
            else if (tal < svar) {
                System.out.println("Fel talet är mindre");
            }
            else if (tal > svar) {
                System.out.println("Fel talet är större");
            }
        }
    }
}
