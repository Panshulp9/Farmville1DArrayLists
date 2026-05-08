public class Plot {
    public String plantName;
    public int numberOfPlants;
    public boolean needsWater;

    public Plot(String pPlantName, int pNumberOfPlants, boolean pNeedsWater) {

        plantName = pPlantName;
        numberOfPlants = pNumberOfPlants;
        needsWater = pNeedsWater;

    }

    public Plot() {



        // choose random numbers for plantID and numberOfPlants

        numberOfPlants = (int)(Math.random() * 100 + 10);
        int plantID = (int)(Math.random() * 5);
        // assign plant name based on plantID
        if (plantID == 0) {
            plantName = "carrot";
        } else if (plantID == 1) {
            plantName = "tulip";
        } else if (plantID == 2) {
            plantName = "lettuce";
        } else if (plantID == 3) {
            plantName = "tomato";
        } else {
            plantName = "empty";
            numberOfPlants = 0;
        }
    }

    public void printPlotInfo(){

        System.out.println("***");
        System.out.println("type of plot: " + plantName);
        System.out.println("number of plants: " + numberOfPlants);
        System.out.println("needs water: " + needsWater);
//        System.out.println();

    }


}