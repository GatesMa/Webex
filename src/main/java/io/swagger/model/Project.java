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
 * Project
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-25T02:02:49.831Z")

public class Project   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("time")
  private String time = null;

  @JsonProperty("content")
  private String content = null;

  public Project name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 项目名称
   * @return name
  **/
  @ApiModelProperty(value = "项目名称")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Project time(String time) {
    this.time = time;
    return this;
  }

  /**
   * 项目时间
   * @return time
  **/
  @ApiModelProperty(value = "项目时间")


  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public Project content(String content) {
    this.content = content;
    return this;
  }

  /**
   * 项目内容
   * @return content
  **/
  @ApiModelProperty(value = "项目内容")


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.name, project.name) &&
        Objects.equals(this.time, project.time) &&
        Objects.equals(this.content, project.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, time, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

