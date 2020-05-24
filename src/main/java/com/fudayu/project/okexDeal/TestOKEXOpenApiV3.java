package com.fudayu.project.okexDeal;

import com.okcoin.commons.okex.open.api.bean.futures.result.ServerTime;
import com.okcoin.commons.okex.open.api.config.APIConfiguration;
import com.okcoin.commons.okex.open.api.service.GeneralAPIService;
import com.okcoin.commons.okex.open.api.service.futures.impl.GeneralAPIServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestOKEXOpenApiV3 {

    @Autowired
    private GeneralAPIService generalAPIService;

    @GetMapping("/server-time")
    @ResponseBody
    public ServerTime getServerTime() {

        ServerTime serverTime = generalAPIService.getServerTime();
        return serverTime;
    }

    @Bean
    public APIConfiguration okexApiConfig() {
        APIConfiguration config = new APIConfiguration();
        config.setEndpoint("https://www.okex.com/");
        config.setApiKey("7cc5a163-37b4-4010-95da-8dd29d38e91b");
        config.setSecretKey("5CE8242B8DE0D1E76783C538AC14B872");
        config.setPassphrase("FUDAYU");
		//是否打印请求头数据
        config.setPrint(false);
        return config;
    }
//    apikey = "7cc5a163-37b4-4010-95da-8dd29d38e91b"
//    secretkey = "5CE8242B8DE0D1E76783C538AC14B872"
//    IP = "0"
//    备注名 = "fudayu_token"
//    权限 = "只读/交易"
    @Bean
    public GeneralAPIService generalAPIService(APIConfiguration config) {
        return new GeneralAPIServiceImpl(config);
    }
}