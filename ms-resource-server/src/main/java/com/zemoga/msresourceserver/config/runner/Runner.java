package com.zemoga.msresourceserver.config.runner;

import com.zemoga.msresourceserver.model.Profile;
import com.zemoga.msresourceserver.repository.ProfileRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @project profile-zemoga
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 5/09/2023
 **/
/*@Component*/
@AllArgsConstructor
public class Runner implements CommandLineRunner {
    private final ProfileRepository profileRepository;
    @Override
    public void run(String... args) throws Exception {
        profileRepository.save(Profile.builder()
                .idUsuario(328970200L)
                        .apePaterno("Chafloque")
                        .apeMaterno("Tampeck")
                        .nombres("Oscar Alfredo")
                        .email("ochafloquet@gmail.com")
                        .photo("https://lh3.googleusercontent.com/a/AAcHTtcgc5LLrO8uRChR5YZYhtQfyu1K19r7UvHjakh1iMW4xvQ=s288-c-no")
                        .resumeObjectives("•\t17+ de experiencia facilitando soluciones de ingeniería de vanguardia con una amplia gama de aplicaciones Java (Spring boot, Spring Security y Spring Cloud).\n" +
                                "•\tExperiencia en análisis de sistemas, diseño, arquitectura de flujos de trabajo, desarrollo, pruebas y mantenimiento de aplicaciones basadas en web.\n" +
                                "•\t7 años de experiencia trabajando en un entorno corporativo como desarrollador front-end UI/Web. Sólidos conocimientos técnicos en desarrollo de sitios web complejos, incluidas aplicaciones basadas en web.\n" +
                                "•\tExperiencia desarrollando aplicaciones web altamente interactivas utilizando JavaScript, HTML5, CSS, JSON, Angular 10, y Bootstrap o Angular Material e integrando API's Restful.\n" +
                                "•\tConocimiento profundo de las tecnologías y estándares web para ofrecer las mejores experiencias a través de la web y los dispositivos móviles, incluida la interfaz de usuario web con capacidad de respuesta.\n" +
                                "•\tAmplia experiencia en el desarrollo de aplicaciones basadas en SOAP y REST.\n" +
                                "•\tTrabajado en varios sistemas de control de versiones - SVN, GIT.\n" +
                                "•\tHa trabajado ampliamente en el proceso de desarrollo ágil.\n" +
                                "•\tBuen conocimiento de los patrones de diseño Modelo Vista Controlador MVC, MVVM y MVP.\n" +
                                "Experiencia en diseño de bases de datos, creación y gestión de esquemas, redacción de procedimientos almacenados, restricciones, consultas SQL, vistas, exportación/importación, etc.\n")
                .build());
    }
}
