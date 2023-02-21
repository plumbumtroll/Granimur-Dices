package main.java;

import main.java.Models.Combination;
import main.java.Models.CombinationType;
import main.java.Models.DiceSet;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello main.java.Models.Gambler!");

//TODO
//        Сделать Класс, от которого будут наследоваться игроки
//        (в классе инициализация массивРуки из 6 значений - соответствие 6 костям)
//        Инициализация игроков 1 и 2
//        Создать шаблонов для методов:
//        - бросок
//        - анализ
//        - вывод выброшенной руки (отсортированной или нет?)
//        - выбор для переброса
//        - переброс
//        - сравнение комбинаций
    }

    public static int[] generateHand(){
        // TODO: реализовать генерацию руки (стартовый бросок)
        return null;
    }

    public static Combination defineCombination(int[] hand){
        // TODO: реализовать определение комбинации

        // hand -> DiceSet[], отсотрированный по DiceSet.count

        // DiceSet[]

        //if (DiceSet[] like [2, 1, 1, 1, 1]) {
        //    return new Combination(CombinationType.Pair, new int[] { /* nominal пары */} );
        //}
        // и так далее
        //else if () {

        //}

        return null;
    }
}

