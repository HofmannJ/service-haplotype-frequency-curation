package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HFCurationResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-13T16:03:03.769+01:00")

public class HFCurationResponse  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("SubmissionID")
  private Long submissionID = null;

  @JsonProperty("PopulationID")
  private Long populationID = null;

  @JsonProperty("CohortID")
  private Long cohortID = null;

  @JsonProperty("MethodSetID")
  private Long methodSetID = null;

  @JsonProperty("LabelID")
  private Long labelID = null;

  @JsonProperty("HaplotypeListID")
  private Long haplotypeListID = null;

  @JsonProperty("ScopeID")
  private Long scopeID = null;

  @JsonProperty("AccessID")
  private Long accessID = null;

  public HFCurationResponse submissionID(Long submissionID) {
    this.submissionID = submissionID;
    return this;
  }

   /**
   * Reference to a submission
   * @return submissionID
  **/
  @ApiModelProperty(required = true, value = "Reference to a submission")
  @NotNull


  public Long getSubmissionID() {
    return submissionID;
  }

  public void setSubmissionID(Long submissionID) {
    this.submissionID = submissionID;
  }

  public HFCurationResponse populationID(Long populationID) {
    this.populationID = populationID;
    return this;
  }

   /**
   * Reference to a population
   * @return populationID
  **/
  @ApiModelProperty(value = "Reference to a population")


  public Long getPopulationID() {
    return populationID;
  }

  public void setPopulationID(Long populationID) {
    this.populationID = populationID;
  }

  public HFCurationResponse cohortID(Long cohortID) {
    this.cohortID = cohortID;
    return this;
  }

   /**
   * References a cohort
   * @return cohortID
  **/
  @ApiModelProperty(value = "References a cohort")


  public Long getCohortID() {
    return cohortID;
  }

  public void setCohortID(Long cohortID) {
    this.cohortID = cohortID;
  }

  public HFCurationResponse methodSetID(Long methodSetID) {
    this.methodSetID = methodSetID;
    return this;
  }

   /**
   * References a method set
   * @return methodSetID
  **/
  @ApiModelProperty(value = "References a method set")


  public Long getMethodSetID() {
    return methodSetID;
  }

  public void setMethodSetID(Long methodSetID) {
    this.methodSetID = methodSetID;
  }

  public HFCurationResponse labelID(Long labelID) {
    this.labelID = labelID;
    return this;
  }

   /**
   * References a label
   * @return labelID
  **/
  @ApiModelProperty(value = "References a label")


  public Long getLabelID() {
    return labelID;
  }

  public void setLabelID(Long labelID) {
    this.labelID = labelID;
  }

  public HFCurationResponse haplotypeListID(Long haplotypeListID) {
    this.haplotypeListID = haplotypeListID;
    return this;
  }

   /**
   * References a haplotype list
   * @return haplotypeListID
  **/
  @ApiModelProperty(value = "References a haplotype list")


  public Long getHaplotypeListID() {
    return haplotypeListID;
  }

  public void setHaplotypeListID(Long haplotypeListID) {
    this.haplotypeListID = haplotypeListID;
  }

  public HFCurationResponse scopeID(Long scopeID) {
    this.scopeID = scopeID;
    return this;
  }

   /**
   * References a scope
   * @return scopeID
  **/
  @ApiModelProperty(value = "References a scope")


  public Long getScopeID() {
    return scopeID;
  }

  public void setScopeID(Long scopeID) {
    this.scopeID = scopeID;
  }

  public HFCurationResponse accessID(Long accessID) {
    this.accessID = accessID;
    return this;
  }

   /**
   * References a access controls
   * @return accessID
  **/
  @ApiModelProperty(value = "References a access controls")


  public Long getAccessID() {
    return accessID;
  }

  public void setAccessID(Long accessID) {
    this.accessID = accessID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HFCurationResponse hfCurationResponse = (HFCurationResponse) o;
    return Objects.equals(this.submissionID, hfCurationResponse.submissionID) &&
        Objects.equals(this.populationID, hfCurationResponse.populationID) &&
        Objects.equals(this.cohortID, hfCurationResponse.cohortID) &&
        Objects.equals(this.methodSetID, hfCurationResponse.methodSetID) &&
        Objects.equals(this.labelID, hfCurationResponse.labelID) &&
        Objects.equals(this.haplotypeListID, hfCurationResponse.haplotypeListID) &&
        Objects.equals(this.scopeID, hfCurationResponse.scopeID) &&
        Objects.equals(this.accessID, hfCurationResponse.accessID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submissionID, populationID, cohortID, methodSetID, labelID, haplotypeListID, scopeID, accessID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HFCurationResponse {\n");
    
    sb.append("    submissionID: ").append(toIndentedString(submissionID)).append("\n");
    sb.append("    populationID: ").append(toIndentedString(populationID)).append("\n");
    sb.append("    cohortID: ").append(toIndentedString(cohortID)).append("\n");
    sb.append("    methodSetID: ").append(toIndentedString(methodSetID)).append("\n");
    sb.append("    labelID: ").append(toIndentedString(labelID)).append("\n");
    sb.append("    haplotypeListID: ").append(toIndentedString(haplotypeListID)).append("\n");
    sb.append("    scopeID: ").append(toIndentedString(scopeID)).append("\n");
    sb.append("    accessID: ").append(toIndentedString(accessID)).append("\n");
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

