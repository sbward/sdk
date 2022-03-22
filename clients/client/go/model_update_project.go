/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * API version: v0.0.1-alpha.144
 * Contact: support@ory.sh
 */

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// UpdateProject struct for UpdateProject
type UpdateProject struct {
	// The name of the project.
	Name string `json:"name"`
	Services ProjectServices `json:"services"`
}

// NewUpdateProject instantiates a new UpdateProject object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUpdateProject(name string, services ProjectServices) *UpdateProject {
	this := UpdateProject{}
	this.Name = name
	this.Services = services
	return &this
}

// NewUpdateProjectWithDefaults instantiates a new UpdateProject object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUpdateProjectWithDefaults() *UpdateProject {
	this := UpdateProject{}
	return &this
}

// GetName returns the Name field value
func (o *UpdateProject) GetName() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Name
}

// GetNameOk returns a tuple with the Name field value
// and a boolean to check if the value has been set.
func (o *UpdateProject) GetNameOk() (*string, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Name, true
}

// SetName sets field value
func (o *UpdateProject) SetName(v string) {
	o.Name = v
}

// GetServices returns the Services field value
func (o *UpdateProject) GetServices() ProjectServices {
	if o == nil {
		var ret ProjectServices
		return ret
	}

	return o.Services
}

// GetServicesOk returns a tuple with the Services field value
// and a boolean to check if the value has been set.
func (o *UpdateProject) GetServicesOk() (*ProjectServices, bool) {
	if o == nil  {
		return nil, false
	}
	return &o.Services, true
}

// SetServices sets field value
func (o *UpdateProject) SetServices(v ProjectServices) {
	o.Services = v
}

func (o UpdateProject) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["name"] = o.Name
	}
	if true {
		toSerialize["services"] = o.Services
	}
	return json.Marshal(toSerialize)
}

type NullableUpdateProject struct {
	value *UpdateProject
	isSet bool
}

func (v NullableUpdateProject) Get() *UpdateProject {
	return v.value
}

func (v *NullableUpdateProject) Set(val *UpdateProject) {
	v.value = val
	v.isSet = true
}

func (v NullableUpdateProject) IsSet() bool {
	return v.isSet
}

func (v *NullableUpdateProject) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUpdateProject(val *UpdateProject) *NullableUpdateProject {
	return &NullableUpdateProject{value: val, isSet: true}
}

func (v NullableUpdateProject) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUpdateProject) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

