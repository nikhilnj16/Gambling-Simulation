package com.bridgelabz.solution;

public class GamblingSimulation {
    public int stake;
    public int bet;


    public GamblingSimulation() {
        this.stake = 100;
        this.bet = 1;
    }

    public static Boolean WinOrLoss(){
        if (Math.random()<0.5){
            return true;
        }
        else {
            return false;
        }
    }
    public static void StakePrice(int stake, int bet){
        if (WinOrLoss()){
            stake+=bet;

        }
        else {
            stake-=bet;
        }
        System.out.println("stake : " + stake);
    }
    public int getStake(){
        return stake;
    }
    public int getBet(){
        return bet;
    }

    @Override
    public String toString() {
        return "result: " + WinOrLoss();

    }

    public static void main(String[] args) {
        GamblingSimulation obj = new GamblingSimulation();
        obj.StakePrice(100, 1);
        System.out.println(obj);


    }
}
