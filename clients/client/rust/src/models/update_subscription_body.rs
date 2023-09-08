/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.2.3
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */

/// UpdateSubscriptionBody : Update Subscription Request Body



#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct UpdateSubscriptionBody {
    ///  monthly Monthly yearly Yearly
    #[serde(rename = "interval")]
    pub interval: IntervalEnum,
    #[serde(rename = "plan")]
    pub plan: String,
    #[serde(rename = "return_to", skip_serializing_if = "Option::is_none")]
    pub return_to: Option<String>,
}


impl UpdateSubscriptionBody {
    /// Update Subscription Request Body
    pub fn new(interval: IntervalEnum, plan: String) -> UpdateSubscriptionBody {
        UpdateSubscriptionBody {
                interval,
                plan,
                return_to: None,
        }
    }
}

///  monthly Monthly yearly Yearly
#[derive(Clone, Copy, Debug, Eq, PartialEq, Ord, PartialOrd, Hash, Serialize, Deserialize)]
pub enum IntervalEnum {
    #[serde(rename = "monthly")]
    Monthly,
    #[serde(rename = "yearly")]
    Yearly,
}

