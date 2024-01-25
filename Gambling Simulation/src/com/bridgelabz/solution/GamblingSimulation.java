package com.bridgelabz.solution;

public class GamblingSimulation {
    public int stake;
    public int bet;


    public GamblingSimulation() {
        this.stake = 100;
        this.bet = 1;
    }

    public static String WinOrLoss(){
        if (Math.random()<0.5){
            return "Win";
        }
        else {
            return "Lose";
        }
    }

    @Override
    public String toString() {
        return "result: " + WinOrLoss();
    }

    public static void main(String[] args) {
        GamblingSimulation obj = new GamblingSimulation();

        System.out.println(obj);

    }
}
