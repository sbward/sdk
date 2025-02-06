/*
 * Ory APIs
 *
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.16.6
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct AccountExperienceColors {
    #[serde(rename = "button-identifier-background-default", skip_serializing_if = "Option::is_none")]
    pub button_identifier_background_default: Option<String>,
    #[serde(rename = "button-identifier-background-hover", skip_serializing_if = "Option::is_none")]
    pub button_identifier_background_hover: Option<String>,
    #[serde(rename = "button-identifier-border-border-default", skip_serializing_if = "Option::is_none")]
    pub button_identifier_border_border_default: Option<String>,
    #[serde(rename = "button-identifier-border-border-hover", skip_serializing_if = "Option::is_none")]
    pub button_identifier_border_border_hover: Option<String>,
    #[serde(rename = "button-identifier-foreground-default", skip_serializing_if = "Option::is_none")]
    pub button_identifier_foreground_default: Option<String>,
    #[serde(rename = "button-identifier-foreground-hover", skip_serializing_if = "Option::is_none")]
    pub button_identifier_foreground_hover: Option<String>,
    #[serde(rename = "button-link-brand-brand", skip_serializing_if = "Option::is_none")]
    pub button_link_brand_brand: Option<String>,
    #[serde(rename = "button-link-brand-brand-hover", skip_serializing_if = "Option::is_none")]
    pub button_link_brand_brand_hover: Option<String>,
    #[serde(rename = "button-link-default-primary", skip_serializing_if = "Option::is_none")]
    pub button_link_default_primary: Option<String>,
    #[serde(rename = "button-link-default-primary-hover", skip_serializing_if = "Option::is_none")]
    pub button_link_default_primary_hover: Option<String>,
    #[serde(rename = "button-link-default-secondary", skip_serializing_if = "Option::is_none")]
    pub button_link_default_secondary: Option<String>,
    #[serde(rename = "button-link-default-secondary-hover", skip_serializing_if = "Option::is_none")]
    pub button_link_default_secondary_hover: Option<String>,
    #[serde(rename = "button-link-disabled-disabled", skip_serializing_if = "Option::is_none")]
    pub button_link_disabled_disabled: Option<String>,
    #[serde(rename = "button-primary-background-default", skip_serializing_if = "Option::is_none")]
    pub button_primary_background_default: Option<String>,
    #[serde(rename = "button-primary-background-disabled", skip_serializing_if = "Option::is_none")]
    pub button_primary_background_disabled: Option<String>,
    #[serde(rename = "button-primary-background-hover", skip_serializing_if = "Option::is_none")]
    pub button_primary_background_hover: Option<String>,
    #[serde(rename = "button-primary-border-default", skip_serializing_if = "Option::is_none")]
    pub button_primary_border_default: Option<String>,
    #[serde(rename = "button-primary-border-disabled", skip_serializing_if = "Option::is_none")]
    pub button_primary_border_disabled: Option<String>,
    #[serde(rename = "button-primary-border-hover", skip_serializing_if = "Option::is_none")]
    pub button_primary_border_hover: Option<String>,
    #[serde(rename = "button-primary-foreground-default", skip_serializing_if = "Option::is_none")]
    pub button_primary_foreground_default: Option<String>,
    #[serde(rename = "button-primary-foreground-disabled", skip_serializing_if = "Option::is_none")]
    pub button_primary_foreground_disabled: Option<String>,
    #[serde(rename = "button-primary-foreground-hover", skip_serializing_if = "Option::is_none")]
    pub button_primary_foreground_hover: Option<String>,
    #[serde(rename = "button-secondary-background-default", skip_serializing_if = "Option::is_none")]
    pub button_secondary_background_default: Option<String>,
    #[serde(rename = "button-secondary-background-disabled", skip_serializing_if = "Option::is_none")]
    pub button_secondary_background_disabled: Option<String>,
    #[serde(rename = "button-secondary-background-hover", skip_serializing_if = "Option::is_none")]
    pub button_secondary_background_hover: Option<String>,
    #[serde(rename = "button-secondary-border-default", skip_serializing_if = "Option::is_none")]
    pub button_secondary_border_default: Option<String>,
    #[serde(rename = "button-secondary-border-disabled", skip_serializing_if = "Option::is_none")]
    pub button_secondary_border_disabled: Option<String>,
    #[serde(rename = "button-secondary-border-hover", skip_serializing_if = "Option::is_none")]
    pub button_secondary_border_hover: Option<String>,
    #[serde(rename = "button-secondary-foreground-default", skip_serializing_if = "Option::is_none")]
    pub button_secondary_foreground_default: Option<String>,
    #[serde(rename = "button-secondary-foreground-disabled", skip_serializing_if = "Option::is_none")]
    pub button_secondary_foreground_disabled: Option<String>,
    #[serde(rename = "button-secondary-foreground-hover", skip_serializing_if = "Option::is_none")]
    pub button_secondary_foreground_hover: Option<String>,
    #[serde(rename = "button-social-background-default", skip_serializing_if = "Option::is_none")]
    pub button_social_background_default: Option<String>,
    #[serde(rename = "button-social-background-disabled", skip_serializing_if = "Option::is_none")]
    pub button_social_background_disabled: Option<String>,
    #[serde(rename = "button-social-background-generic-provider", skip_serializing_if = "Option::is_none")]
    pub button_social_background_generic_provider: Option<String>,
    #[serde(rename = "button-social-background-hover", skip_serializing_if = "Option::is_none")]
    pub button_social_background_hover: Option<String>,
    #[serde(rename = "button-social-border-default", skip_serializing_if = "Option::is_none")]
    pub button_social_border_default: Option<String>,
    #[serde(rename = "button-social-border-disabled", skip_serializing_if = "Option::is_none")]
    pub button_social_border_disabled: Option<String>,
    #[serde(rename = "button-social-border-generic-provider", skip_serializing_if = "Option::is_none")]
    pub button_social_border_generic_provider: Option<String>,
    #[serde(rename = "button-social-border-hover", skip_serializing_if = "Option::is_none")]
    pub button_social_border_hover: Option<String>,
    #[serde(rename = "button-social-foreground-default", skip_serializing_if = "Option::is_none")]
    pub button_social_foreground_default: Option<String>,
    #[serde(rename = "button-social-foreground-disabled", skip_serializing_if = "Option::is_none")]
    pub button_social_foreground_disabled: Option<String>,
    #[serde(rename = "button-social-foreground-generic-provider", skip_serializing_if = "Option::is_none")]
    pub button_social_foreground_generic_provider: Option<String>,
    #[serde(rename = "button-social-foreground-hover", skip_serializing_if = "Option::is_none")]
    pub button_social_foreground_hover: Option<String>,
    #[serde(rename = "checkbox-background-checked", skip_serializing_if = "Option::is_none")]
    pub checkbox_background_checked: Option<String>,
    #[serde(rename = "checkbox-background-default", skip_serializing_if = "Option::is_none")]
    pub checkbox_background_default: Option<String>,
    #[serde(rename = "checkbox-border-checkbox-border-checked", skip_serializing_if = "Option::is_none")]
    pub checkbox_border_checkbox_border_checked: Option<String>,
    #[serde(rename = "checkbox-border-checkbox-border-default", skip_serializing_if = "Option::is_none")]
    pub checkbox_border_checkbox_border_default: Option<String>,
    #[serde(rename = "checkbox-foreground-checked", skip_serializing_if = "Option::is_none")]
    pub checkbox_foreground_checked: Option<String>,
    #[serde(rename = "checkbox-foreground-default", skip_serializing_if = "Option::is_none")]
    pub checkbox_foreground_default: Option<String>,
    #[serde(rename = "form-background-default", skip_serializing_if = "Option::is_none")]
    pub form_background_default: Option<String>,
    #[serde(rename = "form-border-default", skip_serializing_if = "Option::is_none")]
    pub form_border_default: Option<String>,
    #[serde(rename = "input-background-default", skip_serializing_if = "Option::is_none")]
    pub input_background_default: Option<String>,
    #[serde(rename = "input-background-disabled", skip_serializing_if = "Option::is_none")]
    pub input_background_disabled: Option<String>,
    #[serde(rename = "input-background-hover", skip_serializing_if = "Option::is_none")]
    pub input_background_hover: Option<String>,
    #[serde(rename = "input-border-default", skip_serializing_if = "Option::is_none")]
    pub input_border_default: Option<String>,
    #[serde(rename = "input-border-disabled", skip_serializing_if = "Option::is_none")]
    pub input_border_disabled: Option<String>,
    #[serde(rename = "input-border-focus", skip_serializing_if = "Option::is_none")]
    pub input_border_focus: Option<String>,
    #[serde(rename = "input-border-hover", skip_serializing_if = "Option::is_none")]
    pub input_border_hover: Option<String>,
    #[serde(rename = "input-foreground-disabled", skip_serializing_if = "Option::is_none")]
    pub input_foreground_disabled: Option<String>,
    #[serde(rename = "input-foreground-primary", skip_serializing_if = "Option::is_none")]
    pub input_foreground_primary: Option<String>,
    #[serde(rename = "input-foreground-secondary", skip_serializing_if = "Option::is_none")]
    pub input_foreground_secondary: Option<String>,
    #[serde(rename = "input-foreground-tertiary", skip_serializing_if = "Option::is_none")]
    pub input_foreground_tertiary: Option<String>,
    #[serde(rename = "interface-background-brand-primary", skip_serializing_if = "Option::is_none")]
    pub interface_background_brand_primary: Option<String>,
    #[serde(rename = "interface-background-brand-primary-hover", skip_serializing_if = "Option::is_none")]
    pub interface_background_brand_primary_hover: Option<String>,
    #[serde(rename = "interface-background-brand-secondary", skip_serializing_if = "Option::is_none")]
    pub interface_background_brand_secondary: Option<String>,
    #[serde(rename = "interface-background-brand-secondary-hover", skip_serializing_if = "Option::is_none")]
    pub interface_background_brand_secondary_hover: Option<String>,
    #[serde(rename = "interface-background-default-inverted", skip_serializing_if = "Option::is_none")]
    pub interface_background_default_inverted: Option<String>,
    #[serde(rename = "interface-background-default-inverted-hover", skip_serializing_if = "Option::is_none")]
    pub interface_background_default_inverted_hover: Option<String>,
    #[serde(rename = "interface-background-default-none", skip_serializing_if = "Option::is_none")]
    pub interface_background_default_none: Option<String>,
    #[serde(rename = "interface-background-default-primary", skip_serializing_if = "Option::is_none")]
    pub interface_background_default_primary: Option<String>,
    #[serde(rename = "interface-background-default-primary-hover", skip_serializing_if = "Option::is_none")]
    pub interface_background_default_primary_hover: Option<String>,
    #[serde(rename = "interface-background-default-secondary", skip_serializing_if = "Option::is_none")]
    pub interface_background_default_secondary: Option<String>,
    #[serde(rename = "interface-background-default-secondary-hover", skip_serializing_if = "Option::is_none")]
    pub interface_background_default_secondary_hover: Option<String>,
    #[serde(rename = "interface-background-default-tertiary", skip_serializing_if = "Option::is_none")]
    pub interface_background_default_tertiary: Option<String>,
    #[serde(rename = "interface-background-default-tertiary-hover", skip_serializing_if = "Option::is_none")]
    pub interface_background_default_tertiary_hover: Option<String>,
    #[serde(rename = "interface-background-disabled-disabled", skip_serializing_if = "Option::is_none")]
    pub interface_background_disabled_disabled: Option<String>,
    #[serde(rename = "interface-background-validation-danger", skip_serializing_if = "Option::is_none")]
    pub interface_background_validation_danger: Option<String>,
    #[serde(rename = "interface-background-validation-success", skip_serializing_if = "Option::is_none")]
    pub interface_background_validation_success: Option<String>,
    #[serde(rename = "interface-background-validation-warning", skip_serializing_if = "Option::is_none")]
    pub interface_background_validation_warning: Option<String>,
    #[serde(rename = "interface-border-brand-brand", skip_serializing_if = "Option::is_none")]
    pub interface_border_brand_brand: Option<String>,
    #[serde(rename = "interface-border-default-inverted", skip_serializing_if = "Option::is_none")]
    pub interface_border_default_inverted: Option<String>,
    #[serde(rename = "interface-border-default-none", skip_serializing_if = "Option::is_none")]
    pub interface_border_default_none: Option<String>,
    #[serde(rename = "interface-border-default-primary", skip_serializing_if = "Option::is_none")]
    pub interface_border_default_primary: Option<String>,
    #[serde(rename = "interface-border-disabled-disabled", skip_serializing_if = "Option::is_none")]
    pub interface_border_disabled_disabled: Option<String>,
    #[serde(rename = "interface-border-validation-danger", skip_serializing_if = "Option::is_none")]
    pub interface_border_validation_danger: Option<String>,
    #[serde(rename = "interface-border-validation-success", skip_serializing_if = "Option::is_none")]
    pub interface_border_validation_success: Option<String>,
    #[serde(rename = "interface-border-validation-warning", skip_serializing_if = "Option::is_none")]
    pub interface_border_validation_warning: Option<String>,
    #[serde(rename = "interface-foreground-brand-on-primary", skip_serializing_if = "Option::is_none")]
    pub interface_foreground_brand_on_primary: Option<String>,
    #[serde(rename = "interface-foreground-brand-on-secondary", skip_serializing_if = "Option::is_none")]
    pub interface_foreground_brand_on_secondary: Option<String>,
    #[serde(rename = "interface-foreground-brand-primary", skip_serializing_if = "Option::is_none")]
    pub interface_foreground_brand_primary: Option<String>,
    #[serde(rename = "interface-foreground-brand-secondary", skip_serializing_if = "Option::is_none")]
    pub interface_foreground_brand_secondary: Option<String>,
    #[serde(rename = "interface-foreground-default-inverted", skip_serializing_if = "Option::is_none")]
    pub interface_foreground_default_inverted: Option<String>,
    #[serde(rename = "interface-foreground-default-primary", skip_serializing_if = "Option::is_none")]
    pub interface_foreground_default_primary: Option<String>,
    #[serde(rename = "interface-foreground-default-secondary", skip_serializing_if = "Option::is_none")]
    pub interface_foreground_default_secondary: Option<String>,
    #[serde(rename = "interface-foreground-default-tertiary", skip_serializing_if = "Option::is_none")]
    pub interface_foreground_default_tertiary: Option<String>,
    #[serde(rename = "interface-foreground-disabled-disabled", skip_serializing_if = "Option::is_none")]
    pub interface_foreground_disabled_disabled: Option<String>,
    #[serde(rename = "interface-foreground-disabled-on-disabled", skip_serializing_if = "Option::is_none")]
    pub interface_foreground_disabled_on_disabled: Option<String>,
    #[serde(rename = "interface-foreground-validation-danger", skip_serializing_if = "Option::is_none")]
    pub interface_foreground_validation_danger: Option<String>,
    #[serde(rename = "interface-foreground-validation-success", skip_serializing_if = "Option::is_none")]
    pub interface_foreground_validation_success: Option<String>,
    #[serde(rename = "interface-foreground-validation-warning", skip_serializing_if = "Option::is_none")]
    pub interface_foreground_validation_warning: Option<String>,
    #[serde(rename = "ory-background-default", skip_serializing_if = "Option::is_none")]
    pub ory_background_default: Option<String>,
    #[serde(rename = "ory-border-default", skip_serializing_if = "Option::is_none")]
    pub ory_border_default: Option<String>,
    #[serde(rename = "ory-foreground-default", skip_serializing_if = "Option::is_none")]
    pub ory_foreground_default: Option<String>,
    #[serde(rename = "radio-background-checked", skip_serializing_if = "Option::is_none")]
    pub radio_background_checked: Option<String>,
    #[serde(rename = "radio-background-default", skip_serializing_if = "Option::is_none")]
    pub radio_background_default: Option<String>,
    #[serde(rename = "radio-border-checked", skip_serializing_if = "Option::is_none")]
    pub radio_border_checked: Option<String>,
    #[serde(rename = "radio-border-default", skip_serializing_if = "Option::is_none")]
    pub radio_border_default: Option<String>,
    #[serde(rename = "radio-foreground-checked", skip_serializing_if = "Option::is_none")]
    pub radio_foreground_checked: Option<String>,
    #[serde(rename = "radio-foreground-default", skip_serializing_if = "Option::is_none")]
    pub radio_foreground_default: Option<String>,
    #[serde(rename = "toggle-background-checked", skip_serializing_if = "Option::is_none")]
    pub toggle_background_checked: Option<String>,
    #[serde(rename = "toggle-background-default", skip_serializing_if = "Option::is_none")]
    pub toggle_background_default: Option<String>,
    #[serde(rename = "toggle-border-checked", skip_serializing_if = "Option::is_none")]
    pub toggle_border_checked: Option<String>,
    #[serde(rename = "toggle-border-default", skip_serializing_if = "Option::is_none")]
    pub toggle_border_default: Option<String>,
    #[serde(rename = "toggle-foreground-checked", skip_serializing_if = "Option::is_none")]
    pub toggle_foreground_checked: Option<String>,
    #[serde(rename = "toggle-foreground-default", skip_serializing_if = "Option::is_none")]
    pub toggle_foreground_default: Option<String>,
}

impl AccountExperienceColors {
    pub fn new() -> AccountExperienceColors {
        AccountExperienceColors {
            button_identifier_background_default: None,
            button_identifier_background_hover: None,
            button_identifier_border_border_default: None,
            button_identifier_border_border_hover: None,
            button_identifier_foreground_default: None,
            button_identifier_foreground_hover: None,
            button_link_brand_brand: None,
            button_link_brand_brand_hover: None,
            button_link_default_primary: None,
            button_link_default_primary_hover: None,
            button_link_default_secondary: None,
            button_link_default_secondary_hover: None,
            button_link_disabled_disabled: None,
            button_primary_background_default: None,
            button_primary_background_disabled: None,
            button_primary_background_hover: None,
            button_primary_border_default: None,
            button_primary_border_disabled: None,
            button_primary_border_hover: None,
            button_primary_foreground_default: None,
            button_primary_foreground_disabled: None,
            button_primary_foreground_hover: None,
            button_secondary_background_default: None,
            button_secondary_background_disabled: None,
            button_secondary_background_hover: None,
            button_secondary_border_default: None,
            button_secondary_border_disabled: None,
            button_secondary_border_hover: None,
            button_secondary_foreground_default: None,
            button_secondary_foreground_disabled: None,
            button_secondary_foreground_hover: None,
            button_social_background_default: None,
            button_social_background_disabled: None,
            button_social_background_generic_provider: None,
            button_social_background_hover: None,
            button_social_border_default: None,
            button_social_border_disabled: None,
            button_social_border_generic_provider: None,
            button_social_border_hover: None,
            button_social_foreground_default: None,
            button_social_foreground_disabled: None,
            button_social_foreground_generic_provider: None,
            button_social_foreground_hover: None,
            checkbox_background_checked: None,
            checkbox_background_default: None,
            checkbox_border_checkbox_border_checked: None,
            checkbox_border_checkbox_border_default: None,
            checkbox_foreground_checked: None,
            checkbox_foreground_default: None,
            form_background_default: None,
            form_border_default: None,
            input_background_default: None,
            input_background_disabled: None,
            input_background_hover: None,
            input_border_default: None,
            input_border_disabled: None,
            input_border_focus: None,
            input_border_hover: None,
            input_foreground_disabled: None,
            input_foreground_primary: None,
            input_foreground_secondary: None,
            input_foreground_tertiary: None,
            interface_background_brand_primary: None,
            interface_background_brand_primary_hover: None,
            interface_background_brand_secondary: None,
            interface_background_brand_secondary_hover: None,
            interface_background_default_inverted: None,
            interface_background_default_inverted_hover: None,
            interface_background_default_none: None,
            interface_background_default_primary: None,
            interface_background_default_primary_hover: None,
            interface_background_default_secondary: None,
            interface_background_default_secondary_hover: None,
            interface_background_default_tertiary: None,
            interface_background_default_tertiary_hover: None,
            interface_background_disabled_disabled: None,
            interface_background_validation_danger: None,
            interface_background_validation_success: None,
            interface_background_validation_warning: None,
            interface_border_brand_brand: None,
            interface_border_default_inverted: None,
            interface_border_default_none: None,
            interface_border_default_primary: None,
            interface_border_disabled_disabled: None,
            interface_border_validation_danger: None,
            interface_border_validation_success: None,
            interface_border_validation_warning: None,
            interface_foreground_brand_on_primary: None,
            interface_foreground_brand_on_secondary: None,
            interface_foreground_brand_primary: None,
            interface_foreground_brand_secondary: None,
            interface_foreground_default_inverted: None,
            interface_foreground_default_primary: None,
            interface_foreground_default_secondary: None,
            interface_foreground_default_tertiary: None,
            interface_foreground_disabled_disabled: None,
            interface_foreground_disabled_on_disabled: None,
            interface_foreground_validation_danger: None,
            interface_foreground_validation_success: None,
            interface_foreground_validation_warning: None,
            ory_background_default: None,
            ory_border_default: None,
            ory_foreground_default: None,
            radio_background_checked: None,
            radio_background_default: None,
            radio_border_checked: None,
            radio_border_default: None,
            radio_foreground_checked: None,
            radio_foreground_default: None,
            toggle_background_checked: None,
            toggle_background_default: None,
            toggle_border_checked: None,
            toggle_border_default: None,
            toggle_foreground_checked: None,
            toggle_foreground_default: None,
        }
    }
}

