package com.cnu.ad.controller;


import com.cnu.ad.model.Advertisement;
import com.cnu.ad.service.AdService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ads")
@RequiredArgsConstructor
public class AdController {
    private final AdService adService;

    //get 요청으로 광고받기..
    //getMapping 핸들링 해줄수잇는거 찾기
    @GetMapping // 요청하는거라 GetMapping 붙여줘야함.. .?
    public Advertisement getAd(){ return adService.getAd(); }  //서비스 한테 에드 가져와 ..라고 시킬거임
}
