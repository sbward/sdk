/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.179
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */


use reqwest;

use crate::apis::ResponseContent;
use super::{Error, configuration};


/// struct for typed errors of method `create_relation_tuple`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum CreateRelationTupleError {
    Status400(crate::models::GenericError),
    Status500(crate::models::GenericError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `delete_relation_tuples`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DeleteRelationTuplesError {
    Status400(crate::models::GenericError),
    Status500(crate::models::GenericError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `patch_relation_tuples`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum PatchRelationTuplesError {
    Status400(crate::models::GenericError),
    Status404(crate::models::GenericError),
    Status500(crate::models::GenericError),
    UnknownValue(serde_json::Value),
}


/// Use this endpoint to create a relation tuple.
pub async fn create_relation_tuple(configuration: &configuration::Configuration, relation_query: Option<crate::models::RelationQuery>) -> Result<crate::models::RelationQuery, Error<CreateRelationTupleError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/admin/relation-tuples", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::PUT, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    local_var_req_builder = local_var_req_builder.json(&relation_query);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<CreateRelationTupleError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Use this endpoint to delete relation tuples
pub async fn delete_relation_tuples(configuration: &configuration::Configuration, namespace: Option<&str>, object: Option<&str>, relation: Option<&str>, subject_id: Option<&str>, subject_set_namespace: Option<&str>, subject_set_object: Option<&str>, subject_set_relation: Option<&str>) -> Result<(), Error<DeleteRelationTuplesError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/admin/relation-tuples", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::DELETE, local_var_uri_str.as_str());

    if let Some(ref local_var_str) = namespace {
        local_var_req_builder = local_var_req_builder.query(&[("namespace", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = object {
        local_var_req_builder = local_var_req_builder.query(&[("object", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = relation {
        local_var_req_builder = local_var_req_builder.query(&[("relation", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = subject_id {
        local_var_req_builder = local_var_req_builder.query(&[("subject_id", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = subject_set_namespace {
        local_var_req_builder = local_var_req_builder.query(&[("subject_set.namespace", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = subject_set_object {
        local_var_req_builder = local_var_req_builder.query(&[("subject_set.object", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_str) = subject_set_relation {
        local_var_req_builder = local_var_req_builder.query(&[("subject_set.relation", &local_var_str.to_string())]);
    }
    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        Ok(())
    } else {
        let local_var_entity: Option<DeleteRelationTuplesError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Use this endpoint to patch one or more relation tuples.
pub async fn patch_relation_tuples(configuration: &configuration::Configuration, patch_delta: Option<Vec<crate::models::PatchDelta>>) -> Result<(), Error<PatchRelationTuplesError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/admin/relation-tuples", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::PATCH, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    local_var_req_builder = local_var_req_builder.json(&patch_delta);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        Ok(())
    } else {
        let local_var_entity: Option<PatchRelationTuplesError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}
