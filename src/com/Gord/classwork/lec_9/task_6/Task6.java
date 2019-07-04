package com.Gord.classwork.lec_9.task_6;

public class Task6 {
    public static void main(String[] args) {
        String text = "While major gameplay add add add components are already in place and functioning, players help is needed to add some of the smaller features and content. Of course polishing the overall experience is important at the same time. Game has been extensively tested in closed group, but it is always important to hear fresh suggestions from larger crowd that come from various gaming backgrounds. Plan is to make the game as good as possible but without compromising the core idea.";
        int indexJava = text.indexOf("add");
        int sum = 0;
        while (indexJava == -1) {
            if(indexJava == - 1) {
                System.out.println("Слово \"add\" не найдено.");
            } else {
                System.out.println("Слово \"add\" найдено в индексе " + indexJava);
                sum++;
            }
            sum++;
        }

        System.out.println(sum);
    }
}
