/*
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.2.0-alpha.20
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
import java.util.ArrayList;
import java.util.List;
import sh.ory.model.OAuth2Client;
import sh.ory.model.OAuth2ConsentRequestOpenIDConnectContext;

/**
 * OAuth2LoginRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-26T08:30:03.017335438Z[Etc/UTC]")
public class OAuth2LoginRequest {
  public static final String SERIALIZED_NAME_CHALLENGE = "challenge";
  @SerializedName(SERIALIZED_NAME_CHALLENGE)
  private String challenge;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private OAuth2Client client;

  public static final String SERIALIZED_NAME_OIDC_CONTEXT = "oidc_context";
  @SerializedName(SERIALIZED_NAME_OIDC_CONTEXT)
  private OAuth2ConsentRequestOpenIDConnectContext oidcContext;

  public static final String SERIALIZED_NAME_REQUEST_URL = "request_url";
  @SerializedName(SERIALIZED_NAME_REQUEST_URL)
  private String requestUrl;

  public static final String SERIALIZED_NAME_REQUESTED_ACCESS_TOKEN_AUDIENCE = "requested_access_token_audience";
  @SerializedName(SERIALIZED_NAME_REQUESTED_ACCESS_TOKEN_AUDIENCE)
  private List<String> requestedAccessTokenAudience = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUESTED_SCOPE = "requested_scope";
  @SerializedName(SERIALIZED_NAME_REQUESTED_SCOPE)
  private List<String> requestedScope = new ArrayList<>();

  public static final String SERIALIZED_NAME_SESSION_ID = "session_id";
  @SerializedName(SERIALIZED_NAME_SESSION_ID)
  private String sessionId;

  public static final String SERIALIZED_NAME_SKIP = "skip";
  @SerializedName(SERIALIZED_NAME_SKIP)
  private Boolean skip;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public OAuth2LoginRequest() { 
  }

  public OAuth2LoginRequest challenge(String challenge) {
    
    this.challenge = challenge;
    return this;
  }

   /**
   * ID is the identifier (\&quot;login challenge\&quot;) of the login request. It is used to identify the session.
   * @return challenge
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ID is the identifier (\"login challenge\") of the login request. It is used to identify the session.")

  public String getChallenge() {
    return challenge;
  }


  public void setChallenge(String challenge) {
    this.challenge = challenge;
  }


  public OAuth2LoginRequest client(OAuth2Client client) {
    
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OAuth2Client getClient() {
    return client;
  }


  public void setClient(OAuth2Client client) {
    this.client = client;
  }


  public OAuth2LoginRequest oidcContext(OAuth2ConsentRequestOpenIDConnectContext oidcContext) {
    
    this.oidcContext = oidcContext;
    return this;
  }

   /**
   * Get oidcContext
   * @return oidcContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OAuth2ConsentRequestOpenIDConnectContext getOidcContext() {
    return oidcContext;
  }


  public void setOidcContext(OAuth2ConsentRequestOpenIDConnectContext oidcContext) {
    this.oidcContext = oidcContext;
  }


  public OAuth2LoginRequest requestUrl(String requestUrl) {
    
    this.requestUrl = requestUrl;
    return this;
  }

   /**
   * RequestURL is the original OAuth 2.0 Authorization URL requested by the OAuth 2.0 client. It is the URL which initiates the OAuth 2.0 Authorization Code or OAuth 2.0 Implicit flow. This URL is typically not needed, but might come in handy if you want to deal with additional request parameters.
   * @return requestUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "RequestURL is the original OAuth 2.0 Authorization URL requested by the OAuth 2.0 client. It is the URL which initiates the OAuth 2.0 Authorization Code or OAuth 2.0 Implicit flow. This URL is typically not needed, but might come in handy if you want to deal with additional request parameters.")

  public String getRequestUrl() {
    return requestUrl;
  }


  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }


  public OAuth2LoginRequest requestedAccessTokenAudience(List<String> requestedAccessTokenAudience) {
    
    this.requestedAccessTokenAudience = requestedAccessTokenAudience;
    return this;
  }

  public OAuth2LoginRequest addRequestedAccessTokenAudienceItem(String requestedAccessTokenAudienceItem) {
    this.requestedAccessTokenAudience.add(requestedAccessTokenAudienceItem);
    return this;
  }

   /**
   * Get requestedAccessTokenAudience
   * @return requestedAccessTokenAudience
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getRequestedAccessTokenAudience() {
    return requestedAccessTokenAudience;
  }


  public void setRequestedAccessTokenAudience(List<String> requestedAccessTokenAudience) {
    this.requestedAccessTokenAudience = requestedAccessTokenAudience;
  }


  public OAuth2LoginRequest requestedScope(List<String> requestedScope) {
    
    this.requestedScope = requestedScope;
    return this;
  }

  public OAuth2LoginRequest addRequestedScopeItem(String requestedScopeItem) {
    this.requestedScope.add(requestedScopeItem);
    return this;
  }

   /**
   * Get requestedScope
   * @return requestedScope
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getRequestedScope() {
    return requestedScope;
  }


  public void setRequestedScope(List<String> requestedScope) {
    this.requestedScope = requestedScope;
  }


  public OAuth2LoginRequest sessionId(String sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * SessionID is the login session ID. If the user-agent reuses a login session (via cookie / remember flag) this ID will remain the same. If the user-agent did not have an existing authentication session (e.g. remember is false) this will be a new random value. This value is used as the \&quot;sid\&quot; parameter in the ID Token and in OIDC Front-/Back- channel logout. It&#39;s value can generally be used to associate consecutive login requests by a certain user.
   * @return sessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SessionID is the login session ID. If the user-agent reuses a login session (via cookie / remember flag) this ID will remain the same. If the user-agent did not have an existing authentication session (e.g. remember is false) this will be a new random value. This value is used as the \"sid\" parameter in the ID Token and in OIDC Front-/Back- channel logout. It's value can generally be used to associate consecutive login requests by a certain user.")

  public String getSessionId() {
    return sessionId;
  }


  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  public OAuth2LoginRequest skip(Boolean skip) {
    
    this.skip = skip;
    return this;
  }

   /**
   * Skip, if true, implies that the client has requested the same scopes from the same user previously. If true, you can skip asking the user to grant the requested scopes, and simply forward the user to the redirect URL.  This feature allows you to update / set session information.
   * @return skip
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Skip, if true, implies that the client has requested the same scopes from the same user previously. If true, you can skip asking the user to grant the requested scopes, and simply forward the user to the redirect URL.  This feature allows you to update / set session information.")

  public Boolean getSkip() {
    return skip;
  }


  public void setSkip(Boolean skip) {
    this.skip = skip;
  }


  public OAuth2LoginRequest subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Subject is the user ID of the end-user that authenticated. Now, that end user needs to grant or deny the scope requested by the OAuth 2.0 client. If this value is set and &#x60;skip&#x60; is true, you MUST include this subject type when accepting the login request, or the request will fail.
   * @return subject
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Subject is the user ID of the end-user that authenticated. Now, that end user needs to grant or deny the scope requested by the OAuth 2.0 client. If this value is set and `skip` is true, you MUST include this subject type when accepting the login request, or the request will fail.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuth2LoginRequest oAuth2LoginRequest = (OAuth2LoginRequest) o;
    return Objects.equals(this.challenge, oAuth2LoginRequest.challenge) &&
        Objects.equals(this.client, oAuth2LoginRequest.client) &&
        Objects.equals(this.oidcContext, oAuth2LoginRequest.oidcContext) &&
        Objects.equals(this.requestUrl, oAuth2LoginRequest.requestUrl) &&
        Objects.equals(this.requestedAccessTokenAudience, oAuth2LoginRequest.requestedAccessTokenAudience) &&
        Objects.equals(this.requestedScope, oAuth2LoginRequest.requestedScope) &&
        Objects.equals(this.sessionId, oAuth2LoginRequest.sessionId) &&
        Objects.equals(this.skip, oAuth2LoginRequest.skip) &&
        Objects.equals(this.subject, oAuth2LoginRequest.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challenge, client, oidcContext, requestUrl, requestedAccessTokenAudience, requestedScope, sessionId, skip, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuth2LoginRequest {\n");
    sb.append("    challenge: ").append(toIndentedString(challenge)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    oidcContext: ").append(toIndentedString(oidcContext)).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
    sb.append("    requestedAccessTokenAudience: ").append(toIndentedString(requestedAccessTokenAudience)).append("\n");
    sb.append("    requestedScope: ").append(toIndentedString(requestedScope)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
