package org.example.springcryptoautomaticalyjava.service;

import lombok.RequiredArgsConstructor;
import org.example.springcryptoautomaticalyjava.entity.ReportHistory;
import org.example.springcryptoautomaticalyjava.http.SlackHttpClient;
import org.example.springcryptoautomaticalyjava.http.UpbitHttpClient;
import org.example.springcryptoautomaticalyjava.http.UpbitTickerDto;
import org.example.springcryptoautomaticalyjava.repository.ReportHistoryRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpbitSlackService {

    private final SlackHttpClient slackHttpClient;
    private final UpbitHttpClient upbitHttpClient;
    private final ReportHistoryRepository reportHistoryRepository;


    public void execute(String market) {

        // Upbit
        UpbitTickerDto tickerByMarket = upbitHttpClient.getTickerByMarket(market);


        // Slack
        StringBuilder sb = new StringBuilder();
        sb.append("실시간 데이터");
        sb.append(market);
        sb.append(" price = ");
        sb.append(tickerByMarket.getTrade_price());
        slackHttpClient.send(sb.toString());

        reportHistoryRepository.save(market, String.valueOf(tickerByMarket.getAcc_trade_price()));
    }
}
