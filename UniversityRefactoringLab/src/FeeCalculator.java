public class FeeCalculator {

    public double calculateFee(Student student, Course course, String semester, String paymentType) {
        double fee = 0;

        StudentType studentType = StudentType.valueOf(student.type);

        if (studentType == StudentType.LOCAL) {
            fee = course.creditHours * 300;
        } else if (studentType == StudentType.INTERNATIONAL) {
            fee = course.creditHours * 550;
        } else if (studentType == StudentType.SCHOLARSHIP) {
            fee = course.creditHours * 100;
        } else {
            fee = course.creditHours * 300;
        }

        PaymentMethod paymentMethod = PaymentMethod.valueOf(paymentType);

        if (paymentMethod == PaymentMethod.INSTALLMENT) {
            fee = fee + 50;
        } else if (paymentMethod == PaymentMethod.CARD) {
            fee = fee + 10;
        } else if (paymentMethod == PaymentMethod.CASH) {
            fee = fee + 0;
        } else {
            fee = fee + 100;
        }

        if (semester.equals("SUMMER")) {
            fee = fee + 200;
        }

        if (course.code.startsWith("SE")) {
            fee = fee + 75;
        }

        return fee;
    }
}