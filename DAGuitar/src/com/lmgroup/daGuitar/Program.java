/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lmgroup.daGuitar;

import com.lmgroup.daGuitar.Gs.Guitar;
import com.lmgroup.daGuitar.Gs.GuitarFactory;
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

        Scanner input = new Scanner(System.in);
        menu();
        String choice = input.next();
        Guitar g = GuitarFactory.get(choice);
        if (g != null) {
            
            g.play();
        } else {
            System.out.println("Not Found");
        }

    }

    private static void menu() {
        System.out.println("1.Acoustic Guitar");
        System.out.println("2.Electric Guitar");
        System.out.println("3.Spanish Guitar");
        System.out.println("4.Bass Guitar");
        System.out.println("5.Exit");
        System.out.println("Enter your choice[1-5]");

    }

}
