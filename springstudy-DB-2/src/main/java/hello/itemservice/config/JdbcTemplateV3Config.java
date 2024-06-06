package hello.itemservice.config;

import hello.itemservice.repository.ItemRepository;
import hello.itemservice.repository.JdbcTemplate.JdbcTemplateItemRepositoryV2;
import hello.itemservice.repository.JdbcTemplate.JdbcTemplateItemRepositoryV3;
import hello.itemservice.service.ItemService;
import hello.itemservice.service.ItemServiceV1;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;

//@Configuration
@RequiredArgsConstructor
public class JdbcTemplateV3Config {

    private final DataSource dataSource;

    @Bean
    public ItemService itemService(){
        return new ItemServiceV1(itemRepository());
    }
    @Bean
    public ItemRepository itemRepository(){
        return new JdbcTemplateItemRepositoryV3(dataSource,new SimpleJdbcInsert(dataSource));
    }

}
