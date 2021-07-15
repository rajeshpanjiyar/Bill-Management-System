package com.billmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BillManagement {

	static void showBill(int sn, String dish, int quantity, int price) {
		int c = (int) (35 - ((int) Math.log10(sn) + dish.length()));

		System.out.print("   " + sn + ")     " + dish);
		for (int i = 1; i <= c; i++) {
			System.out.print(" ");

		}

		System.out.println(quantity + "        Rs." + (quantity * price));
	}

	public static void main(String[] args) {
		DataRepository.showItems();
		OrderItems.orderedItems();
	}

}
