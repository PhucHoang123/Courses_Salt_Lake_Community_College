
package shoppingcartmanager;

public class ItemToPurchase
{

    //Declaring private fields
    private String itemDescription;
    private String name;
    private double itemPrice;
    private int itemQuantity;

    //Default contrusctor
    public ItemToPurchase()
    {
        itemDescription = "none";
        itemQuantity = 0;
        itemPrice = 0;
        name = "";
    }

    //constructor
    public ItemToPurchase(String name, String description, double price, int itemQuantity)
    {
        this.itemDescription = description;
        this.name = name;
        this.itemPrice = price;
        this.itemQuantity = itemQuantity;
    }

    //mutator
    //itemDescription
    public void setItemDescription(String itemDescription)
    {
        this.itemDescription = itemDescription;
    }
  
    //itemName
    public void setName(String name)
    {
        this.name = name;
    }
    // Item individual cost
    public void setItemPrie(double itemPrie)
    {
        this.itemPrice = itemPrie;
    }
    // Item quantities
    public void setItemQuantity(int itemQuantity)
    {
        this.itemQuantity = itemQuantity;
    }

    //Acccessor
    //itemDescription
    public String getItemDescription()
    {
        return itemDescription;
    }
    //itemName
    public String getName()
    {
        return name;
    }
    // Item individual cost
    public double getItemPrice()
    {
        return itemPrice;
    }
    // Item quantities
    public int getItemQuantity()
    {
        return itemQuantity;
    }
    //print item description
    public void printItemDescription()
    {
        System.out.println(name + " " + itemDescription);
    }
    //printing item total Cost
    public void printItemCost()
    {
        System.out.println(name + " " + itemQuantity + " @ " + itemPrice + " = $" + (itemQuantity * itemPrice));
    }
}
