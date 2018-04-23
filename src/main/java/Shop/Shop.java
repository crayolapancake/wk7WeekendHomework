package Shop;

public class Shop {
    private String name;
    private int stock;

    public Shop(String name, int stock){
        this.name = name;
        this.stock = stock;
    }

    public String getName(){
        return name;
    }

    public int getStockTotal(){
        return stock;
    }

    public void addToStock(int stockToAdd){
        this.stock += stockToAdd;
    }

    public void removeSomeStock(int stockToRemove){
        this.stock -= stockToRemove;
    }


}




















