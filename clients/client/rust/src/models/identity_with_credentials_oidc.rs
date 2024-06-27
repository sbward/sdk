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

/// IdentityWithCredentialsOidc : Create Identity and Import Social Sign In Credentials
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct IdentityWithCredentialsOidc {
    #[serde(rename = "config", skip_serializing_if = "Option::is_none")]
    pub config: Option<Box<models::IdentityWithCredentialsOidcConfig>>,
}

impl IdentityWithCredentialsOidc {
    /// Create Identity and Import Social Sign In Credentials
    pub fn new() -> IdentityWithCredentialsOidc {
        IdentityWithCredentialsOidc {
            config: None,
        }
    }
}

