/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.List;

/**
 *
 * @author oweny
 */
public class Company extends Contact{
    
    public String department;
    public String website;

    public Company(String name, List<Telephone> phones) {
        super(name, phones);
    }

    public Company(List<Telephone> phones) {
        super(phones);
    }

}
