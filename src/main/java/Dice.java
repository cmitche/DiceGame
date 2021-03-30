import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dice {
    private Integer numberOfDice;

    public Dice(Integer numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public Integer tossAndSum(){
        Random rand = new Random();
        int random = 0;
        List<Integer> listOfNumbers = new ArrayList<>();
        for(int num = 1; num <= numberOfDice; num++){
            Integer generatedNumber = rand.nextInt(7);
            if (generatedNumber <= 1){
                random = 1;
            } else {
                random = generatedNumber;
            }
            listOfNumbers.add(random);
        }
//        System.out.println("Number(s) produced by generator: " + listOfNumbers);
        int total = 0;
        for (Integer number : listOfNumbers){
            total += number;
        }
        return total;
    }

    public Integer getNumberOfDice() {
        return numberOfDice;
    }

    public void setNumberOfDice(Integer numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "numberOfDice=" + numberOfDice +
                '}';
    }
}
