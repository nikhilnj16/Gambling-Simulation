package com.bridgelabz.solution;

public class GamblingSimulation {


    public static Boolean WinOrLoss(){
        if (Math.random()<0.5){
            return true;
        }
        else {
            return false;
        }
    }
    
    private static void simulateGambling(int initialStake, int betAmount, int noOfDays, int noOfMonths){
        for (int month = 1; month <= noOfMonths; month++) {
            int totalAmountWonOrLost = 0;
            int totalDaysWon = 0;
            int totalDaysLost = 0;
            for (int day = 1; day <= noOfDays; day++) {
                int currentStake = initialStake;

                while (currentStake > 50 && currentStake < 150) {

                    if (WinOrLoss()) {
                        currentStake += betAmount;

                    } else {
                        currentStake -= betAmount;
                    }
                }
                int amountWonOrLost = currentStake - initialStake;
                totalAmountWonOrLost += amountWonOrLost;

                if (amountWonOrLost > 0) {
                    totalDaysWon++;
                }
                else{
                    totalDaysLost++;
                }
                System.out.println("Month " + month + " Day " + day + ": Amount Won or Lost - $ " + amountWonOrLost);

            }
            System.out.println("Month " + month + " : Total amount won or lost - $" + totalAmountWonOrLost);
            System.out.println("Month " + month + " : Total Days Won - " + totalDaysWon);
            System.out.println("Month " + month + " : Total Days Lost - " + totalDaysLost);
        }
    }


    public static void main(String[] args) {
        int initialStake = 100;
        int betAmount = 1;
        int noOfDays = 20;
        int noOfMonths = 12;
        simulateGambling(initialStake, betAmount, noOfDays, noOfMonths);


        


    }
}
