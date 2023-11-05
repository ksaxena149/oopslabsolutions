public class TemperatureConverter {
  float celsius;
  float fahrenheit;
  public float toFahrenheit(int celsius){
    this.celsius = celsius;
    fahrenheit = (float)(celsius*1.8 +32);
    return fahrenheit;
  }
  public float toCelsius(int celcius){
    this.fahrenheit = fahrenheit;
    celsius = (float)((fahrenheit-32)*(5/9));
    return celsius;
  }
  public static void main(String args[]){
    TemperatureConverter t = new TemperatureConverter();
    float f = t.toCelsius(96);
    System.out.println("In fahrenheit: "+f);
  }
}
