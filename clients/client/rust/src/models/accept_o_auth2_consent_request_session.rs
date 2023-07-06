/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.41
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct AcceptOAuth2ConsentRequestSession {
    /// AccessToken sets session data for the access and refresh token, as well as any future tokens issued by the refresh grant. Keep in mind that this data will be available to anyone performing OAuth 2.0 Challenge Introspection. If only your services can perform OAuth 2.0 Challenge Introspection, this is usually fine. But if third parties can access that endpoint as well, sensitive data from the session might be exposed to them. Use with care!
    #[serde(rename = "access_token", skip_serializing_if = "Option::is_none")]
    pub access_token: Option<serde_json::Value>,
    /// IDToken sets session data for the OpenID Connect ID token. Keep in mind that the session'id payloads are readable by anyone that has access to the ID Challenge. Use with care!
    #[serde(rename = "id_token", skip_serializing_if = "Option::is_none")]
    pub id_token: Option<serde_json::Value>,
}

impl Default for AcceptOAuth2ConsentRequestSession {
    fn default() -> Self {
        Self::new()
    }
}

impl AcceptOAuth2ConsentRequestSession {
    pub fn new() -> AcceptOAuth2ConsentRequestSession {
        AcceptOAuth2ConsentRequestSession {
                access_token: None,
                id_token: None,
        }
    }
}


