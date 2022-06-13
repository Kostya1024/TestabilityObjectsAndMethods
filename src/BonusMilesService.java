public class BonusMilesService {
    public int calculate (int cost ) {
        int priceOfOneMile = 20;
        int miles = cost/priceOfOneMile;
        return miles;
    }
}
