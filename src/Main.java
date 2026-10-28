
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read candidate details
        System.out.println("Enter candidate name:");
        String name = scanner.next();

        System.out.println("Enter percentage:");
        double percentage = scanner.nextDouble();

        System.out.println("Enter number of backlogs:");
        int backlogs = scanner.nextInt();

        System.out.println("Enter graduation year:");
        int graduationYear = scanner.nextInt();

        // Step 2: Create Candidate object
        Candidate candidate = new Candidate(
                name,
                percentage,
                backlogs,
                graduationYear
        );

        // Step 3: Create Job object
        Job job = new Job(
                "Infosys",
                "Java Developer",
                65.0,
                0,
                2026
        );

        // Step 4: Compare eligibility requirements
        boolean percentagePass
                = candidate.getPercentage() >= job.getMinimumPercentage();

        boolean backlogPass
                = candidate.getBacklogs() <= job.getMaximumBacklogs();

        boolean yearPass
                = candidate.getGraduationYear()
                == job.getRequiredGraduationYear();

        // Step 5: Calculate final eligibility
        boolean eligible
                = percentagePass && backlogPass && yearPass;

        // Step 6: Display results
        System.out.println();
        System.out.println("================================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("================================");

        System.out.println("Candidate : " + candidate.getName());
        System.out.println("Company   : " + job.getCompany());
        System.out.println("Role      : " + job.getRole());

        System.out.println();

        System.out.println("Percentage      : "
                + (percentagePass ? "PASS" : "FAIL"));

        System.out.println("Backlogs        : "
                + (backlogPass ? "PASS" : "FAIL"));

        System.out.println("Graduation Year : "
                + (yearPass ? "PASS" : "FAIL"));

        System.out.println();

        System.out.println("Final Result : "
                + (eligible ? "ELIGIBLE" : "NOT ELIGIBLE"));

        System.out.println("================================");

        scanner.close();
    }
}
