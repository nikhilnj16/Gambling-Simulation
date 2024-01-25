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
    public static void StakePrice(int stake, int bet, int noOfGames){
        String result;
        for (int i=0; i<noOfGames; i++) {
            if (WinOrLoss()) {
                result = "win";
                stake += bet;

            } else {
                result = "lost";
                stake -= bet;
            }
            if (stake <= 50 || stake >= 150){
                System.out.println("Not able to Play furthur");
                break;
            }
            System.out.println("result: " + result);
            System.out.println("stakeValue : " + stake);
        }
    }


    public static void main(String[] args) {
        GamblingSimulation obj = new GamblingSimulation();
        obj.StakePrice(100, 1, 100);
        System.out.println(obj);


    }
}
