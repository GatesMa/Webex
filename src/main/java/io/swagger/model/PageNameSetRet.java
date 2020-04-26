package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PageNameSetData;
import io.swagger.model.ReturnCode;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PageNameSetRet
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-25T02:02:49.831Z")

public class PageNameSetRet extends ReturnCode  {
  @JsonProperty("data")
  private PageNameSetData data = null;

  public PageNameSetRet data(PageNameSetData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PageNameSetData getData() {
    return data;
  }

  public void setData(PageNameSetData data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageNameSetRet pageNameSetRet = (PageNameSetRet) o;
    return Objects.equals(this.data, pageNameSetRet.data) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageNameSetRet {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

