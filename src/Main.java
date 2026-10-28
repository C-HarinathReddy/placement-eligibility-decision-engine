
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read candidate details
        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();

        // Create Candidate
        Candidate candidate = new Candidate(
                name,
                percentage,
                backlogs,
                graduationYear
        );

        // Create Job
        Job job = new Job(
                "Infosys",
                "Java Developer",
                65.0,
                0,
                2026
        );

        // Create EligibilityChecker
        EligibilityChecker checker = new EligibilityChecker();

        // Display candidate and job details
        System.out.println("================================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("================================");
        System.out.println();

        System.out.println("Candidate : " + candidate.getName());
        System.out.println("Company   : " + job.getCompany());
        System.out.println("Role      : " + job.getRole());

        System.out.println();

        // Evaluate all rules
        boolean eligible = checker.evaluate(candidate, job);

        System.out.println();

        // Display final result
        if (eligible) {
            System.out.println("Final Result : ELIGIBLE");
        } else {
            System.out.println("Final Result : NOT ELIGIBLE");
        }

        System.out.println("================================");

        scanner.close();
    }
}
