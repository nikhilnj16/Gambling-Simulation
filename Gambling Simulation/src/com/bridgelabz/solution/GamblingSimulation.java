package com.bridgelabz.solution;

public class GamblingSimulation {
    public int stake;
    public int bet;
    public int noOfGames;


    public GamblingSimulation() {
        this.stake = 100;
        this.bet = 1;
        this.noOfGames = 10;
    }

    public static Boolean WinOrLoss(){
        if (Math.random()<0.5){
            return true;
        }
        else {
            return false;
        }
    }
    public void Status(int totalstake){
        if (totalstake < 100){
            System.out.println("Lost: " + (100-totalstake));
        }
        else if (totalstake > 100){
            System.out.println("Won: " + (totalstake-100));
        }
        else {
            System.out.println("No profit no loss");
        }
    }
    public void StakePrice(int stake, int bet, int noOfGames){
        String result;
        int totalstake=stake;
        for (int i=0; i<noOfGames; i++) {
            if (WinOrLoss()) {
                result = "win";
                totalstake += bet;

            } else {
                result = "lost";
                totalstake -= bet;
            }
            if (totalstake <= 50 || totalstake >= 150){
                System.out.println("Not able to Play furthur");
                break;
            }
            if (i==20){
                System.out.println("Status after 20 days");
                Status(totalstake);
            }
            System.out.println("result: " + result);
            System.out.println("stakeValue : " + stake);
        }
    }


    public static void main(String[] args) {
        GamblingSimulation obj = new GamblingSimulation();
        obj.StakePrice(100, 1, 25);
        


    }
}
