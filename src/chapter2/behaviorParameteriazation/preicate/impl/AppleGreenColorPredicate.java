package chapter2.behaviorParameteriazation.preicate.impl;

import chapter2.behaviorParameteriazation.entity.Apple;
import chapter2.behaviorParameteriazation.entity.Color;
import chapter2.behaviorParameteriazation.preicate.ApplePredicate;

public class AppleGreenColorPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return Color.GREEN.equals(apple.getColor());
    }
}
