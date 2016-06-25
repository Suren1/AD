/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lmgroup.dag.Gun;

/**
 *
 * @author Suren
 */
public class ExitCommand extends Gun {

    @Override
    public void shoot() {
        System.exit(0);
    }
    
}
