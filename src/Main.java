public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        // Пишем код для задачи 1
        int ageMinor = 17;
        int ageAdult = 18;
        if (ageMinor < 18) {
            System.out.println("Если возраст человека равен " + ageMinor + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        if (ageAdult >= 18) {
            System.out.println("Если возраст человека равен " + ageAdult + ", то он совершеннолетний");
        }
    }


    public static void task2 () {
        System.out.println("Задача 2");
        // Пишем код для задачи 2
        int cold = 4;
        int warm = 5;
        if (cold < 5) {
            System.out.println("На улице " + cold + " градуса, нужно надеть шапку");
        }
        if (warm >= 5) {
            System.out.println("На улице " + warm + " градусов, можно идти без шапки");
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        // Пишем код для задачи 3
        int overSpeed = 61;
        int normalSpeed = 60;
        if (overSpeed > 60) {
            System.out.println("Если скорость " + overSpeed + ", то придется заплатить штраф");
        }
        if (normalSpeed <= 60) {
            System.out.println("Если скорость " + normalSpeed + ", то можно ездить спокойно");
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        // Пишем код для задачи 4
        int age = 20;
        boolean goToKindergarten = age >= 2 && age <= 6;
        boolean goToSchool = age >= 7 && age <= 18;
        boolean goToUniversity = age > 18 && age < 24;
        boolean outOfSociety = age < 2;
        if (goToKindergarten) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (goToSchool) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (goToUniversity) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        } else if (outOfSociety) {
            System.out.println("Если возраст человека равен " + age + ", то ему пока рано покидать круг семьи");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        // Пишем код для задачи 5
        int age = 12;
        boolean canNotRide = age < 5;
        boolean canRideWithAdult = age >= 5 && age < 14;
        if (canNotRide) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else if (canRideWithAdult) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        // Пишем код для задачи 6
        int people = 5;
        int wagonCapacity = 120;
        int sittings = 60;
        boolean wagonIsFull = people == 120;
        boolean thereAreStandingPlacesInTheWagon = people >= 60 && people < 120;
        boolean wagonFromIndia = people > 120;
        if (wagonIsFull) {
            System.out.println("Если в вагоне " + people + " человек, то мест больше нет");
        } else if (thereAreStandingPlacesInTheWagon) {
            System.out.println("Если в вагоне " + people + " человек, то можно занять стоячее место");
        } else if (wagonFromIndia) {
            System.out.println("Если в/на вагоне " + people + " человек, то, скорее всего, он примчал к нам из Индии, так как вагон уже давно забит (для Вас мест больше нет)");
        }
        else {
            System.out.println("Если в вагоне " + people + " человек, то можно с комфортом развалиться на сидячем месте");
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        // Пишем код для задачи 7
        // 12 13 23
        int one = 2;
        int two = 2;
        int three = 22;
        boolean threeIsBiggest = three > one && three > two;
        boolean twoIsBiggest = two > one && two > three;
        boolean twoAndThreeAreBiggest = two == three && two > one;
        boolean oneAndThreeAreBiggest = one == three && one > two;
        boolean oneAndTwoAreBiggest = one == two && one > three;
        boolean allNumbersAreBiggest = one == two && one == three;
        if (threeIsBiggest) {
            System.out.println(three + " - большее число");
        } else if (twoIsBiggest) {
            System.out.println(two + " - большее число");
        } else if (twoAndThreeAreBiggest) {
            System.out.println(two + " - большее число");
        } else if (oneAndThreeAreBiggest) {
            System.out.println(one + " - большее число");
        } else if (oneAndTwoAreBiggest) {
            System.out.println(one + " - большее число");
        } else if (allNumbersAreBiggest) {
            System.out.println(one + " - большее число");
        } else {
            System.out.println(one + " - большее число");
        }
    }
}