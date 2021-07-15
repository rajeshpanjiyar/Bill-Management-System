package com.billmanagement;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

	private static List<FoodItems> listFoodItems = new ArrayList<>();

	public static List<FoodItems> getListFoodItems() {
		return listFoodItems;
	}

	public static void setListFoodItems(List<FoodItems> listFoodItems) {
		DataRepository.listFoodItems = listFoodItems;
	}

	public static void setSingleFoodItem(FoodItems foodItem) {
		listFoodItems.add(foodItem);
	}

	public static FoodItems getSingleFoodItem(int sn) {
		for (FoodItems fi : listFoodItems) {
			if (fi.getSn() == sn) {
				return fi;
			}
		}
		return null;
	}

	static {
		listFoodItems.add(new FoodItems(1, "Aloo Methi ", 20));
		listFoodItems.add(new FoodItems(2, "Bombay Biryani", 30));
		listFoodItems.add(new FoodItems(3, "Sabudana vada", 35));
		listFoodItems.add(new FoodItems(4, "Bombay Sandwich", 40));
		listFoodItems.add(new FoodItems(5, "Pesara dosa", 50));
		listFoodItems.add(new FoodItems(6, "Uttapam", 25));
		listFoodItems.add(new FoodItems(7, "Pasanda", 50));
		listFoodItems.add(new FoodItems(8, "Aloo tikki", 25));

	}

	static void showItems() {
		for (FoodItems fi : listFoodItems) {
			show(fi.getSn(), fi.getDish(), fi.getPrice());
		}
	}

	/*
	 * This method helps to show all the food items saved in list.
	 */
	private static void show(int a, String s, int e) {
		int c = (int) (40 - ((int) Math.log10(a) + s.length()));
		System.out.print(a + ") " + s);
		for (int i = 1; i <= c; i++) {
			System.out.print(" ");

		}

		System.out.println("Rs." + e);
	}

}
