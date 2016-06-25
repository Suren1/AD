/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmgroup.mc.command;

/**
 *
 * @author Suren
 */
public class MathFactory {

    public static MathCommand get(String key) {
        if (key.equalsIgnoreCase("1")) {
            return new AddCommand();
        } else if (key.equalsIgnoreCase("2")) {
            return new SubCommand();
        } else if (key.equalsIgnoreCase("3")) {
            return new MultiplyCommand();
        } else if (key.equalsIgnoreCase("4")) {
            return new DivCommand();
        } else if (key.equalsIgnoreCase("5")) {
            return new PowerCommnd();
        } else if (key.equalsIgnoreCase("6")) {
            return new ExitCommand();
        }
        return null;

    }

}
