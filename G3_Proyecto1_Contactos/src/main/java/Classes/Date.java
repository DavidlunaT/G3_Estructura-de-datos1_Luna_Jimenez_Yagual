/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author oweny
 */
public class Date {

    public String day;
    public String month;
    public String year;
    public String label;
    
    public Date(String day, String month, String label) {
        this.day = day;
        this.month = month;
        this.label = label;
    }

    public Date(String day, String month, String year, String label) {
        this(day, month, label);
        this.year = year;
    }
    
}
