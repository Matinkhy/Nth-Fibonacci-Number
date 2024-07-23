package com.mycompany.nthfibonaccinum;

import javax.swing.JOptionPane;

public class NthFibonacciNum {

    public static void main(String[] args) {

        String N;
        int n, answer;
        boolean stop = false;

        N = JOptionPane.showInputDialog("Which fibbonachi number do you want?");
        do {
            if (N.equalsIgnoreCase("Stop")) {
                stop = true;
            } else {
                n = Integer.parseInt(N);
                answer = FibonacciNum.FibonacciNum(n);
                JOptionPane.showMessageDialog(null, answer);

            }

        } while (!stop);
    }
}
