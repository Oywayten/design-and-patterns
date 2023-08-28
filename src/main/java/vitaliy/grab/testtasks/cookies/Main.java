package vitaliy.grab.testtasks.cookies;

import java.util.Scanner;

/**
 * Oywayten 28.08.2023.
 */

class Main {

    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TWO = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int places = scanner.nextInt();
        int hours = scanner.nextInt();
        int maxCookiesPerPlace = ZERO;
        int cookiesPerPlace;
        int[] cookies = new int[places];
        for (int i = ZERO; i < places; i++) {
            cookiesPerPlace = scanner.nextInt();
            cookies[i] = cookiesPerPlace;
            if (cookiesPerPlace > maxCookiesPerPlace) {
                maxCookiesPerPlace = cookiesPerPlace;
            }
        }
        scanner.close();
        int minCookies = findMinCookiesForEatAtHour(cookies, hours, maxCookiesPerPlace);
        System.out.println(minCookies);
    }

    private static int findMinCookiesForEatAtHour(int[] cookies, int hours, int maxCookiesPerPlace) {
        int start = ONE;
        int end = maxCookiesPerPlace;
        int result = ZERO;
        while (start <= end) {
            int mid = (start + end) / TWO;
            if (canEatCookies(cookies, hours, mid)) {
                result = mid;
                end = mid - ONE;
            } else {
                start = mid + ONE;
            }
        }
        return result;
    }

    private static boolean canEatCookies(int[] cookies, int hours, int mid) {
        int totalHoursAmount = ZERO;
        boolean result = false;
        for (int cookie : cookies) {
            totalHoursAmount += (int) Math.ceil((double) cookie / mid);
        }
        if (totalHoursAmount <= hours) {
            result = true;
        }
        return result;
    }
}