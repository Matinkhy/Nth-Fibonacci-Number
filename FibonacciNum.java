package com.mycompany.nthfibonaccinum;

import javax.swing.JOptionPane;

public class FibonacciNum {

    public static int FibonacciNum(int n) {
        int F1 = 0, F2 = 1, F3;
        if (n < 0) {
            JOptionPane.showMessageDialog(null, "Your input is invalid, \n enter a positive number");
        } else if (n == 0) {
            JOptionPane.showMessageDialog(null, "It is 0");
            return 0;
        } else if (n == 1) {
            JOptionPane.showMessageDialog(null, "It is 1");
            return 1;
        } else {
            for (int i = 2; i <= n; i++) {
                F3 = F1 + F2;
                F1 = F2;
                F2 = F3;
            }
        }
        return F2;
    }
}
