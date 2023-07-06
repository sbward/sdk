/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.41
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * A Message&#39;s Status
 */
@JsonAdapter(CourierMessageStatus.Adapter.class)
public enum CourierMessageStatus {
  
  QUEUED("queued"),
  
  SENT("sent"),
  
  PROCESSING("processing"),
  
  ABANDONED("abandoned");

  private String value;

  CourierMessageStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CourierMessageStatus fromValue(String value) {
    for (CourierMessageStatus b : CourierMessageStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<CourierMessageStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final CourierMessageStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CourierMessageStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CourierMessageStatus.fromValue(value);
    }
  }
}

