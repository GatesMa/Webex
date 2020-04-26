/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.13).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.BasicProfileGetRet;
import io.swagger.model.BasicProfileSetRequest;
import io.swagger.model.BasicProfileSetRet;
import io.swagger.model.ProjectListGetRet;
import io.swagger.model.ProjectListSetRequest;
import io.swagger.model.ProjectListSetRet;
import io.swagger.model.ScoreListGetRet;
import io.swagger.model.ScoreListSetRequest;
import io.swagger.model.ScoreListSetRet;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-25T02:02:49.831Z")

@Api(value = "personal", description = "the personal API")
@RequestMapping(value = "")
public interface PersonalApi {

    @ApiOperation(value = "获取最基本的个人信息", nickname = "basicprofileget", notes = "名字、生日、邮箱、电话、FREELANCE", response = BasicProfileGetRet.class, tags={ "personal", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = BasicProfileGetRet.class) })
    @RequestMapping(value = "/personal/get_basicProfile",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<BasicProfileGetRet> basicprofileget() {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "设置最基本的个人信息", nickname = "basicprofileset", notes = "名字、生日、邮箱、电话、FREELANCE", response = BasicProfileSetRet.class, tags={ "personal", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = BasicProfileSetRet.class) })
    @RequestMapping(value = "/personal/set_basicProfile",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<BasicProfileSetRet> basicprofileset(@ApiParam(value = "" ,required=true )  @Valid @RequestBody BasicProfileSetRequest body) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "个人经历项目列表", nickname = "projectlistget", notes = "个人经历项目列表", response = ProjectListGetRet.class, tags={ "personal", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ProjectListGetRet.class) })
    @RequestMapping(value = "/personal/get_projectlist",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<ProjectListGetRet> projectlistget();


    @ApiOperation(value = "设置个人经历项目", nickname = "projectlistset", notes = "设置个人经历项目接口", response = ProjectListSetRet.class, tags={ "personal", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ProjectListSetRet.class) })
    @RequestMapping(value = "/personal/set_projectlist",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<ProjectListSetRet> projectlistset(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ProjectListSetRequest body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "成绩列表", nickname = "scorelistget", notes = "成绩列表", response = ScoreListGetRet.class, tags={ "personal", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ScoreListGetRet.class) })
    @RequestMapping(value = "/personal/get_scorelist",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<ScoreListGetRet> scorelistget() {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "设置个人成绩", nickname = "scorelistset", notes = "设置个人成绩接口", response = ScoreListSetRet.class, tags={ "personal", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ScoreListSetRet.class) })
    @RequestMapping(value = "/personal/set_scorelist",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<ScoreListSetRet> scorelistset(@ApiParam(value = "" ,required=true )  @Valid @RequestBody ScoreListSetRequest body) {

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
