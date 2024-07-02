
public class MarksOfStudents {
    public static void main(String[] args) {
        short[] marks = {80, 45, 78, 95, 35, 15, 24, 96, 41, 57, 48, 21, 50, 60, 81, 54, 91, 32, 70, 65};
        byte eightyPlus = 0, sixtyPlus = 0, fourtyPlus = 0, lessThenFourty = 0;
        for (int i = 0; i < 20; i++) {
            if (marks[i] > 80) {
                eightyPlus++;
            } else if (marks[i] > 60) {
                sixtyPlus++;
            } else if (marks[i] > 40) {
                fourtyPlus++;
            } else {
                lessThenFourty++;
            }

        }
        System.out.println("Above Eighty :" + eightyPlus + "\nAbove Sixty :" + sixtyPlus + "\nAbove Forty :" + fourtyPlus + "\n Less the Fourty :" + lessThenFourty);
    }
}
