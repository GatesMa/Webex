package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.gatesma.webex.entities.Contact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.gatesma.webex.entities.Contact;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContactListGetData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-25T02:02:49.831Z")

public class ContactListGetData   {
  @JsonProperty("list")
  @Valid
  private List<Contact> list = null;

  public ContactListGetData list(List<Contact> list) {
    this.list = list;
    return this;
  }

  public ContactListGetData addListItem(Contact listItem) {
    if (this.list == null) {
      this.list = new ArrayList<Contact>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Contact> getList() {
    return list;
  }

  public void setList(List<Contact> list) {
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
    ContactListGetData contactListGetData = (ContactListGetData) o;
    return Objects.equals(this.list, contactListGetData.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactListGetData {\n");
    
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

