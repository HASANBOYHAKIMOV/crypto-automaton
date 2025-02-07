package org.example.springcryptoautomaticalyjava.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.example.springcryptoautomaticalyjava.http.SlackHttpClient;
import org.example.springcryptoautomaticalyjava.http.UpbitHttpClient;
import org.example.springcryptoautomaticalyjava.repository.ReportHistoryRepository;
import org.example.springcryptoautomaticalyjava.service.UpbitSlackService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class testController {

    private final UpbitSlackService upbitSlackService;

    @GetMapping("/api/v1/ticker/{market}")
    public void test(@PathVariable String market){
        upbitSlackService.execute(market);

    }
}
