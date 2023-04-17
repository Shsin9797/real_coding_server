package com.cnu.ad.service;

import com.cnu.ad.model.Advertisement;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class AdService {
    private final List<Advertisement> ads = List.of(
            new Advertisement("구글 개발자 채용", "구글코리아에서 우수한 인재들을 모집합니다", "https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png", "https://www.google.com"),
            new Advertisement("나이키 멤버십 빅 세일", "오직 나이키 멤버십을 위한 단 3일! 새학기 설레는 마음을 조던과 함께", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdn.eyesmag.com%2Fcontent%2Fuploads%2FsliderImages%2F2020%2F12%2F24%2Fair-jordan-1-ko-chicago-01-406abe1e-0ef2-4b71-b479-7716fdb60630.jpg&tbnid=QyvBKpDwO_UoBM&vet=12ahUKEwjA0KXhva7-AhXnplYBHaWYA2cQMygAegUIARCMAg..i&imgrefurl=https%3A%2F%2Fwww.eyesmag.com%2Fposts%2F133372%2Fair-jordan-1-ko-chicago&docid=sYwmVvloa4MEMM&w=903&h=600&q=%EC%A1%B0%EB%8D%98&ved=2ahUKEwjA0KXhva7-AhXnplYBHaWYA2cQMygAegUIARCMAg", "https://www.nike.com/kr"),
            new Advertisement("충남대학교 컴퓨터공학 대학원생 상반기 모집", "충남대학교 컴퓨터공학 대학원생 상반기 모집을 시작합니다. 자세한 사항은 홈페이지를 참고해주세요.", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fplus.cnu.ac.kr%2FUpl%2F_board%2Fsub07_0703%2Fsub07_0703_0_1625820900.jpg&tbnid=25yHUTidQqon-M&vet=12ahUKEwinxujGva7-AhVVplYBHfSXBE4QMygDegUIARDMAQ..i&imgrefurl=https%3A%2F%2Fplus.cnu.ac.kr%2F_prog%2F_board%2F%3Fmode%3DV%26no%3D2480211%26code%3Dsub07_0703%26site_dvs_cd%3Dkr%26menu_dvs_cd%3D0703%26skey%3D%26sval%3D%26site_dvs%3D%26ntt_tag%3D%26GotoPage%3D&docid=nUktNpfW-pncMM&w=2048&h=1215&q=%EC%B6%A9%EB%82%A8%EB%8C%80%ED%95%99%EA%B5%90&ved=2ahUKEwinxujGva7-AhVVplYBHfSXBE4QMygDegUIARDMAQ", "https://plus.cnu.ac.kr/html/kr/"),
            new Advertisement("쿠팡 와우회원 1만원 할인", "오직 쿠팡 와우회원에게만 주어지는 마지막 기회! 1만원 할인 쿠폰을 받아보세요.", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fimage10.coupangcdn.com%2Fimage%2Fmobile%2Fv3%2Fimg_fb_like.png&tbnid=9tak8zDG-dGaMM&vet=12ahUKEwip6-2Rvq7-AhVflFYBHRiADfwQMygAegUIARDbAQ..i&imgrefurl=https%3A%2F%2Fwww.coupang.com%2F&docid=Qqxdvidhpoqf-M&w=512&h=512&itg=1&q=%EC%BF%A0%ED%8C%A1&ved=2ahUKEwip6-2Rvq7-AhVflFYBHRiADfwQMygAegUIARDbAQ", "https://www.coupang.com/"),
            new Advertisement("네이버 쇼핑에서 후기쓰고 포인트 적립하자~", "믿고보는 네이버 쇼핑 후기! 후기쓰고 포인트 적립하자~", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcenter.shopping.naver.com%2Fimg%2Fimg_main_carousel.jpg&tbnid=4w-j7Xc4PzwJ5M&vet=12ahUKEwjw--fKvq7-AhV9klYBHQ8QAZYQMygAegUIARCIAQ..i&imgrefurl=https%3A%2F%2Fcenter.shopping.naver.com%2F&docid=oZ5oXq3Zhw_iFM&w=2050&h=1478&q=%EB%84%A4%EC%9D%B4%EB%B2%84%20%EC%87%BC%ED%95%91&ved=2ahUKEwjw--fKvq7-AhV9klYBHQ8QAZYQMygAegUIARCIAQ", "https://www.naver.com/"),
            new Advertisement("시험기간 이벤트 참여하고 간식받자!", "공부하기도 힘든데 배는 고프지 말아야지! 시험기간 이벤트 참여하고 간식받자!", "https://www.google.com/imgres?imgurl=https%3A%2F%2Fcenter.shopping.naver.com%2Fimg%2Fimg_main_carousel.jpg&tbnid=4w-j7Xc4PzwJ5M&vet=12ahUKEwjw--fKvq7-AhV9klYBHQ8QAZYQMygAegUIARCIAQ..i&imgrefurl=https%3A%2F%2Fcenter.shopping.naver.com%2F&docid=oZ5oXq3Zhw_iFM&w=2050&h=1478&q=%EB%84%A4%EC%9D%B4%EB%B2%84%20%EC%87%BC%ED%95%91&ved=2ahUKEwjw--fKvq7-AhV9klYBHQ8QAZYQMygAegUIARCIAQ", "https://www.naver.com/")
    );

    public Advertisement getAd(){
        int randomIndex =new Random().nextInt(ads.size());
        return ads.get(randomIndex);
    }
}
