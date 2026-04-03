interface Exam { boolean isPassed(int mark); }
interface Classify { String getDivision(double average); }

class Result implements Exam, Classify {
    public boolean isPassed(int mark) { return mark >= 40; }
    public String getDivision(double average) {
        return (average >= 60) ? "First Division" : "Pass Division";
    }

    public static void main(String[] args) {
        Result r = new Result();
        System.out.println("Passed: " + r.isPassed(75));
        System.out.println("Division: " + r.getDivision(65.5));
    }
}
