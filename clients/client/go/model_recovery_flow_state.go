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
	"fmt"
)

// RecoveryFlowState The state represents the state of the recovery flow.  choose_method: ask the user to choose a method (e.g. recover account via email) sent_email: the email has been sent to the user passed_challenge: the request was successful and the recovery challenge was passed.
type RecoveryFlowState string

// List of recoveryFlowState
const (
	RECOVERYFLOWSTATE_CHOOSE_METHOD RecoveryFlowState = "choose_method"
	RECOVERYFLOWSTATE_SENT_EMAIL RecoveryFlowState = "sent_email"
	RECOVERYFLOWSTATE_PASSED_CHALLENGE RecoveryFlowState = "passed_challenge"
)

// All allowed values of RecoveryFlowState enum
var AllowedRecoveryFlowStateEnumValues = []RecoveryFlowState{
	"choose_method",
	"sent_email",
	"passed_challenge",
}

func (v *RecoveryFlowState) UnmarshalJSON(src []byte) error {
	var value string
	err := json.Unmarshal(src, &value)
	if err != nil {
		return err
	}
	enumTypeValue := RecoveryFlowState(value)
	for _, existing := range AllowedRecoveryFlowStateEnumValues {
		if existing == enumTypeValue {
			*v = enumTypeValue
			return nil
		}
	}

	return fmt.Errorf("%+v is not a valid RecoveryFlowState", value)
}

// NewRecoveryFlowStateFromValue returns a pointer to a valid RecoveryFlowState
// for the value passed as argument, or an error if the value passed is not allowed by the enum
func NewRecoveryFlowStateFromValue(v string) (*RecoveryFlowState, error) {
	ev := RecoveryFlowState(v)
	if ev.IsValid() {
		return &ev, nil
	} else {
		return nil, fmt.Errorf("invalid value '%v' for RecoveryFlowState: valid values are %v", v, AllowedRecoveryFlowStateEnumValues)
	}
}

// IsValid return true if the value is valid for the enum, false otherwise
func (v RecoveryFlowState) IsValid() bool {
	for _, existing := range AllowedRecoveryFlowStateEnumValues {
		if existing == v {
			return true
		}
	}
	return false
}

// Ptr returns reference to recoveryFlowState value
func (v RecoveryFlowState) Ptr() *RecoveryFlowState {
	return &v
}

type NullableRecoveryFlowState struct {
	value *RecoveryFlowState
	isSet bool
}

func (v NullableRecoveryFlowState) Get() *RecoveryFlowState {
	return v.value
}

func (v *NullableRecoveryFlowState) Set(val *RecoveryFlowState) {
	v.value = val
	v.isSet = true
}

func (v NullableRecoveryFlowState) IsSet() bool {
	return v.isSet
}

func (v *NullableRecoveryFlowState) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableRecoveryFlowState(val *RecoveryFlowState) *NullableRecoveryFlowState {
	return &NullableRecoveryFlowState{value: val, isSet: true}
}

func (v NullableRecoveryFlowState) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableRecoveryFlowState) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

