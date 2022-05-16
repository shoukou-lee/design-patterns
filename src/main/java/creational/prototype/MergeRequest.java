package creational.prototype;

import java.util.Objects;

public class MergeRequest {
    private String issuer;
    private String commitSha;

    public MergeRequest(String issuer, String commitSha) {
        this.issuer = issuer;
        this.commitSha = commitSha;
    }

    public String getIssuer() {
        return issuer;
    }

    public String getCommitSha() {
        return commitSha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MergeRequest that = (MergeRequest) o;
        return Objects.equals(issuer, that.issuer) && Objects.equals(commitSha, that.commitSha);
    }

}
