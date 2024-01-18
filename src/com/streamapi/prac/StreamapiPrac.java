package com.streamapi.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamapiPrac {

	public static void main(String[] args) {

//		List<Integer> list = List.of(1,2,3,4,5,6,7,8);
//	
//		//Without Stream
//		List<Integer> listEven = new ArrayList<>();
//	
//		for(Integer l : list) {
//			if(l%2 == 0) {
//				listEven.add(l);
//			}
//		}
//		System.out.println(listEven);
//		
//		//Stream
//		List<Integer> listEven2 = list.stream().filter(i -> i%2==0).collect(Collectors.toList());
//		
//		System.out.println(listEven2);
		
		//Stream Interface object
		//1
		Stream<Object> emptyStream = Stream.empty();
		
		emptyStream.forEach(e->{
			System.out.println(e);
		});
		
		//2
		String[] name = {"Har", "Raw", "Sin", "Gov"};
		
		Stream<String> stream1 = Stream.of(name);
		
		stream1.forEach(n -> System.out.println(n));
		
		//3
		IntStream stream2 = Arrays.stream(new int[] {1,2,3,4,5,6});
		
		stream2.forEach(n -> System.out.println(n));

		//4
		List<Integer> list = List.of(1,2,3,4,5,6,7,8);
		
		Stream<Integer> stream3 = list.stream();
		
		stream3.forEach(n -> System.out.println(n));

		//Stream Methods
		
		//filter
			//boolean value function
		
		List<String> names = List.of("Abhinav", "Abh", "Har", "Hargov");
		
		List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		
		System.out.println(newNames);
		
		//map
		//each element operation
		
		List<Integer> num = List.of(1,2,3,4,5,6,7,8,9);
	
		List<Integer> newNum = num.stream().map(e->e*2).collect(Collectors.toList());

		System.out.println(newNum);
		
		//forEach
		
		names.stream().forEach(e->System.out.println(e));
		
		names.stream().forEach(System.out::println);
		
		//sort
		num.stream().sorted().forEach(System.out::println);
	}
}