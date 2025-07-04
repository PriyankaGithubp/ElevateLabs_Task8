import java.util.Scanner;

 class GKQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questions, options, and correct answers
        String[] questions = {
            "1. What is the capital of India?",
            "2. What is 2 + 2?",
            "3. Which color is made by mixing red and blue?",
            "4. Who is the Prime Minister of India in 2024?",
            "5. Which planet is known as the Red Planet?",
            "6. What is the result of 5 × 6?",
            "7. What is the chemical symbol for water?",
            "8. Who wrote the play Romeo and Juliet?",
            "9. What is the largest ocean in the world?",
            "10. Which language is used to develop Android apps?",
            "11. Which animal is known as the 'King of the Jungle'?",
            "12. What is the boiling point of water?"
        };

        String[][] options = {
            {"1. Mumbai", "2. Delhi", "3. Kolkata", "4. Chennai"},
            {"1. 3", "2. 4", "3. 5", "4. 6"},
            {"1. Purple", "2. Green", "3. Orange", "4. Brown"},
            {"1. Rahul Gandhi", "2. Amit Shah", "3. Narendra Modi", "4. Arvind Kejriwal"},
            {"1. Earth", "2. Venus", "3. Jupiter", "4. Mars"},
            {"1. 30", "2. 20", "3. 25", "4. 35"},
            {"1. CO2", "2. O2", "3. H2O", "4. HO2"},
            {"1. William Wordsworth", "2. William Shakespeare", "3. Charles Dickens", "4. Jane Austen"},
            {"1. Atlantic Ocean", "2. Indian Ocean", "3. Arctic Ocean", "4. Pacific Ocean"},
            {"1. Swift", "2. Python", "3. Java", "4. Ruby"},
            {"1. Elephant", "2. Tiger", "3. Lion", "4. Bear"},
            {"1. 90°C", "2. 100°C", "3. 110°C", "4. 80°C"}
        };

        int[] correctAnswers = {2, 2, 1, 3, 4, 1, 3, 2, 4, 3, 3, 2}; // Correct answer index (1-based)

        int score = 0;

        // Quiz loop
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer (1-4): ");
            int answer = scanner.nextInt();

            if (answer == correctAnswers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + correctAnswers[i] + "\n");
            }
        }

        // Final score
        System.out.println("Your final score: " + score + "/" + questions.length);

        scanner.close();
    }
}
