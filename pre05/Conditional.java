import java.io.*;
import java.util.*;

public class Conditional{

public static void main(String[] args){
  int a;

  a = 10;

  if (a > 10){
    System.out.println("A is bigger");
    System.out.println("In if");
  } else if (a < 10){
    System.out.println("It's <");
  } else {
    System.out.println("it's = 10");    
  }

  System.out.println("Not in if");

  
}


}