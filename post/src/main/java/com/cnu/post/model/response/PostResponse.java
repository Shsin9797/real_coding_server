package com.cnu.post.model.response;
import com.cnu.post.model.Advertisement;
import com.cnu.real_coding_server.entity.Post;

public record PostResponse(
         Post post, //게시글과 광고를 같이내려줄거라
        Advertisement advertisement
) { //카멜케이스 .. 변수명.. 짓는관례 ..
    // post_response 스네이크 케이스.. 뱀같아서 . 띄워쓰기마다. .
}
