/*
 * Ory Hydra API
 *
 * Documentation for all of Ory Hydra's APIs. 
 *
 * The version of the OpenAPI document: v2.4.0-alpha.1
 * Contact: hi@ory.sh
 * Generated by: https://openapi-generator.tech
 */

use crate::models;
use serde::{Deserialize, Serialize};

/// TrustedOAuth2JwtGrantIssuer : OAuth2 JWT Bearer Grant Type Issuer Trust Relationship
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct TrustedOAuth2JwtGrantIssuer {
    /// The \"allow_any_subject\" indicates that the issuer is allowed to have any principal as the subject of the JWT.
    #[serde(rename = "allow_any_subject", skip_serializing_if = "Option::is_none")]
    pub allow_any_subject: Option<bool>,
    /// The \"created_at\" indicates, when grant was created.
    #[serde(rename = "created_at", skip_serializing_if = "Option::is_none")]
    pub created_at: Option<String>,
    /// The \"expires_at\" indicates, when grant will expire, so we will reject assertion from \"issuer\" targeting \"subject\".
    #[serde(rename = "expires_at", skip_serializing_if = "Option::is_none")]
    pub expires_at: Option<String>,
    #[serde(rename = "id", skip_serializing_if = "Option::is_none")]
    pub id: Option<String>,
    /// The \"issuer\" identifies the principal that issued the JWT assertion (same as \"iss\" claim in JWT).
    #[serde(rename = "issuer", skip_serializing_if = "Option::is_none")]
    pub issuer: Option<String>,
    #[serde(rename = "public_key", skip_serializing_if = "Option::is_none")]
    pub public_key: Option<Box<models::TrustedOAuth2JwtGrantJsonWebKey>>,
    /// The \"scope\" contains list of scope values (as described in Section 3.3 of OAuth 2.0 [RFC6749])
    #[serde(rename = "scope", skip_serializing_if = "Option::is_none")]
    pub scope: Option<Vec<String>>,
    /// The \"subject\" identifies the principal that is the subject of the JWT.
    #[serde(rename = "subject", skip_serializing_if = "Option::is_none")]
    pub subject: Option<String>,
}

impl TrustedOAuth2JwtGrantIssuer {
    /// OAuth2 JWT Bearer Grant Type Issuer Trust Relationship
    pub fn new() -> TrustedOAuth2JwtGrantIssuer {
        TrustedOAuth2JwtGrantIssuer {
            allow_any_subject: None,
            created_at: None,
            expires_at: None,
            id: None,
            issuer: None,
            public_key: None,
            scope: None,
            subject: None,
        }
    }
}

