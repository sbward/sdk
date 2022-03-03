/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.113
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * CnameSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-03T09:12:46.105275881Z[Etc/UTC]")
public class CnameSettings {
  public static final String SERIALIZED_NAME_COOKIE_DOMAIN = "cookie_domain";
  @SerializedName(SERIALIZED_NAME_COOKIE_DOMAIN)
  private String cookieDomain;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_HOSTNAME = "hostname";
  @SerializedName(SERIALIZED_NAME_HOSTNAME)
  private String hostname;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_VERIFICATION_ERRORS = "verification_errors";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ERRORS)
  private List<String> verificationErrors = null;

  public static final String SERIALIZED_NAME_VERIFICATION_STATUS = "verification_status";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_STATUS)
  private String verificationStatus;

  public CnameSettings() { 
  }

  public CnameSettings cookieDomain(String cookieDomain) {
    
    this.cookieDomain = cookieDomain;
    return this;
  }

   /**
   * Get cookieDomain
   * @return cookieDomain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCookieDomain() {
    return cookieDomain;
  }


  public void setCookieDomain(String cookieDomain) {
    this.cookieDomain = cookieDomain;
  }


  public CnameSettings createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public CnameSettings hostname(String hostname) {
    
    this.hostname = hostname;
    return this;
  }

   /**
   * Get hostname
   * @return hostname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHostname() {
    return hostname;
  }


  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  public CnameSettings id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public CnameSettings updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public CnameSettings verificationErrors(List<String> verificationErrors) {
    
    this.verificationErrors = verificationErrors;
    return this;
  }

  public CnameSettings addVerificationErrorsItem(String verificationErrorsItem) {
    if (this.verificationErrors == null) {
      this.verificationErrors = new ArrayList<>();
    }
    this.verificationErrors.add(verificationErrorsItem);
    return this;
  }

   /**
   * Get verificationErrors
   * @return verificationErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getVerificationErrors() {
    return verificationErrors;
  }


  public void setVerificationErrors(List<String> verificationErrors) {
    this.verificationErrors = verificationErrors;
  }


  public CnameSettings verificationStatus(String verificationStatus) {
    
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * CustomHostnameStatus is the enumeration of valid state values in the CustomHostnameSSL
   * @return verificationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CustomHostnameStatus is the enumeration of valid state values in the CustomHostnameSSL")

  public String getVerificationStatus() {
    return verificationStatus;
  }


  public void setVerificationStatus(String verificationStatus) {
    this.verificationStatus = verificationStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CnameSettings cnameSettings = (CnameSettings) o;
    return Objects.equals(this.cookieDomain, cnameSettings.cookieDomain) &&
        Objects.equals(this.createdAt, cnameSettings.createdAt) &&
        Objects.equals(this.hostname, cnameSettings.hostname) &&
        Objects.equals(this.id, cnameSettings.id) &&
        Objects.equals(this.updatedAt, cnameSettings.updatedAt) &&
        Objects.equals(this.verificationErrors, cnameSettings.verificationErrors) &&
        Objects.equals(this.verificationStatus, cnameSettings.verificationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cookieDomain, createdAt, hostname, id, updatedAt, verificationErrors, verificationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CnameSettings {\n");
    sb.append("    cookieDomain: ").append(toIndentedString(cookieDomain)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    verificationErrors: ").append(toIndentedString(verificationErrors)).append("\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

