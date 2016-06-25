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
public class ExitCommand extends MathCommand {

    @Override
    public double calculate(double x, double y) {
        System.exit(0);
        return 0;
//     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
