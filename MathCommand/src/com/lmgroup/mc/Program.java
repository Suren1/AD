/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmgroup.mc;

import com.lmgroup.mc.command.MathCommand;
import com.lmgroup.mc.command.MathFactory;
import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Suren
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter First Number");
            double num1 = input.nextDouble();
            System.out.println("Enter the second Number");
            double num2 = input.nextDouble();

            double total = 0;
            menu();
            String choice = input.next();

            MathCommand cmd = MathFactory.get(choice);
            if (cmd != null) {
                total = cmd.calculate(num1, num2);
                System.out.println("The total is " + total);
            }
        }

    }

    private static void menu() {
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.println("5.Power");
        System.out.println("6.Exit");
        System.out.println("Enter your choice[1-6]");

    }

}
