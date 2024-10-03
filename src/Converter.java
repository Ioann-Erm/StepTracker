public class Converter {

    int convertToKm(int sumSteps) {
        int sumDistance = (int) ((sumSteps * 0.75) / 1000);
        return sumDistance;
    }

    int convertStepsToKilocallories(int sumSteps) {
        int sumKilocallories = (sumSteps * 50) / 1000;
        return sumKilocallories;
    }
}