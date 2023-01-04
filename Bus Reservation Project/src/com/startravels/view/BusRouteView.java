package com.startravels.view;

import java.util.Scanner;

import com.startravels.model.BusRoute;
import com.startravels.service.BusRouteService;

public class BusRouteView {
	
	static Scanner sc=new Scanner(System.in);
	BusRouteService busRouteService=new BusRouteService();
	
	public void addBusRouteDetails() {
		BusRoute busRoute = new BusRoute();
		System.out.println("Enter Bus id");
		busRoute.setBusId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter Route Id");
		busRoute.setRouteId(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter bus Source City");
		busRoute.setBusSourceCity(sc.nextLine());
	
		System.out.println("Enter bus Destination City");
		busRoute.setBusDestinationCity(sc.nextLine());
		
		
		System.out.println(busRouteService.addBusDetails(busRoute));
	}
	
	public void displayBusRouteDetails() {
		
		BusRoute[] busRoute=busRouteService.displayBusRouteDetails();
		int i=0;
		while(busRoute[i]!=null) {
			System.out.println(busRoute[i]);
			i++;
		}
		
	}

}
