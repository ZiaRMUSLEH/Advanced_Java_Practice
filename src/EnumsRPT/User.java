package EnumsRPT;

public class User {
    private String name;
    private Role role;

    public User (Role role) {
        this.role = role;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Role getRole () {
        return role;
    }

    public void setRole (Role role) {
        this.role = role;
    }
}
