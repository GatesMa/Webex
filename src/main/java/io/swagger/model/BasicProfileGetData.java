package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BasicProfileGetData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-25T02:02:49.831Z")

public class BasicProfileGetData   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("born_time")
  private String bornTime = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("phone")
  private String phone = null;

  @JsonProperty("freelance")
  private String freelance = null;

  public BasicProfileGetData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 个人名字
   * @return name
  **/
  @ApiModelProperty(value = "个人名字")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BasicProfileGetData bornTime(String bornTime) {
    this.bornTime = bornTime;
    return this;
  }

  /**
   * 出生时间，格式：yyyy-MM-dd HH:mm:ss
   * @return bornTime
  **/
  @ApiModelProperty(value = "出生时间，格式：yyyy-MM-dd HH:mm:ss")


  public String getBornTime() {
    return bornTime;
  }

  public void setBornTime(String bornTime) {
    this.bornTime = bornTime;
  }

  public BasicProfileGetData email(String email) {
    this.email = email;
    return this;
  }

  /**
   * 邮箱
   * @return email
  **/
  @ApiModelProperty(value = "邮箱")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BasicProfileGetData phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * 电话
   * @return phone
  **/
  @ApiModelProperty(value = "电话")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public BasicProfileGetData freelance(String freelance) {
    this.freelance = freelance;
    return this;
  }

  /**
   * 现在是否自由
   * @return freelance
  **/
  @ApiModelProperty(value = "现在是否自由")


  public String getFreelance() {
    return freelance;
  }

  public void setFreelance(String freelance) {
    this.freelance = freelance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BasicProfileGetData basicProfileGetData = (BasicProfileGetData) o;
    return Objects.equals(this.name, basicProfileGetData.name) &&
        Objects.equals(this.bornTime, basicProfileGetData.bornTime) &&
        Objects.equals(this.email, basicProfileGetData.email) &&
        Objects.equals(this.phone, basicProfileGetData.phone) &&
        Objects.equals(this.freelance, basicProfileGetData.freelance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, bornTime, email, phone, freelance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BasicProfileGetData {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bornTime: ").append(toIndentedString(bornTime)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    freelance: ").append(toIndentedString(freelance)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

