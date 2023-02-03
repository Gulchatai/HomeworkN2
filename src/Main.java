public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat -1.6;
        paper = paper -7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        var totalWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Обший вес двух бойцов " + totalWeight + "кг");
        var weightDifferenceBoxer = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница в весах бойцов " + weightDifferenceBoxer + "кг");

        System.out.println("Разница в весах бойцов (из большего веса вычесть меньший) " + (weightSecondBoxer - weightFirstBoxer) + "кг");
        System.out.println("Разница в весах бойцов (используя метов функцию остатка от деления) " + (weightSecondBoxer % weightFirstBoxer) + "кг");
    }
}