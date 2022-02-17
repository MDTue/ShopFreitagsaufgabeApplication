package de.neuefische.shop_freitagsaufgabe;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class GitHubControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void shouldRetrieveRepositoryNames(){
        ResponseEntity<String[]>  response = restTemplate.getForEntity("/github/MDTue", String[].class);
        assertTrue((response.getBody().length > 0));
    }





}


