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
)

// checks if the AccountExperienceConfiguration type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &AccountExperienceConfiguration{}

// AccountExperienceConfiguration struct for AccountExperienceConfiguration
type AccountExperienceConfiguration struct {
	AccountExperienceThemeStylesheet *string `json:"account_experience_theme_stylesheet,omitempty"`
	FaviconType *string `json:"favicon_type,omitempty"`
	FaviconUrl *string `json:"favicon_url,omitempty"`
	KratosSelfserviceDefaultBrowserReturnUrl *string `json:"kratos_selfservice_default_browser_return_url,omitempty"`
	KratosSelfserviceFlowsRecoveryEnabled *bool `json:"kratos_selfservice_flows_recovery_enabled,omitempty"`
	KratosSelfserviceFlowsRegistrationEnabled *bool `json:"kratos_selfservice_flows_registration_enabled,omitempty"`
	KratosSelfserviceFlowsVerificationEnabled *bool `json:"kratos_selfservice_flows_verification_enabled,omitempty"`
	LogoUrl *string `json:"logo_url,omitempty"`
	Name *string `json:"name,omitempty"`
	OrganizationMap *map[string]string `json:"organization_map,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _AccountExperienceConfiguration AccountExperienceConfiguration

// NewAccountExperienceConfiguration instantiates a new AccountExperienceConfiguration object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewAccountExperienceConfiguration() *AccountExperienceConfiguration {
	this := AccountExperienceConfiguration{}
	return &this
}

// NewAccountExperienceConfigurationWithDefaults instantiates a new AccountExperienceConfiguration object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewAccountExperienceConfigurationWithDefaults() *AccountExperienceConfiguration {
	this := AccountExperienceConfiguration{}
	return &this
}

// GetAccountExperienceThemeStylesheet returns the AccountExperienceThemeStylesheet field value if set, zero value otherwise.
func (o *AccountExperienceConfiguration) GetAccountExperienceThemeStylesheet() string {
	if o == nil || IsNil(o.AccountExperienceThemeStylesheet) {
		var ret string
		return ret
	}
	return *o.AccountExperienceThemeStylesheet
}

// GetAccountExperienceThemeStylesheetOk returns a tuple with the AccountExperienceThemeStylesheet field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AccountExperienceConfiguration) GetAccountExperienceThemeStylesheetOk() (*string, bool) {
	if o == nil || IsNil(o.AccountExperienceThemeStylesheet) {
		return nil, false
	}
	return o.AccountExperienceThemeStylesheet, true
}

// HasAccountExperienceThemeStylesheet returns a boolean if a field has been set.
func (o *AccountExperienceConfiguration) HasAccountExperienceThemeStylesheet() bool {
	if o != nil && !IsNil(o.AccountExperienceThemeStylesheet) {
		return true
	}

	return false
}

// SetAccountExperienceThemeStylesheet gets a reference to the given string and assigns it to the AccountExperienceThemeStylesheet field.
func (o *AccountExperienceConfiguration) SetAccountExperienceThemeStylesheet(v string) {
	o.AccountExperienceThemeStylesheet = &v
}

// GetFaviconType returns the FaviconType field value if set, zero value otherwise.
func (o *AccountExperienceConfiguration) GetFaviconType() string {
	if o == nil || IsNil(o.FaviconType) {
		var ret string
		return ret
	}
	return *o.FaviconType
}

// GetFaviconTypeOk returns a tuple with the FaviconType field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AccountExperienceConfiguration) GetFaviconTypeOk() (*string, bool) {
	if o == nil || IsNil(o.FaviconType) {
		return nil, false
	}
	return o.FaviconType, true
}

// HasFaviconType returns a boolean if a field has been set.
func (o *AccountExperienceConfiguration) HasFaviconType() bool {
	if o != nil && !IsNil(o.FaviconType) {
		return true
	}

	return false
}

// SetFaviconType gets a reference to the given string and assigns it to the FaviconType field.
func (o *AccountExperienceConfiguration) SetFaviconType(v string) {
	o.FaviconType = &v
}

// GetFaviconUrl returns the FaviconUrl field value if set, zero value otherwise.
func (o *AccountExperienceConfiguration) GetFaviconUrl() string {
	if o == nil || IsNil(o.FaviconUrl) {
		var ret string
		return ret
	}
	return *o.FaviconUrl
}

// GetFaviconUrlOk returns a tuple with the FaviconUrl field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AccountExperienceConfiguration) GetFaviconUrlOk() (*string, bool) {
	if o == nil || IsNil(o.FaviconUrl) {
		return nil, false
	}
	return o.FaviconUrl, true
}

// HasFaviconUrl returns a boolean if a field has been set.
func (o *AccountExperienceConfiguration) HasFaviconUrl() bool {
	if o != nil && !IsNil(o.FaviconUrl) {
		return true
	}

	return false
}

// SetFaviconUrl gets a reference to the given string and assigns it to the FaviconUrl field.
func (o *AccountExperienceConfiguration) SetFaviconUrl(v string) {
	o.FaviconUrl = &v
}

// GetKratosSelfserviceDefaultBrowserReturnUrl returns the KratosSelfserviceDefaultBrowserReturnUrl field value if set, zero value otherwise.
func (o *AccountExperienceConfiguration) GetKratosSelfserviceDefaultBrowserReturnUrl() string {
	if o == nil || IsNil(o.KratosSelfserviceDefaultBrowserReturnUrl) {
		var ret string
		return ret
	}
	return *o.KratosSelfserviceDefaultBrowserReturnUrl
}

// GetKratosSelfserviceDefaultBrowserReturnUrlOk returns a tuple with the KratosSelfserviceDefaultBrowserReturnUrl field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AccountExperienceConfiguration) GetKratosSelfserviceDefaultBrowserReturnUrlOk() (*string, bool) {
	if o == nil || IsNil(o.KratosSelfserviceDefaultBrowserReturnUrl) {
		return nil, false
	}
	return o.KratosSelfserviceDefaultBrowserReturnUrl, true
}

// HasKratosSelfserviceDefaultBrowserReturnUrl returns a boolean if a field has been set.
func (o *AccountExperienceConfiguration) HasKratosSelfserviceDefaultBrowserReturnUrl() bool {
	if o != nil && !IsNil(o.KratosSelfserviceDefaultBrowserReturnUrl) {
		return true
	}

	return false
}

// SetKratosSelfserviceDefaultBrowserReturnUrl gets a reference to the given string and assigns it to the KratosSelfserviceDefaultBrowserReturnUrl field.
func (o *AccountExperienceConfiguration) SetKratosSelfserviceDefaultBrowserReturnUrl(v string) {
	o.KratosSelfserviceDefaultBrowserReturnUrl = &v
}

// GetKratosSelfserviceFlowsRecoveryEnabled returns the KratosSelfserviceFlowsRecoveryEnabled field value if set, zero value otherwise.
func (o *AccountExperienceConfiguration) GetKratosSelfserviceFlowsRecoveryEnabled() bool {
	if o == nil || IsNil(o.KratosSelfserviceFlowsRecoveryEnabled) {
		var ret bool
		return ret
	}
	return *o.KratosSelfserviceFlowsRecoveryEnabled
}

// GetKratosSelfserviceFlowsRecoveryEnabledOk returns a tuple with the KratosSelfserviceFlowsRecoveryEnabled field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AccountExperienceConfiguration) GetKratosSelfserviceFlowsRecoveryEnabledOk() (*bool, bool) {
	if o == nil || IsNil(o.KratosSelfserviceFlowsRecoveryEnabled) {
		return nil, false
	}
	return o.KratosSelfserviceFlowsRecoveryEnabled, true
}

// HasKratosSelfserviceFlowsRecoveryEnabled returns a boolean if a field has been set.
func (o *AccountExperienceConfiguration) HasKratosSelfserviceFlowsRecoveryEnabled() bool {
	if o != nil && !IsNil(o.KratosSelfserviceFlowsRecoveryEnabled) {
		return true
	}

	return false
}

// SetKratosSelfserviceFlowsRecoveryEnabled gets a reference to the given bool and assigns it to the KratosSelfserviceFlowsRecoveryEnabled field.
func (o *AccountExperienceConfiguration) SetKratosSelfserviceFlowsRecoveryEnabled(v bool) {
	o.KratosSelfserviceFlowsRecoveryEnabled = &v
}

// GetKratosSelfserviceFlowsRegistrationEnabled returns the KratosSelfserviceFlowsRegistrationEnabled field value if set, zero value otherwise.
func (o *AccountExperienceConfiguration) GetKratosSelfserviceFlowsRegistrationEnabled() bool {
	if o == nil || IsNil(o.KratosSelfserviceFlowsRegistrationEnabled) {
		var ret bool
		return ret
	}
	return *o.KratosSelfserviceFlowsRegistrationEnabled
}

// GetKratosSelfserviceFlowsRegistrationEnabledOk returns a tuple with the KratosSelfserviceFlowsRegistrationEnabled field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AccountExperienceConfiguration) GetKratosSelfserviceFlowsRegistrationEnabledOk() (*bool, bool) {
	if o == nil || IsNil(o.KratosSelfserviceFlowsRegistrationEnabled) {
		return nil, false
	}
	return o.KratosSelfserviceFlowsRegistrationEnabled, true
}

// HasKratosSelfserviceFlowsRegistrationEnabled returns a boolean if a field has been set.
func (o *AccountExperienceConfiguration) HasKratosSelfserviceFlowsRegistrationEnabled() bool {
	if o != nil && !IsNil(o.KratosSelfserviceFlowsRegistrationEnabled) {
		return true
	}

	return false
}

// SetKratosSelfserviceFlowsRegistrationEnabled gets a reference to the given bool and assigns it to the KratosSelfserviceFlowsRegistrationEnabled field.
func (o *AccountExperienceConfiguration) SetKratosSelfserviceFlowsRegistrationEnabled(v bool) {
	o.KratosSelfserviceFlowsRegistrationEnabled = &v
}

// GetKratosSelfserviceFlowsVerificationEnabled returns the KratosSelfserviceFlowsVerificationEnabled field value if set, zero value otherwise.
func (o *AccountExperienceConfiguration) GetKratosSelfserviceFlowsVerificationEnabled() bool {
	if o == nil || IsNil(o.KratosSelfserviceFlowsVerificationEnabled) {
		var ret bool
		return ret
	}
	return *o.KratosSelfserviceFlowsVerificationEnabled
}

// GetKratosSelfserviceFlowsVerificationEnabledOk returns a tuple with the KratosSelfserviceFlowsVerificationEnabled field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AccountExperienceConfiguration) GetKratosSelfserviceFlowsVerificationEnabledOk() (*bool, bool) {
	if o == nil || IsNil(o.KratosSelfserviceFlowsVerificationEnabled) {
		return nil, false
	}
	return o.KratosSelfserviceFlowsVerificationEnabled, true
}

// HasKratosSelfserviceFlowsVerificationEnabled returns a boolean if a field has been set.
func (o *AccountExperienceConfiguration) HasKratosSelfserviceFlowsVerificationEnabled() bool {
	if o != nil && !IsNil(o.KratosSelfserviceFlowsVerificationEnabled) {
		return true
	}

	return false
}

// SetKratosSelfserviceFlowsVerificationEnabled gets a reference to the given bool and assigns it to the KratosSelfserviceFlowsVerificationEnabled field.
func (o *AccountExperienceConfiguration) SetKratosSelfserviceFlowsVerificationEnabled(v bool) {
	o.KratosSelfserviceFlowsVerificationEnabled = &v
}

// GetLogoUrl returns the LogoUrl field value if set, zero value otherwise.
func (o *AccountExperienceConfiguration) GetLogoUrl() string {
	if o == nil || IsNil(o.LogoUrl) {
		var ret string
		return ret
	}
	return *o.LogoUrl
}

// GetLogoUrlOk returns a tuple with the LogoUrl field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AccountExperienceConfiguration) GetLogoUrlOk() (*string, bool) {
	if o == nil || IsNil(o.LogoUrl) {
		return nil, false
	}
	return o.LogoUrl, true
}

// HasLogoUrl returns a boolean if a field has been set.
func (o *AccountExperienceConfiguration) HasLogoUrl() bool {
	if o != nil && !IsNil(o.LogoUrl) {
		return true
	}

	return false
}

// SetLogoUrl gets a reference to the given string and assigns it to the LogoUrl field.
func (o *AccountExperienceConfiguration) SetLogoUrl(v string) {
	o.LogoUrl = &v
}

// GetName returns the Name field value if set, zero value otherwise.
func (o *AccountExperienceConfiguration) GetName() string {
	if o == nil || IsNil(o.Name) {
		var ret string
		return ret
	}
	return *o.Name
}

// GetNameOk returns a tuple with the Name field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AccountExperienceConfiguration) GetNameOk() (*string, bool) {
	if o == nil || IsNil(o.Name) {
		return nil, false
	}
	return o.Name, true
}

// HasName returns a boolean if a field has been set.
func (o *AccountExperienceConfiguration) HasName() bool {
	if o != nil && !IsNil(o.Name) {
		return true
	}

	return false
}

// SetName gets a reference to the given string and assigns it to the Name field.
func (o *AccountExperienceConfiguration) SetName(v string) {
	o.Name = &v
}

// GetOrganizationMap returns the OrganizationMap field value if set, zero value otherwise.
func (o *AccountExperienceConfiguration) GetOrganizationMap() map[string]string {
	if o == nil || IsNil(o.OrganizationMap) {
		var ret map[string]string
		return ret
	}
	return *o.OrganizationMap
}

// GetOrganizationMapOk returns a tuple with the OrganizationMap field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *AccountExperienceConfiguration) GetOrganizationMapOk() (*map[string]string, bool) {
	if o == nil || IsNil(o.OrganizationMap) {
		return nil, false
	}
	return o.OrganizationMap, true
}

// HasOrganizationMap returns a boolean if a field has been set.
func (o *AccountExperienceConfiguration) HasOrganizationMap() bool {
	if o != nil && !IsNil(o.OrganizationMap) {
		return true
	}

	return false
}

// SetOrganizationMap gets a reference to the given map[string]string and assigns it to the OrganizationMap field.
func (o *AccountExperienceConfiguration) SetOrganizationMap(v map[string]string) {
	o.OrganizationMap = &v
}

func (o AccountExperienceConfiguration) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o AccountExperienceConfiguration) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.AccountExperienceThemeStylesheet) {
		toSerialize["account_experience_theme_stylesheet"] = o.AccountExperienceThemeStylesheet
	}
	if !IsNil(o.FaviconType) {
		toSerialize["favicon_type"] = o.FaviconType
	}
	if !IsNil(o.FaviconUrl) {
		toSerialize["favicon_url"] = o.FaviconUrl
	}
	if !IsNil(o.KratosSelfserviceDefaultBrowserReturnUrl) {
		toSerialize["kratos_selfservice_default_browser_return_url"] = o.KratosSelfserviceDefaultBrowserReturnUrl
	}
	if !IsNil(o.KratosSelfserviceFlowsRecoveryEnabled) {
		toSerialize["kratos_selfservice_flows_recovery_enabled"] = o.KratosSelfserviceFlowsRecoveryEnabled
	}
	if !IsNil(o.KratosSelfserviceFlowsRegistrationEnabled) {
		toSerialize["kratos_selfservice_flows_registration_enabled"] = o.KratosSelfserviceFlowsRegistrationEnabled
	}
	if !IsNil(o.KratosSelfserviceFlowsVerificationEnabled) {
		toSerialize["kratos_selfservice_flows_verification_enabled"] = o.KratosSelfserviceFlowsVerificationEnabled
	}
	if !IsNil(o.LogoUrl) {
		toSerialize["logo_url"] = o.LogoUrl
	}
	if !IsNil(o.Name) {
		toSerialize["name"] = o.Name
	}
	if !IsNil(o.OrganizationMap) {
		toSerialize["organization_map"] = o.OrganizationMap
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return toSerialize, nil
}

func (o *AccountExperienceConfiguration) UnmarshalJSON(data []byte) (err error) {
	varAccountExperienceConfiguration := _AccountExperienceConfiguration{}

	err = json.Unmarshal(data, &varAccountExperienceConfiguration)

	if err != nil {
		return err
	}

	*o = AccountExperienceConfiguration(varAccountExperienceConfiguration)

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(data, &additionalProperties); err == nil {
		delete(additionalProperties, "account_experience_theme_stylesheet")
		delete(additionalProperties, "favicon_type")
		delete(additionalProperties, "favicon_url")
		delete(additionalProperties, "kratos_selfservice_default_browser_return_url")
		delete(additionalProperties, "kratos_selfservice_flows_recovery_enabled")
		delete(additionalProperties, "kratos_selfservice_flows_registration_enabled")
		delete(additionalProperties, "kratos_selfservice_flows_verification_enabled")
		delete(additionalProperties, "logo_url")
		delete(additionalProperties, "name")
		delete(additionalProperties, "organization_map")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableAccountExperienceConfiguration struct {
	value *AccountExperienceConfiguration
	isSet bool
}

func (v NullableAccountExperienceConfiguration) Get() *AccountExperienceConfiguration {
	return v.value
}

func (v *NullableAccountExperienceConfiguration) Set(val *AccountExperienceConfiguration) {
	v.value = val
	v.isSet = true
}

func (v NullableAccountExperienceConfiguration) IsSet() bool {
	return v.isSet
}

func (v *NullableAccountExperienceConfiguration) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableAccountExperienceConfiguration(val *AccountExperienceConfiguration) *NullableAccountExperienceConfiguration {
	return &NullableAccountExperienceConfiguration{value: val, isSet: true}
}

func (v NullableAccountExperienceConfiguration) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableAccountExperienceConfiguration) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


