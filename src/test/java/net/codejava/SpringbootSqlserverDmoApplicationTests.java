package net.codejava;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
public class SpringbootSqlserverDmoApplicationTests implements CommandLineRunner {
	@SuppressWarnings("unused")
	private JdbcTemplate jdbcTemplate;

	@Test
	public void contextLoads() {
	}

}
