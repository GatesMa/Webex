package io.swagger.api;

import com.gatesma.webex.entities.Account;
import com.gatesma.webex.entities.Page;
import com.gatesma.webex.util.SpringUtil;
import io.swagger.model.ApiReturnCode;
import io.swagger.model.LoginRequest;
import io.swagger.model.LoginRet;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.model.PageNameSetRet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-25T02:02:49.831Z")

@Controller
public class AccountApiController implements AccountApi {

    private static final Logger log = LoggerFactory.getLogger(AccountApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AccountApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }


    public ResponseEntity<LoginRet> login(@ApiParam(value = "用户登陆login信息" ,required=true )  @Valid @RequestBody LoginRequest body) {
        log.info("访问接口：" + request.getRequestURI());
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            Account account =(Account) SpringUtil.getBean("account");
            LoginRet response = new LoginRet();
            if(null == body.getUsername() || null == body.getPassword()) {
                response.code(ApiReturnCode.FAIL.code)
                        .message("请填写用户名和密码");
                return new ResponseEntity<LoginRet>(response, HttpStatus.OK);
            }
            if(account.getLoginName().equals(body.getUsername()) && account.getPassword().equals(body.getPassword())) {
                response.code(ApiReturnCode.SUCCESS.code)
                        .message("登陆成功");
            } else {
                response.code(ApiReturnCode.LOGIN_FAIL_FOR_ERROR.code)
                        .message("用户名或密码不正确");
            }
            return new ResponseEntity<LoginRet>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<LoginRet>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
