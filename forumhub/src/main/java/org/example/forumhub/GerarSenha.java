package org.example.forumhub;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class GerarSenha implements CommandLineRunner {

    @Override
    public void run(String... args) {
                if (args.length == 0) {
            System.err.println("Uso: mvnw spring-boot:run -Dspring-boot.run.arguments=\"<senha>\"");
            System.exit(1);
        }

        String plain = args[0];                            
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String senhaHash = encoder.encode(plain);

        System.out.println("=================================");
        System.out.println("Senha criptografada: " + senhaHash);
        System.out.println("=================================");

        System.exit(0);                                 
    }
}
