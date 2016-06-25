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
public class ExitCommnd extends Guitar{

    @Override
    public void play() {
      System.exit(0);
    }
    
}
