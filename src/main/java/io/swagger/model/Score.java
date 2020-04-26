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
 * Score
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-25T02:02:49.831Z")

public class Score   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("score")
  private Integer score = null;

  public Score name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 科目名称
   * @return name
  **/
  @ApiModelProperty(value = "科目名称")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Score score(Integer score) {
    this.score = score;
    return this;
  }

  /**
   * 成绩
   * minimum: 0
   * maximum: 100
   * @return score
  **/
  @ApiModelProperty(example = "90", value = "成绩")

@Min(0) @Max(100) 
  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Score score = (Score) o;
    return Objects.equals(this.name, score.name) &&
        Objects.equals(this.score, score.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Score {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

