package effective_java_practice.override_equals;

public class Example {
    private String name;
    private String middle;
    private String lastName;

    public Example(String name, String middle, String lastName) {
        this.name = name;
        this.middle = middle;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getMiddle() {
        return middle;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Example{");
        sb.append("name='").append(name).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Example)) return false;
        Example example = (Example) o;
        return getName().equals(example.getName()) && getMiddle().equals(example.getMiddle()) && getLastName().equals(example.getLastName());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result +getLastName().hashCode();
        result = 31 * result + getMiddle().hashCode();
        return result;
    }
}
