/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmgroup.dadatabase.da;

/**
 *
 * @author Suren
 */
public class DatabaseFactory {

    public static Database get(String key) {
        if (key.equalsIgnoreCase("1")) {
            return new MySQLDatabase();
        } else if (key.equalsIgnoreCase("2")) {
            return new OracalDatabase();
        } else if (key.equalsIgnoreCase("3")) {
            return new SQLDatabase();
        } else if (key.equalsIgnoreCase("4")) {
            return new DB2Database();
        } else if (key.equalsIgnoreCase("5")) {
            return new ExitCommand();
        }

        return null;

    }
}
