package com.basic.Arrays;

public class TripletSum {

	public static void main(String[] args) {

		int a[] = { -2, -1, 0, 1, 2, 4, 0, -4 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				for (int k = j + 1; k < a.length; k++) {

					if (a[i] + a[j] + a[k] == 0) {

						System.out.println("Triplets are/is + " + a[i] + "," + a[j] + "," + a[k]);

					}

				}
			}

		}

	}

}
