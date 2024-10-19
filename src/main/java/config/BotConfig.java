package config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource("application.properties")
public class BotConfig {
    @Value("${t.me/IT_Nico_bot}")
    String botName;
    @Value("${7815802972:AAHnNPIXRgSZbgxcRmJ4M4qAuIF4NRyEoiI}")
    String token;
}

/*

{
    "amount": 100.0,
    "base": "EUR",
    "date": "2024-19-10",
    "rates": {
        "USD": 109.57
    }
}
 */