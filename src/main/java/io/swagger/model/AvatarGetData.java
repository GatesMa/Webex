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
 * AvatarGetData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-25T02:02:49.831Z")

public class AvatarGetData   {
  @JsonProperty("avatarid")
  private String avatarid = null;

  @JsonProperty("avatarsuffix")
  private String avatarsuffix = null;

  public AvatarGetData avatarid(String avatarid) {
    this.avatarid = avatarid;
    return this;
  }

  /**
   * 头像对应图片的名称
   * @return avatarid
  **/
  @ApiModelProperty(value = "头像对应图片的名称")


  public String getAvatarid() {
    return avatarid;
  }

  public void setAvatarid(String avatarid) {
    this.avatarid = avatarid;
  }

  public AvatarGetData avatarsuffix(String avatarsuffix) {
    this.avatarsuffix = avatarsuffix;
    return this;
  }

  /**
   * 后缀名
   * @return avatarsuffix
  **/
  @ApiModelProperty(value = "后缀名")


  public String getAvatarsuffix() {
    return avatarsuffix;
  }

  public void setAvatarsuffix(String avatarsuffix) {
    this.avatarsuffix = avatarsuffix;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvatarGetData avatarGetData = (AvatarGetData) o;
    return Objects.equals(this.avatarid, avatarGetData.avatarid) &&
        Objects.equals(this.avatarsuffix, avatarGetData.avatarsuffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarid, avatarsuffix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvatarGetData {\n");
    
    sb.append("    avatarid: ").append(toIndentedString(avatarid)).append("\n");
    sb.append("    avatarsuffix: ").append(toIndentedString(avatarsuffix)).append("\n");
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

