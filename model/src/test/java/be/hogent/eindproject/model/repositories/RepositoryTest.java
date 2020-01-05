package be.hogent.eindproject.model.repositories;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;



class RepositoryTest {

    @Test
    void testRepoConnection() {
        Assertions.assertThatCode(()-> new Repository()).doesNotThrowAnyException();
    }
}