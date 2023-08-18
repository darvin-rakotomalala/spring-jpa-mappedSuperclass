package com.poc;

import com.poc.domain.Developer;
import com.poc.domain.Tutorial;
import com.poc.repository.DeveloperRepository;
import com.poc.repository.TutorialRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Slf4j
@SpringBootApplication
@EnableJpaAuditing
public class MainApplication implements ApplicationRunner {

    @Autowired
    private TutorialRepository tutorialRepository;

    @Autowired
    private DeveloperRepository developerRepository;

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("############################   RUN   ############################");

        var testTutorial = Tutorial.builder()
                .title("JPA MappedSuperclass")
                .description("Spring Data JPA inheritance MappedSuperclass")
                .level(2)
                .published(true)
                .build();

        tutorialRepository.save(testTutorial);

        var testDeveloper = Developer.builder()
                .fullName("Tojo Darvin")
                .position("Developer backend Java - Spring Boot")
                .yearExperience(5)
                .build();

        developerRepository.save(testDeveloper);
    }

}
