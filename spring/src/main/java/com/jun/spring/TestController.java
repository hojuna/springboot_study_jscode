package com.jun.spring;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    int num=0;
    @GetMapping("api/test")
    public String test(){
        return "test";
    }
    @GetMapping("api/name")
    public String test2(){
        return "이호준";
    }

    /**
     * 쿼리 스트링을 통해서
     * @param name
     * @return
     */
    @GetMapping("api/returnName")
    public String returnName(@RequestParam("name") String name){
        return name;
    }

    /**
     * api url 경롤 통해서
     * @param name
     * @return
     */
    @GetMapping("api/returnName2/{name}")
    public String returnName2(@PathVariable("name") String name){
        return name;
    }


    @GetMapping("api/hojun")
    public String iam(){
        num+=1;

        return "콘솔 테스트: " + num;

    }

    @GetMapping("api/getNum")
    public int returnNum(){
        return num;
    }
}
