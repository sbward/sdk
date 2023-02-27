/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.21
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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import sh.ory.JSON;

/**
 * VerifiableAddress is an identity&#39;s verifiable address
 */
@ApiModel(description = "VerifiableAddress is an identity's verifiable address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-27T16:38:42.861955397Z[Etc/UTC]")
public class VerifiableIdentityAddress {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_VERIFIED = "verified";
  @SerializedName(SERIALIZED_NAME_VERIFIED)
  private Boolean verified;

  public static final String SERIALIZED_NAME_VERIFIED_AT = "verified_at";
  @SerializedName(SERIALIZED_NAME_VERIFIED_AT)
  private OffsetDateTime verifiedAt;

  public static final String SERIALIZED_NAME_VIA = "via";
  @SerializedName(SERIALIZED_NAME_VIA)
  private String via;

  public VerifiableIdentityAddress() {
  }

  public VerifiableIdentityAddress createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * When this entry was created
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014-01-01T23:28:56.782Z", value = "When this entry was created")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public VerifiableIdentityAddress id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public VerifiableIdentityAddress status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * VerifiableAddressStatus must not exceed 16 characters as that is the limitation in the SQL Schema
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "VerifiableAddressStatus must not exceed 16 characters as that is the limitation in the SQL Schema")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public VerifiableIdentityAddress updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * When this entry was last updated
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014-01-01T23:28:56.782Z", value = "When this entry was last updated")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public VerifiableIdentityAddress value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The address value  example foo@user.com
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The address value  example foo@user.com")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public VerifiableIdentityAddress verified(Boolean verified) {
    
    this.verified = verified;
    return this;
  }

   /**
   * Indicates if the address has already been verified
   * @return verified
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "Indicates if the address has already been verified")

  public Boolean getVerified() {
    return verified;
  }


  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  public VerifiableIdentityAddress verifiedAt(OffsetDateTime verifiedAt) {
    
    this.verifiedAt = verifiedAt;
    return this;
  }

   /**
   * Get verifiedAt
   * @return verifiedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getVerifiedAt() {
    return verifiedAt;
  }


  public void setVerifiedAt(OffsetDateTime verifiedAt) {
    this.verifiedAt = verifiedAt;
  }


  public VerifiableIdentityAddress via(String via) {
    
    this.via = via;
    return this;
  }

   /**
   * VerifiableAddressType must not exceed 16 characters as that is the limitation in the SQL Schema
   * @return via
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "VerifiableAddressType must not exceed 16 characters as that is the limitation in the SQL Schema")

  public String getVia() {
    return via;
  }


  public void setVia(String via) {
    this.via = via;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerifiableIdentityAddress verifiableIdentityAddress = (VerifiableIdentityAddress) o;
    return Objects.equals(this.createdAt, verifiableIdentityAddress.createdAt) &&
        Objects.equals(this.id, verifiableIdentityAddress.id) &&
        Objects.equals(this.status, verifiableIdentityAddress.status) &&
        Objects.equals(this.updatedAt, verifiableIdentityAddress.updatedAt) &&
        Objects.equals(this.value, verifiableIdentityAddress.value) &&
        Objects.equals(this.verified, verifiableIdentityAddress.verified) &&
        Objects.equals(this.verifiedAt, verifiableIdentityAddress.verifiedAt) &&
        Objects.equals(this.via, verifiableIdentityAddress.via);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, id, status, updatedAt, value, verified, verifiedAt, via);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerifiableIdentityAddress {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    verifiedAt: ").append(toIndentedString(verifiedAt)).append("\n");
    sb.append("    via: ").append(toIndentedString(via)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("created_at");
    openapiFields.add("id");
    openapiFields.add("status");
    openapiFields.add("updated_at");
    openapiFields.add("value");
    openapiFields.add("verified");
    openapiFields.add("verified_at");
    openapiFields.add("via");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("value");
    openapiRequiredFields.add("verified");
    openapiRequiredFields.add("via");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VerifiableIdentityAddress
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VerifiableIdentityAddress.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VerifiableIdentityAddress is not found in the empty JSON string", VerifiableIdentityAddress.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VerifiableIdentityAddress.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VerifiableIdentityAddress` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : VerifiableIdentityAddress.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (!jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      if (!jsonObj.get("via").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `via` to be a primitive type in the JSON string but got `%s`", jsonObj.get("via").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VerifiableIdentityAddress.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VerifiableIdentityAddress' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VerifiableIdentityAddress> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VerifiableIdentityAddress.class));

       return (TypeAdapter<T>) new TypeAdapter<VerifiableIdentityAddress>() {
           @Override
           public void write(JsonWriter out, VerifiableIdentityAddress value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VerifiableIdentityAddress read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VerifiableIdentityAddress given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VerifiableIdentityAddress
  * @throws IOException if the JSON string is invalid with respect to VerifiableIdentityAddress
  */
  public static VerifiableIdentityAddress fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VerifiableIdentityAddress.class);
  }

 /**
  * Convert an instance of VerifiableIdentityAddress to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

