package Misc;

import Oops.Computer;

public class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.playGame();
        computer.playMusic();

        Computer computer1 = new Computer();
        System.out.println(computer1);
        computer1.playGame();
        computer1.playMusic();
    }
}
