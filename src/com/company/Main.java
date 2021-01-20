package com.company;

import java.util.Scanner;

public class Main {

    private static Messages messages = new Messages();
    private static Computer bot = new Computer();
    private static Scanner scan = new Scanner(System.in);
    private static boolean botStep = true;
    private static int countMatches = 20;


    public static void main(String[] args) {
        gameStart();
    }

    public static void gameStart() {
        System.out.println(messages.gameStarted());
        userStep();
    }

    public static void userStep() {
        while (countMatches > 1) {
            if (botStep) {
                int temp = bot.bot(countMatches);
                System.out.println(messages.botStep(temp));
                countMatches -= temp;
            } else {
                System.out.print(messages.playerMove("Игрок"));
                String temp = scan.next();
                while (!userCheckEnter(temp)) {
                    System.out.print(messages.playerMove("Игрок"));
                    temp = scan.next();
                }
                countMatches -= Integer.parseInt(temp);
            }
            System.out.println(messages.countMatches(countMatches));
            botStep = !botStep;
        }
        gameEnd();
    }

    public static void gameEnd() {
        if (countMatches == 1) {
            System.out.println("\n" + messages.playerWin("Бот "));
            System.out.print(messages.oneMatch("Игрок") + "\n\n");
        }
        else {
            System.out.println("\n" + messages.playerWin("Игрок"));
            System.out.print(messages.zeroMatch("Игрок") + "\n\n");
        }
        restart();
    }

    public static boolean userCheckEnter(String check) {
        try {
            int temp = Integer.parseInt(check);
            if (temp < 1 || temp > 3) {
                System.out.println("Введите число от 1 до 3.\n");
                return false;
            }
            else return true;
        } catch (Exception e) {
            System.out.println("Incorrect string: " + check);
            return false;
        }
    }

    public static void restart() {
        countMatches = 20;
        botStep = true;
        System.out.println(messages.gameStarted());
        userStep();
    }
}
