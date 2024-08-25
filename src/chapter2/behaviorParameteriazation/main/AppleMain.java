package chapter2.behaviorParameteriazation.main;

import chapter2.behaviorParameteriazation.entity.Apple;
import chapter2.behaviorParameteriazation.entity.Color;
import chapter2.behaviorParameteriazation.filter.AppleFilter;
import chapter2.behaviorParameteriazation.preicate.impl.AppleGreenColorPredicate;

import java.util.ArrayList;
import java.util.List;

public class AppleMain {
    public static void main(String[] args) {
        Apple apple1 = new Apple(150, Color.GREEN);
        Apple apple2 = new Apple(150, Color.RED);
        Apple apple3 = new Apple(170, Color.BLUE);
        List<Apple> apples = new ArrayList<>();
        apples.add(apple1);
        apples.add(apple2);
        apples.add(apple3);

        List<Apple> result = AppleFilter.filterApples(apples, new AppleGreenColorPredicate());

        System.out.println("초록색 사과의 갯수는 : " + result.size());

        //람다식으로 하기
        //일일이 메서드를 만들어서 하는거 보다 훨씬 유용하고 유연함 goat!
        List<Apple> resultLambda = AppleFilter.filterApples(apples,
                (Apple apple) -> Color.RED.equals(apple.getColor()));

        System.out.println("람다의 결과 갯수 : " + resultLambda.size());

        for(Apple apple : resultLambda){
            System.out.println("람다 결과 사과의 무게 : " + apple.getWeight());
            System.out.printf("람다 결과 사과 컬러 : " + apple.getColor());
        }



    }
}
