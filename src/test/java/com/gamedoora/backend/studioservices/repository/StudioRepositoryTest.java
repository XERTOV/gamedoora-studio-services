package com.gamedoora.backend.studioservices.repository;

import com.gamedoora.model.dao.Studios;
import com.gamedoora.model.dao.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest(properties = {"spring.cloud.config.enabled=false"})
//@ContextConfiguration(classes = GamedooraStudioServicesApplication.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class StudioRepositoryTest {


    @Autowired
    private StudioRepository studioRepository;

    @MockBean
    private EntityManager entityManager;

    @Test

    void findByName() {
        Studios studio1 = Studios.builder().id(40).name("avik").build();
        Studios studio2 = Studios.builder().id(41).name("rahul").build();

        studioRepository.saveAll(List.of(studio1, studio2));

        List<Studios> registeredStudios = new ArrayList<>();
        registeredStudios.addAll(studioRepository.findByName("avik"));
        registeredStudios.addAll(studioRepository.findByName("rahul"));

        assertThat(registeredStudios)
                .isNotEmpty()
                .hasSize(2)
                .extracting("name")
                .containsExactlyInAnyOrder("avik", "rahul");

    }


    @Test

    void findByUsersSet_Id() {

//        Users user = Users.builder()
//                .id(1L)
//                .firstName("someUsername")
//                .providerToken("")
//                .email("user@example.com")
//                .build();
//        entityManager.persist(user);
//
//        Studios studio1 = Studios.builder().id(40).name("avik").usersSet(Set.of(user)).build();
//        Studios studio2 = Studios.builder().id(41).name("rahul").usersSet(Set.of(user)).build();
//        entityManager.persist(studio1);
//        entityManager.persist(studio2);
//
//        entityManager.clear();
//        List<Studios> registeredStudios = studioRepository.findByUsersSet_Id(user.getId());
//
//        assertThat(registeredStudios)
//                .isNotEmpty()
//                .hasSize(2)
//                .extracting("name")
//                .containsExactlyInAnyOrder("avik", "rahul");


    }


}