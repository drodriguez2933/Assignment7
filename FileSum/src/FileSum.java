import java.util.Scanner;   // Needed for Scanner
import java.io.*;           // Needed for File and IOException

public class FileSum
{
   public static void main(String[] args) throws IOException
   {
	  
	  Scanner keyboard = new Scanner(System.in);
	   
	  int amountNumbers;
	  String filename;
	  int sum = 0;
	  int flag = 0;
	  
      
      System.out.println("How many numbers are you going to put into the file?");
      amountNumbers = keyboard.nextInt();
      
      int num;
      
      keyboard.nextLine();
      
      System.out.print("Enter the filename: ");
      filename = keyboard.nextLine();
      
//======================================================================================

      // Open the file.
      PrintWriter outputFile = new PrintWriter(filename);
      
      for (int i = 1; i <= amountNumbers; i++)
      {
         // Get the name of a friend.
         System.out.print("Enter the number for number " + i + ": ");
         num = keyboard.nextInt();

         // Write the name to the file.
         outputFile.print(num + " ");
      }
      
      outputFile.println(-1);
      outputFile.close();
//======================================================================================

      // Open the file.
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);
      
      	while(flag!=1){
    	  int a = inputFile.nextInt();
    	  if(a == -1){
    		  flag++;
    	  }
    	  else{
    		  sum += a;
    	  }
      	}
      
      inputFile.close();
      
      System.out.println("The sum of the numbers you put into the file is " + sum);
      
      
   }
}