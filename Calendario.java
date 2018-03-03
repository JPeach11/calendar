//Joseph Peach
//CS 140 w/ Parson
//Calendario
//Calendar application that prompts a user input and displays a calendar based off of that input,
//also prints a calendar based off of the actual current date.


import java.util.* ;
public class Calendario  {
   

   
   public static final int SIZE = 20;
   
   //prints the appropraite methods in order, initializes the true date 
   //calendar and stores the user input and actual calendar dates
   public static void main(String[] args) {
      
      Calendar realDate = Calendar.getInstance();
      int realMonth = realDate.get(Calendar.MONTH)+ 1;
      int realDay = realDate.get(Calendar.DATE);
      String userDate = getDate();
      int userDateMonth = monthFromDate(userDate);
      int userDateDay = dayFromDate(userDate);
      drawMonth(userDateMonth);
      displayDate(userDateMonth, userDateDay);
      drawMonth(realMonth);
      displayDate(realMonth, realDay);
         
   }
   
   // draws each week of the month based off the integer passed in by the drawMonth method
   public static void drawRow(int row, int days) { 
      System.out.print(" ");
      for(int j = 1; j <= 7 * (SIZE + 1) - 1 ; j++)  {
             
         System.out.print("=");
      }
      System.out.println();

      int x = 1;   
      for(int o = x; o <= days; o++)  {
     
         System.out.print("| " + (o + 7 * row));
         for(int p = 1; p <= SIZE - 3; p++)  {
         
            System.out.print(" ");

         }
         for(int z = o + 7 * row; z <= 9 ; z += 10 )  {
            
            System.out.print(" ");
         } 
       
      } 

         System.out.println("|");
         for(int i = 1; i <= SIZE / 2 - 1; i++)   {
         
            for(int k = 1; k <= days; k++)  {
            
               System.out.print("|");
               for(int l = 1; l <= SIZE; l++)  {
               
                  System.out.print(" ");
               }
         
         } 
         System.out.println("|");
      
         }
   }
   
   //organizes the weeks into a month and underlines the calendar and prints the number above the calendar
   //based on the month of the date for which the calendar is being printed
   public static void drawMonth(int userDateMonth)   {
      aSCII();      
      for(int k = 1; k <= 3 * (SIZE + 1) + SIZE / 2; k++)  {
         
         System.out.print(" ");
      } 
      System.out.println(userDateMonth);
      System.out.println();    
      for(int i = 0; i <= 3; i++)   {
         
         drawRow(i,7);
      }
      drawRow(4,3);
      System.out.print(" ");
      for(int j = 1; j <= 3 * (SIZE + 1) - 1; j++)  {
             
         System.out.print("=");
      }
      System.out.println();
   }
   
   // calculates user month from the date input string and returns the month as an integer
   public static int monthFromDate(String date1){
      int month = Integer.parseInt(date1.substring(0,2));
      return month;

   
   }
   
   //calculates user month from the date input string and returns the day as an integer
   public static int dayFromDate(String date1){
      int day = Integer.parseInt(date1.substring(3,5));
      return day;

   
   }
   
   //prompts user to input a date and returns this information
   public static String getDate()  {
      System.out.print("Please enter a date (mm/dd):");
      Scanner console = new Scanner(System.in);
      String date1 = console.nextLine();
      return date1;
   }

   //Displays the date underneath each calendar based off of the integers that are passed in
   public static void displayDate(int month, int day) {
      System.out.println(" Month: " + month);
      System.out.println(" Day: " + day);
      System.out.println();
   }
   //prints an ascii pyramid
   public static void aSCII() {
      for(int i = 1; i <= SIZE / 2; i++) {
         
         aSCIICell(i);
      
      }
   
   
   
   }   
   //takes in a row number from aSCII, and prints a number of cells based on the row number
   public static void aSCIICell(int rowNum) {
      for(int m = 1; m <= rowNum; m++)   {
         
         System.out.print(" ");
         for(int i = 1; i <= SIZE - 2; i++) {
            
            System.out.print("=");
         }
      }   
      System.out.println();
      for(int j = 1; j <= SIZE / 2 - 3; j++) {
         for(int z = 1; z <= rowNum; z++) { 
            System.out.print("|");
            for(int k = 1; k <= SIZE - 2; k++)  {
            
               System.out.print(" ");
            }
         }   
         System.out.println("|");   
      }
      for(int o = 1; o <= rowNum; o++) {
      
         System.out.print(" ");
         for(int L = 1; L <= SIZE - 2; L++) {
            
            System.out.print("=");
         }
      }   
 
   System.out.println();
   }
   
}