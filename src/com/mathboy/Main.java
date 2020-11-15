package com.mathboy;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int score = 0;
        System.out.println("Welcome to MathBoy11's text-based/DND adventure game!");
        System.out.println("Would you like to play?");
        Scanner in = new Scanner(System.in);
        String userChoice = in.nextLine();
        if (userChoice.equals("y")) {
            System.out.println("Score: " + score);
            System.out.println("You are in your room.");
            System.out.println("You see two doors. One leads to the basement, the other exits to the hall.");
            System.out.println("Which one do you want to go through? (Type 1 for basement, Type 2 for the hall)");
            Scanner doors1 = new Scanner(System.in);
            String userChoice2 = doors1.nextLine();
            if (userChoice2.equals("1")) {
                System.out.println("You are greeted by bats which chase you into a lava pit!");
                System.out.println("You Lose!");
                System.out.println("Score: " + score);
                System.exit(0);
            } else {
                System.out.println("You are in the large hallway.");
                System.out.println("You encounter a knight on the other side of the hall.");
                System.out.println("Would you like to roll to kill?");
                Scanner init1 = new Scanner(System.in);
                String initChoice1 = init1.nextLine();
                if (initChoice1.equals("y")) {
                    Random init1roll = new Random();
                    int init1output = init1roll.nextInt((20 - 1) + 1) + 1;
                    System.out.println("You roll a " + init1output);
                    if (init1output > 9) {
                        System.out.println("HIT!");
                        System.out.println("You win 4 points!");
                        score++;
                        score++;
                        score++;
                        score++;
                        System.out.println("Score: " + score);
                        System.out.println("You are at the end of the hallway.");
                        System.out.println("Would you like to go downstairs?");
                        Scanner downstairs = new Scanner(System.in);
                        String downstairsOut = downstairs.nextLine();
                        if (downstairsOut.equals("y")) {
                            System.out.println("You are in the living room");
                            System.out.println("You are very hungry!");
                            System.out.println("Would you like to go to the kitchen, or deluxe restaurant with a 5 star review! (1 or 2)");
                            Scanner resorkit = new Scanner(System.in);
                            String resorkitout = resorkit.nextLine();
                            if (resorkitout.equals("1")) {
                                System.out.println("You make a peanut-butter and jelly sandwich and a smoothie. You feel very refreshed!");
                                System.out.println("You earn 3 points!");
                                score++;
                                score++;
                                score++;
                                System.out.println("Score: " + score);
                                System.out.println("You decide to go outside and clean up the leaves!");
                                System.out.println("While you are outside, you discover that you have a emergency meeting!");
                                System.out.println("How should clean up the leaves");
                                System.out.println("1 (Raking) 2 (Leaf blower)");
                                Scanner rakeorblow = new Scanner(System.in);
                                String rakeorblowout = rakeorblow.nextLine();
                                if (rakeorblowout.equals("2")) {
                                    System.out.println("You decide to use the leaf blower even though you have not had any exercise!");
                                    System.out.println("When you turned it on, a monster descended from the leaf blower!");
                                    System.out.println("Would you like to roll to kill?");
                                    Scanner roll1 = new Scanner(System.in);
                                    String roll1out = roll1.nextLine();
                                    if (roll1out.equals("y")) {
                                        Random init2roll = new Random();
                                        int init2output = init2roll.nextInt((20 - 1) + 1) + 1;
                                        if (init2output > 13) {
                                            System.out.println("HIT!");
                                            System.out.println("You win 6 points!");
                                            score++;
                                            score++;
                                            score++;
                                            score++;
                                            score++;
                                            score++;
                                            System.out.println("Score: " + score);
                                            System.out.println("The next day you decide to go camping.");
                                            System.out.println("When you got there, you decide to take a walk in the forest!");
                                            System.out.println("While you were in the forest, you realized that you for got your phone and can't tell what time it is!");
                                            System.out.println("You were so focused on your walk that you didn't realize that it was midnight!");
                                            System.out.println("Would you like to return to the campsite to sleep, or sleep in the forest?");
                                            Scanner returnorstay = new Scanner(System.in);
                                            String returnorstayout = returnorstay.nextLine();
                                            if (returnorstayout.equals("2")) {
                                                System.out.println("You stay in the forest and sleep without any dangers!");
                                                System.out.println("You have completed your mission!");
                                                System.out.println("Final Score: " + score);
                                                System.exit(0);

                                            } else {
                                                System.out.println("You encountered too many monsters and you couldn't fight back!");
                                                System.out.println("You Lose!");
                                                System.out.println("Score: " + score);
                                                System.exit(0);
                                            }

                                            } else {
                                            System.out.println("MISS!");
                                            System.out.println("The monster pushed you off a cliff!");
                                            System.out.println("You Died!");
                                            System.out.println("Score: " + score);
                                        }
                                    } else {
                                        System.out.println("The monster took it's advantage and killed you!");
                                        System.out.println("You Lose!");
                                        System.out.println("Score: " + score);
                                        System.exit(0);
                                    }
                                }
                                    else {
                                        System.out.println("You raked, and you were late for the meeting!");
                                        System.out.println("The boss was so mad he came to your house to show you a piece of his mind!");
                                        System.out.println("You Lose!");
                                        System.out.println("Score: " + score);
                                        System.exit(0);
                                }
                                } else {
                                    System.out.println("You were tricked! The reviews were by the employees and the food had poison!");
                                    System.out.println("You Died!");
                                    System.out.println("Score: " + score);
                                    System.exit(0);
                            }
                            } else {
                                System.out.println("You descend into a deep dark shaft...");
                                System.out.println("You Lose!");
                                System.out.println("Score: " + score);
                                System.exit(0);
                            }

                        } else {
                            System.out.println("MISS!");
                            System.out.println("The knight kills you with his shining sword!");
                            System.out.println("You Lose!");
                            System.out.println("Score: " + score);
                            System.exit(0);
                        }
                    } else {
                    System.exit(0);
                }
            }
        }
    }
}