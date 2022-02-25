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
    }
    
    for (int num : elements)
    {
      System.out.println(num);
    }

    //Insertion Sort with Int Array
    int[] elements2 = {21, 17, 60, 20, 56, 12};
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
    }

    for (int num : elements2)
    {
      System.out.println(num);
    }

    //Selection Sort with String Array
    String[] wordsSelect = {"paint" , "cheer" , "dance" , "wish" , "fall"};
    for(int i = 0; i<wordsSelect.length - 1; i++)
      {
        //idea of selection sort is in the first part looking for the lowest
        //then sorting it to the earliest part
        int minIndex = i;
        for (int k = i + 1; k < wordsSelect.length; k++)
      {
        if (wordsSelect[k].compareTo(wordsSelect[minIndex]) <//if one has lower than other in terms of ascii value)
        {
          minIndex = k;
        }
      }
      String temp = wordsSelect[i];
      wordsSelect[i] = wordsSelect[minIndex];
      wordsSelect[minIndex] = temp;
    }

    //Insertion Sort with String Array
    String[] wordsInsert = {"paint" , "cheer" , "dance" , "wish" , "fall"};
        //the idea of insertion sort is to compare 2 + n < length
        //reorder piece by piece

    //Selection Sort with Integer ArrayList
    //Insertion Sort with Integer ArrayList
    //Selection Sort with String ArrayList
    //Insertion Sort with String ArrayList



    //check printing requirements for ALL 
    
  }
}