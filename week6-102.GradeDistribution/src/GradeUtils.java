
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gab Camba
 */
public class GradeUtils {

    private ArrayList<Integer> gradeList;
    private int gradeFive;
    private int gradeFour;
    private int gradeThree;
    private int gradeTwo;
    private int gradeOne;
    private int gradeZero;

    public GradeUtils() {
        this.gradeList = new ArrayList<Integer>();
        
        this.gradeFive = 0;
        this.gradeFour = 0;
        this.gradeThree = 0;
        this.gradeTwo = 0;
        this.gradeOne = 0;
        this.gradeZero = 0;

    }

    public boolean withinRange(int input) {
        return (input > -1 && input < 61);
        //return input != -1;
    }

    public void addToList(int input) {
        this.gradeList.add(input);
    }

    public void starCount(ArrayList<Integer> grades) {
        for (int grade : grades) {
            if (grade >= 50 && grade <= 60) {
                this.gradeFive++;
            } else if (grade >= 45 && grade <= 49) {
                this.gradeFour++;
            } else if (grade >= 40 && grade <= 44) {
                this.gradeThree++;
            } else if (grade >= 35 && grade <= 39) {
                this.gradeTwo++;
            } else if (grade >= 30 && grade <= 34) {
                this.gradeOne++;
            } else {
                this.gradeZero++;
            }
        }
    }

    public void displayStarCount() {
        System.out.println("Grade Distribution: ");
        System.out.print("5: ");
        printStars(this.gradeFive);
        System.out.print("4: ");
        printStars(this.gradeFour);
        System.out.print("3: ");
        printStars(this.gradeThree);
        System.out.print("2: ");
        printStars(this.gradeTwo);
        System.out.print("1: ");
        printStars(this.gradeOne);
        System.out.print("0: ");
        printStars(this.gradeZero);
        int accepted = this.gradeFive + this.gradeFour + this.gradeThree + this.gradeTwo + this.gradeOne;
        int all = this.gradeFive + this.gradeFour + this.gradeThree + this.gradeTwo + this.gradeOne + this.gradeZero;

        double percentage = ((double) (accepted) / (all)) * 100;
        System.out.println("Acceptance Percentage: " + percentage);

    }

    public void printStars(int starCount) {
        int i = 1;
        while (i <= starCount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public ArrayList<Integer> returnList() {
        return this.gradeList;
    }

    public void displayList() {
        for (int grades : this.gradeList) {
            System.out.println(grades);
        }
    }

}
