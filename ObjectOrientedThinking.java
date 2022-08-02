/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectorientedthinking;

/**
 *
 * @author NJORO
 */
public class ObjectOrientedThinking {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Time time1 = new Time();
        Time time2 = new Time(555550000);
        Time time3 = new Time(5, 23, 55);
        
        System.out.printf("%d:%d:%d%n", time1.getHour(), time1.getMinute(), time1.getSecond());
        System.out.printf("%d:%d:%d%n", time2.getHour(), time2.getMinute(), time2.getSecond());
        System.out.printf("%d:%d:%d%n%n", time3.getHour(), time3.getMinute(), time3.getSecond());
        
        time3.setTime(2432423534L);
        time2.setTime(2432423534L);
        time1.setTime(2432423534L);
        System.out.printf("%d:%d:%d%n", time3.getHour(), time3.getMinute(), time3.getSecond());
        System.out.printf("%d:%d:%d%n", time2.getHour(), time2.getMinute(), time2.getSecond());
        System.out.printf("%d:%d:%d%n%n", time1.getHour(), time1.getMinute(), time1.getSecond());
    }
    
}
