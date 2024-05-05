package com.booking.api.common.config

import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig {

    @Bean
    fun openAPI(): OpenAPI {
        return OpenAPI()
                .components(Components())
                .info(configurationInfo())
    }

    private fun configurationInfo(): Info {
        return Info()
                .title("레스토랑 예약 시스템")
                .description("레스토랑을 예약할 수 있는 백엔드 API")
                .version("1.0.0")
    }

}
