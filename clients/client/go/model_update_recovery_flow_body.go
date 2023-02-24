/*
Ory APIs

Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

API version: v1.1.19
Contact: support@ory.sh
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package client

import (
	"encoding/json"
	"fmt"
)

// UpdateRecoveryFlowBody - Update Recovery Flow Request Body
type UpdateRecoveryFlowBody struct {
	UpdateRecoveryFlowWithCodeMethod *UpdateRecoveryFlowWithCodeMethod
	UpdateRecoveryFlowWithLinkMethod *UpdateRecoveryFlowWithLinkMethod
}

// UpdateRecoveryFlowWithCodeMethodAsUpdateRecoveryFlowBody is a convenience function that returns UpdateRecoveryFlowWithCodeMethod wrapped in UpdateRecoveryFlowBody
func UpdateRecoveryFlowWithCodeMethodAsUpdateRecoveryFlowBody(v *UpdateRecoveryFlowWithCodeMethod) UpdateRecoveryFlowBody {
	return UpdateRecoveryFlowBody{
		UpdateRecoveryFlowWithCodeMethod: v,
	}
}

// UpdateRecoveryFlowWithLinkMethodAsUpdateRecoveryFlowBody is a convenience function that returns UpdateRecoveryFlowWithLinkMethod wrapped in UpdateRecoveryFlowBody
func UpdateRecoveryFlowWithLinkMethodAsUpdateRecoveryFlowBody(v *UpdateRecoveryFlowWithLinkMethod) UpdateRecoveryFlowBody {
	return UpdateRecoveryFlowBody{
		UpdateRecoveryFlowWithLinkMethod: v,
	}
}


// Unmarshal JSON data into one of the pointers in the struct
func (dst *UpdateRecoveryFlowBody) UnmarshalJSON(data []byte) error {
	var err error
	match := 0
	// try to unmarshal data into UpdateRecoveryFlowWithCodeMethod
	err = newStrictDecoder(data).Decode(&dst.UpdateRecoveryFlowWithCodeMethod)
	if err == nil {
		jsonUpdateRecoveryFlowWithCodeMethod, _ := json.Marshal(dst.UpdateRecoveryFlowWithCodeMethod)
		if string(jsonUpdateRecoveryFlowWithCodeMethod) == "{}" { // empty struct
			dst.UpdateRecoveryFlowWithCodeMethod = nil
		} else {
			match++
		}
	} else {
		dst.UpdateRecoveryFlowWithCodeMethod = nil
	}

	// try to unmarshal data into UpdateRecoveryFlowWithLinkMethod
	err = newStrictDecoder(data).Decode(&dst.UpdateRecoveryFlowWithLinkMethod)
	if err == nil {
		jsonUpdateRecoveryFlowWithLinkMethod, _ := json.Marshal(dst.UpdateRecoveryFlowWithLinkMethod)
		if string(jsonUpdateRecoveryFlowWithLinkMethod) == "{}" { // empty struct
			dst.UpdateRecoveryFlowWithLinkMethod = nil
		} else {
			match++
		}
	} else {
		dst.UpdateRecoveryFlowWithLinkMethod = nil
	}

	if match > 1 { // more than 1 match
		// reset to nil
		dst.UpdateRecoveryFlowWithCodeMethod = nil
		dst.UpdateRecoveryFlowWithLinkMethod = nil

		return fmt.Errorf("Data matches more than one schema in oneOf(UpdateRecoveryFlowBody)")
	} else if match == 1 {
		return nil // exactly one match
	} else { // no match
		return fmt.Errorf("Data failed to match schemas in oneOf(UpdateRecoveryFlowBody)")
	}
}

// Marshal data from the first non-nil pointers in the struct to JSON
func (src UpdateRecoveryFlowBody) MarshalJSON() ([]byte, error) {
	if src.UpdateRecoveryFlowWithCodeMethod != nil {
		return json.Marshal(&src.UpdateRecoveryFlowWithCodeMethod)
	}

	if src.UpdateRecoveryFlowWithLinkMethod != nil {
		return json.Marshal(&src.UpdateRecoveryFlowWithLinkMethod)
	}

	return nil, nil // no data in oneOf schemas
}

// Get the actual instance
func (obj *UpdateRecoveryFlowBody) GetActualInstance() (interface{}) {
	if obj == nil {
		return nil
	}
	if obj.UpdateRecoveryFlowWithCodeMethod != nil {
		return obj.UpdateRecoveryFlowWithCodeMethod
	}

	if obj.UpdateRecoveryFlowWithLinkMethod != nil {
		return obj.UpdateRecoveryFlowWithLinkMethod
	}

	// all schemas are nil
	return nil
}

type NullableUpdateRecoveryFlowBody struct {
	value *UpdateRecoveryFlowBody
	isSet bool
}

func (v NullableUpdateRecoveryFlowBody) Get() *UpdateRecoveryFlowBody {
	return v.value
}

func (v *NullableUpdateRecoveryFlowBody) Set(val *UpdateRecoveryFlowBody) {
	v.value = val
	v.isSet = true
}

func (v NullableUpdateRecoveryFlowBody) IsSet() bool {
	return v.isSet
}

func (v *NullableUpdateRecoveryFlowBody) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUpdateRecoveryFlowBody(val *UpdateRecoveryFlowBody) *NullableUpdateRecoveryFlowBody {
	return &NullableUpdateRecoveryFlowBody{value: val, isSet: true}
}

func (v NullableUpdateRecoveryFlowBody) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUpdateRecoveryFlowBody) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


