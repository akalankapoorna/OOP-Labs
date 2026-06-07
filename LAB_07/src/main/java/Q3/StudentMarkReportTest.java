public class StudentMarkReportTest {
    public static void main(String[] args) {
        String[] marks = {"78", "82", "absent", "90"};
        StudentMarkReport report = new StudentMarkReport(marks);

        // First try block: Testing invalid array index
        try {
            int mark1 = report.getMarkAt(6);
            System.out.println("Mark: " + mark1);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Exception occurs because the selected index (6) does not exist in the array
            System.out.println("Error: Selected mark position does not exist.");
        } finally {
            System.out.println("Array access checking completed.");
        }

        // Second try block: Testing invalid number format
        try {
            int mark2 = report.getMarkAt(2);
            System.out.println("Mark: " + mark2);
        } catch (NumberFormatException e) {
            // Exception occurs because the selected text ("absent") is not a valid number to parse
            System.out.println("Error: Selected mark is not a valid number.");
        } finally {
            System.out.println("Number conversion checking completed.");
        }

        System.out.println("Report checking completed.");
    }
}
