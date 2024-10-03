public class MonthData {

    int[] days = new int[30];


    MonthData(){
        for (int i = 0; i < days.length; i++) {
            days[i] = 0;
        }
    }

    int sumStepsFromMonth(){

        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps = sumSteps + days[i];
        }

        return sumSteps;
    }


    void printDaysAndStepsPerMonth(){
        for (int i = 0; i < days.length; i++) {
            System.out.println("День " + (i + 1) + ": " + days[i] + " шагов.");
        }
    }

    int maxStepsFromMonth(){
        int maxSteps = 0;


        for (int i = 0; i < days.length; i++) {
            if (days[i] > maxSteps){
                maxSteps = days[i];
            }
        }
        return maxSteps;
    }

    int bestSeries(int goalByStepsPerDay){

        int bestStepSeries = 0;
        int localBestSeries = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i] >= goalByStepsPerDay){
                localBestSeries += 1;
            }else{
                if(localBestSeries > bestStepSeries){
                    bestStepSeries = localBestSeries;
                }
                localBestSeries = 0;
            }
        }
        if(localBestSeries > bestStepSeries){
            bestStepSeries = localBestSeries;
        }
        return bestStepSeries;
    }

}
