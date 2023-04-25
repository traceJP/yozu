package com.tracejp.yozu.api.thirdparty;

import com.tracejp.yozu.api.thirdparty.domain.MailMessage;
import com.tracejp.yozu.api.thirdparty.domain.SmsMessage;
import com.tracejp.yozu.common.core.constant.ServiceNameConstants;
import com.tracejp.yozu.common.core.domain.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * <p> 第三方服务接口 <p/>
 *
 * @author traceJP
 * @since 2023/4/24 19:54
 */
@FeignClient(contextId = "remoteThirdpartyService", value = ServiceNameConstants.THIRDPARTY_SERVICE)
public interface RemoteThirdpartyService {

    /**
     * 发送邮件
     * @param message 邮件信息
     */
    @PostMapping("/mail/send")
    R<?> sendMail(@RequestBody MailMessage message);

    /**
     * 发送短信
     * @param message 短信信息
     */
    @PostMapping("/send")
    R<?> sendSms(@RequestBody SmsMessage message);

}
