/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.2.10
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
 * Used when an administrator creates a recovery code for an identity.
 */
@ApiModel(description = "Used when an administrator creates a recovery code for an identity.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-05T13:50:54.246292158Z[Etc/UTC]")
public class RecoveryCodeForIdentity {
  public static final String SERIALIZED_NAME_EXPIRES_AT = "expires_at";
  @SerializedName(SERIALIZED_NAME_EXPIRES_AT)
  private OffsetDateTime expiresAt;

  public static final String SERIALIZED_NAME_RECOVERY_CODE = "recovery_code";
  @SerializedName(SERIALIZED_NAME_RECOVERY_CODE)
  private String recoveryCode;

  public static final String SERIALIZED_NAME_RECOVERY_LINK = "recovery_link";
  @SerializedName(SERIALIZED_NAME_RECOVERY_LINK)
  private String recoveryLink;

  public RecoveryCodeForIdentity() {
  }

  public RecoveryCodeForIdentity expiresAt(OffsetDateTime expiresAt) {
    
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Expires At is the timestamp of when the recovery flow expires  The timestamp when the recovery link expires.
   * @return expiresAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expires At is the timestamp of when the recovery flow expires  The timestamp when the recovery link expires.")

  public OffsetDateTime getExpiresAt() {
    return expiresAt;
  }


  public void setExpiresAt(OffsetDateTime expiresAt) {
    this.expiresAt = expiresAt;
  }


  public RecoveryCodeForIdentity recoveryCode(String recoveryCode) {
    
    this.recoveryCode = recoveryCode;
    return this;
  }

   /**
   * RecoveryCode is the code that can be used to recover the account
   * @return recoveryCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "RecoveryCode is the code that can be used to recover the account")

  public String getRecoveryCode() {
    return recoveryCode;
  }


  public void setRecoveryCode(String recoveryCode) {
    this.recoveryCode = recoveryCode;
  }


  public RecoveryCodeForIdentity recoveryLink(String recoveryLink) {
    
    this.recoveryLink = recoveryLink;
    return this;
  }

   /**
   * RecoveryLink with flow  This link opens the recovery UI with an empty &#x60;code&#x60; field.
   * @return recoveryLink
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "RecoveryLink with flow  This link opens the recovery UI with an empty `code` field.")

  public String getRecoveryLink() {
    return recoveryLink;
  }


  public void setRecoveryLink(String recoveryLink) {
    this.recoveryLink = recoveryLink;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the RecoveryCodeForIdentity instance itself
   */
  public RecoveryCodeForIdentity putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecoveryCodeForIdentity recoveryCodeForIdentity = (RecoveryCodeForIdentity) o;
    return Objects.equals(this.expiresAt, recoveryCodeForIdentity.expiresAt) &&
        Objects.equals(this.recoveryCode, recoveryCodeForIdentity.recoveryCode) &&
        Objects.equals(this.recoveryLink, recoveryCodeForIdentity.recoveryLink)&&
        Objects.equals(this.additionalProperties, recoveryCodeForIdentity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiresAt, recoveryCode, recoveryLink, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecoveryCodeForIdentity {\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
    sb.append("    recoveryCode: ").append(toIndentedString(recoveryCode)).append("\n");
    sb.append("    recoveryLink: ").append(toIndentedString(recoveryLink)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("expires_at");
    openapiFields.add("recovery_code");
    openapiFields.add("recovery_link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("recovery_code");
    openapiRequiredFields.add("recovery_link");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecoveryCodeForIdentity
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RecoveryCodeForIdentity.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecoveryCodeForIdentity is not found in the empty JSON string", RecoveryCodeForIdentity.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : RecoveryCodeForIdentity.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("recovery_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recovery_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recovery_code").toString()));
      }
      if (!jsonObj.get("recovery_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `recovery_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("recovery_link").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecoveryCodeForIdentity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecoveryCodeForIdentity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecoveryCodeForIdentity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecoveryCodeForIdentity.class));

       return (TypeAdapter<T>) new TypeAdapter<RecoveryCodeForIdentity>() {
           @Override
           public void write(JsonWriter out, RecoveryCodeForIdentity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public RecoveryCodeForIdentity read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RecoveryCodeForIdentity instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecoveryCodeForIdentity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecoveryCodeForIdentity
  * @throws IOException if the JSON string is invalid with respect to RecoveryCodeForIdentity
  */
  public static RecoveryCodeForIdentity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecoveryCodeForIdentity.class);
  }

 /**
  * Convert an instance of RecoveryCodeForIdentity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

