package ru.netology.homeworkfjddiploma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.netology.homeworkfjddiploma.entity.MyUser;
import ru.netology.homeworkfjddiploma.repository.MyRepository;

import java.util.List;
import java.util.stream.IntStream;

@Component
public class CommandLineApp implements CommandLineRunner {
    @Autowired
    private MyRepository myRepository;

    @Override
    @Transactional
    public void run(String... args) {
        var logins = List.of("user", "admin");
        var passwords = List.of("password", "password");
        var firstNames = List.of("Katya", "Vasiliy");
        var lastNames = List.of("Ivanova", "Pupkin");
        var roles = List.of("USER", "ADMIN");

        IntStream.range(0, logins.size())
                .forEach(i -> {
                    var myUser = MyUser.builder()
                            .login(logins.get(i))
                            .password(passwords.get(i))
                            .firstName(firstNames.get(i))
                            .lastName(lastNames.get(i))
                            .role(roles.get(i))
                            .build();

                    myRepository.getMyUserRepository().save(myUser);
                });
    }
}
