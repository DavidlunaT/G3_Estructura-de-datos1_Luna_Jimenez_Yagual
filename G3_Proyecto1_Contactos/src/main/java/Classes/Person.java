/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Interfaces.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;



/**
 *
 * @author oweny
 */
public class Person extends Contact{ //Deberia implementar la interfaz Usuario
    
    public String secondName;
    public String lastName;
    public String secondLastName;

    public Person(String name, List<Phone> phones) {
        super(name, phones);
    }
    
}
