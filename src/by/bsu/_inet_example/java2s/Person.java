package by.bsu.com._inet_example.java2s;

public class Person {
    private Level severity;
    private String name;

    public Person(Level severity, String name) {
        super();
        this.severity = severity;
        this.name = name;
    }

    public Level getSeverity() {
        return severity;
    }

    public void setSeverity(Level severity) {
        this.severity = severity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
