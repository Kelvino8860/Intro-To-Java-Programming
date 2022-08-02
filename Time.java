/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectorientedthinking;

/**
 *
 * @author NJORO
 */
public class Time {
   private int hour;
   private int minute;
   private int second;
   private long elapsedTime;
   
   public Time(){
     elapsedTime = System.currentTimeMillis();
   }
   public Time(long time){
       elapsedTime = time;
   }
   public Time(int hour, int minute, int second){
       
       elapsedTime = ((hour * 1000 * 60 * 60) + (minute * 1000 * 60) + (second * 1000));
   }
   
   public int getHour(){
       return (int)(elapsedTime/(1000*60*60)) % 24;
   }
   public int getMinute() {
       return (int)(elapsedTime/(1000*60)) % 60;
   }
   public int getSecond() {
       return (int)(elapsedTime/(1000)) % 60;
   }
   
   public void setTime(long elapsedTime) {
       this.elapsedTime = elapsedTime;
   }
}
