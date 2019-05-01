package com.sobhitha;

public class ifandcodeblock
{        public static void main(String[] args) {


    int highScorePosition = calucalateHighScorePosition(1500);
    displayHighScorePosition("Twinkle", highScorePosition);

    highScorePosition = calucalateHighScorePosition(900);
    displayHighScorePosition("sobhitha", highScorePosition);


    highScorePosition = calucalateHighScorePosition(400);
    displayHighScorePosition("Rinky", highScorePosition);

    highScorePosition = calucalateHighScorePosition(50);
    displayHighScorePosition("vicky", highScorePosition);

    highScorePosition = calucalateHighScorePosition(1000);
    displayHighScorePosition("vicky", highScorePosition);
}




        public static void displayHighScorePosition(String playerName , int highScorePosition)
        {
            System.out.println(playerName + " managed to get into position " +
                    highScorePosition + " on the high score table");

        }

        public static int calucalateHighScorePosition(int playerScore) {
            if (playerScore > 1000)
                return 1;
            else if (playerScore >= 500 && playerScore < 1000)
                return 2;
            else if (playerScore >= 100 && playerScore < 500)
                return 3;
            else
                return 4;

        }

        }


