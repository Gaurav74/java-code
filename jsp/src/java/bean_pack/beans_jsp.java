package bean_pack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class beans_jsp implements Serializable {

    /*
    @declarations
     */
    private String name = null;
    private int age = 0;

    public beans_jsp() {
        //nothing
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int in) {
        this.age = in;
    }

}
