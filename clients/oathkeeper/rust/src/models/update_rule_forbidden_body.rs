/*
 * ORY Oathkeeper
 *
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.0.0-alpha.47
 * Contact: hi@ory.am
 * Generated by: https://openapi-generator.tech
 */

/// UpdateRuleForbiddenBody : UpdateRuleForbiddenBody UpdateRuleForbiddenBody UpdateRuleForbiddenBody UpdateRuleForbiddenBody UpdateRuleForbiddenBody UpdateRuleForbiddenBody UpdateRuleForbiddenBody update rule forbidden body



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct UpdateRuleForbiddenBody {
    /// code
    #[serde(rename = "code", skip_serializing_if = "Option::is_none")]
    pub code: Option<i64>,
    /// details
    #[serde(rename = "details", skip_serializing_if = "Option::is_none")]
    pub details: Option<Vec<serde_json::Value>>,
    /// message
    #[serde(rename = "message", skip_serializing_if = "Option::is_none")]
    pub message: Option<String>,
    /// reason
    #[serde(rename = "reason", skip_serializing_if = "Option::is_none")]
    pub reason: Option<String>,
    /// request
    #[serde(rename = "request", skip_serializing_if = "Option::is_none")]
    pub request: Option<String>,
    /// status
    #[serde(rename = "status", skip_serializing_if = "Option::is_none")]
    pub status: Option<String>,
}

impl UpdateRuleForbiddenBody {
    /// UpdateRuleForbiddenBody UpdateRuleForbiddenBody UpdateRuleForbiddenBody UpdateRuleForbiddenBody UpdateRuleForbiddenBody UpdateRuleForbiddenBody UpdateRuleForbiddenBody update rule forbidden body
    pub fn new() -> UpdateRuleForbiddenBody {
        UpdateRuleForbiddenBody {
            code: None,
            details: None,
            message: None,
            reason: None,
            request: None,
            status: None,
        }
    }
}


