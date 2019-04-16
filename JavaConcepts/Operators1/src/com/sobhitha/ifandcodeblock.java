package com.sobhitha;

public class ifandcodeblock
{        public static void main(String[] args)
{

            calucalateScore(true,800, 5, 100);

            calucalateScore(true,10000, 8, 200);


            }


        public static void calucalateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

                       if (gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                System.out.println("Your final score is " + finalScore);
            }
        }
}
