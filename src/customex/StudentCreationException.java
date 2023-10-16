package customex;

public class StudentCreationException extends Exception {

    private String name;

    public StudentCreationException(String message, String name) {
        super(message);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
