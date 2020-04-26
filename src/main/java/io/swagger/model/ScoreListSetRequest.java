package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Score;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ScoreListSetRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-25T02:02:49.831Z")

public class ScoreListSetRequest   {
  @JsonProperty("list")
  @Valid
  private List<Score> list = new ArrayList<Score>();

  public ScoreListSetRequest list(List<Score> list) {
    this.list = list;
    return this;
  }

  public ScoreListSetRequest addListItem(Score listItem) {
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<Score> getList() {
    return list;
  }

  public void setList(List<Score> list) {
    this.list = list;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoreListSetRequest scoreListSetRequest = (ScoreListSetRequest) o;
    return Objects.equals(this.list, scoreListSetRequest.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoreListSetRequest {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

