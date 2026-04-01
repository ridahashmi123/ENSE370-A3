public class ReportService {
    private UniversitySystem system;

    public ReportService(UniversitySystem system) {
        this.system = system;
    }

    public void printTranscript(String studentId) {
        system.printTranscript(studentId);
    }

    public void printCourseRoster(String courseCode) {
        system.printCourseRoster(courseCode);
    }

    public void printDepartmentSummary(String department) {
        system.printDepartmentSummary(department);
    }

    public void sendWarningLetters() {
        system.sendWarningLetters();
    }

    public void printAllStudents() {
        LegacyReportPrinter printer = new LegacyReportPrinter();
        printer.printStudents(system.students);
    }

    public void printAllCourses() {
        LegacyReportPrinter printer = new LegacyReportPrinter();
        printer.printCourses(system.courses);
    }

    public void printAllPayments() {
        LegacyReportPrinter printer = new LegacyReportPrinter();
        printer.printPayments(system.payments);
    }
}