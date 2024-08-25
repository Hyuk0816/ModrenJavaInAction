package chapter2.behaviorParameteriazation.filter;

import chapter2.behaviorParameteriazation.entity.Apple;
import chapter2.behaviorParameteriazation.preicate.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

public class AppleFilter {

    public static List<Apple> filterApples(List<Apple> apples,
                                           ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : apples){
            if(p.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
