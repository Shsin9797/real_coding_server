package com.cnu.ad.model;

public record Advertisement(

        String title,  // private final 이 숨어잇음 . 자동으로 getter 만들어줌 .. ㅁ .. 17버전에 재밌는 피쳐 많음..
        String description,
        String imageUrl,
        String siteUrl

) {  //레코드.. 자바 17 에서 새로생김..
    //클래스중에.. 값만 들고다니는애.. 레이어를 이동하면서 값만가지는걸 밸류오브젝트라고 하는데..그걸 작성하기위해 만들어진 피쳐임



}
