package io.hexlet;

public class App {
    public static void printSquare(Circle fig) {
        try {
            var square = Math.round(fig.getSquare());
            System.out.println(square);
        } catch (NegativeRadiusException e) {
            System.out.println("Не удалось посчитать площадь");
        }
        System.out.println("Вычисление окончено");
    }
}
