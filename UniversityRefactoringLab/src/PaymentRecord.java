public class PaymentRecord {
    private String studentId;
    private double amount;
    private String method;
    private String status;

    public PaymentRecord(String studentId, double amount, String method, String status) {
        this.setStudentId(studentId);
        this.setAmount(amount);
        this.setMethod(method);
        this.setStatus(status);
    }

    public String getStudentId() {
        return studentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getMethod() {
        return method;
    }

    public String getStatus() {
        return status;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}