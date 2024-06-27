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

/// CreateProjectMemberInviteBody : Create Project MemberInvite Request Body
#[derive(Clone, Default, Debug, PartialEq, Serialize, Deserialize)]
pub struct CreateProjectMemberInviteBody {
    /// A email to invite
    #[serde(rename = "invitee_email", skip_serializing_if = "Option::is_none")]
    pub invitee_email: Option<String>,
}

impl CreateProjectMemberInviteBody {
    /// Create Project MemberInvite Request Body
    pub fn new() -> CreateProjectMemberInviteBody {
        CreateProjectMemberInviteBody {
            invitee_email: None,
        }
    }
}

