package com.Gord.classwork.lec_9.task_6;

public class Task6 {
    public static void main(String[] args) {
        String string = "While major add add gameplay plan  components are already in place and functioning, players help is needed to add some of the smaller features and content. Of course polishing the overall experience is important at the same time. Game has been extensively tested in closed group, but it is always important to hear fresh suggestions from larger crowd that come from various gaming backgrounds. Plan is to make the game as good as possible but without compromising the core idea.";
        String foundAdd = ("add");
        String foundAlert = ("alert");
        String foundGood = ("good");
        String foundPlan = ("plan");
        int numFoundAdd = string.indexOf(foundAdd);
        int numFoundAlert = string.indexOf(foundAlert);
        int numFoundGood = string.indexOf(foundGood);
        int numFoundPlan = string.indexOf(foundPlan);
        int sumFoundAdd = 0;
        int sumFoundAlert = 0;
        int sumFoundGood = 0;
        int sumFoundPlan = 0;
        while (numFoundAdd >= 0) {
            System.out.println("Слово " + foundAdd + " найдено в индексе: " + numFoundAdd);
            numFoundAdd = string.indexOf(foundAdd, numFoundAdd + 1);
            sumFoundAdd++;
        }
        if (sumFoundAdd == 0) {
            System.out.println("Слово " + foundAdd + " не найдено в строке");
        }
        System.out.println("Суммарное колличество вхождений " + foundAdd + " в строку составило: " + sumFoundAdd+"\n");
        while (numFoundAlert >= 0) {
            System.out.println("Слово " + foundAlert + " найдено в индексе: " + numFoundAlert);
            numFoundAdd = string.indexOf(foundAlert, numFoundAlert + 1);
            sumFoundAlert++;
        }
        if (sumFoundAlert == 0) {
            System.out.println("Слово " + foundAlert + " не найдено в строке");
        }
        System.out.println("Суммарное колличество вхождений " + foundAlert + " в строку составило: " + sumFoundAlert+"\n");

        while (numFoundGood >= 0) {
            System.out.println("Слово " + foundGood + " найдено в индексе: " + numFoundGood);
            numFoundGood = string.indexOf(foundGood, numFoundGood + 1);
            sumFoundGood++;
        }
        if (sumFoundGood == 0) {
            System.out.println("Слово " + foundGood + " не найдено в строке");
        }
        System.out.println("Суммарное колличество вхождений " + foundGood + " в строку составило: " + sumFoundGood+"\n");
        while (numFoundPlan >= 0) {
            System.out.println("Слово " + foundPlan + " найдено в индексе: " + numFoundPlan);
            numFoundPlan = string.indexOf(foundPlan, numFoundPlan + 1);
            sumFoundPlan++;
        }
        if (sumFoundPlan == 0) {
            System.out.println("Слово " + foundPlan + " не найдено в строке");
        }
        System.out.println("Суммарное колличество вхождений " + foundPlan + " в строку составило: " + sumFoundPlan+"\n");
}
