package com.lambda.prac;

public class Hotel {
	public int pricePerNight;
	public int rating;
	public HotelType hotelType;
	
	public Hotel(int pricePerNight, int review, HotelType hotelType) {
		this.pricePerNight = pricePerNight;
		this.rating = review;
		this.hotelType = hotelType;
	}

	public int getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public HotelType getHotelType() {
		return hotelType;
	}

	public void setHotelType(HotelType hotelType) {
		this.hotelType = hotelType;
	}

	@Override
	public String toString() {
		return "Hotel [pricePerNight=" + pricePerNight + ", rating=" + rating + ", hotelType=" + hotelType + "]";
	}
}
