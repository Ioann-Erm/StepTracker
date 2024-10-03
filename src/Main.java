import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Приветствуем вас в приложении StepTracker!");

        Scanner scanner = new Scanner(System.in);


        Menu menu = new Menu();
        StepTracker stepTracker = new StepTracker(scanner);


        while (true){

            menu.printMenu();

            int command = scanner.nextInt();

            if (command == 1) {
                stepTracker.addNewNumberStepsPerDay();
            } else if (command == 2) {
                stepTracker.changeStepGoal();
            } else if (command == 3) {
                stepTracker.printStatistic();

            } else if (command == 4) {
                System.out.println("Пока-пока");
                break;
            }else {
                System.out.println("Неверная команда");
            }
        }
    }
}
