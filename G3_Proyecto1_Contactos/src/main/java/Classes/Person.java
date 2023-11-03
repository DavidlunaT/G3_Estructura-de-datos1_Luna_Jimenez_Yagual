/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author oweny
 */
public class Person extends Contact{ //Deberia implementar la interfaz Usuario
    
    public String secondName;
    public String lastName;
    public String secondLastName;

    public Person(String name, List<Telephone> phones) {
        super(name, phones);
    }
    
}
