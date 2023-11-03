/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import DataStructure.ArrayList;
import Interfaces.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


 //implementar tda

/**
 *
 * @author oweny
 */
public abstract class Contact implements Serializable{
    
    protected String name;
    protected List<Phone> phones;
    protected List<Address> addresses;
    protected List<Email> emails;
    protected List<SpecialDate> birthdays;
    protected String Photo;

    public Contact(List<Phone> phones) {
        this.phones = phones;
        this.name = phones.get(0).getNumber();
    }

    public Contact(String name, List<Phone> phones) {
        this.name = name;
        this.phones = phones;
    }
    
}
