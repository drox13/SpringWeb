package com.dario.curso.sprintboot.webapp.sprintboot_web;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({ //para configurar varios archivos .  properties
	 @PropertySource(value = "classpath:values.properties", encoding = "UTF-8") //aca quedaria configurada y da acceso a toda la aplicacion,
}) 
public class AppConfig {

}
