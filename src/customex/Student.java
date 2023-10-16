package customex;

public class Student {

    private String name;

    public Student(String name) throws StudentCreationException {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws StudentCreationException {
        if (name.trim() != null && name.trim().length() >= 2) {
            this.name = name;
        } else {
            throw new StudentCreationException("You are trying to create human with name less than two letters", name);
        }
    }
}
