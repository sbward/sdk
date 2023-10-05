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
 * NormalizedProjectRevisionTokenizerTemplate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-05T13:50:54.246292158Z[Etc/UTC]")
public class NormalizedProjectRevisionTokenizerTemplate {
  public static final String SERIALIZED_NAME_CLAIMS_MAPPER_URL = "claims_mapper_url";
  @SerializedName(SERIALIZED_NAME_CLAIMS_MAPPER_URL)
  private String claimsMapperUrl;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_JWKS_URL = "jwks_url";
  @SerializedName(SERIALIZED_NAME_JWKS_URL)
  private String jwksUrl;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_PROJECT_REVISION_ID = "project_revision_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_REVISION_ID)
  private String projectRevisionId;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private String ttl = "1m";

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public NormalizedProjectRevisionTokenizerTemplate() {
  }

  
  public NormalizedProjectRevisionTokenizerTemplate(
     OffsetDateTime createdAt, 
     String id, 
     OffsetDateTime updatedAt
  ) {
    this();
    this.createdAt = createdAt;
    this.id = id;
    this.updatedAt = updatedAt;
  }

  public NormalizedProjectRevisionTokenizerTemplate claimsMapperUrl(String claimsMapperUrl) {
    
    this.claimsMapperUrl = claimsMapperUrl;
    return this;
  }

   /**
   * Claims mapper URL
   * @return claimsMapperUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Claims mapper URL")

  public String getClaimsMapperUrl() {
    return claimsMapperUrl;
  }


  public void setClaimsMapperUrl(String claimsMapperUrl) {
    this.claimsMapperUrl = claimsMapperUrl;
  }


   /**
   * The Project&#39;s Revision Creation Date
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Project's Revision Creation Date")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }




   /**
   * The revision ID.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The revision ID.")

  public String getId() {
    return id;
  }




  public NormalizedProjectRevisionTokenizerTemplate jwksUrl(String jwksUrl) {
    
    this.jwksUrl = jwksUrl;
    return this;
  }

   /**
   * JSON Web Key URL
   * @return jwksUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "JSON Web Key URL")

  public String getJwksUrl() {
    return jwksUrl;
  }


  public void setJwksUrl(String jwksUrl) {
    this.jwksUrl = jwksUrl;
  }


  public NormalizedProjectRevisionTokenizerTemplate key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The unique key of the template
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique key of the template")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public NormalizedProjectRevisionTokenizerTemplate projectRevisionId(String projectRevisionId) {
    
    this.projectRevisionId = projectRevisionId;
    return this;
  }

   /**
   * The Revision&#39;s ID this schema belongs to
   * @return projectRevisionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Revision's ID this schema belongs to")

  public String getProjectRevisionId() {
    return projectRevisionId;
  }


  public void setProjectRevisionId(String projectRevisionId) {
    this.projectRevisionId = projectRevisionId;
  }


  public NormalizedProjectRevisionTokenizerTemplate ttl(String ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * Token time to live
   * @return ttl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1h", value = "Token time to live")

  public String getTtl() {
    return ttl;
  }


  public void setTtl(String ttl) {
    this.ttl = ttl;
  }


   /**
   * Last Time Project&#39;s Revision was Updated
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last Time Project's Revision was Updated")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
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
   * @return the NormalizedProjectRevisionTokenizerTemplate instance itself
   */
  public NormalizedProjectRevisionTokenizerTemplate putAdditionalProperty(String key, Object value) {
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
    NormalizedProjectRevisionTokenizerTemplate normalizedProjectRevisionTokenizerTemplate = (NormalizedProjectRevisionTokenizerTemplate) o;
    return Objects.equals(this.claimsMapperUrl, normalizedProjectRevisionTokenizerTemplate.claimsMapperUrl) &&
        Objects.equals(this.createdAt, normalizedProjectRevisionTokenizerTemplate.createdAt) &&
        Objects.equals(this.id, normalizedProjectRevisionTokenizerTemplate.id) &&
        Objects.equals(this.jwksUrl, normalizedProjectRevisionTokenizerTemplate.jwksUrl) &&
        Objects.equals(this.key, normalizedProjectRevisionTokenizerTemplate.key) &&
        Objects.equals(this.projectRevisionId, normalizedProjectRevisionTokenizerTemplate.projectRevisionId) &&
        Objects.equals(this.ttl, normalizedProjectRevisionTokenizerTemplate.ttl) &&
        Objects.equals(this.updatedAt, normalizedProjectRevisionTokenizerTemplate.updatedAt)&&
        Objects.equals(this.additionalProperties, normalizedProjectRevisionTokenizerTemplate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(claimsMapperUrl, createdAt, id, jwksUrl, key, projectRevisionId, ttl, updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NormalizedProjectRevisionTokenizerTemplate {\n");
    sb.append("    claimsMapperUrl: ").append(toIndentedString(claimsMapperUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    jwksUrl: ").append(toIndentedString(jwksUrl)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    projectRevisionId: ").append(toIndentedString(projectRevisionId)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("claims_mapper_url");
    openapiFields.add("created_at");
    openapiFields.add("id");
    openapiFields.add("jwks_url");
    openapiFields.add("key");
    openapiFields.add("project_revision_id");
    openapiFields.add("ttl");
    openapiFields.add("updated_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NormalizedProjectRevisionTokenizerTemplate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NormalizedProjectRevisionTokenizerTemplate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NormalizedProjectRevisionTokenizerTemplate is not found in the empty JSON string", NormalizedProjectRevisionTokenizerTemplate.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("claims_mapper_url") != null && !jsonObj.get("claims_mapper_url").isJsonNull()) && !jsonObj.get("claims_mapper_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `claims_mapper_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("claims_mapper_url").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("jwks_url") != null && !jsonObj.get("jwks_url").isJsonNull()) && !jsonObj.get("jwks_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jwks_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jwks_url").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("project_revision_id") != null && !jsonObj.get("project_revision_id").isJsonNull()) && !jsonObj.get("project_revision_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_revision_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_revision_id").toString()));
      }
      if ((jsonObj.get("ttl") != null && !jsonObj.get("ttl").isJsonNull()) && !jsonObj.get("ttl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ttl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ttl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NormalizedProjectRevisionTokenizerTemplate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NormalizedProjectRevisionTokenizerTemplate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NormalizedProjectRevisionTokenizerTemplate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NormalizedProjectRevisionTokenizerTemplate.class));

       return (TypeAdapter<T>) new TypeAdapter<NormalizedProjectRevisionTokenizerTemplate>() {
           @Override
           public void write(JsonWriter out, NormalizedProjectRevisionTokenizerTemplate value) throws IOException {
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
           public NormalizedProjectRevisionTokenizerTemplate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NormalizedProjectRevisionTokenizerTemplate instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of NormalizedProjectRevisionTokenizerTemplate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NormalizedProjectRevisionTokenizerTemplate
  * @throws IOException if the JSON string is invalid with respect to NormalizedProjectRevisionTokenizerTemplate
  */
  public static NormalizedProjectRevisionTokenizerTemplate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NormalizedProjectRevisionTokenizerTemplate.class);
  }

 /**
  * Convert an instance of NormalizedProjectRevisionTokenizerTemplate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

