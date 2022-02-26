//Selection & Insertion Sorts
import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

class Main{
  public static void main (String str[]) throws IOException {
    
    //Selection Sort with Int Array
    int[] elements = {21, 17, 60, 20, 56, 12};
    System.out.println("Printing Unsorted Array");
    for(int nums : elements)
      {
        System.out.print(nums + " ");
      }
    System.out.println("Printing Each Pass Through the Selection Sort");
    for (int j = 0; j < elements.length -1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;

      for(int nums : elements)
      {
        System.out.print(nums + " ");
      }
      System.out.println();
    }

    //NOTE figure out spacing and printing order and also do a temporary check

    //Insertion Sort with Int Array
    int[] elements2 = {21, 17, 60, 20, 56, 12};
    System.out.println("Printing Unsorted Array");
    for(int numi : elements2)
      {
        System.out.print(numi + " ");
      }
    System.out.println("Printing Each Pass Through the Insertion Sort");
    for (int j = 1; j < elements2.length; j++)
    {
      int temp = elements2[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements2[possibleIndex - 1])
      {
        elements2[possibleIndex] = elements2[possibleIndex - 1];
        possibleIndex--;
        
      }
      elements2[possibleIndex] = temp;

      for(int numi : elements2)
      {
        System.out.print(numi + " ");
      }
      System.out.println();
    }


    

    //Selection Sort with String Array
    String[] wordsSelect = {"paint" , "cheer" , "dance" , "wish" , "fall"};
    System.out.println("Printing Unsorted String Array of Strings\n");
    for(String s : wordsSelect)
      {
        System.out.print(s + " ");
      }
    System.out.println("Printing Each Pass of String Array Through the Selection Sort");
    for(int i = 0; i<wordsSelect.length - 1; i++)
    {
      //idea of selection sort is in the first part looking for the lowest
      //then sorting it to the earliest part
      int minIndex = i;
      for (int k = i + 1; k < wordsSelect.length; k++)
      {
        if (wordsSelect[k].compareTo(wordsSelect[minIndex]) > -1)
        {
          minIndex = k;
        }
      }
      String temp = wordsSelect[i];
      wordsSelect[i] = wordsSelect[minIndex];
      wordsSelect[minIndex] = temp;

      for(String s : wordsSelect)
      {
        System.out.print(s + " ");
      }
      System.out.println();
    }
    
    //Insertion Sort with String Array
    String[] wordsInsert = {"paint" , "cheer" , "dance" , "wish" , "fall"};
    System.out.println("Printing Unsorted Array of Strings\n");
    for(String i : wordsInsert)
      {
        System.out.print(i + " ");
      }
    System.out.println("Printing Each Pass of String Array Through the Insertion Sort");
    for (int j = 1; j < wordsInsert.length; j++)
    {
      String temp = wordsInsert[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp.compareTo(wordsInsert[possibleIndex - 1]) > -1)
      {
        wordsInsert[possibleIndex] = wordsInsert[possibleIndex - 1];
        possibleIndex--;
      }
      wordsInsert[possibleIndex] = temp;

      for(String i : wordsInsert)
      {
        System.out.print(i + " ");
      }
      System.out.println();
    }
        

    //Selection Sort with Integer ArrayList
    //Insertion Sort with Integer ArrayList
    //Selection Sort with String ArrayList
    //Insertion Sort with String ArrayList



    //check printing requirements for ALL 
    
  }
}