public class BonusMilesService {

    public int calculateBonus (int price, int rubles) {
        int miles;
        miles = price / rubles;

        return miles;

    }
}
