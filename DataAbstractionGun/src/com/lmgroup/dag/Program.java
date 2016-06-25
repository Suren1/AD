/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmgroup.dag;

import com.lmgroup.dag.Gun.Gun;
import com.lmgroup.dag.Gun.GunFactory;
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
        Gun g = GunFactory.get(choice);
        if (g != null) {
            g.setModel("1234-1234");
            g.setName("Compact");
            System.out.println(g.getName());
            System.out.println(g.getModel());
            g.shoot();
        } else {
            System.out.println("Not Found");
        }

    }

    private static void menu() {
        System.out.println("1.Machine Gun");
        System.out.println("2.Rifals");
        System.out.println("3.Revolver");
        System.out.println("4.ShotGUn");
        System.out.println("5.Exit");
        System.out.println("Enter your choice[1-5]");

    }

}
