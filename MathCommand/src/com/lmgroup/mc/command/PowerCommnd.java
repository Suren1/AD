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
public class PowerCommnd extends MathCommand {

    @Override
    public double calculate(double x, double y) {
        double total = 1;
        for (int i = 1; i <= y; i++) {
            total = x * total;
        }
        return total;
    }

}
