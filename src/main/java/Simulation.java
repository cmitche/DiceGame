public class Simulation {
    private Integer numberOfDies = 0;
    private Integer numberOfTosses = 0;
    Bins bins;

    public Simulation(Integer numberOfDies, Integer numberOfTosses){
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        Bins newBins = new Bins(numberOfDies, (numberOfDies * 6));
        this.bins = newBins;
    }

    public void runSimulation(){
        Dice dice = new Dice(numberOfDies);
        Integer result = 0;
        for (int index = 0; index <= numberOfTosses; index++){
            result = dice.tossAndSum();
            for (int x = numberOfDies; x <= (numberOfDies * 6); x++){
                if (result == x){
                    bins.incrementBin(x);
                }
            }
        }
    }

    public void printResults(){
        System.out.println("***\nSimulation of " + numberOfDies + " dice tossed for " + numberOfTosses + " times. \n***");
        for (int index = numberOfDies; index <= (numberOfDies * 6); index++){
            System.out.println(index + " : " + bins.getBin(index) + " : ");
        }
    }
}
