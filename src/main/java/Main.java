package main.java;

import main.java.Models.Combination;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import main.java.Models.CombinationType;
import main.java.Models.DiceSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Gambler!");
        int [] handOne = new int[6];
        handOne = generateHand();
        defineCombination(handOne);
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
        int[] nominals = new int[6];
        Random diceRandomizator = new Random();
        for (int i = 0; i < nominals.length; i++) {
            nominals[i] = 1 + diceRandomizator.nextInt(6);
        }
        //Вывод:
        for (int i = 0; i < nominals.length; i++) {
            System.out.print(nominals[i] + " ");
        }
        System.out.println();
        return nominals;
    }
    public static Combination defineCombination(int[] hand) {
        // TODO: реализовать определение комбинации
        // hand -> DiceSet[], отсотрированный по DiceSet.count
        // [2 4 3 6 3 1]   ->   DiceSet(int value, int count)
        // сортирую Руку:
        int bubbleBuffer;
        for (int i = 0; i < hand.length-1; i++){
            for(int j = 0; j < hand.length - i - 1; j++){
                if (hand[j] > hand[j+1]) {
                    bubbleBuffer = hand[j+1];
                    hand[j+1] = hand[j];
                    hand[j] = bubbleBuffer;
                }
            }
        }
        // вывод сортированной Руки:
        for (int i = 0; i < hand.length; i++) {
            System.out.print(hand[i] + " ");
        }
        System.out.println();

        //Начинаем делать группки костей:
        ArrayList<DiceSet> diceSetList = new ArrayList<>();
        DiceSet currentSet = new DiceSet(hand[0], 1);
        for (int i = 1; i < hand.length; i++) {
            if (hand[i] == currentSet.getNominal()) {
                currentSet.incrementCount();
            }
            else {
                diceSetList.add(currentSet);
                currentSet = new DiceSet(hand[i], 1);
            }


        }
//        for (int i = 0; i < hand.length; i++) {        }
//        DiceSet setN1 = new DiceSet(hand[0], 1);
//        DiceSet setN2 = new DiceSet(hand[1], )

        // DiceSet[]

        //if (DiceSet[] like [2, 1, 1, 1, 1]) {
        //    return new Combination(CombinationType.Pair, new int[] { /* nominal пары */} );
        //}
        // и так далее
        //else if () {

        //}

        return null;
    }

    public static Combination defineCombination2(int[] hand) {

        int[] counts = new int[6];
        for (int i = 0; i < hand.length; i++) {
            counts[hand[i]]++;
        }

        ArrayList<DiceSet> diceSets = new ArrayList<>();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                diceSets.add(new DiceSet(i, counts[i]));
            }
        }

        return null;
    }
}

