package com.billmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderItems {

	static void orderedItems() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\nName: ");
		String name = sc.nextLine();
		
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		
		System.out.println("\nOrder food items by its symbol number:");
		
		while (sc.hasNextInt()) {
			if (sc.hasNextInt()) {
				
				int order = sc.nextInt();
				a.add(order);
				System.out.print(DataRepository.getListFoodItems().get(order - 1).getDish() + "  |");
				System.out.print("  Quantity = ");
				int quantity = sc.nextInt();
				b.add(quantity);
				System.out.print("Press 'o' to order or input symbol number for more food items:) ");
			}

		}
		/*
		 * Bill format code
		 */

		System.out.println(
				"\n\n\n                       HOTEL NATION           \n                  Kathmandu -4, Tinkune Road\n\n\n");

		System.out.print("  Name: " + name.toUpperCase());

		System.out.print("               Time: ");
		TimeAndDate.showTime();
		System.out.print("  ");
		System.out.print(" Date: ");
		TimeAndDate.showDate();

		System.out.println("\n\n S.No. |   Food items                   |  Quantity  | Amount\n");

		int totalAmount = 0;
		for (int i = 0; i < a.size(); i++) {
			BillManagement.showBill(i + 1, DataRepository.getListFoodItems().get(a.get(i) - 1).getDish(), b.get(i),
					DataRepository.getListFoodItems().get(a.get(i) - 1).getPrice());
			
			totalAmount += (b.get(i) * DataRepository.getListFoodItems().get(a.get(i) - 1).getPrice());

		}

		System.out.println(" ---------------------------------------------------------------");

		System.out.println("                            Total:                    Rs." + totalAmount);

		System.out.println("                       GST amount: 5% of Rs." + totalAmount + " =     Rs." + (0.05 * totalAmount));

		System.out.println("                                                    ------------");

		System.out.println("                 Amount after GST:                    Rs." + (totalAmount - (0.05 * totalAmount)));

		System.out.println("\n                                            THANK YOU!                      ");

	}
}
