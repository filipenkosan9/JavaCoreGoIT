package mod3.work3;


public class SpecialStudent extends CollegeStudent {

    private long secretKey;
    private String email;


    public SpecialStudent(String firstName, String lastName, int group, long secretKey, String email) {
        super(firstName, lastName, group);
        this.secretKey = secretKey;
        this.email = email;
    }

    public SpecialStudent(Course[] coursesTaken) {
        super(coursesTaken);
    }

    public SpecialStudent(Course[] coursesTaken, long secretKey, String email) {
        super(coursesTaken);
        this.secretKey = secretKey;
        this.email = email;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
