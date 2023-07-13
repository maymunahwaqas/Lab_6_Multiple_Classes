import java.util.ArrayList;

public class Gallery {


    private String name;
    //    private String artist;
    private double till;
    private ArrayList<Stock> stocks;
    private int artwork;

    public Gallery(String name) {
        this.name = name;
        this.till = till;
        this.stocks = new ArrayList<Stock>();
        this.artwork = 0;

    }

    public String getName() {
        return this.name;
    }


    public double getTill() {
        return this.till;


    }

    public int getArtworkForSale() {
        return this.artwork;
    }

    public void setArtworkForSale(int amount) {
        this.artwork = amount;
    }

    public ArrayList<Stock> getStocks() {
        return this.stocks;


    }

}
//    public void getStock




