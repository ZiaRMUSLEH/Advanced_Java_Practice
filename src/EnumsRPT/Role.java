package EnumsRPT;

public enum Role {
    ADMIN("admin"),
    TEACHER("teacher"),
    STUDENT("student");

    private final String name;


    Role (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }
}
