/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.1.21
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
	"time"
)

// RecoveryCodeForIdentity Used when an administrator creates a recovery code for an identity.
type RecoveryCodeForIdentity struct {
	// Expires At is the timestamp of when the recovery flow expires  The timestamp when the recovery link expires.
	ExpiresAt *time.Time `json:"expires_at,omitempty"`
	// RecoveryCode is the code that can be used to recover the account
	RecoveryCode string `json:"recovery_code"`
	// RecoveryLink with flow  This link opens the recovery UI with an empty `code` field.
	RecoveryLink string `json:"recovery_link"`
}

// NewRecoveryCodeForIdentity instantiates a new RecoveryCodeForIdentity object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewRecoveryCodeForIdentity(recoveryCode string, recoveryLink string) *RecoveryCodeForIdentity {
	this := RecoveryCodeForIdentity{}
	this.RecoveryCode = recoveryCode
	this.RecoveryLink = recoveryLink
	return &this
}

// NewRecoveryCodeForIdentityWithDefaults instantiates a new RecoveryCodeForIdentity object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewRecoveryCodeForIdentityWithDefaults() *RecoveryCodeForIdentity {
	this := RecoveryCodeForIdentity{}
	return &this
}

// GetExpiresAt returns the ExpiresAt field value if set, zero value otherwise.
func (o *RecoveryCodeForIdentity) GetExpiresAt() time.Time {
	if o == nil || o.ExpiresAt == nil {
		var ret time.Time
		return ret
	}
	return *o.ExpiresAt
}

// GetExpiresAtOk returns a tuple with the ExpiresAt field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *RecoveryCodeForIdentity) GetExpiresAtOk() (*time.Time, bool) {
	if o == nil || o.ExpiresAt == nil {
		return nil, false
	}
	return o.ExpiresAt, true
}

// HasExpiresAt returns a boolean if a field has been set.
func (o *RecoveryCodeForIdentity) HasExpiresAt() bool {
	if o != nil && o.ExpiresAt != nil {
		return true
	}

	return false
}

// SetExpiresAt gets a reference to the given time.Time and assigns it to the ExpiresAt field.
func (o *RecoveryCodeForIdentity) SetExpiresAt(v time.Time) {
	o.ExpiresAt = &v
}

// GetRecoveryCode returns the RecoveryCode field value
func (o *RecoveryCodeForIdentity) GetRecoveryCode() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.RecoveryCode
}

// GetRecoveryCodeOk returns a tuple with the RecoveryCode field value
// and a boolean to check if the value has been set.
func (o *RecoveryCodeForIdentity) GetRecoveryCodeOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.RecoveryCode, true
}

// SetRecoveryCode sets field value
func (o *RecoveryCodeForIdentity) SetRecoveryCode(v string) {
	o.RecoveryCode = v
}

// GetRecoveryLink returns the RecoveryLink field value
func (o *RecoveryCodeForIdentity) GetRecoveryLink() string {
	if o == nil {
		var ret string
		return ret
	}

	return o.RecoveryLink
}

// GetRecoveryLinkOk returns a tuple with the RecoveryLink field value
// and a boolean to check if the value has been set.
func (o *RecoveryCodeForIdentity) GetRecoveryLinkOk() (*string, bool) {
	if o == nil {
		return nil, false
	}
	return &o.RecoveryLink, true
}

// SetRecoveryLink sets field value
func (o *RecoveryCodeForIdentity) SetRecoveryLink(v string) {
	o.RecoveryLink = v
}

func (o RecoveryCodeForIdentity) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.ExpiresAt != nil {
		toSerialize["expires_at"] = o.ExpiresAt
	}
	if true {
		toSerialize["recovery_code"] = o.RecoveryCode
	}
	if true {
		toSerialize["recovery_link"] = o.RecoveryLink
	}
	return json.Marshal(toSerialize)
}

type NullableRecoveryCodeForIdentity struct {
	value *RecoveryCodeForIdentity
	isSet bool
}

func (v NullableRecoveryCodeForIdentity) Get() *RecoveryCodeForIdentity {
	return v.value
}

func (v *NullableRecoveryCodeForIdentity) Set(val *RecoveryCodeForIdentity) {
	v.value = val
	v.isSet = true
}

func (v NullableRecoveryCodeForIdentity) IsSet() bool {
	return v.isSet
}

func (v *NullableRecoveryCodeForIdentity) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRecoveryCodeForIdentity(val *RecoveryCodeForIdentity) *NullableRecoveryCodeForIdentity {
	return &NullableRecoveryCodeForIdentity{value: val, isSet: true}
}

func (v NullableRecoveryCodeForIdentity) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRecoveryCodeForIdentity) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


