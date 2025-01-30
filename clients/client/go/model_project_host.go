/*
Ory APIs

# Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 

API version: v1.16.4
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
	"fmt"
)

// checks if the ProjectHost type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &ProjectHost{}

// ProjectHost struct for ProjectHost
type ProjectHost struct {
	// The project's host.
	Host string `json:"host"`
	// The mapping's ID.
	Id string `json:"id"`
	// The Revision's Project ID
	ProjectId string `json:"project_id"`
	AdditionalProperties map[string]interface{}
}

type _ProjectHost ProjectHost

// NewProjectHost instantiates a new ProjectHost object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewProjectHost(host string, id string, projectId string) *ProjectHost {
	this := ProjectHost{}
	this.Host = host
	this.Id = id
	this.ProjectId = projectId
	return &this
}

// NewProjectHostWithDefaults instantiates a new ProjectHost object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewProjectHostWithDefaults() *ProjectHost {
	this := ProjectHost{}
	return &this
}

// GetHost returns the Host field value
func (o *ProjectHost) GetHost() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Host
}

// GetHostOk returns a tuple with the Host field value
// and a boolean to check if the value has been set.
func (o *ProjectHost) GetHostOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Host, true
}

// SetHost sets field value
func (o *ProjectHost) SetHost(v string) {
	o.Host = v
}

// GetId returns the Id field value
func (o *ProjectHost) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *ProjectHost) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *ProjectHost) SetId(v string) {
	o.Id = v
}

// GetProjectId returns the ProjectId field value
func (o *ProjectHost) GetProjectId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.ProjectId
}

// GetProjectIdOk returns a tuple with the ProjectId field value
// and a boolean to check if the value has been set.
func (o *ProjectHost) GetProjectIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.ProjectId, true
}

// SetProjectId sets field value
func (o *ProjectHost) SetProjectId(v string) {
	o.ProjectId = v
}

func (o ProjectHost) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o ProjectHost) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["host"] = o.Host
	toSerialize["id"] = o.Id
	toSerialize["project_id"] = o.ProjectId

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *ProjectHost) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"host",
		"id",
		"project_id",
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

	varProjectHost := _ProjectHost{}

	err = json.Unmarshal(data, &varProjectHost)

	if err != nil {
		return err
	}

	*o = ProjectHost(varProjectHost)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "host")
		delete(additionalProperties, "id")
		delete(additionalProperties, "project_id")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableProjectHost struct {
	value *ProjectHost
	isSet bool
}

func (v NullableProjectHost) Get() *ProjectHost {
	return v.value
}

func (v *NullableProjectHost) Set(val *ProjectHost) {
	v.value = val
	v.isSet = true
}

func (v NullableProjectHost) IsSet() bool {
	return v.isSet
}

func (v *NullableProjectHost) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableProjectHost(val *ProjectHost) *NullableProjectHost {
	return &NullableProjectHost{value: val, isSet: true}
}

func (v NullableProjectHost) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableProjectHost) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


