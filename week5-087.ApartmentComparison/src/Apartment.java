
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment apartment)
    {
        if(this.squareMeters > apartment.squareMeters)
        {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment apartment)
    {
        return Math.abs((this.pricePerSquareMeter * this.squareMeters) - (apartment.pricePerSquareMeter * apartment.squareMeters));
    }
    
    public boolean moreExpensiveThan(Apartment apartment)
    {
        if(this.pricePerSquareMeter*this.squareMeters > apartment.pricePerSquareMeter * apartment.squareMeters)
        {
            return true;
        }
        return false;
    }
}
