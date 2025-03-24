
package shoppingcartmanager;
import java.util.ArrayList;
public class ShoppingCart
{
    //Declare private field and item array
    private String customerName;
    private String currentDate;
    ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();
    
    //Default constructor
    public ShoppingCart()
    {
        currentDate = "January 1, 2016";
        customerName = "none";
    }
    //constructor
    public ShoppingCart(String name, String date)
    {
        this.currentDate = date;
        this.customerName = name;
    }
    //method to getCustomerName()
    //Accessor
    public String getCustomerName()
    {
        return customerName;
    }
    //mutator
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }
    //method to getCurrentDate()
    //Accessor 
    public String getCurrentDate()
    {
        return currentDate;
    }
    //Mutator
    public void setCurrentDate(String currentDate)
    {
        this.currentDate = currentDate;
    }
    //method to add item
    public void addItem(ItemToPurchase i)
    {
        cartItems.add(i);
    }
    //method to remove item
    public void removeItem(String name)
    {
        boolean found = false;
        for (ItemToPurchase i : cartItems)
        {
            if (i.getName().equalsIgnoreCase(name))
            {
                cartItems.remove(i);
                found = true;
                break;
            }
        }
        //If not found
        if (!found)
        {
            System.out.println("Item not found in cart. Nothing removed");
        }
    }
    //method to modify item
    public void modifyItem(ItemToPurchase item)
    {
        boolean found = false;
        for (ItemToPurchase i : cartItems)
        {
            if (i.getName().equalsIgnoreCase(item.getName()))
            {
                if (i.getItemQuantity() != 0)
                {
                    i.setItemQuantity(item.getItemQuantity());
                }
                found = true;
                break;
            }
        }
        //if not found
        if (!found)
        {
            System.out.println("Item not found in cart. Nothing removed");
        }
    }
    //method to get number of total items in cart 
    public int getNumItemsInCart()
    {
        int sum = 0;
        for (ItemToPurchase i : cartItems)
        {
            sum = sum + i.getItemQuantity();
        }
        return sum;
    }
    //method to get total price of cart
    public double getCostOfCart()
    {
        double sum = 0;
        for (ItemToPurchase i : cartItems)
        {
            sum = sum + i.getItemPrice();
        }
        return sum;

    }
    //print Total
    public void printTotal()
    {
        if (cartItems != null && cartItems.size() > 0)
        {
            System.out.println(customerName + "'s Shopping Cart - " + currentDate);
            System.out.println("Number of Items: " + cartItems.size());
            System.out.println();
            for (ItemToPurchase i : cartItems)
            {

                i.printItemCost();
            }
            System.out.println("Total: " + getCostOfCart() +"$");
        } else
        {
            System.out.println("SHOPPING CART IS EMPTY");
        }
    }
    //ptint descrpition
    public void printDescriptions()
    {
        System.out.println(customerName + "'s Shopping Cart - " + currentDate);
        System.out.println("Number of Items: " + cartItems.size());
        System.out.println();
        System.out.println("Item Descriptions");
        for (ItemToPurchase i : cartItems)
        {

            i.printItemDescription();
        }
    }
}
