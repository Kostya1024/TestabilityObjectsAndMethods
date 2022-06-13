public class BonusMilesService {
    public int calculate (int price ) {
        int priceOfOneMile = 20;
        int miles = price/priceOfOneMile;
        return miles;
    }
}
