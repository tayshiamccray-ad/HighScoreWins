package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user
        System.out.print("Enter the game score (format: Home:Visitor|21:9): ");
        String input = scanner.nextLine(); // Example: Home:Visitor|21:9

        // Split the input into team names and scores
        String[] parts = input.split("\\|");
        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        String homeTeam = teams[0];
        String visitorTeam = teams[1];
        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        // Determine and display the winner
        if (homeScore > visitorScore) {
            System.out.println("Winner: " + homeTeam);
        } else if (visitorScore > homeScore) {
            System.out.println("Winner: " + visitorTeam);
        } else {
            System.out.println("It's a tie!");}


        }
    }
