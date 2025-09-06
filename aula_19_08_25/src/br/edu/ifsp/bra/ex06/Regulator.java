package br.edu.ifsp.bra.ex06;

public class Regulator {
  private Heater heater;
  private Thermometer thermometer;
  
  public Regulator(Heater h, Thermometer t) {
    this.heater = h;
    this.thermometer = t;
  }
 
  public static void regulate(double minT, double maxT) {
    double currentTemp = this.thermometer.read();
     if (currentTemp < minTemp) {
       this.heater.engageHeater();
     } else if (currentTemp > maxTemp) {
       this.heater.disengageHeater();
     }
  }
}

