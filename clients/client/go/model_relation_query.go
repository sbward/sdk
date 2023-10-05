/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.2.10
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
)

// checks if the RelationQuery type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &RelationQuery{}

// RelationQuery Relation Query
type RelationQuery struct {
	// Namespace to query
	Namespace *string `json:"namespace,omitempty"`
	// Object to query
	Object *string `json:"object,omitempty"`
	// Relation to query
	Relation *string `json:"relation,omitempty"`
	// SubjectID to query  Either SubjectSet or SubjectID can be provided.
	SubjectId *string `json:"subject_id,omitempty"`
	SubjectSet *SubjectSet `json:"subject_set,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _RelationQuery RelationQuery

// NewRelationQuery instantiates a new RelationQuery object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRelationQuery() *RelationQuery {
	this := RelationQuery{}
	return &this
}

// NewRelationQueryWithDefaults instantiates a new RelationQuery object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRelationQueryWithDefaults() *RelationQuery {
	this := RelationQuery{}
	return &this
}

// GetNamespace returns the Namespace field value if set, zero value otherwise.
func (o *RelationQuery) GetNamespace() string {
	if o == nil || IsNil(o.Namespace) {
		var ret string
		return ret
	}
	return *o.Namespace
}

// GetNamespaceOk returns a tuple with the Namespace field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RelationQuery) GetNamespaceOk() (*string, bool) {
	if o == nil || IsNil(o.Namespace) {
		return nil, false
	}
	return o.Namespace, true
}

// HasNamespace returns a boolean if a field has been set.
func (o *RelationQuery) HasNamespace() bool {
	if o != nil && !IsNil(o.Namespace) {
		return true
	}

	return false
}

// SetNamespace gets a reference to the given string and assigns it to the Namespace field.
func (o *RelationQuery) SetNamespace(v string) {
	o.Namespace = &v
}

// GetObject returns the Object field value if set, zero value otherwise.
func (o *RelationQuery) GetObject() string {
	if o == nil || IsNil(o.Object) {
		var ret string
		return ret
	}
	return *o.Object
}

// GetObjectOk returns a tuple with the Object field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RelationQuery) GetObjectOk() (*string, bool) {
	if o == nil || IsNil(o.Object) {
		return nil, false
	}
	return o.Object, true
}

// HasObject returns a boolean if a field has been set.
func (o *RelationQuery) HasObject() bool {
	if o != nil && !IsNil(o.Object) {
		return true
	}

	return false
}

// SetObject gets a reference to the given string and assigns it to the Object field.
func (o *RelationQuery) SetObject(v string) {
	o.Object = &v
}

// GetRelation returns the Relation field value if set, zero value otherwise.
func (o *RelationQuery) GetRelation() string {
	if o == nil || IsNil(o.Relation) {
		var ret string
		return ret
	}
	return *o.Relation
}

// GetRelationOk returns a tuple with the Relation field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RelationQuery) GetRelationOk() (*string, bool) {
	if o == nil || IsNil(o.Relation) {
		return nil, false
	}
	return o.Relation, true
}

// HasRelation returns a boolean if a field has been set.
func (o *RelationQuery) HasRelation() bool {
	if o != nil && !IsNil(o.Relation) {
		return true
	}

	return false
}

// SetRelation gets a reference to the given string and assigns it to the Relation field.
func (o *RelationQuery) SetRelation(v string) {
	o.Relation = &v
}

// GetSubjectId returns the SubjectId field value if set, zero value otherwise.
func (o *RelationQuery) GetSubjectId() string {
	if o == nil || IsNil(o.SubjectId) {
		var ret string
		return ret
	}
	return *o.SubjectId
}

// GetSubjectIdOk returns a tuple with the SubjectId field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RelationQuery) GetSubjectIdOk() (*string, bool) {
	if o == nil || IsNil(o.SubjectId) {
		return nil, false
	}
	return o.SubjectId, true
}

// HasSubjectId returns a boolean if a field has been set.
func (o *RelationQuery) HasSubjectId() bool {
	if o != nil && !IsNil(o.SubjectId) {
		return true
	}

	return false
}

// SetSubjectId gets a reference to the given string and assigns it to the SubjectId field.
func (o *RelationQuery) SetSubjectId(v string) {
	o.SubjectId = &v
}

// GetSubjectSet returns the SubjectSet field value if set, zero value otherwise.
func (o *RelationQuery) GetSubjectSet() SubjectSet {
	if o == nil || IsNil(o.SubjectSet) {
		var ret SubjectSet
		return ret
	}
	return *o.SubjectSet
}

// GetSubjectSetOk returns a tuple with the SubjectSet field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RelationQuery) GetSubjectSetOk() (*SubjectSet, bool) {
	if o == nil || IsNil(o.SubjectSet) {
		return nil, false
	}
	return o.SubjectSet, true
}

// HasSubjectSet returns a boolean if a field has been set.
func (o *RelationQuery) HasSubjectSet() bool {
	if o != nil && !IsNil(o.SubjectSet) {
		return true
	}

	return false
}

// SetSubjectSet gets a reference to the given SubjectSet and assigns it to the SubjectSet field.
func (o *RelationQuery) SetSubjectSet(v SubjectSet) {
	o.SubjectSet = &v
}

func (o RelationQuery) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o RelationQuery) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Namespace) {
		toSerialize["namespace"] = o.Namespace
	}
	if !IsNil(o.Object) {
		toSerialize["object"] = o.Object
	}
	if !IsNil(o.Relation) {
		toSerialize["relation"] = o.Relation
	}
	if !IsNil(o.SubjectId) {
		toSerialize["subject_id"] = o.SubjectId
	}
	if !IsNil(o.SubjectSet) {
		toSerialize["subject_set"] = o.SubjectSet
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *RelationQuery) UnmarshalJSON(bytes []byte) (err error) {
	varRelationQuery := _RelationQuery{}

	err = json.Unmarshal(bytes, &varRelationQuery)

	if err != nil {
		return err
	}

	*o = RelationQuery(varRelationQuery)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "namespace")
		delete(additionalProperties, "object")
		delete(additionalProperties, "relation")
		delete(additionalProperties, "subject_id")
		delete(additionalProperties, "subject_set")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableRelationQuery struct {
	value *RelationQuery
	isSet bool
}

func (v NullableRelationQuery) Get() *RelationQuery {
	return v.value
}

func (v *NullableRelationQuery) Set(val *RelationQuery) {
	v.value = val
	v.isSet = true
}

func (v NullableRelationQuery) IsSet() bool {
	return v.isSet
}

func (v *NullableRelationQuery) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRelationQuery(val *RelationQuery) *NullableRelationQuery {
	return &NullableRelationQuery{value: val, isSet: true}
}

func (v NullableRelationQuery) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRelationQuery) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


