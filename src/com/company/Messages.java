package com.company;

public class Messages {

    String gameStarted() {
        return "Игра началась, на столе 20 спичек.\n";
    }

    String countMatches(int countMatches) {
        return "На столе осталось " + countMatches + " спичек.\n";
    }

    String oneMatch(String playerStepLose) {
        return "-" + playerStepLose + " проиграл. " + "На столе осталась последняя спичка.\n";
    }

    String zeroMatch(String playerStepLose) {
        return "-" + playerStepLose + " проиграл. " + "Забрал со стола последнюю спичку.\n";
    }

    String playerMove(String user) {
        return " -" + user + " ваш ход: ";
    }

    String botStep(int botStep) {
        return " -Бот забрал: " + botStep + " спичку(-и).";
    }

    String playerWin(String player) {
        return "-" + player + " выиграл партию.";
    }
}
