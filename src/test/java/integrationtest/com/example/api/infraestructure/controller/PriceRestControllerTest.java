package integrationtest.com.example.api.infraestructure.controller;

import com.example.api.infraestructure.dto.PriceResponseDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

import java.time.LocalDateTime;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {com.example.api.ApiApplication.class})
@AutoConfigureMockMvc
class PriceRestControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper mapper;

    @Test
    @DisplayName("Test 1: petición a las 10:00 del día 14 del producto 35455 para la brand 1 (ZARA)")
    void test1() throws Exception {

        String applicationDateString = "2020-06-14T10:00:00";
        Integer priceListExpected = 1;
        Integer brandIdExpected = 1;
        Integer productIdExpected = 35455;
        LocalDateTime applicationDateExpected = LocalDateTime.parse(applicationDateString);
        LocalDateTime startDateExpected = LocalDateTime.of(2020, 6, 14, 0, 0, 0);
        LocalDateTime endDateExpected = LocalDateTime.of(2020, 12, 31, 23, 59, 59);
        Double priceExpected = 35.5;

        ResultActions resultActions = mockMvc.perform(get("/price/product/{productId}/brand/{brandId}", productIdExpected, brandIdExpected)
                        .param("application-date", applicationDateString))
                .andExpect(status().isOk());

        MvcResult result = resultActions.andReturn();
        String contentAsString = result.getResponse().getContentAsString();

        PriceResponseDto priceResponseDto = mapper.readValue(contentAsString, PriceResponseDto.class);

        Assertions.assertEquals(priceListExpected, priceResponseDto.getPriceList());
        Assertions.assertEquals(brandIdExpected, priceResponseDto.getBrandId());
        Assertions.assertEquals(productIdExpected, priceResponseDto.getProductId());
        Assertions.assertEquals(applicationDateExpected, priceResponseDto.getApplicationDate());
        Assertions.assertEquals(startDateExpected, priceResponseDto.getStartDate());
        Assertions.assertEquals(endDateExpected, priceResponseDto.getEndDate());
        Assertions.assertEquals(priceExpected, priceResponseDto.getPrice());
    }

    @Test
    @DisplayName("Test 2: petición a las 16:00 del día 14 del producto 35455 para la brand 1 (ZARA)")
    void test2() throws Exception {

        String applicationDateString = "2020-06-14T16:00:00";
        Integer priceListExpected = 2;
        Integer brandIdExpected = 1;
        Integer productIdExpected = 35455;
        LocalDateTime applicationDateExpected = LocalDateTime.parse(applicationDateString);
        LocalDateTime startDateExpected = LocalDateTime.of(2020, 6, 14, 15, 0, 0);
        LocalDateTime endDateExpected = LocalDateTime.of(2020, 6, 14, 18, 30, 0);
        Double priceExpected = 25.45;

        ResultActions resultActions = mockMvc.perform(get("/price/product/{productId}/brand/{brandId}", productIdExpected, brandIdExpected)
                        .param("application-date", applicationDateString))
                .andExpect(status().isOk());

        MvcResult result = resultActions.andReturn();
        String contentAsString = result.getResponse().getContentAsString();

        PriceResponseDto priceResponseDto = mapper.readValue(contentAsString, PriceResponseDto.class);

        Assertions.assertEquals(priceListExpected, priceResponseDto.getPriceList());
        Assertions.assertEquals(brandIdExpected, priceResponseDto.getBrandId());
        Assertions.assertEquals(productIdExpected, priceResponseDto.getProductId());
        Assertions.assertEquals(applicationDateExpected, priceResponseDto.getApplicationDate());
        Assertions.assertEquals(startDateExpected, priceResponseDto.getStartDate());
        Assertions.assertEquals(endDateExpected, priceResponseDto.getEndDate());
        Assertions.assertEquals(priceExpected, priceResponseDto.getPrice());
    }

    @Test
    @DisplayName("Test 3: petición a las 21:00 del día 14 del producto 35455 para la brand 1 (ZARA)")
    void test3() throws Exception {

        String applicationDateString = "2020-06-14T21:00:00";
        Integer priceListExpected = 1;
        Integer brandIdExpected = 1;
        Integer productIdExpected = 35455;
        LocalDateTime applicationDateExpected = LocalDateTime.parse(applicationDateString);
        LocalDateTime startDateExpected = LocalDateTime.of(2020, 6, 14, 0, 0, 0);
        LocalDateTime endDateExpected = LocalDateTime.of(2020, 12, 31, 23, 59, 59);
        Double priceExpected = 35.5;

        ResultActions resultActions = mockMvc.perform(get("/price/product/{productId}/brand/{brandId}", productIdExpected, brandIdExpected)
                        .param("application-date", applicationDateString))
                .andExpect(status().isOk());

        MvcResult result = resultActions.andReturn();
        String contentAsString = result.getResponse().getContentAsString();

        PriceResponseDto priceResponseDto = mapper.readValue(contentAsString, PriceResponseDto.class);

        Assertions.assertEquals(priceListExpected, priceResponseDto.getPriceList());
        Assertions.assertEquals(brandIdExpected, priceResponseDto.getBrandId());
        Assertions.assertEquals(productIdExpected, priceResponseDto.getProductId());
        Assertions.assertEquals(applicationDateExpected, priceResponseDto.getApplicationDate());
        Assertions.assertEquals(startDateExpected, priceResponseDto.getStartDate());
        Assertions.assertEquals(endDateExpected, priceResponseDto.getEndDate());
        Assertions.assertEquals(priceExpected, priceResponseDto.getPrice());
    }

    @Test
    @DisplayName("Test 4: petición a las 10:00 del día 15 del producto 35455 para la brand 1 (ZARA)")
    void test4() throws Exception {

        String applicationDateString = "2020-06-15T10:00:00";
        Integer priceListExpected = 3;
        Integer brandIdExpected = 1;
        Integer productIdExpected = 35455;
        LocalDateTime applicationDateExpected = LocalDateTime.parse(applicationDateString);
        LocalDateTime startDateExpected = LocalDateTime.of(2020, 6, 15, 0, 0, 0);
        LocalDateTime endDateExpected = LocalDateTime.of(2020, 6, 15, 11, 0, 0);
        Double priceExpected = 30.5;

        ResultActions resultActions = mockMvc.perform(get("/price/product/{productId}/brand/{brandId}", productIdExpected, brandIdExpected)
                        .param("application-date", applicationDateString))
                .andExpect(status().isOk());

        MvcResult result = resultActions.andReturn();
        String contentAsString = result.getResponse().getContentAsString();

        PriceResponseDto priceResponseDto = mapper.readValue(contentAsString, PriceResponseDto.class);

        Assertions.assertEquals(priceListExpected, priceResponseDto.getPriceList());
        Assertions.assertEquals(brandIdExpected, priceResponseDto.getBrandId());
        Assertions.assertEquals(productIdExpected, priceResponseDto.getProductId());
        Assertions.assertEquals(applicationDateExpected, priceResponseDto.getApplicationDate());
        Assertions.assertEquals(startDateExpected, priceResponseDto.getStartDate());
        Assertions.assertEquals(endDateExpected, priceResponseDto.getEndDate());
        Assertions.assertEquals(priceExpected, priceResponseDto.getPrice());
    }

    @Test
    @DisplayName("Test 5: petición a las 21:00 del día 16 del producto 35455 para la brand 1 (ZARA)")
    void test5() throws Exception {

        String applicationDateString = "2020-06-16T21:00:00";
        Integer priceListExpected = 4;
        Integer brandIdExpected = 1;
        Integer productIdExpected = 35455;
        LocalDateTime applicationDateExpected = LocalDateTime.parse(applicationDateString);
        LocalDateTime startDateExpected = LocalDateTime.of(2020, 6, 15, 16, 0, 0);
        LocalDateTime endDateExpected = LocalDateTime.of(2020, 12, 31, 23, 59, 59);
        Double priceExpected = 38.95;

        ResultActions resultActions = mockMvc.perform(get("/price/product/{productId}/brand/{brandId}", productIdExpected, brandIdExpected)
                        .param("application-date", applicationDateString))
                .andExpect(status().isOk());

        MvcResult result = resultActions.andReturn();
        String contentAsString = result.getResponse().getContentAsString();

        PriceResponseDto priceResponseDto = mapper.readValue(contentAsString, PriceResponseDto.class);

        Assertions.assertEquals(priceListExpected, priceResponseDto.getPriceList());
        Assertions.assertEquals(brandIdExpected, priceResponseDto.getBrandId());
        Assertions.assertEquals(productIdExpected, priceResponseDto.getProductId());
        Assertions.assertEquals(applicationDateExpected, priceResponseDto.getApplicationDate());
        Assertions.assertEquals(startDateExpected, priceResponseDto.getStartDate());
        Assertions.assertEquals(endDateExpected, priceResponseDto.getEndDate());
        Assertions.assertEquals(priceExpected, priceResponseDto.getPrice());
    }
}
