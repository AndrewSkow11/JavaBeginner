package ch04_data;

import java.util.Arrays;

public class Elemets {
    public static void main(String[] args) {

        int[] kiosk_q1 = {42_000, 48_000, 50_000};
        int[] kiosk_q2 = {52_000, 58_000, 60_000};
        int[] kiosk_q3 = {46_000, 49_000, 58_000};
        int[] kiosk_q4 = {50_000, 51_000, 61_000};

        int[] outlet_q1 = {57_000, 63_000, 60_000};
        int[] outlet_q2 = {70_000, 67_000, 73_000};
        int[] outlet_q3 = {67_000, 65_000, 62_000};
        int[] outlet_q4 = {72_000, 69_000, 75_000};

        int[] sum = new int[12];
        int total = 0;

        for (int i = 0; i < kiosk_q1.length; i++) {
            sum[i] = kiosk_q1[i] + outlet_q1[i];
            sum[i + 3] = kiosk_q2[i] + outlet_q2[i];
            sum[i + 6] = kiosk_q3[i] + outlet_q3[i];
            sum[i + 9] = kiosk_q4[i] + outlet_q4[i];
        }

        for (int i = 0; i < sum.length; i++) {
            System.out.printf("Месяц %d, объём продаж:\t%d\n", i+1, sum[i]);
            total += sum[i];
        }

        System.out.println("\nОбщий объём продаж за год:\t" + total);

        //System.out.println(Arrays.toString(kiosk_q1));
    }
}
