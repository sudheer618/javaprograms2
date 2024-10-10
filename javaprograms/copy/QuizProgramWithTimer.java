package com.chs.javaprograms.copy;

import java.util.*;

public class QuizProgramWithTimer {
	// Inner class for questions
	static class Question {
		String question;
		String[] options;
		int correctAnswerIndex;

		Question(String question, String[] options, int correctAnswerIndex) {
			this.question = question;
			this.options = options;
			this.correctAnswerIndex = correctAnswerIndex;
		}

		boolean isAnswerCorrect(int answerIndex) {
			return answerIndex == correctAnswerIndex;
		}
	}

	// Inner class for managing the game
	static class Game {
		private static final int MAX_QUESTIONS = 15;
		private static final long[] PRIZE_AMOUNTS = {
				100000, 200000, 300000, 500000, 1000000,
				2000000, 4000000, 8000000, 16000000, 32000000,
				64000000, 125000000, 250000000, 500000000, 1000000000
		};

		private List<Question> questions;
		private Scanner scanner;
		private boolean[] lifelinesUsed;
		private int currentQuestionIndex;
		private long currentPrize;

		Game() {
			scanner = new Scanner(System.in);
			lifelinesUsed = new boolean[3]; // 0: 50-50, 1: Phone-a-Friend, 2: Ask the Audience

			// Initialize questions
			questions = new ArrayList<>(Arrays.asList(
					new Question("What is the capital of France?", new String[]{"1. Berlin", "2. Madrid", "3. Paris", "4. Rome"}, 2),
					new Question("Who wrote 'To Kill a Mockingbird'?", new String[]{"1. Harper Lee", "2. J.K. Rowling", "3. Ernest Hemingway", "4. Mark Twain"}, 0),
					new Question("What is the chemical symbol for water?", new String[]{"1. H2O", "2. CO2", "3. O2", "4. NaCl"}, 0),
					new Question("In which year did the Titanic sink?", new String[]{"1. 1912", "2. 1905", "3. 1898", "4. 1923"}, 0),
					new Question("What is the largest planet in our solar system?", new String[]{"1. Earth", "2. Mars", "3. Jupiter", "4. Saturn"}, 2),
					new Question("Who painted the Mona Lisa?", new String[]{"1. Leonardo da Vinci", "2. Vincent van Gogh", "3. Pablo Picasso", "4. Claude Monet"}, 0),
					new Question("What is the hardest natural substance on Earth?", new String[]{"1. Gold", "2. Iron", "3. Diamond", "4. Quartz"}, 2),
					new Question("Which planet is known as the Red Planet?", new String[]{"1. Earth", "2. Venus", "3. Mars", "4. Jupiter"}, 2),
					new Question("What is the largest ocean on Earth?", new String[]{"1. Atlantic Ocean", "2. Indian Ocean", "3. Arctic Ocean", "4. Pacific Ocean"}, 3),
					new Question("What element does 'O' represent on the periodic table?", new String[]{"1. Oxygen", "2. Gold", "3. Osmium", "4. Omnium"}, 0),
					new Question("What is the square root of 64?", new String[]{"1. 6", "2. 7", "3. 8", "4. 9"}, 2),
					new Question("Which country is known as the Land of the Rising Sun?", new String[]{"1. China", "2. Japan", "3. Thailand", "4. Korea"}, 1),
					new Question("In which city is the Eiffel Tower located?", new String[]{"1. London", "2. Paris", "3. Rome", "4. Berlin"}, 1),
					new Question("What is the smallest prime number?", new String[]{"1. 1", "2. 2", "3. 3", "4. 5"}, 1),
					new Question("How many continents are there on Earth?", new String[]{"1. 5", "2. 6", "3. 7", "4. 8"}, 2)
					));
		}

