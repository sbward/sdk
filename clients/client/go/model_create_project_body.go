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

// checks if the CreateProjectBody type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &CreateProjectBody{}

// CreateProjectBody Create Project Request Body
type CreateProjectBody struct {
	// The environment of the project. prod Production stage Staging dev Development
	Environment string `json:"environment"`
	// Home Region  The home region of the project. This is the region where the project will be created. eu-central EUCentral asia-northeast AsiaNorthEast us-east USEast us-west USWest us US global Global
	HomeRegion *string `json:"home_region,omitempty"`
	// The name of the project to be created
	Name string `json:"name"`
	// The workspace to create the project in.
	WorkspaceId *string `json:"workspace_id,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _CreateProjectBody CreateProjectBody

// NewCreateProjectBody instantiates a new CreateProjectBody object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewCreateProjectBody(environment string, name string) *CreateProjectBody {
	this := CreateProjectBody{}
	this.Environment = environment
	this.Name = name
	return &this
}

// NewCreateProjectBodyWithDefaults instantiates a new CreateProjectBody object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewCreateProjectBodyWithDefaults() *CreateProjectBody {
	this := CreateProjectBody{}
	return &this
}

// GetEnvironment returns the Environment field value
func (o *CreateProjectBody) GetEnvironment() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Environment
}

// GetEnvironmentOk returns a tuple with the Environment field value
// and a boolean to check if the value has been set.
func (o *CreateProjectBody) GetEnvironmentOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Environment, true
}

// SetEnvironment sets field value
func (o *CreateProjectBody) SetEnvironment(v string) {
	o.Environment = v
}

// GetHomeRegion returns the HomeRegion field value if set, zero value otherwise.
func (o *CreateProjectBody) GetHomeRegion() string {
	if o == nil || IsNil(o.HomeRegion) {
		var ret string
		return ret
	}
	return *o.HomeRegion
}

// GetHomeRegionOk returns a tuple with the HomeRegion field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateProjectBody) GetHomeRegionOk() (*string, bool) {
	if o == nil || IsNil(o.HomeRegion) {
		return nil, false
	}
	return o.HomeRegion, true
}

// HasHomeRegion returns a boolean if a field has been set.
func (o *CreateProjectBody) HasHomeRegion() bool {
	if o != nil && !IsNil(o.HomeRegion) {
		return true
	}

	return false
}

// SetHomeRegion gets a reference to the given string and assigns it to the HomeRegion field.
func (o *CreateProjectBody) SetHomeRegion(v string) {
	o.HomeRegion = &v
}

// GetName returns the Name field value
func (o *CreateProjectBody) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *CreateProjectBody) GetNameOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *CreateProjectBody) SetName(v string) {
	o.Name = v
}

// GetWorkspaceId returns the WorkspaceId field value if set, zero value otherwise.
func (o *CreateProjectBody) GetWorkspaceId() string {
	if o == nil || IsNil(o.WorkspaceId) {
		var ret string
		return ret
	}
	return *o.WorkspaceId
}

// GetWorkspaceIdOk returns a tuple with the WorkspaceId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *CreateProjectBody) GetWorkspaceIdOk() (*string, bool) {
	if o == nil || IsNil(o.WorkspaceId) {
		return nil, false
	}
	return o.WorkspaceId, true
}

// HasWorkspaceId returns a boolean if a field has been set.
func (o *CreateProjectBody) HasWorkspaceId() bool {
	if o != nil && !IsNil(o.WorkspaceId) {
		return true
	}

	return false
}

// SetWorkspaceId gets a reference to the given string and assigns it to the WorkspaceId field.
func (o *CreateProjectBody) SetWorkspaceId(v string) {
	o.WorkspaceId = &v
}

func (o CreateProjectBody) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o CreateProjectBody) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	toSerialize["environment"] = o.Environment
	if !IsNil(o.HomeRegion) {
		toSerialize["home_region"] = o.HomeRegion
	}
	toSerialize["name"] = o.Name
	if !IsNil(o.WorkspaceId) {
		toSerialize["workspace_id"] = o.WorkspaceId
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *CreateProjectBody) UnmarshalJSON(data []byte) (err error) {
	// This validates that all required properties are included in the JSON object
	// by unmarshalling the object into a generic map with string keys and checking
	// that every required field exists as a key in the generic map.
	requiredProperties := []string{
		"environment",
		"name",
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

	varCreateProjectBody := _CreateProjectBody{}

	err = json.Unmarshal(data, &varCreateProjectBody)

	if err != nil {
		return err
	}

	*o = CreateProjectBody(varCreateProjectBody)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "environment")
		delete(additionalProperties, "home_region")
		delete(additionalProperties, "name")
		delete(additionalProperties, "workspace_id")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableCreateProjectBody struct {
	value *CreateProjectBody
	isSet bool
}

func (v NullableCreateProjectBody) Get() *CreateProjectBody {
	return v.value
}

func (v *NullableCreateProjectBody) Set(val *CreateProjectBody) {
	v.value = val
	v.isSet = true
}

func (v NullableCreateProjectBody) IsSet() bool {
	return v.isSet
}

func (v *NullableCreateProjectBody) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableCreateProjectBody(val *CreateProjectBody) *NullableCreateProjectBody {
	return &NullableCreateProjectBody{value: val, isSet: true}
}

func (v NullableCreateProjectBody) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableCreateProjectBody) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


