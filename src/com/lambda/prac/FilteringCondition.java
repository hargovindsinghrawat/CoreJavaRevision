package com.lambda.prac;

@FunctionalInterface
public interface FilteringCondition {
	abstract boolean test(Hotel hotel);
}
