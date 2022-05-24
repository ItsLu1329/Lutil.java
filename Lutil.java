//Author: Lu
//Date Made - 4/7/2022
// V 1.0.4.3
// last update date: 5 - 24 - 2022

// go to w3 schools java
package lu;
import java.util.*;
import java.io.*; 


public class Lutil {
  
  public static int randomInt(int var) {
    Random rand = new Random();
    return rand.nextInt(var);
  }


  private static String retrieveInput(Scanner myObj) {
    return myObj.nextLine();
  }
  
  public static String input(String text) {
    Scanner myObj = new Scanner(System.in);
    System.out.print(text);
    String input = retrieveInput(myObj);
    myObj.close();
    return input;
  }
  
  public static double toDouble(String str) {
    double num = Double.parseDouble(str);
    return num;
  }

  public static double round (double var, double decimal_places) {
    double pre_var = Math.pow(10, decimal_places);
    var = Math.round(var * (pre_var)) / pre_var;
    return var;
  }


  
  public static double pow (double num, double power) {
    double total = num;
    for (int i = 0; i < power; i++) {
      total *= num;}
    return total;
  }
  
  
  public static double mean(double[] numbers) {
    double amount = numbers.length; double total = 0.0;
    for (int i = 0; i < amount; i++) {
      total += numbers[i];}
    return Lutil.round(total / amount, 2);
  }
  
  public static double Standard_dev (double[] numbers, double mean) {
    double amount = numbers.length; double total = 0.0;
    for (int i = 0; i < amount; i++) {
      total += pow((numbers[i] - mean), 2);}
    return round(Math.sqrt (total)/amount, 2);
  }
  
  public static String index (String string, int amount) {
    return string.substring(0, amount);
    
    
  }
  
  public static String getValues (double[] list) {
    String output = "";
    if (list.length == 1){
      return String.valueOf(list[0]);
    }
    
    else if (list.length == 0) {
      return "Error: List has no values";
    }
    
    for (int i = 0; i < list.length; i++) {
      output += list[i] + ", ";
    }
    return output;
  }
  
  
  public static String getValues (String[] list) {
    String output = "";
    if (list.length == 1){
      return list[0].toString();
    }
    
    else if (list.length == 0) {
      return "Error: List has no values";
    }
    
    for (int i = 0; i < list.length; i++) {
      output += list[i] + ", ";
    }
    return output;
  }

  public static String[] toList (String string) {
    List<String> letters = new ArrayList<>();
    for (int i = 0; i < string.length(); i++) {
      char pre_letter = string.charAt(i);
      String letter = Character.toString(pre_letter);
      letters.add(letter);
    }
    return new String[letters.size()];
  }

  
  
  public static void test() {
    System.out.print("working");
    
  }
  public static int sumElements (int[] numbers){
        int sum = 0;
        for (int n : numbers)
            sum += n;
        return sum;
    }
  public static int sumElements (double[] numbers){
        int sum = 0;
        for (double n : numbers)
            sum += n;
        return sum;
    }
    
    public static int square (int number) {
        return number * number;
    }
  
  public static String readFile(String filename) {
    String fileData = "";
    try {
      File infile = new File (filename);
      Scanner reader = new Scanner (infile);
      while (reader.hasNextLine()) {
        String lineData = reader.nextLine();
        fileData +=  lineData;
      }
      reader.close();
      
    }
    catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    return fileData;
  }
  
}
