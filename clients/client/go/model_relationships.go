/*
Ory APIs

# Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 

API version: v1.15.17
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// checks if the Relationships type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &Relationships{}

// Relationships Paginated Relationship List
type Relationships struct {
	// The opaque token to provide in a subsequent request to get the next page. It is the empty string iff this is the last page.
	NextPageToken *string `json:"next_page_token,omitempty"`
	RelationTuples []Relationship `json:"relation_tuples,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _Relationships Relationships

// NewRelationships instantiates a new Relationships object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRelationships() *Relationships {
	this := Relationships{}
	return &this
}

// NewRelationshipsWithDefaults instantiates a new Relationships object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRelationshipsWithDefaults() *Relationships {
	this := Relationships{}
	return &this
}

// GetNextPageToken returns the NextPageToken field value if set, zero value otherwise.
func (o *Relationships) GetNextPageToken() string {
	if o == nil || IsNil(o.NextPageToken) {
		var ret string
		return ret
	}
	return *o.NextPageToken
}

// GetNextPageTokenOk returns a tuple with the NextPageToken field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Relationships) GetNextPageTokenOk() (*string, bool) {
	if o == nil || IsNil(o.NextPageToken) {
		return nil, false
	}
	return o.NextPageToken, true
}

// HasNextPageToken returns a boolean if a field has been set.
func (o *Relationships) HasNextPageToken() bool {
	if o != nil && !IsNil(o.NextPageToken) {
		return true
	}

	return false
}

// SetNextPageToken gets a reference to the given string and assigns it to the NextPageToken field.
func (o *Relationships) SetNextPageToken(v string) {
	o.NextPageToken = &v
}

// GetRelationTuples returns the RelationTuples field value if set, zero value otherwise.
func (o *Relationships) GetRelationTuples() []Relationship {
	if o == nil || IsNil(o.RelationTuples) {
		var ret []Relationship
		return ret
	}
	return o.RelationTuples
}

// GetRelationTuplesOk returns a tuple with the RelationTuples field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *Relationships) GetRelationTuplesOk() ([]Relationship, bool) {
	if o == nil || IsNil(o.RelationTuples) {
		return nil, false
	}
	return o.RelationTuples, true
}

// HasRelationTuples returns a boolean if a field has been set.
func (o *Relationships) HasRelationTuples() bool {
	if o != nil && !IsNil(o.RelationTuples) {
		return true
	}

	return false
}

// SetRelationTuples gets a reference to the given []Relationship and assigns it to the RelationTuples field.
func (o *Relationships) SetRelationTuples(v []Relationship) {
	o.RelationTuples = v
}

func (o Relationships) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o Relationships) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.NextPageToken) {
		toSerialize["next_page_token"] = o.NextPageToken
	}
	if !IsNil(o.RelationTuples) {
		toSerialize["relation_tuples"] = o.RelationTuples
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *Relationships) UnmarshalJSON(data []byte) (err error) {
	varRelationships := _Relationships{}

	err = json.Unmarshal(data, &varRelationships)

	if err != nil {
		return err
	}

	*o = Relationships(varRelationships)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "next_page_token")
		delete(additionalProperties, "relation_tuples")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableRelationships struct {
	value *Relationships
	isSet bool
}

func (v NullableRelationships) Get() *Relationships {
	return v.value
}

func (v *NullableRelationships) Set(val *Relationships) {
	v.value = val
	v.isSet = true
}

func (v NullableRelationships) IsSet() bool {
	return v.isSet
}

func (v *NullableRelationships) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRelationships(val *Relationships) *NullableRelationships {
	return &NullableRelationships{value: val, isSet: true}
}

func (v NullableRelationships) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRelationships) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


