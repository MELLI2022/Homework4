import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {

        {// Задание 1.1
            int age = 24;
            if (age >= 18) {
                System.out.println("Поздравляем с совершенолетием");
            }
            if (age < 18) {
                System.out.println("Возраст совершенолетия ещё не наступил");
            }
            //Задание 1.2
            if (age >= 7 && age < 18) {
                System.out.println("Ребенок может посещать школу");
            }
            if (age >= 18 && age < 24) {
                System.out.println("Человек может учиться в университете");
            }
            if (age >= 24) {
                System.out.println("Человеку пора искать первую работу");
            }
            //Задание1.3

            int wagonOccypancy = 102;
            int seatPlace = 60;
            int standingPlace = wagonOccypancy - seatPlace;
            System.out.println("Колличество сидячих мест в вагоне равно " + standingPlace + "");
            int seat = 59;
            int stand = 41;
            if (seat == seatPlace) {
                System.out.println("Сидячих мест нет");
            }
            if (stand == standingPlace) {
                System.out.println("Стоячих мест нет");
            }
            if (stand < standingPlace) {
                System.out.println("В вагоне есть " + (standingPlace - stand) + " стоячee мест");
            }
            if (seat < seatPlace) {
                System.out.println("В вагоне есть " + (seatPlace - seat) + " сидячee мест");
            }

        }
        {// Задание 2.1
            int age = 24;
            if (age >= 18) {
                System.out.println("Поздравляем с совершенолетием");
            } else if (age < 18) {
                System.out.println("Возраст совершенолетия ещё не наступил");
            }
            //Задание 2.2
            if (age >= 7 && age < 18) {
                System.out.println("Ребенок может посещать школу");
            } else if (age >= 18 && age < 24) {
                System.out.println("Человек может учиться в университете");
            } else if (age >= 24) {
                System.out.println("Человеку пора искать первую работу");
            }
            //Задание2.3

            int wagonOccypancy = 102;
            int seatPlace = 60;
            int standingPlace = wagonOccypancy - seatPlace;
            System.out.println("Колличество сидячих мест в вагоне равно " + standingPlace + "");
            int seat = 61;
            int stand = 42;
            if (seat < seatPlace) {
                System.out.println("В вагоне есть " + (seatPlace - seat) + " сидячee мест");
            } else {
                System.out.println("Сидячих мест нет");
            }
            if (stand < standingPlace) {
                System.out.println("В вагоне есть " + (standingPlace - stand) + " стоячee мест");
            } else {
                System.out.println("Стоячих мест нет");
            }

        }
        {// Задание 3.1
            int personAge = 15;
            if (personAge >= 2 && personAge <= 6) {
                System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить в детский садик");
            } else if (personAge >= 7 && personAge <= 18) {
                System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить в школу");
            } else if (personAge > 18 && personAge < 24) {
                System.out.println("Если возраст человека равен " + personAge + " то ему нужно ходить в университет");
            } else {
                System.out.println("Если возраст человека равен" + personAge + " то ему нужно идти на работу");
            }
            // Задание 3.2
            if (personAge < 5) {
                System.out.println("Если возраст человека равен " + personAge + " то он не может кататься на атракционе");
            } else if (personAge >= 5 && personAge < 14) {
                System.out.println("Если возраст человека равен " + personAge + " то он может кататься на атракционе в соопровождении взрослых");
            } else {
                System.out.println("Если возраст человека равен " + personAge + " то он может кататься на атракционе самостоятельно");
            }
            // Задание 3.2
            int one = 4;
            int two = 56;
            int three = 60;
            if (one > two) {
                    System.out.println("Большее число " + one + "");
                } else if (two > one) {
                        System.out.println("Большее число " + two + "");
                    } else {
                        System.out.println("Большее число " + three + "");
                    }
                }
            }
        }





































































































