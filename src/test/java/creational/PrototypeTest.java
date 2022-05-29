package creational;

import creational.prototype.MergeRequest;
import creational.prototype.PullRequest;
import creational.prototype.concreteprototype.GithubRepository;
import creational.prototype.concreteprototype.GitlabRepository;
import creational.prototype.prototype.Repository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PrototypeTest {

    @Test
    @DisplayName("Swallow-copied clone")
    void swallowCopiedClone() throws CloneNotSupportedException {
        // given
        String name = "design-patterns";
        String desc = "gof's 23 design patterns";
        PullRequest pr = new PullRequest("shoukou", "8a42d46b");

        Repository githubRepository = new GithubRepository(name, desc, pr);

        // when
        Repository clone = githubRepository.customClone();

        // then
        assertThat(githubRepository).isNotSameAs(clone);
        assertThat(githubRepository).isEqualTo(clone);
        assertThat(((GithubRepository) githubRepository).getPr()).isSameAs(((GithubRepository) clone).getPr());

    }

    @Test
    @DisplayName("Deep-copied clone")
    void deepCopiedClone() throws CloneNotSupportedException {
        // given
        String name = "design-patterns";
        String desc = "gof's 23 design patterns";
        MergeRequest mr = new MergeRequest("shoukou", "8a42d46b");

        Repository gitlabRepository = new GitlabRepository(name, desc, mr);

        // when
        Repository clone = gitlabRepository.customClone();

        // then
        assertThat(gitlabRepository).isNotSameAs(clone);
        assertThat(gitlabRepository).isEqualTo(clone);
        assertThat(((GitlabRepository) gitlabRepository).getMr()).isNotSameAs(((GitlabRepository) clone).getMr());
        assertThat(((GitlabRepository) gitlabRepository).getMr()).isEqualTo(((GitlabRepository) clone).getMr());

    }


}
