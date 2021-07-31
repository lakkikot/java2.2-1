public class BonusMilesService {

    public int calculate(int cost) {
        int milePrice = 20;      //количество рублей для начисления 1 мили
        int bonusMile = cost / milePrice;
        return bonusMile;
    }

}
