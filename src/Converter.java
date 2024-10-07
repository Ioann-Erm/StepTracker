public class Converter {

    int convertToKm(int sumSteps) {
        // Yellow
        // Можно сразу возвращать значение, вместо того, чтобы создавать дополнительную переменную
        // return (int) ((sumSteps * 0.75) / 1000);
        int sumDistance = (int) ((sumSteps * 0.75) / 1000);
        return sumDistance;
    }

    int convertStepsToKilocallories(int sumSteps) {
        // Yellow
        // Можно сразу возвращать значение, вместо того, чтобы создавать дополнительную переменную
        // return (int) ((sumSteps * 0.75) / 1000);
        int sumKilocallories = (sumSteps * 50) / 1000;
        return sumKilocallories;
    }
}