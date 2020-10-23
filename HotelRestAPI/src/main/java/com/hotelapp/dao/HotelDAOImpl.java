package com.hotelapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hotelapp.model.Hotel;
@Service
public class HotelDAOImpl implements HotelDAO{

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		 return showHotelList();
	}

	private List<Hotel> showHotelList() {
		// TODO Auto-generated method stub
		return Arrays.asList(new Hotel("SPR",1,"Mysore" ,"Indian"), new Hotel("Empire",2,"Banglore","South Indian"), new Hotel("BBN",3,"Manglore","Chinise"));
	}

	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		 List<Hotel> newHotelList = new ArrayList<>();
	        for(Hotel hotel : showHotelList()) {
	            if(hotel.getCity().equals(city))
	                newHotelList.add(hotel);
	        }
	        return newHotelList;
	
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		// TODO Auto-generated method stub
		List<Hotel> newHotelList = new ArrayList<>();
        for(Hotel hotel : showHotelList()) {
            if(hotel.getCuisine().equals(cuisine))
                newHotelList.add(hotel);
        }
        return newHotelList;
		
	}

	@Override
	public Hotel getById(int id) {
		// TODO Auto-generated method stub
		 for(Hotel hotel : showHotelList()) {
	            if(hotel.getHotelId()==id)
	                return hotel;
	                
	        }
	        return null;
	}

}
