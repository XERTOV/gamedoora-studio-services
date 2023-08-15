package com.gamedoora.backend.studioservices.repository;
import com.gamedoora.model.dao.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.assertThat;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

@DataJpaTest(properties = {"spring.cloud.config.enabled=false"})
class StudioRepositoryTest {

    @Autowired
    private StudioRepository studioRepository;

    @Test
    void findByName() {
        Studios studio1 = Studios.builder().id(40).name("avik").build();
        studioRepository.saveAll(List.of(studio1));
        List<Studios> registeredName = studioRepository.findByName("avik");
        assertThat(registeredName).isNotEmpty();
    }


    @Test
    void findByUsersSet_Id() {
        Studios studio2 = Studios.builder().id(21).name("xyz").usersSet(new HashSet<>()).build();
        studioRepository.saveAll(List.of(studio2));
        List<Studios> registeredUsersSet_Id = studioRepository.findByUsersSet_Id(21);
        assertThat(registeredUsersSet_Id).isNotNull();


    }


}