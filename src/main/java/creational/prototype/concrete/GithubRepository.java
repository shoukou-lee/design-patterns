package creational.prototype.concrete;

import creational.prototype.PullRequest;
import creational.prototype.prototype.Repository;

import java.util.Objects;

public class GithubRepository implements Repository, Cloneable {

    private String name;

    private String description;

    private PullRequest pr;

    public GithubRepository(String name, String description, PullRequest pr) {
        this.name = name;
        this.description = description;
        this.pr = pr;
    }

    @Override
    public Repository customClone() throws CloneNotSupportedException {
        return (Repository) clone();
    }

    // shallow copy clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Repository) super.clone();
    }

    // boilerplates
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public PullRequest getPr() {
        return pr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubRepository that = (GithubRepository) o;
        return Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(pr, that.pr);
    }

}
