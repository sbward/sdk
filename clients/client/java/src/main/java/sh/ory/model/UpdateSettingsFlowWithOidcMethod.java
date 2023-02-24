/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.19
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
 * Update Settings Flow with OpenID Connect Method
 */
@ApiModel(description = "Update Settings Flow with OpenID Connect Method")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-24T12:42:31.987086234Z[Etc/UTC]")
public class UpdateSettingsFlowWithOidcMethod {
  public static final String SERIALIZED_NAME_FLOW = "flow";
  @SerializedName(SERIALIZED_NAME_FLOW)
  private String flow;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_METHOD = "method";
  @SerializedName(SERIALIZED_NAME_METHOD)
  private String method;

  public static final String SERIALIZED_NAME_TRAITS = "traits";
  @SerializedName(SERIALIZED_NAME_TRAITS)
  private Object traits;

  public static final String SERIALIZED_NAME_UNLINK = "unlink";
  @SerializedName(SERIALIZED_NAME_UNLINK)
  private String unlink;

  public UpdateSettingsFlowWithOidcMethod() {
  }

  public UpdateSettingsFlowWithOidcMethod flow(String flow) {
    
    this.flow = flow;
    return this;
  }

   /**
   * Flow ID is the flow&#39;s ID.  in: query
   * @return flow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flow ID is the flow's ID.  in: query")

  public String getFlow() {
    return flow;
  }


  public void setFlow(String flow) {
    this.flow = flow;
  }


  public UpdateSettingsFlowWithOidcMethod link(String link) {
    
    this.link = link;
    return this;
  }

   /**
   * Link this provider  Either this or &#x60;unlink&#x60; must be set.  type: string in: body
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Link this provider  Either this or `unlink` must be set.  type: string in: body")

  public String getLink() {
    return link;
  }


  public void setLink(String link) {
    this.link = link;
  }


  public UpdateSettingsFlowWithOidcMethod method(String method) {
    
    this.method = method;
    return this;
  }

   /**
   * Method  Should be set to profile when trying to update a profile.
   * @return method
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Method  Should be set to profile when trying to update a profile.")

  public String getMethod() {
    return method;
  }


  public void setMethod(String method) {
    this.method = method;
  }


  public UpdateSettingsFlowWithOidcMethod traits(Object traits) {
    
    this.traits = traits;
    return this;
  }

   /**
   * The identity&#39;s traits  in: body
   * @return traits
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The identity's traits  in: body")

  public Object getTraits() {
    return traits;
  }


  public void setTraits(Object traits) {
    this.traits = traits;
  }


  public UpdateSettingsFlowWithOidcMethod unlink(String unlink) {
    
    this.unlink = unlink;
    return this;
  }

   /**
   * Unlink this provider  Either this or &#x60;link&#x60; must be set.  type: string in: body
   * @return unlink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unlink this provider  Either this or `link` must be set.  type: string in: body")

  public String getUnlink() {
    return unlink;
  }


  public void setUnlink(String unlink) {
    this.unlink = unlink;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateSettingsFlowWithOidcMethod updateSettingsFlowWithOidcMethod = (UpdateSettingsFlowWithOidcMethod) o;
    return Objects.equals(this.flow, updateSettingsFlowWithOidcMethod.flow) &&
        Objects.equals(this.link, updateSettingsFlowWithOidcMethod.link) &&
        Objects.equals(this.method, updateSettingsFlowWithOidcMethod.method) &&
        Objects.equals(this.traits, updateSettingsFlowWithOidcMethod.traits) &&
        Objects.equals(this.unlink, updateSettingsFlowWithOidcMethod.unlink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flow, link, method, traits, unlink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSettingsFlowWithOidcMethod {\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
    sb.append("    unlink: ").append(toIndentedString(unlink)).append("\n");
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
    openapiFields.add("flow");
    openapiFields.add("link");
    openapiFields.add("method");
    openapiFields.add("traits");
    openapiFields.add("unlink");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("method");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateSettingsFlowWithOidcMethod
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateSettingsFlowWithOidcMethod.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateSettingsFlowWithOidcMethod is not found in the empty JSON string", UpdateSettingsFlowWithOidcMethod.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateSettingsFlowWithOidcMethod.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateSettingsFlowWithOidcMethod` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UpdateSettingsFlowWithOidcMethod.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("flow") != null && !jsonObj.get("flow").isJsonNull()) && !jsonObj.get("flow").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `flow` to be a primitive type in the JSON string but got `%s`", jsonObj.get("flow").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if (!jsonObj.get("method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("method").toString()));
      }
      if ((jsonObj.get("unlink") != null && !jsonObj.get("unlink").isJsonNull()) && !jsonObj.get("unlink").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unlink` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unlink").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateSettingsFlowWithOidcMethod.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateSettingsFlowWithOidcMethod' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateSettingsFlowWithOidcMethod> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateSettingsFlowWithOidcMethod.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateSettingsFlowWithOidcMethod>() {
           @Override
           public void write(JsonWriter out, UpdateSettingsFlowWithOidcMethod value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateSettingsFlowWithOidcMethod read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateSettingsFlowWithOidcMethod given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateSettingsFlowWithOidcMethod
  * @throws IOException if the JSON string is invalid with respect to UpdateSettingsFlowWithOidcMethod
  */
  public static UpdateSettingsFlowWithOidcMethod fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateSettingsFlowWithOidcMethod.class);
  }

 /**
  * Convert an instance of UpdateSettingsFlowWithOidcMethod to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

