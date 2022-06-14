public class BonusMilesService {
    public int calculate(int cost) {
        int priceOfOneMile = 20;
        int bonusMiles = cost / priceOfOneMile;
        return bonusMiles;
    }
}
