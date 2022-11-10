/*
 * Ory Hydra API
 *
 * Documentation for all of Ory Hydra's APIs. 
 *
 * The version of the OpenAPI document: v2.0.2
 * Contact: hi@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// JsonWebKeySet : JSON Web Key Set



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct JsonWebKeySet {
    /// List of JSON Web Keys  The value of the \"keys\" parameter is an array of JSON Web Key (JWK) values. By default, the order of the JWK values within the array does not imply an order of preference among them, although applications of JWK Sets can choose to assign a meaning to the order for their purposes, if desired.
    #[serde(rename = "keys", skip_serializing_if = "Option::is_none")]
    pub keys: Option<Vec<crate::models::JsonWebKey>>,
}

impl Default for JsonWebKeySet {
    fn default() -> Self {
        Self::new()
    }
}

impl JsonWebKeySet {
    /// JSON Web Key Set
    pub fn new() -> JsonWebKeySet {
        JsonWebKeySet {
                keys: None,
        }
    }
}


