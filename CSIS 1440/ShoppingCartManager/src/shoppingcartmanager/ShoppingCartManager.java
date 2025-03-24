//CSIS 1400

//Final Coding

//Name: Phuc Hoang

//Version
package shoppingcartmanager;
import java.util.Scanner;
public class ShoppingCartManager
{

 
    public static void main(String[] args)
    {
        //Asking for input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Customer's Name: ");
        String customerName = scan.nextLine();
        System.out.println("Enter Today's Date: ");
        String currentDate = scan.nextLine();
        ShoppingCart s = new ShoppingCart(customerName, currentDate);
        System.out.println();
        System.out.println("Customer Name: " + s.getCustomerName());
        System.out.println("Today's Date: " + currentDate);
        printMenu(s);

    }

    public static void printMenu(ShoppingCart s)
    {   //looping menu
        while (true)
        {   //Menu option
            System.out.println("MENU\na - Add item to cart\nd - Remove item from cart\nc - Change item quantity\ni - Output items's descriptions\no - Output shopping cart\nq - Quit\n\nChoose an option: ");
            Scanner scan = new Scanner(System.in);
            char ch = scan.next().charAt(0);
            scan.nextLine();
            //Add item to cart
            if (ch == 'a' || ch == 'A')
            {
                System.out.println("ADD ITEM TO CART");
                System.out.println("Enter Item Name: ");
                String name = scan.nextLine();

                System.out.println("Enter Item Description: ");
                String itemDescritpion = scan.nextLine();
                System.out.println("Enter Item Price: ");
                int itemPrice = scan.nextInt();
                System.out.println("Enter Item Quantity: ");
                int quantity = scan.nextInt();
                scan.nextLine();
                ItemToPurchase item = new ItemToPurchase(name, itemDescritpion, itemPrice, quantity);
                s.addItem(item);
            }
            //Remove item from cart
            else if (ch == 'd' || ch == 'D')
            {
                System.out.println("REMOVE ITEM FROM CART");
                System.out.println("Enter name of item to remove: ");
                String name = scan.nextLine();
                s.removeItem(name);
            //change Item quantity
            } else if (ch == 'c' || ch == 'C')
            {
                System.out.println("CHANGE ITEM QUANTITY");
                System.out.println("Enter the item name: ");
                String name = scan.nextLine();
                System.out.println("Enter the new quantity: ");
                int quantity = scan.nextInt();
                ItemToPurchase item = new ItemToPurchase();
                item.setName(name);
                item.setItemQuantity(quantity);
                s.modifyItem(item);
            } 
            //Output items's descriptions
            else if (ch == 'I' || ch == 'i')
            {
                System.out.println("OUTPUT ITEMS' DESCRIPTIONS");
                s.printDescriptions();
            } 
            //Out shopping cart
            else if (ch == 'O' || ch == 'o')
            {
                System.out.println("OUTPUT SHOPPING CART");
                s.printTotal();
            } else if (ch == 'q' || ch == 'Q')
            {
                break;
            }
        }
    }
}


