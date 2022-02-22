package codeWar;

import java.util.Arrays;
//Our football team finished the championship. The result of each match look like "x:y". Results of all matches are recorded in the collection.
//
//For example: ["3:1", "2:2", "0:1", ...]
//
//Write a function that takes such collection and counts the points of our team in the championship. Rules for counting points for each match:
//
//if x>y - 3 points
//if x<y - 0 point
//if x=y - 1 point
public class TotalPoints {

    public static int points(String[] games) {
        int points = 0;
        for (String game : games) {
            String[] scores = game.split(":");
            int x = Integer.parseInt(scores[0]);
            int y = Integer.parseInt(scores[1]);
            if (x > y) {
                points += 3;
            } else if (x == y) {
                points++;
            }
        }
        return points;
    }
}
