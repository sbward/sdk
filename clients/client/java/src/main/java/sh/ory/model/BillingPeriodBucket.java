/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.16.4
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
import sh.ory.model.Invoice;
import sh.ory.model.TimeInterval;

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
 * BillingPeriodBucket
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-01-30T14:01:51.626964496Z[Etc/UTC]", comments = "Generator version: 7.7.0")
public class BillingPeriodBucket {
  public static final String SERIALIZED_NAME_BASE_INVOICES = "base_invoices";
  @SerializedName(SERIALIZED_NAME_BASE_INVOICES)
  private List<Invoice> baseInvoices = new ArrayList<>();

  public static final String SERIALIZED_NAME_BILLING_PERIOD = "billing_period";
  @SerializedName(SERIALIZED_NAME_BILLING_PERIOD)
  private TimeInterval billingPeriod;

  public static final String SERIALIZED_NAME_USAGE_INVOICE = "usage_invoice";
  @SerializedName(SERIALIZED_NAME_USAGE_INVOICE)
  private Invoice usageInvoice;

  public BillingPeriodBucket() {
  }

  public BillingPeriodBucket baseInvoices(List<Invoice> baseInvoices) {
    this.baseInvoices = baseInvoices;
    return this;
  }

  public BillingPeriodBucket addBaseInvoicesItem(Invoice baseInvoicesItem) {
    if (this.baseInvoices == null) {
      this.baseInvoices = new ArrayList<>();
    }
    this.baseInvoices.add(baseInvoicesItem);
    return this;
  }

  /**
   * Get baseInvoices
   * @return baseInvoices
   */
  @javax.annotation.Nullable
  public List<Invoice> getBaseInvoices() {
    return baseInvoices;
  }

  public void setBaseInvoices(List<Invoice> baseInvoices) {
    this.baseInvoices = baseInvoices;
  }


  public BillingPeriodBucket billingPeriod(TimeInterval billingPeriod) {
    this.billingPeriod = billingPeriod;
    return this;
  }

  /**
   * Get billingPeriod
   * @return billingPeriod
   */
  @javax.annotation.Nullable
  public TimeInterval getBillingPeriod() {
    return billingPeriod;
  }

  public void setBillingPeriod(TimeInterval billingPeriod) {
    this.billingPeriod = billingPeriod;
  }


  public BillingPeriodBucket usageInvoice(Invoice usageInvoice) {
    this.usageInvoice = usageInvoice;
    return this;
  }

  /**
   * Get usageInvoice
   * @return usageInvoice
   */
  @javax.annotation.Nullable
  public Invoice getUsageInvoice() {
    return usageInvoice;
  }

  public void setUsageInvoice(Invoice usageInvoice) {
    this.usageInvoice = usageInvoice;
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
   * @return the BillingPeriodBucket instance itself
   */
  public BillingPeriodBucket putAdditionalProperty(String key, Object value) {
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
    BillingPeriodBucket billingPeriodBucket = (BillingPeriodBucket) o;
    return Objects.equals(this.baseInvoices, billingPeriodBucket.baseInvoices) &&
        Objects.equals(this.billingPeriod, billingPeriodBucket.billingPeriod) &&
        Objects.equals(this.usageInvoice, billingPeriodBucket.usageInvoice)&&
        Objects.equals(this.additionalProperties, billingPeriodBucket.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseInvoices, billingPeriod, usageInvoice, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingPeriodBucket {\n");
    sb.append("    baseInvoices: ").append(toIndentedString(baseInvoices)).append("\n");
    sb.append("    billingPeriod: ").append(toIndentedString(billingPeriod)).append("\n");
    sb.append("    usageInvoice: ").append(toIndentedString(usageInvoice)).append("\n");
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
    openapiFields.add("base_invoices");
    openapiFields.add("billing_period");
    openapiFields.add("usage_invoice");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BillingPeriodBucket
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BillingPeriodBucket.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BillingPeriodBucket is not found in the empty JSON string", BillingPeriodBucket.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("base_invoices") != null && !jsonObj.get("base_invoices").isJsonNull()) {
        JsonArray jsonArraybaseInvoices = jsonObj.getAsJsonArray("base_invoices");
        if (jsonArraybaseInvoices != null) {
          // ensure the json data is an array
          if (!jsonObj.get("base_invoices").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `base_invoices` to be an array in the JSON string but got `%s`", jsonObj.get("base_invoices").toString()));
          }

          // validate the optional field `base_invoices` (array)
          for (int i = 0; i < jsonArraybaseInvoices.size(); i++) {
            Invoice.validateJsonElement(jsonArraybaseInvoices.get(i));
          };
        }
      }
      // validate the optional field `billing_period`
      if (jsonObj.get("billing_period") != null && !jsonObj.get("billing_period").isJsonNull()) {
        TimeInterval.validateJsonElement(jsonObj.get("billing_period"));
      }
      // validate the optional field `usage_invoice`
      if (jsonObj.get("usage_invoice") != null && !jsonObj.get("usage_invoice").isJsonNull()) {
        Invoice.validateJsonElement(jsonObj.get("usage_invoice"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BillingPeriodBucket.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BillingPeriodBucket' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BillingPeriodBucket> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BillingPeriodBucket.class));

       return (TypeAdapter<T>) new TypeAdapter<BillingPeriodBucket>() {
           @Override
           public void write(JsonWriter out, BillingPeriodBucket value) throws IOException {
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
           public BillingPeriodBucket read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BillingPeriodBucket instance = thisAdapter.fromJsonTree(jsonObj);
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
   * Create an instance of BillingPeriodBucket given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BillingPeriodBucket
   * @throws IOException if the JSON string is invalid with respect to BillingPeriodBucket
   */
  public static BillingPeriodBucket fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BillingPeriodBucket.class);
  }

  /**
   * Convert an instance of BillingPeriodBucket to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

