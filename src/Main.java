public class Main {
    public static void main(String[] args) {
        //Задание - 1. Задача 1.
        System.out.println("Задача 1");
        var dog = 8;
        System.out.println (dog);
        var cat = 3.6;
        System.out.println (cat);
        var paper = 763789;
        System.out.println (paper);
        // Задача 2.
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println (dog);
        cat = cat + 4;
        System.out.println (cat);
        paper = paper + 4;
        System.out.println (paper);
        // Задача 3.
        System.out.println("Задача 3");
        var dog1 = 8.0;
        dog1 = dog1 - 3.5;
        System.out.println (dog1);
        cat = cat - 1.6;
        System.out.println (cat);
        paper = paper - 7639;
        System.out.println (paper);
        //Задача 4.
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println (friend);
        friend = friend + 2;
        System.out.println (friend);
        friend = friend / 7;
        System.out.println (friend);
        //Задача 5.
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println (frog);
        frog = frog * 10;
        System.out.println (frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog = frog + 4;
        System.out.println (frog);
        //Задача 6,7.
        System.out.println("Задача 6,7");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println ("общий вес бойцов " + totalWeight + " кг!");
        var weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println ("разница в весе бойцов  " + weightDifference + " кг!");
        System.out.println("Задача 7");
        totalWeight = (weightBoxer2 % weightBoxer1);
        System.out.println  ("разница в весе бойцов " + totalWeight + " кг!");
        // Задача 8.
        System.out.println("Задача 8");
        var totalTime = 640;
        var workTime = 8;
        var worker = totalTime / workTime;
        System.out.println (" Всего работников в компании " + worker + " человек");
        worker = worker + 94;
        System.out.println (" Всего работников в компании " + worker + " человек");
        totalTime = worker * workTime;
        System.out.println(" Если в компании работает " + worker + " человека то всего" + totalTime + "часа работы может быть поделено между сотрудниками");
    }
}