/*MENU Ideas: Basic testing 
*Drinks: Espresso (1s) -* $3.00 Espresso (1L)- $3.50 /
 * Latte (2s)-  $3.50 Latte (2L) 
 * Tea(3s)- $2.00 Tea(3L)-$2.50 / 
 * Frappuccino(4s)-$4.00 Frappuccino(4L)-$4.75 / 
 * Hot chocolate(5s)- $2.25 Hot chocolate (5L) 2.75 
 * Food: steak Panini (6)($7.00) 
 * /Muffin (7)($3.00)
 * / chicken Panini (8) ($7.00) 
 * / cake pop(9) ($1.75) /
 bagel (10) $3.50*/
import java.util.*;
class BrewCoffee
{
    void displayMenu()    //shows menu options
    {
        System.out.println("-------------------BrewTiful MENU---------------------");
        System.out.println("DRINKS:");
        System.out.println("1s: Espresso - $3.00");
        System.out.println("1L: Espresso - $3.50");
        System.out.println("2s: Latte - $3.50");
        System.out.println("2L: Latte - $4.00");
        System.out.println("3s: Tea - $2.00");
        System.out.println("3L: Tea - $2.50");
        System.out.println("4s: Frappuccino - $4.00");
        System.out.println("4L: Frappuccino - $4.75");
        System.out.println("5s: Hot  chocolate - $2.25");
        System.out.println("5L: Hot  chocolate - $2.75");
        System.out.println("FOOD:");
        System.out.println("6: Steak Panini - $7");
        System.out.println("7: Muffin - $3.00");
        System.out.println("8: Chicken Panini - $7.00");
        System.out.println("9: Cake Pop - $1.75");
        System.out.println("10: Bagel - $3.50");
        System.out.println("--------------------------------------------");
    }
    void showOrder(String order[],Double cost)  //showing the order of menu and cost
    {
        System.out.println("--------------------------------------------");  // This is what the user sees
        System.out.println("Your BREWTIFUL order: ");         //Keeping Company in mind
        for(int i=0;i<order.length;i++)
            if(order[i]!=null)                                   // insert loop for array
                System.out.println(order[i]);
        System.out.println("Amount to be paid: "+cost);
    }
    void processInput()
    {
        Scanner sc = new Scanner(System.in);        //Begin tracking customer input
        String order[] = new String[5];
        int k = 0;
        String product[] = {"16oz Espresso","18oz Espresso","16oz Latte","18oz Latte","16oz Tea","18oz Tea","16oz Frappuccino","18oz Frappucinno","12oz Hot Chocolate","18oz Hot Chocolate",
            "Steak Panini","Muffin","Chicken Panini","Cake Pop","Bagel"};
        Double price[]= {3.00,3.50,3.50,4.00,2.00,2.50,4.00,4.75,2.25,2.75,7.00,3.00,7.00,1.75,3.50};     // Delcaring arrays and variables
        Double cost = 0.0;
        int flag = 0;
        System.out.println();
        while(flag==0)
        {
            System.out.println("Enter your choice(X: To stop placing order):");
            String ch = sc.nextLine();
            switch(ch)                                                                  // Mandatory switch requirement
            {
                case "1s": order[k++] = product[0];
                           cost += price[0];
                           break;
                case "1L": order[k++] = product[1];
                           cost += price[1];
                           break;
                case "2s": order[k++] = product[2];
                           cost += price[2];
                           break;
                case "2L": order[k++] = product[3];
                           cost += price[3];
                           break;
                case "3s": order[k++] = product[4];
                           cost += price[4];
                           break;
                case "3L": order[k++] = product[5];
                           cost += price[5];
                           break;
                case "4s": order[k++] = product[6];
                           cost += price[6];
                           break;
                case "4L": order[k++] = product[7];
                           cost += price[7];
                           break;
                case "5s": order[k++] = product[8];
                           cost += price[8];
                           break;
                case "5L": order[k++] = product[9];
                           cost += price[9];
                           break;
                case "6": order[k++] = product[10];
                           cost += price[10];
                           break;
                case "7": order[k++] = product[11];
                           cost += price[11];
                           break;
                case "8": order[k++] = product[12];
                           cost += price[12];
                           break;
                case "9": order[k++] = product[13];
                           cost += price[13];
                           break;
                case "10": order[k++] = product[14];
                           cost += price[14];
                           break;
                case "X":flag = 1;
                          break;
                default: System.out.println("Wrong option");                   // Letting User it is invalid input.
            }
            if(k==5)
            {
                System.out.println("You can place atmost five orders.");
                break;                                                           // set paramaters for 5 items-  Letting user know whats wrong
            }
        }
        showOrder(order,cost);
    }
    public static void main(String args[])
    {
        Customer ob = new Customer();
        ob.displayMenu();
        ob.processInput();
        // Below code is used to process order of second customer
        // Customer ob2 = new Customer();
        // ob2.displayMenu();
        // ob2.processInput();
    }
}
