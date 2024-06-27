/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.12.1
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

use crate::models;

/// UpdateSettingsFlowBody : Update Settings Flow Request Body
#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
#[serde(tag = "method")]
pub enum UpdateSettingsFlowBody {
    #[serde(rename="password")]
    Password(Box<models::UpdateSettingsFlowWithPasswordMethod>),
    #[serde(rename="profile")]
    Profile(Box<models::UpdateSettingsFlowWithProfileMethod>),
    #[serde(rename="oidc")]
    Oidc(Box<models::UpdateSettingsFlowWithOidcMethod>),
    #[serde(rename="totp")]
    Totp(Box<models::UpdateSettingsFlowWithTotpMethod>),
    #[serde(rename="webauthn")]
    Webauthn(Box<models::UpdateSettingsFlowWithWebAuthnMethod>),
    #[serde(rename="lookup_secret")]
    LookupSecret(Box<models::UpdateSettingsFlowWithLookupMethod>),
    #[serde(rename="passkey")]
    Passkey(Box<models::UpdateSettingsFlowWithPasskeyMethod>),
}

impl Default for UpdateSettingsFlowBody {
    fn default() -> Self {
        Self::Password(Default::default())
    }
}


