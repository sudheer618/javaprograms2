package com.chs.javaprograms;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizProgram {

	static boolean timeout = false;
	static Timer timer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score =0;
		String[][] questions = {
				{"what is capital of india ?","a. delhi","b. bangalore","c. mumbai","d. gujarath",("a")},
				{"which cuntry largest area accupied in world ?","a. india","b. chaina","c. america","d. russia","b"},
				{"what is the currency of japan ?","a. dollar","b. rupee","c. yen","d. euro","c"},
				{"what is answer of 5 * 5 ?","a. 40","b. 20","c. 45","d. 25","d"},
				{"which planet is known as red planet ?","a. Earth", "b. Mars", "c. Jupiter", "d. Saturn","a"}
		};
		for(int i=0; i<questions.length ; i++) {
			timeout = false;
			startTimer();
			System.out.println("Q" +(i+1)+ ":" + questions[i][0]);
			System.out.println(questions[i][1]);
			System.out.println(questions[i][2]);
			System.out.println(questions[i][3]);
			System.out.println(questions[i][4]);
			System.out.println(questions[i][5]);
			
			 //System.out.println("Type '50' for a 50/50 audience poll or select an answer (1-4):");

			
			String userAnswer = sc.nextLine();
			stopTimer();
			if(timeout) {
				System.out.println("\n you didn't answer in time . the quiz is over");
				break;
			}
			if(!userAnswer.equalsIgnoreCase(questions[i][5])) {
				System.out.println("\n wrong answer .the quiz is over");
				break;
			}
			score++;	
		}
		System.out.println("final score is :" + score + "/" + questions.length);
		//Scanner.close();
	}
	public static void startTimer() {
		timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				timeout = true;
			}
			
		},60000);
	}
	public static void stopTimer() {
		if(timer!=null) {
			timer.cancel();
		}
//		 public static void use5050() {
//		        System.out.println("Using 50/50 audience poll...");
//		        int correctAnswerIndex = -1;
//		        int randomWrongAnswer = -1;
//		
	}
}
