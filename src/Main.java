
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read candidate details
        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();

        // Read candidate skills
        int skillCount = scanner.nextInt();
        String[] skills = new String[skillCount];

        for (int i = 0; i < skillCount; i++) {
            skills[i] = scanner.next();
        }

        // Create Candidate object
        Candidate candidate = new Candidate(
                name,
                percentage,
                backlogs,
                graduationYear,
                skills
        );

        // Create Job object
        Job job = new Job(
                "Infosys",
                "Java Developer",
                65.0,
                0,
                2026
        );

        // Create EligibilityChecker
        EligibilityChecker checker = new EligibilityChecker();

        // Display results
        System.out.println("================================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("================================");
        System.out.println();

        System.out.println("Candidate : " + candidate.getName());
        System.out.println("Company   : " + job.getCompany());
        System.out.println("Role      : " + job.getRole());
        System.out.println();

        boolean eligible = checker.evaluate(candidate, job);

        System.out.println();

        if (eligible) {
            System.out.println("Final Result : ELIGIBLE");
        } else {
            System.out.println("Final Result : NOT ELIGIBLE");
        }

        System.out.println("================================");

        scanner.close();
    }
}
