import java.util.Random;
import java.util.Scanner;
class GuessNumberGame{
    static void printLine() {
        for (int i = 0; i <= 156; i++)
        {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        boolean l=true;
        while(l)
        {
          System.out.print("set a range to 1 to tell which number :-");
          int stopnum=scan.nextInt();
          System.out.print("\r");
          int Guessnum = rand.nextInt(stopnum)+1;
          int count=0;
          boolean f=true ;
          while(f)
          {
            if(count==0)
            {
                printLine();
                System.out.println("WELCOME TO THE NUMBER GUSSES GAME ^^");
                printLine();

            }
            System.out.println();
            System.out.print(" please enter the number :-");
            int number =scan.nextInt();
            System.out.print("\r");
            if(number==Guessnum)
            {
                count=count+1;
                System.out.println("you got the number ! "+number);
                System.out.println("and the attemp is "+count);
                System.out.println("if you want to play again (yes or no)");
                scan.nextLine();
                String check = scan.nextLine();
                if(check.equals("yes"))
                {
                    printLine();
                    System.out.println("oh ok your back !");
                    printLine();
                    f=false;
                    l=true;
                }
                else{
                    if(check.equals("no"))
                    {
                        printLine();
                        System.out.println("thank you <3");
                        printLine();
                        f=false;
                        l=false;
                    }
                    else{
                        printLine();
                        System.out.println("error please try again later");     
                        printLine();               
                    }
                }
                
            }
            else{
                count=count+1;
                if(Guessnum<number)
                {
                  System.out.println("|lower|");
                  f=true;
                  
                }
                else{
                    System.out.println("|higher|");
                    f=true;
                }
            }
          } 
        }
        scan.close(); 
    
    }
        
}