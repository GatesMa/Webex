package io.swagger.api;

import com.gatesma.webex.entities.Page;
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
public class PersonalApiController implements PersonalApi {

    private static final Logger log = LoggerFactory.getLogger(PersonalApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PersonalApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<BasicProfileGetRet> basicprofileget() {
        log.info("访问接口：" + request.getRequestURI());
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            Personal personal = (Personal) SpringUtil.getBean("personal");
            //System.out.println(personal);
            BasicProfileGetRet response = new BasicProfileGetRet();
            BasicProfileGetData data = new BasicProfileGetData().name(personal.getProfile().getName())
                    .bornTime(personal.getProfile().getBornTime())
                    .email(personal.getProfile().getEmail())
                    .freelance(personal.getProfile().getFreelance())
                    .phone(personal.getProfile().getPhone());
            response.data(data)
                    .code(ApiReturnCode.SUCCESS.code)
                    .message("获取成功");
            return new ResponseEntity<BasicProfileGetRet>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<BasicProfileGetRet>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<BasicProfileSetRet> basicprofileset(@ApiParam(value = "" ,required=true )  @Valid @RequestBody BasicProfileSetRequest body) {
        log.info("访问接口：" + request.getRequestURI());
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            Personal personal = (Personal) SpringUtil.getBean("personal");
            personal.getProfile().setName(body.getName());
            personal.getProfile().setEmail(body.getEmail());
            personal.getProfile().setBornTime(body.getBornTime());
            personal.getProfile().setFreelance(body.getFreelance());
            personal.getProfile().setPhone(body.getPhone());
            BasicProfileSetRet response = new BasicProfileSetRet();
            response.code(ApiReturnCode.SUCCESS.code)
                    .message("设置成功");
            return new ResponseEntity<BasicProfileSetRet>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<BasicProfileSetRet>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<ProjectListGetRet> projectlistget() {
        log.info("访问接口：" + request.getRequestURI());
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            Personal personal = (Personal) SpringUtil.getBean("personal");
            //System.out.println(personal);
            ProjectListGetRet response = new ProjectListGetRet();
            response.data(new ProjectListGetData().list(personal.getProjectList()))
                    .code(ApiReturnCode.SUCCESS.code)
                    .message("获取成功");
            return new ResponseEntity<ProjectListGetRet>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<ProjectListGetRet>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<ProjectListSetRet> projectlistset(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ProjectListSetRequest body) {
        log.info("访问接口：" + request.getRequestURI());
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            Personal personal = (Personal) SpringUtil.getBean("personal");
            List<Project> list = body.getList();
            List<com.gatesma.webex.entities.Project> newlist = new ArrayList<>();
            for(Project project : list) {
                newlist.add(EntityUtil.swaggerProToModelPro(project));
            }
            personal.setProjectList(newlist);
            ProjectListSetRet response = new ProjectListSetRet();
            response.code(ApiReturnCode.SUCCESS.code)
                    .message("设置成功");
            return new ResponseEntity<ProjectListSetRet>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<ProjectListSetRet>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<ScoreListGetRet> scorelistget() {
        log.info("访问接口：" + request.getRequestURI());
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            Personal personal = (Personal) SpringUtil.getBean("personal");
            ScoreListGetRet response = new ScoreListGetRet();
            response.data(new ScoreListGetData().list(personal.getScoreList()))
                    .code(ApiReturnCode.SUCCESS.code)
                    .message("获取成功");
            return new ResponseEntity<ScoreListGetRet>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<ScoreListGetRet>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<ScoreListSetRet> scorelistset(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ScoreListSetRequest body) {
        log.info("访问接口：" + request.getRequestURI());
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            Personal personal = (Personal) SpringUtil.getBean("personal");
            List<Score> list = body.getList();
            List<com.gatesma.webex.entities.Score> newlist = new ArrayList<>();
            for(Score score : list) {
                newlist.add(EntityUtil.swaggerScoreToModel(score));
            }
            personal.setScoreList(newlist);
            ScoreListSetRet response = new ScoreListSetRet();
            response.code(ApiReturnCode.SUCCESS.code)
                    .message("设置成功");
            return new ResponseEntity<ScoreListSetRet>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<ScoreListSetRet>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
