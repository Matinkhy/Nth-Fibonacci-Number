package com.mycompany.nthfibonaccinum;

import javax.swing.JOptionPane;

public class NthFibonacciNum {

    public static void main(String[] args) {

        String N;
        int n, answer, ansTensPlace = 0, ansOnesPlace = 0, lengthOfString;
        boolean stop = false;
        
        N = JOptionPane.showInputDialog("Which fibbonachi number do you want?");
        do {
            if (N.equalsIgnoreCase("Stop")) {
                stop = true;
            } else {
                n = Integer.parseInt(N);
                answer = FibonacciNum.FibonacciNum(n);
                lengthOfString = N.length();
                if (lengthOfString > 0) {
                    ansOnesPlace = Character.getNumericValue(N.charAt(lengthOfString - 1));
                    if (lengthOfString > 1) {
                        ansTensPlace = Character.getNumericValue(N.charAt(lengthOfString - 2));
                    }
                }
                if (ansTensPlace != 1 && ansOnesPlace != 1) {
                    switch (ansOnesPlace) {
                        case 1:
                            JOptionPane.showMessageDialog(null, "The 1st number of the fibonacci sequence is " + answer);
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "The 2nd number of the fibonacci sequence is " + answer);
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "The 3rd number of the fibonacci sequence is " + answer);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "The " + ansOnesPlace + "th number of the fibonacci sequence is " + answer);
                            break;
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "The " + n + "th number of the fibonnaci sequence is " + answer);
                }
            }
            
        } while (!stop);
        JOptionPane.showMessageDialog(null, "Thank you for using this program, come back another time :)");
    }
}
