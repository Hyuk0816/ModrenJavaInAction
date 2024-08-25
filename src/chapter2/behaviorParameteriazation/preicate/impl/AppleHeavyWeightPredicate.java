package chapter2.behaviorParameteriazation.preicate.impl;

import chapter2.behaviorParameteriazation.entity.Apple;
import chapter2.behaviorParameteriazation.preicate.ApplePredicate;

public class AppleHeavyWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
