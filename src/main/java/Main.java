package main.java;

import main.java.Models.Combination;
import java.lang.Math;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello main.java.Models.Gambler!");
        int [] handOne = new int[6];
        handOne = generateHand();
//TODO
//        Сделать Класс, от которого будут наследоваться игроки
//        (в классе инициализация массивРуки из 6 значений - соответствие 6 костям)
//        Инициализация игроков 1 и 2
//        Создать шаблонов для методов:
//        - бросок - generateHand()
//        - анализ
//        - вывод выброшенной руки (отсортированной или нет?)
//        - выбор для переброса
//        - переброс
//        - сравнение комбинаций
    }

    public static int[] generateHand() {
        // TODO: реализовать генерацию руки (стартовый бросок)
        int[] nominals = new int[6];
        Random diceRandomizator = new Random();
        for (int i = 0; i < nominals.length; i++) {
//            int n = diceRandomizator.nextInt(1000);
            nominals[i] = 1 + diceRandomizator.nextInt(6);
        }
        for (int i = 0; i < nominals.length; i++) {
            System.out.println(nominals[i]);
        }
        return nominals;
    }
    public static Combination defineCombination(int[] hand) {
        // TODO: реализовать определение комбинации
     return null; }

}

