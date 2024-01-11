package com.lambda.prac;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
	
	public Predicate<Hotel> getLambdaExp(){
		int PRICE = 2000;
		List<Integer> ar = new ArrayList<>();
		Predicate<Hotel> lambdaExp = hotel -> {
			return hotel.getPricePerNight() <= PRICE;
		};
		return lambdaExp;
	}

	public static void main(String[] args) {
		HotelService hotelService = new HotelService();
		
		Main main = new Main();
		Predicate<Hotel> lambdaExp = main.getLambdaExp();
		
		List<Hotel> hotels = hotelService.filterHotels(lambdaExp);
		
//		List<Hotel> hotels = hotelService.filterHotels(new FilteringCondition() {
//			@Override
//			public boolean test(Hotel hotel) {
//				return hotel.getPricePerNight() <= 2000;
//			}
//		});
		
//		List<Hotel> hotels = hotelService.filterHotels(hotel -> hotel.getPricePerNight() <= 2000);
		
		System.out.println("List of hotels under 2000" + hotels);
		
//		List<Hotel> fiveStars = hotelService.filterHotels(new FilteringCondition() {
//			@Override
//			public boolean test(Hotel hotel) {
//				return hotel.getHotelType() == HotelType.FIVE_STAR;
//			}
//		});
		
		List<Hotel> fiveStars = hotelService.filterHotels(hotel -> hotel.getHotelType() == HotelType.FIVE_STAR);

		System.out.println(fiveStars);
		
		
		//Predicate Interface
		
		Predicate<Integer> divBy2 = no -> no % 2 == 0;
		Predicate<Integer> divBy3 = no -> no % 3 == 0;
		
		Predicate<Integer> divBy6 = divBy2.and(divBy3);
		
		System.out.println(divBy6.test(6));
		
		
		//Consumer Interface
		
		List<Integer> lst = List.of(1,2,3,4,5);
		Consumer<Integer> consumer = a -> System.out.println(a);
		
		lst.forEach(consumer);
		
		
		//Supplier Interface
		
		Supplier<Double> supplier = () -> Math.random();
		System.out.println(supplier.get());
		
		
		//Function Interface
		
		Function<String, Integer> strToLenMap = (string) -> string.length();
		System.out.println(strToLenMap.apply("hargovind"));
		
		Function<String, String> strToStr = Function.identity();
		System.out.println(strToStr.apply("HAR"));
		
		Function<Integer, Integer> squares = a -> a*a;
		Function<Integer, Integer> addOne = a -> a+1;
		
		Integer len = squares.andThen(addOne).andThen(squares).apply(2);
		System.out.println(len);
		
		//Functional Interface with Primitive support
		//IntPredicate
		//doublePredicate
		
//		List.of(1,2,3,4,5).forEach(x -> System.out.println(x));
		
		//Method References
		List.of(1,2,3,4,5).forEach(System.out::println);
		
	}

}