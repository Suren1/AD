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
public abstract class Gun {

    public String gName;
    private String gModel;

    /*
     *Default Constructor
     */
    public Gun() {
        System.out.println("Default constructor of Gun");
    }
    /*
     *Overloaded Constructor
     *@param gName
     *@
     */

    public Gun(String gName, String gModle) {
        this.gName = gName;
        this.gModel = gModle;
    }

    public String getName() {
        return gName;
    }

    public void setName(String gName) {
        this.gName = gName;
    }

    public String getModel() {
        return gModel;
    }

    public void setModel(String gModel) {
        this.gModel = gModel;

    }

    public abstract void shoot();
}
