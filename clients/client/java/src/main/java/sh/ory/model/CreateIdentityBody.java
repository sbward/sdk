/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.15.12
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import sh.ory.model.IdentityWithCredentials;
import sh.ory.model.RecoveryIdentityAddress;
import sh.ory.model.VerifiableIdentityAddress;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import sh.ory.JSON;

/**
 * Create Identity Body
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-19T10:51:32.987394612Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class CreateIdentityBody {
  public static final String SERIALIZED_NAME_CREDENTIALS = "credentials";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS)
  private IdentityWithCredentials credentials;

  public static final String SERIALIZED_NAME_METADATA_ADMIN = "metadata_admin";
  @SerializedName(SERIALIZED_NAME_METADATA_ADMIN)
  private Object metadataAdmin = null;

  public static final String SERIALIZED_NAME_METADATA_PUBLIC = "metadata_public";
  @SerializedName(SERIALIZED_NAME_METADATA_PUBLIC)
  private Object metadataPublic = null;

  public static final String SERIALIZED_NAME_RECOVERY_ADDRESSES = "recovery_addresses";
  @SerializedName(SERIALIZED_NAME_RECOVERY_ADDRESSES)
  private List<RecoveryIdentityAddress> recoveryAddresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_SCHEMA_ID = "schema_id";
  @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
  private String schemaId;

  /**
   * State is the identity&#39;s state. active StateActive inactive StateInactive
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_TRAITS = "traits";
  @SerializedName(SERIALIZED_NAME_TRAITS)
  private Object traits;

  public static final String SERIALIZED_NAME_VERIFIABLE_ADDRESSES = "verifiable_addresses";
  @SerializedName(SERIALIZED_NAME_VERIFIABLE_ADDRESSES)
  private List<VerifiableIdentityAddress> verifiableAddresses = new ArrayList<>();

  public CreateIdentityBody() {
  }

  public CreateIdentityBody credentials(IdentityWithCredentials credentials) {
    this.credentials = credentials;
    return this;
  }

  /**
   * Get credentials
   * @return credentials
   */
  @javax.annotation.Nullable
  public IdentityWithCredentials getCredentials() {
    return credentials;
  }

  public void setCredentials(IdentityWithCredentials credentials) {
    this.credentials = credentials;
  }


  public CreateIdentityBody metadataAdmin(Object metadataAdmin) {
    this.metadataAdmin = metadataAdmin;
    return this;
  }

  /**
   * Store metadata about the user which is only accessible through admin APIs such as &#x60;GET /admin/identities/&lt;id&gt;&#x60;.
   * @return metadataAdmin
   */
  @javax.annotation.Nullable
  public Object getMetadataAdmin() {
    return metadataAdmin;
  }

  public void setMetadataAdmin(Object metadataAdmin) {
    this.metadataAdmin = metadataAdmin;
  }


  public CreateIdentityBody metadataPublic(Object metadataPublic) {
    this.metadataPublic = metadataPublic;
    return this;
  }

  /**
   * Store metadata about the identity which the identity itself can see when calling for example the session endpoint. Do not store sensitive information (e.g. credit score) about the identity in this field.
   * @return metadataPublic
   */
  @javax.annotation.Nullable
  public Object getMetadataPublic() {
    return metadataPublic;
  }

  public void setMetadataPublic(Object metadataPublic) {
    this.metadataPublic = metadataPublic;
  }


  public CreateIdentityBody recoveryAddresses(List<RecoveryIdentityAddress> recoveryAddresses) {
    this.recoveryAddresses = recoveryAddresses;
    return this;
  }

  public CreateIdentityBody addRecoveryAddressesItem(RecoveryIdentityAddress recoveryAddressesItem) {
    if (this.recoveryAddresses == null) {
      this.recoveryAddresses = new ArrayList<>();
    }
    this.recoveryAddresses.add(recoveryAddressesItem);
    return this;
  }

  /**
   * RecoveryAddresses contains all the addresses that can be used to recover an identity.  Use this structure to import recovery addresses for an identity. Please keep in mind that the address needs to be represented in the Identity Schema or this field will be overwritten on the next identity update.
   * @return recoveryAddresses
   */
  @javax.annotation.Nullable
  public List<RecoveryIdentityAddress> getRecoveryAddresses() {
    return recoveryAddresses;
  }

  public void setRecoveryAddresses(List<RecoveryIdentityAddress> recoveryAddresses) {
    this.recoveryAddresses = recoveryAddresses;
  }


  public CreateIdentityBody schemaId(String schemaId) {
    this.schemaId = schemaId;
    return this;
  }

  /**
   * SchemaID is the ID of the JSON Schema to be used for validating the identity&#39;s traits.
   * @return schemaId
   */
  @javax.annotation.Nonnull
  public String getSchemaId() {
    return schemaId;
  }

  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  public CreateIdentityBody state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * State is the identity&#39;s state. active StateActive inactive StateInactive
   * @return state
   */
  @javax.annotation.Nullable
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }


  public CreateIdentityBody traits(Object traits) {
    this.traits = traits;
    return this;
  }

  /**
   * Traits represent an identity&#39;s traits. The identity is able to create, modify, and delete traits in a self-service manner. The input will always be validated against the JSON Schema defined in &#x60;schema_url&#x60;.
   * @return traits
   */
  @javax.annotation.Nonnull
  public Object getTraits() {
    return traits;
  }

  public void setTraits(Object traits) {
    this.traits = traits;
  }


  public CreateIdentityBody verifiableAddresses(List<VerifiableIdentityAddress> verifiableAddresses) {
    this.verifiableAddresses = verifiableAddresses;
    return this;
  }

  public CreateIdentityBody addVerifiableAddressesItem(VerifiableIdentityAddress verifiableAddressesItem) {
    if (this.verifiableAddresses == null) {
      this.verifiableAddresses = new ArrayList<>();
    }
    this.verifiableAddresses.add(verifiableAddressesItem);
    return this;
  }

  /**
   * VerifiableAddresses contains all the addresses that can be verified by the user.  Use this structure to import verified addresses for an identity. Please keep in mind that the address needs to be represented in the Identity Schema or this field will be overwritten on the next identity update.
   * @return verifiableAddresses
   */
  @javax.annotation.Nullable
  public List<VerifiableIdentityAddress> getVerifiableAddresses() {
    return verifiableAddresses;
  }

  public void setVerifiableAddresses(List<VerifiableIdentityAddress> verifiableAddresses) {
    this.verifiableAddresses = verifiableAddresses;
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
   * @return the CreateIdentityBody instance itself
   */
  public CreateIdentityBody putAdditionalProperty(String key, Object value) {
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
    CreateIdentityBody createIdentityBody = (CreateIdentityBody) o;
    return Objects.equals(this.credentials, createIdentityBody.credentials) &&
        Objects.equals(this.metadataAdmin, createIdentityBody.metadataAdmin) &&
        Objects.equals(this.metadataPublic, createIdentityBody.metadataPublic) &&
        Objects.equals(this.recoveryAddresses, createIdentityBody.recoveryAddresses) &&
        Objects.equals(this.schemaId, createIdentityBody.schemaId) &&
        Objects.equals(this.state, createIdentityBody.state) &&
        Objects.equals(this.traits, createIdentityBody.traits) &&
        Objects.equals(this.verifiableAddresses, createIdentityBody.verifiableAddresses)&&
        Objects.equals(this.additionalProperties, createIdentityBody.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentials, metadataAdmin, metadataPublic, recoveryAddresses, schemaId, state, traits, verifiableAddresses, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIdentityBody {\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    metadataAdmin: ").append(toIndentedString(metadataAdmin)).append("\n");
    sb.append("    metadataPublic: ").append(toIndentedString(metadataPublic)).append("\n");
    sb.append("    recoveryAddresses: ").append(toIndentedString(recoveryAddresses)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    traits: ").append(toIndentedString(traits)).append("\n");
    sb.append("    verifiableAddresses: ").append(toIndentedString(verifiableAddresses)).append("\n");
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
    openapiFields.add("credentials");
    openapiFields.add("metadata_admin");
    openapiFields.add("metadata_public");
    openapiFields.add("recovery_addresses");
    openapiFields.add("schema_id");
    openapiFields.add("state");
    openapiFields.add("traits");
    openapiFields.add("verifiable_addresses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("schema_id");
    openapiRequiredFields.add("traits");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CreateIdentityBody
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateIdentityBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateIdentityBody is not found in the empty JSON string", CreateIdentityBody.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateIdentityBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `credentials`
      if (jsonObj.get("credentials") != null && !jsonObj.get("credentials").isJsonNull()) {
        IdentityWithCredentials.validateJsonElement(jsonObj.get("credentials"));
      }
      if (jsonObj.get("recovery_addresses") != null && !jsonObj.get("recovery_addresses").isJsonNull()) {
        JsonArray jsonArrayrecoveryAddresses = jsonObj.getAsJsonArray("recovery_addresses");
        if (jsonArrayrecoveryAddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("recovery_addresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `recovery_addresses` to be an array in the JSON string but got `%s`", jsonObj.get("recovery_addresses").toString()));
          }

          // validate the optional field `recovery_addresses` (array)
          for (int i = 0; i < jsonArrayrecoveryAddresses.size(); i++) {
            RecoveryIdentityAddress.validateJsonElement(jsonArrayrecoveryAddresses.get(i));
          };
        }
      }
      if (!jsonObj.get("schema_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schema_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schema_id").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        StateEnum.validateJsonElement(jsonObj.get("state"));
      }
      if (jsonObj.get("verifiable_addresses") != null && !jsonObj.get("verifiable_addresses").isJsonNull()) {
        JsonArray jsonArrayverifiableAddresses = jsonObj.getAsJsonArray("verifiable_addresses");
        if (jsonArrayverifiableAddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("verifiable_addresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `verifiable_addresses` to be an array in the JSON string but got `%s`", jsonObj.get("verifiable_addresses").toString()));
          }

          // validate the optional field `verifiable_addresses` (array)
          for (int i = 0; i < jsonArrayverifiableAddresses.size(); i++) {
            VerifiableIdentityAddress.validateJsonElement(jsonArrayverifiableAddresses.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateIdentityBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateIdentityBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateIdentityBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateIdentityBody.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateIdentityBody>() {
           @Override
           public void write(JsonWriter out, CreateIdentityBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
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
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateIdentityBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateIdentityBody instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of CreateIdentityBody given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CreateIdentityBody
   * @throws IOException if the JSON string is invalid with respect to CreateIdentityBody
   */
  public static CreateIdentityBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateIdentityBody.class);
  }

  /**
   * Convert an instance of CreateIdentityBody to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

