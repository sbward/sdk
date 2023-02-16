/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.1.12
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
	"time"
)

// MessageDispatch MessageDispatch represents an attempt of sending a courier message It contains the status of the attempt (failed or successful) and the error if any occured
type MessageDispatch struct {
	// CreatedAt is a helper struct field for gobuffalo.pop.
	CreatedAt time.Time `json:"created_at"`
	Error map[string]interface{} `json:"error,omitempty"`
	// The ID of this message dispatch
	Id string `json:"id"`
	// The ID of the message being dispatched
	MessageId string `json:"message_id"`
	// The status of this dispatch Either \"failed\" or \"success\" failed CourierMessageDispatchStatusFailed success CourierMessageDispatchStatusSuccess
	Status string `json:"status"`
	// UpdatedAt is a helper struct field for gobuffalo.pop.
	UpdatedAt time.Time `json:"updated_at"`
}

// NewMessageDispatch instantiates a new MessageDispatch object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMessageDispatch(createdAt time.Time, id string, messageId string, status string, updatedAt time.Time) *MessageDispatch {
	this := MessageDispatch{}
	this.CreatedAt = createdAt
	this.Id = id
	this.MessageId = messageId
	this.Status = status
	this.UpdatedAt = updatedAt
	return &this
}

// NewMessageDispatchWithDefaults instantiates a new MessageDispatch object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMessageDispatchWithDefaults() *MessageDispatch {
	this := MessageDispatch{}
	return &this
}

// GetCreatedAt returns the CreatedAt field value
func (o *MessageDispatch) GetCreatedAt() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.CreatedAt
}

// GetCreatedAtOk returns a tuple with the CreatedAt field value
// and a boolean to check if the value has been set.
func (o *MessageDispatch) GetCreatedAtOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return &o.CreatedAt, true
}

// SetCreatedAt sets field value
func (o *MessageDispatch) SetCreatedAt(v time.Time) {
	o.CreatedAt = v
}

// GetError returns the Error field value if set, zero value otherwise.
func (o *MessageDispatch) GetError() map[string]interface{} {
	if o == nil || o.Error == nil {
		var ret map[string]interface{}
		return ret
	}
	return o.Error
}

// GetErrorOk returns a tuple with the Error field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *MessageDispatch) GetErrorOk() (map[string]interface{}, bool) {
	if o == nil || o.Error == nil {
		return nil, false
	}
	return o.Error, true
}

// HasError returns a boolean if a field has been set.
func (o *MessageDispatch) HasError() bool {
	if o != nil && o.Error != nil {
		return true
	}

	return false
}

// SetError gets a reference to the given map[string]interface{} and assigns it to the Error field.
func (o *MessageDispatch) SetError(v map[string]interface{}) {
	o.Error = v
}

// GetId returns the Id field value
func (o *MessageDispatch) GetId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Id
}

// GetIdOk returns a tuple with the Id field value
// and a boolean to check if the value has been set.
func (o *MessageDispatch) GetIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Id, true
}

// SetId sets field value
func (o *MessageDispatch) SetId(v string) {
	o.Id = v
}

// GetMessageId returns the MessageId field value
func (o *MessageDispatch) GetMessageId() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.MessageId
}

// GetMessageIdOk returns a tuple with the MessageId field value
// and a boolean to check if the value has been set.
func (o *MessageDispatch) GetMessageIdOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.MessageId, true
}

// SetMessageId sets field value
func (o *MessageDispatch) SetMessageId(v string) {
	o.MessageId = v
}

// GetStatus returns the Status field value
func (o *MessageDispatch) GetStatus() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.Status
}

// GetStatusOk returns a tuple with the Status field value
// and a boolean to check if the value has been set.
func (o *MessageDispatch) GetStatusOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.Status, true
}

// SetStatus sets field value
func (o *MessageDispatch) SetStatus(v string) {
	o.Status = v
}

// GetUpdatedAt returns the UpdatedAt field value
func (o *MessageDispatch) GetUpdatedAt() time.Time {
	if o == nil {
		var ret time.Time
		return ret
	}

	return o.UpdatedAt
}

// GetUpdatedAtOk returns a tuple with the UpdatedAt field value
// and a boolean to check if the value has been set.
func (o *MessageDispatch) GetUpdatedAtOk() (*time.Time, bool) {
	if o == nil {
		return nil, false
	}
	return &o.UpdatedAt, true
}

// SetUpdatedAt sets field value
func (o *MessageDispatch) SetUpdatedAt(v time.Time) {
	o.UpdatedAt = v
}

func (o MessageDispatch) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if true {
		toSerialize["created_at"] = o.CreatedAt
	}
	if o.Error != nil {
		toSerialize["error"] = o.Error
	}
	if true {
		toSerialize["id"] = o.Id
	}
	if true {
		toSerialize["message_id"] = o.MessageId
	}
	if true {
		toSerialize["status"] = o.Status
	}
	if true {
		toSerialize["updated_at"] = o.UpdatedAt
	}
	return json.Marshal(toSerialize)
}

type NullableMessageDispatch struct {
	value *MessageDispatch
	isSet bool
}

func (v NullableMessageDispatch) Get() *MessageDispatch {
	return v.value
}

func (v *NullableMessageDispatch) Set(val *MessageDispatch) {
	v.value = val
	v.isSet = true
}

func (v NullableMessageDispatch) IsSet() bool {
	return v.isSet
}

func (v *NullableMessageDispatch) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMessageDispatch(val *MessageDispatch) *NullableMessageDispatch {
	return &NullableMessageDispatch{value: val, isSet: true}
}

func (v NullableMessageDispatch) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMessageDispatch) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


