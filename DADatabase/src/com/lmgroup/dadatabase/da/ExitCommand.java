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
public class ExitCommand extends Database{

    @Override
    public void show() {
        System.exit(0);
    }
    
}
