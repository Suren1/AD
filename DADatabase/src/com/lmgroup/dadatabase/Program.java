/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lmgroup.dadatabase;

import com.lmgroup.dadatabase.da.Database;
import com.lmgroup.dadatabase.da.DatabaseFactory;
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
        menu();
        String choice= input.next();
        Database db=DatabaseFactory.get(choice);
        if(db!=null){
            db.show();
        }
        else{
            System.out.println("Database not found");
        }
        
    }
    public static void menu(){
        System.out.println("1.MySQL Database");
        System.out.println("2.Oracal Database");
        System.out.println("3.SQL Database");
        System.out.println("4.DB2 Database");
        System.out.println("5.Exit");
        System.out.println("Enter your choice[1-5]");

    }
    
}
