package chapters.collection.imutableClass;

import java.util.Objects;

public final class Company {
    private final String id;
    private final String name;
    private final Person director;

    public Company(String id, String name, Person director) {
        this.id = id;
        this.name = name;
        this.director = new Person(director.getName(),director.getSurname());
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Person getDirector() {
        return new Person(director.getName(),director.getSurname());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company company)) return false;
        return Objects.equals(id, company.id) && Objects.equals(name, company.name) && Objects.equals(director, company.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, director);
    }

    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", director=" + director +
                '}';
    }
}
