package pojo;

public class StudentImpl {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentImpl{" +
                "name='" + name + '\'' +
                '}';
    }
}
