import java.util.Objects;

public class Actor extends Person {

    private final int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }



    @Override
    public String toString() {
        return getName() + " " + getSurname() + " (" + height + " см)";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Actor newActor = (Actor) o;
        return getName().equals(newActor.getName()) &&
                getSurname().equals(newActor.getSurname()) &&
                height == newActor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), height);
    }
}
