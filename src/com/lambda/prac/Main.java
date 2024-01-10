package com.lambda.prac;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		HotelService hotelService = new HotelService();
		
//		List<Hotel> hotels = hotelService.filterHotels(new FilteringCondition() {
//			@Override
//			public boolean test(Hotel hotel) {
//				return hotel.getPricePerNight() <= 2000;
//			}
//		});
		
		List<Hotel> hotels = hotelService.filterHotels(hotel -> hotel.getPricePerNight() <= 2000);
		
		System.out.println("List of hotels under 2000" + hotels);
		
//		List<Hotel> fiveStars = hotelService.filterHotels(new FilteringCondition() {
//			@Override
//			public boolean test(Hotel hotel) {
//				return hotel.getHotelType() == HotelType.FIVE_STAR;
//			}
//		});
		
		List<Hotel> fiveStars = hotelService.filterHotels(hotel -> hotel.getHotelType() == HotelType.FIVE_STAR);

		System.out.println(fiveStars);
	}

}