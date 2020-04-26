package io.swagger.api;

import com.gatesma.webex.entities.Page;
import com.gatesma.webex.util.SpringUtil;
import io.swagger.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-25T02:02:49.831Z")

@RestController
public class PageApiController implements PageApi {

    private static final Logger log = LoggerFactory.getLogger(PageApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PageApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }


    public ResponseEntity<PageNameGetRet> pagenameget() {
        log.info("访问接口：" + request.getRequestURI());
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            Page page = (Page) SpringUtil.getBean("page");
            PageNameGetRet response = new PageNameGetRet();
            response.data(new PageNameGetData().name(page.getName()))
                    .code(ApiReturnCode.SUCCESS.code)
                    .message("获取成功");
            return new ResponseEntity<PageNameGetRet>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<PageNameGetRet>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<PageNameSetRet> pagenameset(@ApiParam(value = "个人主页名称" ,required=true )  @Valid @RequestBody PageNameSetRequest body) {
        log.info("访问接口：" + request.getRequestURI());
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
                Page page = (Page) SpringUtil.getBean("page");
                page.setName(body.getName());
                PageNameSetRet response = new PageNameSetRet();
                response.code(ApiReturnCode.SUCCESS.code)
                        .message("设置成功");
                return new ResponseEntity<PageNameSetRet>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<PageNameSetRet>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
