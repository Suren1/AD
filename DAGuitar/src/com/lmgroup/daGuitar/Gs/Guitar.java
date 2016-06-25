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
public abstract class Guitar {


    /*
     *Default Constructor
     */
    public Guitar() {
        System.out.println("Default constructor of Guitar");
    }
       public abstract void play();
}