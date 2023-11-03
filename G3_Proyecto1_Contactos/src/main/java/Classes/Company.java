/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Interfaces.List;



/**
 *
 * @author oweny
 */
public class Company extends Contact{
    
    public String department;
    public String website;

    public Company(String name, List<Phone> phones) {
        super(name, phones);
        this.department = department;
    }

    public Company(List<Phone> phones) {
        super(phones);
    }

}
