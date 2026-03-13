package com.miempresa.holamundo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  private final JdbcTemplate jdbc;

  public HelloController(JdbcTemplate jdbc) {
    this.jdbc = jdbc;
  }

  @GetMapping("/hello")
  public String hello() {
    try {
      return jdbc.queryForObject(
          "select msg_text from messages where msg_key = ?",
          String.class,
          "hello"
      );
    } catch (Exception e) {
      return "Hola mundo (fallback). DB no disponible o sin dato.";
    }
  }
}
