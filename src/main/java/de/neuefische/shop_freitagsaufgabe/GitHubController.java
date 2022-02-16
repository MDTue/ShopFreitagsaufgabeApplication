package de.neuefische.shop_freitagsaufgabe;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/github")
public class GitHubController {

    @GetMapping("/githubUser")
    public String[] getRepositoryNames(@PathVariable String githubUser){
       String url = "https://api.github.com/users/" + githubUser + "/repos";
       RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Repository[]> response = restTemplate.getForEntity(url, Repository[].class);
        Repository[] repositories = response.getBody();
        String[] repositoryNames = new String[repositories.length];
        for (int i=0; i<repositoryNames.length; i++) {
            repositoryNames[i]= repositories[i].getName();
        }
        return repositoryNames;
    }

}
