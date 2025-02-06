/*
Ory APIs

# Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 

API version: v1.16.6
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
	"fmt"
)

// checks if the OAuth2ConsentRequest type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &OAuth2ConsentRequest{}

// OAuth2ConsentRequest struct for OAuth2ConsentRequest
type OAuth2ConsentRequest struct {
	// ACR represents the Authentication AuthorizationContext Class Reference value for this authentication session. You can use it to express that, for example, a user authenticated using two factor authentication.
	Acr *string `json:"acr,omitempty"`
	Amr []string `json:"amr,omitempty"`
	// ID is the identifier (\"authorization challenge\") of the consent authorization request. It is used to identify the session.
	Challenge string `json:"challenge"`
	Client *OAuth2Client `json:"client,omitempty"`
	Context map[string]interface{} `json:"context,omitempty"`
	// LoginChallenge is the login challenge this consent challenge belongs to. It can be used to associate a login and consent request in the login & consent app.
	LoginChallenge *string `json:"login_challenge,omitempty"`
	// LoginSessionID is the login session ID. If the user-agent reuses a login session (via cookie / remember flag) this ID will remain the same. If the user-agent did not have an existing authentication session (e.g. remember is false) this will be a new random value. This value is used as the \"sid\" parameter in the ID Token and in OIDC Front-/Back- channel logout. It's value can generally be used to associate consecutive login requests by a certain user.
	LoginSessionId *string `json:"login_session_id,omitempty"`
	OidcContext *OAuth2ConsentRequestOpenIDConnectContext `json:"oidc_context,omitempty"`
	// RequestURL is the original OAuth 2.0 Authorization URL requested by the OAuth 2.0 client. It is the URL which initiates the OAuth 2.0 Authorization Code or OAuth 2.0 Implicit flow. This URL is typically not needed, but might come in handy if you want to deal with additional request parameters.
	RequestUrl *string `json:"request_url,omitempty"`
	RequestedAccessTokenAudience []string `json:"requested_access_token_audience,omitempty"`
	RequestedScope []string `json:"requested_scope,omitempty"`
	// Skip, if true, implies that the client has requested the same scopes from the same user previously. If true, you must not ask the user to grant the requested scopes. You must however either allow or deny the consent request using the usual API call.
	Skip *bool `json:"skip,omitempty"`
	// Subject is the user ID of the end-user that authenticated. Now, that end user needs to grant or deny the scope requested by the OAuth 2.0 client.
	Subject *string `json:"subject,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _OAuth2ConsentRequest OAuth2ConsentRequest

// NewOAuth2ConsentRequest instantiates a new OAuth2ConsentRequest object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewOAuth2ConsentRequest(challenge string) *OAuth2ConsentRequest {
	this := OAuth2ConsentRequest{}
	this.Challenge = challenge
	return &this
}

// NewOAuth2ConsentRequestWithDefaults instantiates a new OAuth2ConsentRequest object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewOAuth2ConsentRequestWithDefaults() *OAuth2ConsentRequest {
	this := OAuth2ConsentRequest{}
	return &this
}

// GetAcr returns the Acr field value if set, zero value otherwise.
func (o *OAuth2ConsentRequest) GetAcr() string {
	if o == nil || IsNil(o.Acr) {
		var ret string
		return ret
	}
	return *o.Acr
}

// GetAcrOk returns a tuple with the Acr field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OAuth2ConsentRequest) GetAcrOk() (*string, bool) {
	if o == nil || IsNil(o.Acr) {
		return nil, false
	}
	return o.Acr, true
}

// HasAcr returns a boolean if a field has been set.
func (o *OAuth2ConsentRequest) HasAcr() bool {
	if o != nil && !IsNil(o.Acr) {
		return true
	}

	return false
}

// SetAcr gets a reference to the given string and assigns it to the Acr field.
func (o *OAuth2ConsentRequest) SetAcr(v string) {
	o.Acr = &v
}

// GetAmr returns the Amr field value if set, zero value otherwise.
func (o *OAuth2ConsentRequest) GetAmr() []string {
	if o == nil || IsNil(o.Amr) {
		var ret []string
		return ret
	}
	return o.Amr
}

// GetAmrOk returns a tuple with the Amr field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OAuth2ConsentRequest) GetAmrOk() ([]string, bool) {
	if o == nil || IsNil(o.Amr) {
		return nil, false
	}
	return o.Amr, true
}

// HasAmr returns a boolean if a field has been set.
func (o *OAuth2ConsentRequest) HasAmr() bool {
	if o != nil && !IsNil(o.Amr) {
		return true
	}

	return false
}

// SetAmr gets a reference to the given []string and assigns it to the Amr field.
func (o *OAuth2ConsentRequest) SetAmr(v []string) {
	o.Amr = v
}

// GetChallenge returns the Challenge field value
func (o *OAuth2ConsentRequest) GetChallenge() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Challenge
}

// GetChallengeOk returns a tuple with the Challenge field value
// and a boolean to check if the value has been set.
func (o *OAuth2ConsentRequest) GetChallengeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Challenge, true
}

// SetChallenge sets field value
func (o *OAuth2ConsentRequest) SetChallenge(v string) {
	o.Challenge = v
}

// GetClient returns the Client field value if set, zero value otherwise.
func (o *OAuth2ConsentRequest) GetClient() OAuth2Client {
	if o == nil || IsNil(o.Client) {
		var ret OAuth2Client
		return ret
	}
	return *o.Client
}

// GetClientOk returns a tuple with the Client field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OAuth2ConsentRequest) GetClientOk() (*OAuth2Client, bool) {
	if o == nil || IsNil(o.Client) {
		return nil, false
	}
	return o.Client, true
}

// HasClient returns a boolean if a field has been set.
func (o *OAuth2ConsentRequest) HasClient() bool {
	if o != nil && !IsNil(o.Client) {
		return true
	}

	return false
}

// SetClient gets a reference to the given OAuth2Client and assigns it to the Client field.
func (o *OAuth2ConsentRequest) SetClient(v OAuth2Client) {
	o.Client = &v
}

// GetContext returns the Context field value if set, zero value otherwise.
func (o *OAuth2ConsentRequest) GetContext() map[string]interface{} {
	if o == nil || IsNil(o.Context) {
		var ret map[string]interface{}
		return ret
	}
	return o.Context
}

// GetContextOk returns a tuple with the Context field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OAuth2ConsentRequest) GetContextOk() (map[string]interface{}, bool) {
	if o == nil || IsNil(o.Context) {
		return map[string]interface{}{}, false
	}
	return o.Context, true
}

// HasContext returns a boolean if a field has been set.
func (o *OAuth2ConsentRequest) HasContext() bool {
	if o != nil && !IsNil(o.Context) {
		return true
	}

	return false
}

// SetContext gets a reference to the given map[string]interface{} and assigns it to the Context field.
func (o *OAuth2ConsentRequest) SetContext(v map[string]interface{}) {
	o.Context = v
}

// GetLoginChallenge returns the LoginChallenge field value if set, zero value otherwise.
func (o *OAuth2ConsentRequest) GetLoginChallenge() string {
	if o == nil || IsNil(o.LoginChallenge) {
		var ret string
		return ret
	}
	return *o.LoginChallenge
}

// GetLoginChallengeOk returns a tuple with the LoginChallenge field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OAuth2ConsentRequest) GetLoginChallengeOk() (*string, bool) {
	if o == nil || IsNil(o.LoginChallenge) {
		return nil, false
	}
	return o.LoginChallenge, true
}

// HasLoginChallenge returns a boolean if a field has been set.
func (o *OAuth2ConsentRequest) HasLoginChallenge() bool {
	if o != nil && !IsNil(o.LoginChallenge) {
		return true
	}

	return false
}

// SetLoginChallenge gets a reference to the given string and assigns it to the LoginChallenge field.
func (o *OAuth2ConsentRequest) SetLoginChallenge(v string) {
	o.LoginChallenge = &v
}

// GetLoginSessionId returns the LoginSessionId field value if set, zero value otherwise.
func (o *OAuth2ConsentRequest) GetLoginSessionId() string {
	if o == nil || IsNil(o.LoginSessionId) {
		var ret string
		return ret
	}
	return *o.LoginSessionId
}

// GetLoginSessionIdOk returns a tuple with the LoginSessionId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OAuth2ConsentRequest) GetLoginSessionIdOk() (*string, bool) {
	if o == nil || IsNil(o.LoginSessionId) {
		return nil, false
	}
	return o.LoginSessionId, true
}

// HasLoginSessionId returns a boolean if a field has been set.
func (o *OAuth2ConsentRequest) HasLoginSessionId() bool {
	if o != nil && !IsNil(o.LoginSessionId) {
		return true
	}

	return false
}

// SetLoginSessionId gets a reference to the given string and assigns it to the LoginSessionId field.
func (o *OAuth2ConsentRequest) SetLoginSessionId(v string) {
	o.LoginSessionId = &v
}

// GetOidcContext returns the OidcContext field value if set, zero value otherwise.
func (o *OAuth2ConsentRequest) GetOidcContext() OAuth2ConsentRequestOpenIDConnectContext {
	if o == nil || IsNil(o.OidcContext) {
		var ret OAuth2ConsentRequestOpenIDConnectContext
		return ret
	}
	return *o.OidcContext
}

// GetOidcContextOk returns a tuple with the OidcContext field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OAuth2ConsentRequest) GetOidcContextOk() (*OAuth2ConsentRequestOpenIDConnectContext, bool) {
	if o == nil || IsNil(o.OidcContext) {
		return nil, false
	}
	return o.OidcContext, true
}

// HasOidcContext returns a boolean if a field has been set.
func (o *OAuth2ConsentRequest) HasOidcContext() bool {
	if o != nil && !IsNil(o.OidcContext) {
		return true
	}

	return false
}

// SetOidcContext gets a reference to the given OAuth2ConsentRequestOpenIDConnectContext and assigns it to the OidcContext field.
func (o *OAuth2ConsentRequest) SetOidcContext(v OAuth2ConsentRequestOpenIDConnectContext) {
	o.OidcContext = &v
}

// GetRequestUrl returns the RequestUrl field value if set, zero value otherwise.
func (o *OAuth2ConsentRequest) GetRequestUrl() string {
	if o == nil || IsNil(o.RequestUrl) {
		var ret string
		return ret
	}
	return *o.RequestUrl
}

// GetRequestUrlOk returns a tuple with the RequestUrl field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OAuth2ConsentRequest) GetRequestUrlOk() (*string, bool) {
	if o == nil || IsNil(o.RequestUrl) {
		return nil, false
	}
	return o.RequestUrl, true
}

// HasRequestUrl returns a boolean if a field has been set.
func (o *OAuth2ConsentRequest) HasRequestUrl() bool {
	if o != nil && !IsNil(o.RequestUrl) {
		return true
	}

	return false
}

// SetRequestUrl gets a reference to the given string and assigns it to the RequestUrl field.
func (o *OAuth2ConsentRequest) SetRequestUrl(v string) {
	o.RequestUrl = &v
}

// GetRequestedAccessTokenAudience returns the RequestedAccessTokenAudience field value if set, zero value otherwise.
func (o *OAuth2ConsentRequest) GetRequestedAccessTokenAudience() []string {
	if o == nil || IsNil(o.RequestedAccessTokenAudience) {
		var ret []string
		return ret
	}
	return o.RequestedAccessTokenAudience
}

// GetRequestedAccessTokenAudienceOk returns a tuple with the RequestedAccessTokenAudience field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OAuth2ConsentRequest) GetRequestedAccessTokenAudienceOk() ([]string, bool) {
	if o == nil || IsNil(o.RequestedAccessTokenAudience) {
		return nil, false
	}
	return o.RequestedAccessTokenAudience, true
}

// HasRequestedAccessTokenAudience returns a boolean if a field has been set.
func (o *OAuth2ConsentRequest) HasRequestedAccessTokenAudience() bool {
	if o != nil && !IsNil(o.RequestedAccessTokenAudience) {
		return true
	}

	return false
}

// SetRequestedAccessTokenAudience gets a reference to the given []string and assigns it to the RequestedAccessTokenAudience field.
func (o *OAuth2ConsentRequest) SetRequestedAccessTokenAudience(v []string) {
	o.RequestedAccessTokenAudience = v
}

// GetRequestedScope returns the RequestedScope field value if set, zero value otherwise.
func (o *OAuth2ConsentRequest) GetRequestedScope() []string {
	if o == nil || IsNil(o.RequestedScope) {
		var ret []string
		return ret
	}
	return o.RequestedScope
}

// GetRequestedScopeOk returns a tuple with the RequestedScope field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OAuth2ConsentRequest) GetRequestedScopeOk() ([]string, bool) {
	if o == nil || IsNil(o.RequestedScope) {
		return nil, false
	}
	return o.RequestedScope, true
}

// HasRequestedScope returns a boolean if a field has been set.
func (o *OAuth2ConsentRequest) HasRequestedScope() bool {
	if o != nil && !IsNil(o.RequestedScope) {
		return true
	}

	return false
}

// SetRequestedScope gets a reference to the given []string and assigns it to the RequestedScope field.
func (o *OAuth2ConsentRequest) SetRequestedScope(v []string) {
	o.RequestedScope = v
}

// GetSkip returns the Skip field value if set, zero value otherwise.
func (o *OAuth2ConsentRequest) GetSkip() bool {
	if o == nil || IsNil(o.Skip) {
		var ret bool
		return ret
	}
	return *o.Skip
}

// GetSkipOk returns a tuple with the Skip field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OAuth2ConsentRequest) GetSkipOk() (*bool, bool) {
	if o == nil || IsNil(o.Skip) {
		return nil, false
	}
	return o.Skip, true
}

// HasSkip returns a boolean if a field has been set.
func (o *OAuth2ConsentRequest) HasSkip() bool {
	if o != nil && !IsNil(o.Skip) {
		return true
	}

	return false
}

// SetSkip gets a reference to the given bool and assigns it to the Skip field.
func (o *OAuth2ConsentRequest) SetSkip(v bool) {
	o.Skip = &v
}

// GetSubject returns the Subject field value if set, zero value otherwise.
func (o *OAuth2ConsentRequest) GetSubject() string {
	if o == nil || IsNil(o.Subject) {
		var ret string
		return ret
	}
	return *o.Subject
}

// GetSubjectOk returns a tuple with the Subject field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *OAuth2ConsentRequest) GetSubjectOk() (*string, bool) {
	if o == nil || IsNil(o.Subject) {
		return nil, false
	}
	return o.Subject, true
}

// HasSubject returns a boolean if a field has been set.
func (o *OAuth2ConsentRequest) HasSubject() bool {
	if o != nil && !IsNil(o.Subject) {
		return true
	}

	return false
}

// SetSubject gets a reference to the given string and assigns it to the Subject field.
func (o *OAuth2ConsentRequest) SetSubject(v string) {
	o.Subject = &v
}

func (o OAuth2ConsentRequest) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o OAuth2ConsentRequest) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Acr) {
		toSerialize["acr"] = o.Acr
	}
	if !IsNil(o.Amr) {
		toSerialize["amr"] = o.Amr
	}
	toSerialize["challenge"] = o.Challenge
	if !IsNil(o.Client) {
		toSerialize["client"] = o.Client
	}
	if !IsNil(o.Context) {
		toSerialize["context"] = o.Context
	}
	if !IsNil(o.LoginChallenge) {
		toSerialize["login_challenge"] = o.LoginChallenge
	}
	if !IsNil(o.LoginSessionId) {
		toSerialize["login_session_id"] = o.LoginSessionId
	}
	if !IsNil(o.OidcContext) {
		toSerialize["oidc_context"] = o.OidcContext
	}
	if !IsNil(o.RequestUrl) {
		toSerialize["request_url"] = o.RequestUrl
	}
	if !IsNil(o.RequestedAccessTokenAudience) {
		toSerialize["requested_access_token_audience"] = o.RequestedAccessTokenAudience
	}
	if !IsNil(o.RequestedScope) {
		toSerialize["requested_scope"] = o.RequestedScope
	}
	if !IsNil(o.Skip) {
		toSerialize["skip"] = o.Skip
	}
	if !IsNil(o.Subject) {
		toSerialize["subject"] = o.Subject
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *OAuth2ConsentRequest) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"challenge",
	}

	allProperties := make(map[string]interface{})

	err = json.Unmarshal(data, &allProperties)

	if err != nil {
		return err;
	}

	for _, requiredProperty := range(requiredProperties) {
		if _, exists := allProperties[requiredProperty]; !exists {
			return fmt.Errorf("no value given for required property %v", requiredProperty)
		}
	}

	varOAuth2ConsentRequest := _OAuth2ConsentRequest{}

	err = json.Unmarshal(data, &varOAuth2ConsentRequest)

	if err != nil {
		return err
	}

	*o = OAuth2ConsentRequest(varOAuth2ConsentRequest)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "acr")
		delete(additionalProperties, "amr")
		delete(additionalProperties, "challenge")
		delete(additionalProperties, "client")
		delete(additionalProperties, "context")
		delete(additionalProperties, "login_challenge")
		delete(additionalProperties, "login_session_id")
		delete(additionalProperties, "oidc_context")
		delete(additionalProperties, "request_url")
		delete(additionalProperties, "requested_access_token_audience")
		delete(additionalProperties, "requested_scope")
		delete(additionalProperties, "skip")
		delete(additionalProperties, "subject")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableOAuth2ConsentRequest struct {
	value *OAuth2ConsentRequest
	isSet bool
}

func (v NullableOAuth2ConsentRequest) Get() *OAuth2ConsentRequest {
	return v.value
}

func (v *NullableOAuth2ConsentRequest) Set(val *OAuth2ConsentRequest) {
	v.value = val
	v.isSet = true
}

func (v NullableOAuth2ConsentRequest) IsSet() bool {
	return v.isSet
}

func (v *NullableOAuth2ConsentRequest) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableOAuth2ConsentRequest(val *OAuth2ConsentRequest) *NullableOAuth2ConsentRequest {
	return &NullableOAuth2ConsentRequest{value: val, isSet: true}
}

func (v NullableOAuth2ConsentRequest) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableOAuth2ConsentRequest) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


