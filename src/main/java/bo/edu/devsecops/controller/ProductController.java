package bo.edu.devsecops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/search")
    public List<Map<String, Object>> searchProducts(@RequestParam("name") String name) {
        // Usamos consultas parametrizadas (?) para prevenir Inyección SQL detectada por Semgrep
        String sql = "SELECT id, name, price FROM products WHERE name LIKE ?";
        return jdbcTemplate.queryForList(sql, "%" + name + "%");
    }
}