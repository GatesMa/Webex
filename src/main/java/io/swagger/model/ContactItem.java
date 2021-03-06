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
 * ContactItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-25T02:02:49.831Z")

public class ContactItem   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("content")
  private String content = null;

  public ContactItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 社交媒体名称
   * @return name
  **/
  @ApiModelProperty(value = "社交媒体名称")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContactItem content(String content) {
    this.content = content;
    return this;
  }

  /**
   * 链接
   * @return content
  **/
  @ApiModelProperty(value = "链接")


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
    ContactItem contactItem = (ContactItem) o;
    return Objects.equals(this.name, contactItem.name) &&
        Objects.equals(this.content, contactItem.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactItem {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

