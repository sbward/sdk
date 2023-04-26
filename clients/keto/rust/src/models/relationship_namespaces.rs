/*
 * Ory Keto API
 *
 * Documentation for all of Ory Keto's REST APIs. gRPC is documented separately. 
 *
 * The version of the OpenAPI document: v0.11.0-alpha.0
 * Contact: hi@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// RelationshipNamespaces : Relationship Namespace List



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct RelationshipNamespaces {
    #[serde(rename = "namespaces", skip_serializing_if = "Option::is_none")]
    pub namespaces: Option<Vec<crate::models::Namespace>>,
}

impl Default for RelationshipNamespaces {
    fn default() -> Self {
        Self::new()
    }
}

impl RelationshipNamespaces {
    /// Relationship Namespace List
    pub fn new() -> RelationshipNamespaces {
        RelationshipNamespaces {
                namespaces: None,
        }
    }
}

