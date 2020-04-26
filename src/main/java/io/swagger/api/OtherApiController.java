package io.swagger.api;

import com.gatesma.webex.entities.Contact;
import com.gatesma.webex.entities.Other;
import com.gatesma.webex.entities.Personal;
import com.gatesma.webex.util.EntityUtil;
import com.gatesma.webex.util.SpringUtil;
import io.swagger.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
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
import java.util.ArrayList;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-25T02:02:49.831Z")

@Controller
public class OtherApiController implements OtherApi {

    private static final Logger log = LoggerFactory.getLogger(OtherApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OtherApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ContactListGetRet> contactlistget() {
        log.info("访问接口：" + request.getRequestURI());
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            Other other = (Other) SpringUtil.getBean("other");
            ContactListGetRet response = new ContactListGetRet();
            response.data(new ContactListGetData().list(other.getList()))
                    .code(ApiReturnCode.SUCCESS.code)
                    .message("获取成功");
            return new ResponseEntity<ContactListGetRet>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<ContactListGetRet>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<ContactListSetRet> contactlistset(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ContactSetRequest body) {
        log.info("访问接口：" + request.getRequestURI());
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            Other other = (Other) SpringUtil.getBean("other");
            List<ContactItem> list = body.getList();
            List<Contact> newlist = new ArrayList<>();
            for(ContactItem contact : list) {
                newlist.add(EntityUtil.swaggerContactToModel(contact));
            }
            other.setList(newlist);
            ContactListSetRet response = new ContactListSetRet();
            response.code(ApiReturnCode.SUCCESS.code)
                    .message("设置成功");
            return new ResponseEntity<ContactListSetRet>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<ContactListSetRet>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
