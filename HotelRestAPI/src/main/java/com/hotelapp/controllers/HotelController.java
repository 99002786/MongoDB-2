package com.hotelapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hotelapp.model.Hotel;
import com.hotelapp.service.HotelService;

@RestController
public class HotelController {
	@Autowired
	HotelService hotelService;
	@GetMapping("/hotels")
	 public List<Hotel> showAllHotels(){
		 return hotelService.getAllHotels();
	 }
	@GetMapping("/hotels-by-city/{city}")
	 public List<Hotel> showHotelsByCity(@PathVariable("city")String city){
		 return hotelService.getByCity(city);
	 }
	@GetMapping("/hotels-by-cuisine/{cuisine}")
	 public List<Hotel> showHotelsByCuisine(@PathVariable("cuisine")String cuisine){
		 return hotelService.getByCuisine(cuisine);
	 }
	@GetMapping("/hotel-by-Id/{hotelId}")
	 public Hotel showHotelsById(@PathVariable("hotelId")Integer id){
		 return hotelService.getById(id);
	 }
	

}
