public class Item {
    // adding one member variable to the Item class, int index. Don't forget to give it a getter and setter

    // Set Member Variables
    private String name;
    private double price;
    private int index;

    //CONSTRUCTOR
    public Item(){}

    //CONSTRUCTOR OVERLOAD
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }

    // GETTERS & SETTERS
    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }

    public double getPrice (){
        return this.price;
    }

    public void setPrice(){
        this.price = price;
    }

    public int getIndex(){
        return this.index;
    }

    public void setIndex(int index){
        this.index = index;
    }


}