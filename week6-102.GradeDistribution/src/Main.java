
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeUtils gradeutils = new GradeUtils();

        while (true) {
            int grade = Integer.parseInt(scanner.nextLine());

            if (gradeutils.withinRange(grade)) {
                gradeutils.addToList(grade);
            }

            if (grade == -1) {
                break;
            }
        }

        gradeutils.starCount(gradeutils.returnList());
        gradeutils.displayStarCount();
    }
}
