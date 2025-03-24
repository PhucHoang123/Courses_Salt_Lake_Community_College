
package shoppingcartprinter.java;

public class ItemToPurchase
{
    //Declare private field
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    //Default constructor
    public ItemToPurchase()
    {
        this.itemName = "none";
        this.itemPrice = 0;
        this.itemQuantity = 0;
    }

    //constructor
    public ItemToPurchase(String itemName, int itemPrice, int itemQuantity)
    {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    //mutator
    public void setName(String nameItem)
    {
        itemName = nameItem;
    }

    public void setPrice(int priceItem)
    {
        itemPrice = priceItem;
    }

    public void setQuantity(int numItem)
    {
        itemQuantity = numItem;
    }

    //accessor
    public String getName()
    {
        return itemName;
    }

    public int getPrice()
    {
        return itemPrice;
    }

    public int getQuantity()
    {
        return itemQuantity;
    }
    
    //printing method
    //public void printItem()
    //{
    //    System.out.println(itemName + " " + itemQuantity + " @ $" + itemPrice + " = $" + (itemPrice * itemQuantity));
    //}
}
