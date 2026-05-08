import java.util.ArrayList;

public class MyFarm {

    ArrayList<Plot> row;

    ArrayList<Integer> nums;

    public static void main(String[] args) {
        MyFarm garden = new MyFarm();
    }

    public MyFarm() {

        /***
         * array-list version
         */
        row = new ArrayList<>();

        nums = new ArrayList<>();
        nums.add(9);


        for (int z = 0; z < 10; z++) {
            row.add(new Plot());

        }


        /***
         * for each method you code, call it here
         */
printRowInfo();
totalPlants();
printPlantNames();
addLettuce();
printPlantNames();
addTulip();
tomatoLocations();
totalCarrots();
averageNumberOfPlants();
numberOfCarrotPlots();
numberOfEmptyPlots();
everyOtherNeedsWater();
plantWithMaxNumber();
plantWithMinNumber();
greaterThan10();
plantWithMaxNumberNeedsWater();


    }

    public void totalPlants() {
        // how many total plants are there in the row?
        int i = 0;
        for (int x = 0; x < row.size(); x++){
            i = i+ row.get(x).numberOfPlants;
        }
        System.out.println("total number of plants: " + i);
    }

    public void printPlantNames() {
        // print the name of each plant in the row and its index
        for (int x = 0; x < row.size(); x++){
            System.out.println(x + ": " + row.get(x).plantName);
        }
    }

    public void printRowInfo() {
        // use the printPlotInfo() method in Plot.java to print all information for each plot in the row
        for (int x = 0; x < row.size(); x++){
            row.get(x).printPlotInfo();
        }
    }

    public void addLettuce() {
        // add a lettuce plot to the end of the row// with 42 plants that need water
        // call printPlantNames() method before and after your addition to make sure it worked
        row.add(new Plot("lettuce", 42, true));
    }

    public void addTulip() {
        // at index 3, add a new tulip plot with 70 plants that do not need water
        // call printPlantNames() method before and after your addition to make sure it worked
        printPlantNames();
        row.add(3, new Plot("Tulips", 70,false));
        printPlantNames();

    }

    public void tomatoLocations() {
        // print indexes of all tomato plants
        // call printPlantNames() method to make sure you're getting the correct indexes
       printPlantNames();
        for (int y = 0; y < row.size(); y++){
            if (row.get(y).plantName.equals("tomato")){
                System.out.println("tomatoes at index: " + y);
            }

        }



        // Note: this one needs a for loop, NOT a for each loop
    }

    public void totalCarrots() {
        // how many total carrot plants are there?
        printPlantNames();
        int i = 0;
        for (int x = 0; x < row.size(); x++){
            if (row.get(x).plantName.equals("carrot")){
                i=i+1;
            }
        }
        System.out.println("number of carrots: " + i);

    }

    public void averageNumberOfPlants() {
        int s = 0;
       for (int x = 0; x < row.size(); x++){
           s = row.get(x).numberOfPlants;
       }
       double ave = s/row.size();
        // what is the average number of plants per plot?
        System.out.println("The average is: " + ave);

    }

    public void numberOfCarrotPlots() {
        int e = 0;
        for (int y = 0; y < row.size(); y++){
            if (row.get(y).plantName.equals("carrot")){
                e = y+e;
            }
        }
        System.out.println("Number of plots with carrots: " + e);
        // how many plots have carrots on them

    }

    public void numberOfEmptyPlots() {
        // how many plots are empty
        int u = 0;
        for (int p = 0; p < row.size(); p++){
            if (row.get(p).plantName.equals("empty")){
                u = p + u;
            }
        }
        System.out.println("Number of plots with empty: " + u);

    }

    public void everyOtherNeedsWater(){
        // change the value of needsWater to be true for even numbered indexes and false for odd numbered indexes
        for (int c = 0; c < row.size(); c=c+2){
            row.get(c).needsWater = true;
        }
        for (int g = 1; g < row.size(); g = g + 2){
            row.get(g).needsWater = false;
        }
    }

    public void plantWithMaxNumber() {
        // which plant type has the most total plants?
        int tom = 0;
        int lett = 0;
        int emp = 0;
        int car = 0;
        for (int h = 0; h < row.size(); h++){
            if (row.get(h).plantName.equals("tomato")){
                tom++;
            }
            if (row.get(h).plantName.equals("lettuce")){
                lett++;
            }
            if (row.get(h).plantName.equals("empty")){
                emp++;
            }
            if (row.get(h).plantName.equals("carrot")){
                car++;
            }
        }
        if (car > lett && car > tom && car > emp){
            System.out.println("Carrots are the most");
        }
        if (lett > car && lett > tom && lett > emp){
            System.out.println("lettuce is the most");
        }
        if (tom > lett && tom > car && tom > emp){
            System.out.println("tomatoes are the most");
        }
        if (emp > lett && emp > car && emp > tom){
            System.out.println("Most are empty");
        }
    }

    public void plantWithMinNumber() {
        // which plant type has the least total plants (not counting empty plots)?
        int tom = 0;
        int lett = 0;
        int car = 0;
        for (int h = 0; h < row.size(); h++){
            if (row.get(h).plantName.equals("tomato")){
                tom++;
            }
            if (row.get(h).plantName.equals("lettuce")){
                lett++;
            }
            if (row.get(h).plantName.equals("carrot")){
                car++;
            }
        }
        if (car < lett && car < tom){
            System.out.println("Carrots are the least");
        }
        if (lett < car && lett < tom){
            System.out.println("lettuce is the least");
        }
        if (tom < lett && tom < car){
            System.out.println("tomatoes are the least");
        }
    }

    public void greaterThan10() {
        // how many plots have more than 10 plants in the plot?
        int numPlots = 0;
        for (int j = 0; j < row.size(); j++){
            if (row.get(j).numberOfPlants >= 10){
                numPlots++;
            }
        }
        System.out.println("The number of plots have over ten plants: " + numPlots);
    }

    public void plantWithMaxNumberNeedsWater(){
        // which plant type has the most total plants (not counting empty plots) that needs water?
        int tom = 0;
        int lett = 0;
        int car = 0;
        for (int h = 0; h < row.size(); h++){
            if (row.get(h).plantName.equals("tomato") && row.get(h).needsWater){
                tom++;
            }
            if (row.get(h).plantName.equals("lettuce") && row.get(h).needsWater){
                lett++;
            }
            if (row.get(h).plantName.equals("carrot") && row.get(h).needsWater){
                car++;
            }
        }
        if (car > lett && car > tom){
            System.out.println("Carrots need most");
        }
        if (lett > car && lett > tom){
            System.out.println("lettuce need most");
        }
        if (tom > lett && tom > car){
            System.out.println("tomatoes need most");
        }
    }

    /***
     * more challenging
     */
    public void greatestDifferenceNumberBetweenAnyPlants() {
        // of every pair of adjacent plots, which two have the greatest difference in plant numbers?
        // what is that difference?


    }

    public void numberOfCarrotPlotsNextToLettuce() {
        // how many carrot plots share a border with a lettuce plot?
    }

    public void removeFirstCarrot() {
        // remove the first carrot plot
        // call printPlantNames() method before and after your removal to make sure it worked

    }

    public void removeAllEmpty() {
        // remove all empty plots
        // call printPlantNames() method before and after your removal to make sure it worked
    } // arraylist-specific

    /***
     * most challenging
     */
    public void greatestDifferenceOfPlantNumbers() {
        // what is the largest difference in plant numbers between two plants of the same type?
    }

}
