package br.edu.ifsp.bra.ex06;

public class IOChannelHeater implements Heater {
  private static void engageHeater() {
   System.out.println("Furnace ON");
  }
  
  private static void disengageHeater() {
   System.out.println("Furnace OFF");
  } 
}
