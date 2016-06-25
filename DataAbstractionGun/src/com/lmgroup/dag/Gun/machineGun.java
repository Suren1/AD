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
public class machineGun extends Gun{
    //gName="1917";
    //setName("Combat");
           
    @Override
    public void shoot() {
        System.out.println("Mitragliatrice Breda calibro 8 modello 38 per carri armati was an Italian tank-pattern machine gun ");
        System.out.println(getName()); 
    }
    
}