		void startGame() {
			for (currentQuestionIndex = 0; currentQuestionIndex < MAX_QUESTIONS; currentQuestionIndex++) {
				currentPrize = PRIZE_AMOUNTS[currentQuestionIndex];
				System.out.println("Question for ₹" + currentPrize);
				if (!askQuestion(questions.get(currentQuestionIndex))) {
					System.out.println("You've lost the game. You've won ₹" + (currentQuestionIndex > 0 ? PRIZE_AMOUNTS[currentQuestionIndex - 1] : 0) + "!");
					return;
				}
			}
			System.out.println("Congratulations! You've won ₹" + PRIZE_AMOUNTS[MAX_QUESTIONS - 1] + "!");
		}

		private boolean askQuestion(Question question) {
			System.out.println(question.question);
			for (String option : question.options) {
				System.out.println(option);
			}

			System.out.println("Enter your answer (1-4) or type 'lifeline' for options:");
			String input = scanner.nextLine().trim();

			if (input.equalsIgnoreCase("lifeline")) {
				return useLifeline(question);
			} else {
				try {
					int answer = Integer.parseInt(input) - 1;
					if (question.isAnswerCorrect(answer)) {
						System.out.println("Correct! Moving to the next question.");
						return true;
					} else {
						System.out.println("Wrong answer. Game Over.");
						return false;
					}
				} catch (NumberFormatException e) {
					System.out.println("Invalid input. Please enter a number between 1 and 4.");
					return askQuestion(question); // Retry the current question
				}
			}
		}

		private boolean useLifeline(Question question) {
			System.out.println("Choose a lifeline: 1 - 50:50, 2 - Phone-a-Friend, 3 - Ask the Audience");
			String choice = scanner.nextLine().trim();
			int lifelineIndex = Integer.parseInt(choice) - 1;

			if (lifelineIndex < 0 || lifelineIndex >= lifelinesUsed.length || lifelinesUsed[lifelineIndex]) {
				System.out.println("Invalid or already used lifeline.");
				return askQuestion(question); // Retry the current question
			}

			lifelinesUsed[lifelineIndex] = true;

			switch (lifelineIndex) {
			case 0:
				return useFiftyFiftyLifeline(question);
			case 1:
				usePhoneAFriendLifeline();
				return askQuestion(question); // Retry the current question
			case 2:
				return useAskTheAudienceLifeline(question);
			default:
				return askQuestion(question); // Retry the current question
			}
		}

		private boolean useFiftyFiftyLifeline(Question question) {
			System.out.println("50:50 Lifeline used. Two incorrect options will be removed.");
			Random rand = new Random();
			int correctOption = question.correctAnswerIndex;
			List<Integer> optionsToRemove = new ArrayList<>();
			optionsToRemove.add(correctOption);

			while (optionsToRemove.size() < 2) {
				int optionToRemove = rand.nextInt(4);
				if (optionToRemove != correctOption && !optionsToRemove.contains(optionToRemove)) {
					optionsToRemove.add(optionToRemove);
				}
			}

			System.out.println("Remaining options:");
			for (int i = 0; i < question.options.length; i++) {
				if (i == correctOption || optionsToRemove.contains(i)) {
					System.out.println(question.options[i]);
				}
			}

			return askQuestion(question); // Retry the current question
		}

		private void usePhoneAFriendLifeline() {
			System.out.println("Phone-a-Friend Lifeline used. Your friend suggests you choose the best answer from the remaining options.");
		}

		private boolean useAskTheAudienceLifeline(Question question) {
			System.out.println("Ask the Audience Lifeline used. Audience voting results are shown below:");
			Random rand = new Random();
			int[] votes = new int[4];
			int correctOption = question.correctAnswerIndex;
			votes[correctOption] = 50 + rand.nextInt(31); // Correct answer gets between 50% and 80%
			int remainingPercentage = 100 - votes[correctOption];

			for (int i = 0; i < votes.length; i++) {
				if (i != correctOption) {
					votes[i] = remainingPercentage / (votes.length - 1);
				}
			}

			System.out.println("Audience votes:");
			for (int i = 0; i < votes.length; i++) {
				System.out.println((i + 1) + ". " + question.options[i] + " - " + votes[i] + "%");
			}

			return askQuestion(question); // Retry the current question
		}
	}

	public static void main(String[] args) {
		Game game = new Game();
		game.startGame();
	}

}



