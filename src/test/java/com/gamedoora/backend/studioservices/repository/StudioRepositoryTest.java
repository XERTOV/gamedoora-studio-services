package com.gamedoora.backend.studioservices.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest(properties = {"spring.cloud.config.enabled=false"})
class StudioRepositoryTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void findByName() {
    }


    @Test
    void findByUsersSet_Id() {
    }


}