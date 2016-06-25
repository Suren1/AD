/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lmgroup.daGuitar.Gs;

/**
 *
 * @author Suren
 */
public class GuitarFactory {

    public static Guitar get(String key) {
        if (key.equalsIgnoreCase("1")) {
            return new Acoustic();
        } else if (key.equalsIgnoreCase("2")) {
            return new Electric();
        } else if (key.equalsIgnoreCase("3")) {
            return new Bass();
        } else if (key.equalsIgnoreCase("4")) {
            return new Spanish();
        } else if (key.equalsIgnoreCase("5")) {
            return new ExitCommnd();
        }
        return null;

    }
}
