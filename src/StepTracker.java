import java.util.Scanner;


public class StepTracker {
    Scanner scanner;

    MonthData[] monthToData = new MonthData[12];

    Converter converter = new Converter();


    int goalByStepsPerDay = 10000;

    StepTracker(Scanner scan){
        scanner = scan;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();

        }
    }
    // Green
    // Весь метод сделан очень здорово.
    // Реализованы корректные проверки входных данных.
    // Все записывается и обрабатывается так, как необходимо, молодчина!
    void addNewNumberStepsPerDay() {
        System.out.println();
        System.out.println();
        System.out.println("Введите номер месяца:");
        int monthNum;

        while (true) {
            monthNum = scanner.nextInt();
            if (monthNum < 1 || monthNum > 12) {
                System.out.println("От 1 до 12!!!");
            } else {

                break;
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Введите день от 1 до 30 (включительно):");

        int dayOfMonth;

        while (true) {
            dayOfMonth = scanner.nextInt();
            if (dayOfMonth < 1 || dayOfMonth > 30) {
                System.out.println("От 1 до 30 (включительно)!!!");
            } else {
                break;
            }
        }


        System.out.println();
        System.out.println();

        System.out.println("Введите колличество шагов:");
        int stepsPerDay;
        while (true){
            stepsPerDay = scanner.nextInt();
            // Yellow
            // Странно, что 0 является корректным значением
            if (stepsPerDay < 0){
                System.out.println("Невозможное значение!");
            }else {
                break;
            }
        }


        MonthData monthData = monthToData[monthNum - 1];
        monthData.days[dayOfMonth - 1] = stepsPerDay;
        System.out.println("Данные сохранены!");
    }


    // Red
    // Метод ничего не должен возвращать
    // Он просто сохраняет новую цель по шагам
    int changeStepGoal(){

        System.out.println();
        System.out.println();
        System.out.println("Введите новую цель шагов:");

        while (true){
            goalByStepsPerDay = scanner.nextInt();
            if (goalByStepsPerDay < 0){
                // Yellow
                // Странно, что 0 является корректным значением
                System.out.println("Невозможное значение");
            }else {
                System.out.println("Значение сохранено!");
                break;
            }
        }
        return goalByStepsPerDay;
    }


    void printStatistic() {
        System.out.println();
        System.out.println();
        System.out.println("Статистика за какой месяц вас интересует?");
        System.out.println("Введите номер месяца:");
        int month = scanner.nextInt();
        MonthData monthData = monthToData[month - 1];
        monthData.printDaysAndStepsPerMonth();
        System.out.println();
        System.out.println("Всего шагов за месяц: " + monthData.sumStepsFromMonth() + ".");
        System.out.println();
        // Red
        // Орфография
        System.out.println("Максимальное колличество шагов за день: " + monthData.maxStepsFromMonth() + ".");
        System.out.println();
        System.out.println("Лучшая серия дней по шагам: " + monthData.bestSeries(goalByStepsPerDay) + ".");
        System.out.println();
        System.out.println("Всего пройдено " + converter.convertToKm(monthData.sumStepsFromMonth()) + " километров.");
        System.out.println();
        System.out.println("Всего сожжено " + converter.convertStepsToKilocallories(monthData.sumStepsFromMonth()) + " килокалорий.");

    }



}

