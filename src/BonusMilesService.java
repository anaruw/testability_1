public class BonusMilesService {

    public int calculate(int price){

        short bonusCost = 20;

        int result = price / bonusCost;
        return result;
    }
}
