/**
 * This class represents a shopper object
 * *
 * @author William Hu
 */
public class Shopper {
    /** The name of the Shopper */
    private String name;
    /** The selectedItem by the Shopper */
    private String selectedItem;
    /** The itemPrice of the selectedItem */
    private double itemPrice;

    /**
     * Instantiates a Shopper object.
     *
     * @param name The name
     */

    public Shopper(String name) {
        this.name = name;
        selectedItem = "";
        itemPrice = 0.0;
    }

    /**
     * Return the current name of the shopper.
     *
     * @return the name of the shopper
     */

    public String getName() {
        return name;
    }

    /**
     * Returns the current selectedItem by the shopper.
     *
     * @return the selectedItem of shopper
     */

    public String getSelectedItem() {
        return selectedItem;
    }

    /**
     * Sets the selectedItem to a new item
     *
     * @param newselectedItem The new selectedItem picked
     */

    public void setSelectedItem(String value) {
        selectedItem = value;
    }

    // getter and setter method for the price


}