package com.cnu.post.client;

import com.cnu.post.model.Advertisement;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//스프링이 관리하는 객체가 될수있도록
@Component
public class AdvertisementClient {

    //http 프로토콜 쓸수있도록
    RestTemplate restTemplate = new RestTemplate(); // 광고서버에게 광고를 요청함
    private static final Advertisement AD_FALLBACK = new Advertisement(
            "Devblog로 개발 블로그를 만들어보자",
            "Devblog는 개발자들을 위한 블로그 플랫폼입니다. Devblog로 개발 블로그를 만들어보세요!",
            "https://devblog.com/images/og-image.png",
            "https://devblog.com"
    );
    //서킷브레이커 설치
    @CircuitBreaker(name = "ad",fallbackMethod = "fallback" ) //광고서버와 관련된 서킷..
    public Advertisement getAd(){
        return restTemplate.getForObject("http://localhost:9090/ads",Advertisement.class ); // 두번째.. 어떤 객체로 받고시은지 적음..
        //클라이언트 다 작성한거임.. .
    }

    private Advertisement fallback(CallNotPermittedException e){
        return AD_FALLBACK;

    }

}
