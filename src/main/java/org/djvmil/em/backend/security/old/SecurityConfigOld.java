package org.djvmil.em.backend.security.old;
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfigOld {

    @Autowired
    AuthenticationManager authenticationManager;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception{

        System.out.println("except 13");
        httpSecurity.sessionManagement(session ->
                        session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                        .csrf(AbstractHttpConfigurer::disable)
                        //.csrf(csrf -> csrf.disable())
                        //.authorizeHttpRequests(requests -> requests.requestMatchers("/login", "register").permitAll())
                        .authorizeHttpRequests( requests ->
                                requests.requestMatchers("/login").permitAll()
                                        .anyRequest().authenticated()
                        )
                        .addFilterBefore(new JWTAuthenticationFilterOld(authenticationManager),
                            UsernamePasswordAuthenticationFilter.class);

        System.out.println("except 14 ");
        return httpSecurity.build();
    }

}*/