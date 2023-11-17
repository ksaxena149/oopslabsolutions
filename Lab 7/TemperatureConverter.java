import java.util.Scanner;

public class TemperatureConverter {
  float celsius;
  float fahrenheit;
  public float toFahrenheit(float celsius){
    this.celsius = celsius;
    fahrenheit = (float)(celsius*1.8 +32);
    return fahrenheit;
  }
  public float toCelsius(float fahrenheit){
    this.fahrenheit = fahrenheit;
    celsius = (float)((fahrenheit-32)*(5/9));
    return celsius;
  }
  public static void main(String args[]){
    System.out.println("Enter: ");
    System.out.println("1. To convert to celsius");
    System.out.println("2. To convert to fahrenheit");
    Scanner sc = new Scanner(System.in);
    int choice = sc.nextInt();
    float f, c;
    TemperatureConverter t = new TemperatureConverter();
    switch (choice) {
      case 1:
        System.out.println("Enter the temperature in fahrenheit: ");
        f = sc.nextInt();
        c = t.toCelsius(f);
        System.out.println("The temperature in celsius is: "+c);
        break;
      case 2:
        System.out.println("Enter the temperature in celsius: ");
        c = sc.nextInt();
        f = t.toCelsius(c);
        System.out.println("The temperature in fahrenheit is: "+f);
        break;
    
      default:
        System.out.println("Enter a valid number.");
        break;
    }
    sc.close();
  }
}
