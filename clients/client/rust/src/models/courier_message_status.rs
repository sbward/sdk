/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.19
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// CourierMessageStatus : A Message's Status

/// A Message's Status
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum CourierMessageStatus {
    #[serde(rename = "queued")]
    Queued,
    #[serde(rename = "sent")]
    Sent,
    #[serde(rename = "processing")]
    Processing,
    #[serde(rename = "abandoned")]
    Abandoned,

}

impl ToString for CourierMessageStatus {
    fn to_string(&self) -> String {
        match self {
            Self::Queued => String::from("queued"),
            Self::Sent => String::from("sent"),
            Self::Processing => String::from("processing"),
            Self::Abandoned => String::from("abandoned"),
        }
    }
}




