package creational.prototype.concreteprototype;

import creational.prototype.MergeRequest;
import creational.prototype.prototype.Repository;

import java.util.Objects;

public class GitlabRepository implements Repository {

    private String name;

    private String description;

    private MergeRequest mr;

    public GitlabRepository(String name, String description, MergeRequest mr) {
        this.name = name;
        this.description = description;
        this.mr = mr;
    }

    @Override
    public Repository customClone() {
        return new GitlabRepository(this.name, this.description, new MergeRequest(this.mr.getIssuer(), this.mr.getCommitSha()));
    }

    // boilerplates
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public MergeRequest getMr() {
        return mr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GitlabRepository that = (GitlabRepository) o;
        return Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(mr, that.mr);
    }

}
