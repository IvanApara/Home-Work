package practice;

import java.util.Scanner;

public class TrucksAndContainers {

    private static final int MAX_CONTAINERS_IN_TRUCK = 12;
    private static final int MAX_BOXES_IN_CONTAINER = 27;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //получение количество коробок от пользователя
        int boxes = scanner.nextInt();
        int newContainer = 1;
        int truck = 1;
        int box;
        int container;




        if (boxes == 0) {
            System.out.println("Необходимо:" + System.lineSeparator() + "грузовиков - " + 0 + " шт."
                    + System.lineSeparator() + "контейнеров - " + 0 + " шт.");
        }

        if (boxes >= 1) {

            int containers = boxes / MAX_BOXES_IN_CONTAINER + (boxes % MAX_BOXES_IN_CONTAINER == 0 ? 0 : 1);


                System.out.println("Грузовик: " + truck);

                for (container = 1; container <= containers; ++container) {

                    System.out.println("\tКонтейнер: " + container);

                    for (box = newContainer; box <= boxes; box++) {
                        System.out.println("\t\tЯщик: " + box);

                        if (box / MAX_BOXES_IN_CONTAINER == container) {
                            break;
                        }
                    }
                    newContainer = ++box;

                    if (container / MAX_CONTAINERS_IN_TRUCK == truck){
                        truck++;
                        System.out.println("Грузовик: " + truck);
                    }
                    if(container == containers){
                        break;
                    }
                }

            System.out.println("Необходимо:" + System.lineSeparator() + "грузовиков - " + truck + " шт."
                    + System.lineSeparator() + "контейнеров - " + container + " шт.");

        }


            // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
            // пример вывода при вводе 2
            // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */



    }
}
