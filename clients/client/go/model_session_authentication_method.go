/*
Ory APIs

# Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 

API version: v1.15.12
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
	"time"
)

// checks if the SessionAuthenticationMethod type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &SessionAuthenticationMethod{}

// SessionAuthenticationMethod A singular authenticator used during authentication / login.
type SessionAuthenticationMethod struct {
	Aal *AuthenticatorAssuranceLevel `json:"aal,omitempty"`
	// When the authentication challenge was completed.
	CompletedAt *time.Time `json:"completed_at,omitempty"`
	Method *string `json:"method,omitempty"`
	// The Organization id used for authentication
	Organization *string `json:"organization,omitempty"`
	// OIDC or SAML provider id used for authentication
	Provider *string `json:"provider,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _SessionAuthenticationMethod SessionAuthenticationMethod

// NewSessionAuthenticationMethod instantiates a new SessionAuthenticationMethod object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewSessionAuthenticationMethod() *SessionAuthenticationMethod {
	this := SessionAuthenticationMethod{}
	return &this
}

// NewSessionAuthenticationMethodWithDefaults instantiates a new SessionAuthenticationMethod object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewSessionAuthenticationMethodWithDefaults() *SessionAuthenticationMethod {
	this := SessionAuthenticationMethod{}
	return &this
}

// GetAal returns the Aal field value if set, zero value otherwise.
func (o *SessionAuthenticationMethod) GetAal() AuthenticatorAssuranceLevel {
	if o == nil || IsNil(o.Aal) {
		var ret AuthenticatorAssuranceLevel
		return ret
	}
	return *o.Aal
}

// GetAalOk returns a tuple with the Aal field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SessionAuthenticationMethod) GetAalOk() (*AuthenticatorAssuranceLevel, bool) {
	if o == nil || IsNil(o.Aal) {
		return nil, false
	}
	return o.Aal, true
}

// HasAal returns a boolean if a field has been set.
func (o *SessionAuthenticationMethod) HasAal() bool {
	if o != nil && !IsNil(o.Aal) {
		return true
	}

	return false
}

// SetAal gets a reference to the given AuthenticatorAssuranceLevel and assigns it to the Aal field.
func (o *SessionAuthenticationMethod) SetAal(v AuthenticatorAssuranceLevel) {
	o.Aal = &v
}

// GetCompletedAt returns the CompletedAt field value if set, zero value otherwise.
func (o *SessionAuthenticationMethod) GetCompletedAt() time.Time {
	if o == nil || IsNil(o.CompletedAt) {
		var ret time.Time
		return ret
	}
	return *o.CompletedAt
}

// GetCompletedAtOk returns a tuple with the CompletedAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SessionAuthenticationMethod) GetCompletedAtOk() (*time.Time, bool) {
	if o == nil || IsNil(o.CompletedAt) {
		return nil, false
	}
	return o.CompletedAt, true
}

// HasCompletedAt returns a boolean if a field has been set.
func (o *SessionAuthenticationMethod) HasCompletedAt() bool {
	if o != nil && !IsNil(o.CompletedAt) {
		return true
	}

	return false
}

// SetCompletedAt gets a reference to the given time.Time and assigns it to the CompletedAt field.
func (o *SessionAuthenticationMethod) SetCompletedAt(v time.Time) {
	o.CompletedAt = &v
}

// GetMethod returns the Method field value if set, zero value otherwise.
func (o *SessionAuthenticationMethod) GetMethod() string {
	if o == nil || IsNil(o.Method) {
		var ret string
		return ret
	}
	return *o.Method
}

// GetMethodOk returns a tuple with the Method field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SessionAuthenticationMethod) GetMethodOk() (*string, bool) {
	if o == nil || IsNil(o.Method) {
		return nil, false
	}
	return o.Method, true
}

// HasMethod returns a boolean if a field has been set.
func (o *SessionAuthenticationMethod) HasMethod() bool {
	if o != nil && !IsNil(o.Method) {
		return true
	}

	return false
}

// SetMethod gets a reference to the given string and assigns it to the Method field.
func (o *SessionAuthenticationMethod) SetMethod(v string) {
	o.Method = &v
}

// GetOrganization returns the Organization field value if set, zero value otherwise.
func (o *SessionAuthenticationMethod) GetOrganization() string {
	if o == nil || IsNil(o.Organization) {
		var ret string
		return ret
	}
	return *o.Organization
}

// GetOrganizationOk returns a tuple with the Organization field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SessionAuthenticationMethod) GetOrganizationOk() (*string, bool) {
	if o == nil || IsNil(o.Organization) {
		return nil, false
	}
	return o.Organization, true
}

// HasOrganization returns a boolean if a field has been set.
func (o *SessionAuthenticationMethod) HasOrganization() bool {
	if o != nil && !IsNil(o.Organization) {
		return true
	}

	return false
}

// SetOrganization gets a reference to the given string and assigns it to the Organization field.
func (o *SessionAuthenticationMethod) SetOrganization(v string) {
	o.Organization = &v
}

// GetProvider returns the Provider field value if set, zero value otherwise.
func (o *SessionAuthenticationMethod) GetProvider() string {
	if o == nil || IsNil(o.Provider) {
		var ret string
		return ret
	}
	return *o.Provider
}

// GetProviderOk returns a tuple with the Provider field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *SessionAuthenticationMethod) GetProviderOk() (*string, bool) {
	if o == nil || IsNil(o.Provider) {
		return nil, false
	}
	return o.Provider, true
}

// HasProvider returns a boolean if a field has been set.
func (o *SessionAuthenticationMethod) HasProvider() bool {
	if o != nil && !IsNil(o.Provider) {
		return true
	}

	return false
}

// SetProvider gets a reference to the given string and assigns it to the Provider field.
func (o *SessionAuthenticationMethod) SetProvider(v string) {
	o.Provider = &v
}

func (o SessionAuthenticationMethod) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o SessionAuthenticationMethod) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Aal) {
		toSerialize["aal"] = o.Aal
	}
	if !IsNil(o.CompletedAt) {
		toSerialize["completed_at"] = o.CompletedAt
	}
	if !IsNil(o.Method) {
		toSerialize["method"] = o.Method
	}
	if !IsNil(o.Organization) {
		toSerialize["organization"] = o.Organization
	}
	if !IsNil(o.Provider) {
		toSerialize["provider"] = o.Provider
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *SessionAuthenticationMethod) UnmarshalJSON(data []byte) (err error) {
	varSessionAuthenticationMethod := _SessionAuthenticationMethod{}

	err = json.Unmarshal(data, &varSessionAuthenticationMethod)

	if err != nil {
		return err
	}

	*o = SessionAuthenticationMethod(varSessionAuthenticationMethod)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "aal")
		delete(additionalProperties, "completed_at")
		delete(additionalProperties, "method")
		delete(additionalProperties, "organization")
		delete(additionalProperties, "provider")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableSessionAuthenticationMethod struct {
	value *SessionAuthenticationMethod
	isSet bool
}

func (v NullableSessionAuthenticationMethod) Get() *SessionAuthenticationMethod {
	return v.value
}

func (v *NullableSessionAuthenticationMethod) Set(val *SessionAuthenticationMethod) {
	v.value = val
	v.isSet = true
}

func (v NullableSessionAuthenticationMethod) IsSet() bool {
	return v.isSet
}

func (v *NullableSessionAuthenticationMethod) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableSessionAuthenticationMethod(val *SessionAuthenticationMethod) *NullableSessionAuthenticationMethod {
	return &NullableSessionAuthenticationMethod{value: val, isSet: true}
}

func (v NullableSessionAuthenticationMethod) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableSessionAuthenticationMethod) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


