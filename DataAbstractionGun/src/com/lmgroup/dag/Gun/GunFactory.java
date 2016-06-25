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
public class GunFactory{
   /*
    *making single refrence using string
    */
    
    public static Gun get(String key){
         if (key.equalsIgnoreCase("1")) 
         {   return new machineGun();
            
        } else if (key.equalsIgnoreCase("2")) {
            return new Rifals();
        } else if (key.equalsIgnoreCase("3")) {
            return new Revolver();
        } else if (key.equalsIgnoreCase("4")) {
            return new ShotGun();
        } else if (key.equalsIgnoreCase("5")) {
            return new ExitCommand();
        } 
        return null;

    }

    
    }
    
