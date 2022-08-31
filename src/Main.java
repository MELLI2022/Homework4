import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание 4");

        // Задание 1
        int age1 = 19;
        if (age1 >= 18) {
            System.out.println("Поздравляем с совершенолетием");
        }
        int age2 = 17;
        if (age2 < 18) {
            System.out.println("Возраст совершенолетия ещё не наступил");
        }

        int childAge = 8;
        if (childAge >= 7) {
            System.out.println("Ребенок может посещать школу");
        }

        int human1 = 20;
        if (human1 > 18) {
            System.out.println("Человек может учиться в университете");
        }

        int human2 = 25;
        if (human2 >= 24) {
            System.out.println("Человеку пора искать первую работу");
        }

        int wagonOccypancy = 102;
        int seatPlace = 60;
        int standingPlace = wagonOccypancy - seatPlace;
        System.out.println("Колличество сидячих мест в вагоне равно " + standingPlace + "");
        int people = 103;
        if (people > 102) {
            System.out.println("Вагон уже полностью забит");
        }

        //Задание2

        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравить пользователя с днем рождения");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать");
        }

        int human = 6;
        if (human >= 7) {
            System.out.println("Может ходить в школу");
        } else {
            System.out.println("Возраст для школы ещё не наступил, нужно ходить в детский сад");
        }

        int youtn = 19;
        if (youtn >= 18) {
            System.out.println("Может ходить в универ");
        } else {
            System.out.println("Возраст для универа ещё не наступил, нужно ходить в школу");
        }

        int youngWomen = 25;
        if (youngWomen >= 24) {
            System.out.println("Пора искать первую работу");
        } else {
            System.out.println("Возраст для поиска первой работы ещё не наступил, можно учиться в университете");
        }

        int allPlace = 103;
        if (allPlace <= 102) {
            System.out.println("В вагоне есть свободные места");
        } else {
            System.out.println("Вагон уже полностью забит");
        }

        // Задание 3
        int child = 4;
        if (child >= 2 && child <= 6) {
            System.out.println("Если возраст человека равен 4 , то ему нужно ходить в детский сад ");
            int human3 = 17;
            if (human3 >= 7 && human3 <= 18) {
                System.out.println("Если возраст человека равен 17, то ему нужно ходить в школу");
            }
            int human4 = 22;
            if (human4 >= 18 && human4 < 24) {
                System.out.println("Если возраст человека равен 22, то ему нужно ходить в университет");
            } else {
                System.out.println("Он должен ходить на работу");
            }

            int child1 = 3;
            if (child1 < 5) {
                System.out.println("Ребенку возраст которого равен 3 нельзя кататься на атракционе");
            }

            int child2 = 12;
            if (child2 > 5 && child2 < 14) {
                System.out.println("Ребенок может кататься только в сопровождении взрослого,если взрослого нет, то кататься нельзя");
            }
            else {
                System.out.println("Ребенок может кататься без сопровождении взрослого");
            }
            int one = 1;
            int two = 2;
            int free = 3;
            if (two > two)
            { System.out.println(two);}
            else if (two<free){
                    System.out.println(free);}
        }
    }
}

























































































