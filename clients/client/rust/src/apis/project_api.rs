/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.0
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 */


use std::fmt::Display;

use num_traits;
use reqwest;

use crate::apis::ResponseContent;
use super::{Error, configuration};

trait NumVecJoin {
    fn join(&self, sep: &str) -> String;
}

impl <T: Display + num_traits::Num> NumVecJoin for Vec<T> {
    fn join(&self, sep: &str) -> String {
        self.iter()
            .map(ToString::to_string)
            .collect::<Vec<String>>()
            .join(sep)
    }
}


/// struct for typed errors of method `create_project`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum CreateProjectError {
    Status401(crate::models::ErrorGeneric),
    Status403(crate::models::ErrorGeneric),
    Status404(crate::models::ErrorGeneric),
    DefaultResponse(crate::models::ErrorGeneric),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `create_project_api_key`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum CreateProjectApiKeyError {
    DefaultResponse(crate::models::ErrorGeneric),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `delete_project_api_key`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum DeleteProjectApiKeyError {
    DefaultResponse(crate::models::ErrorGeneric),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `get_active_project_in_console`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetActiveProjectInConsoleError {
    Status401(crate::models::GenericError),
    DefaultResponse(crate::models::GenericError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `get_project`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetProjectError {
    Status401(crate::models::ErrorGeneric),
    Status403(crate::models::ErrorGeneric),
    Status404(crate::models::ErrorGeneric),
    DefaultResponse(crate::models::ErrorGeneric),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `get_project_members`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum GetProjectMembersError {
    Status401(crate::models::GenericError),
    Status406(crate::models::GenericError),
    DefaultResponse(crate::models::GenericError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `list_project_api_keys`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ListProjectApiKeysError {
    DefaultResponse(crate::models::ErrorGeneric),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `list_projects`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ListProjectsError {
    Status401(crate::models::ErrorGeneric),
    Status403(crate::models::ErrorGeneric),
    Status404(crate::models::ErrorGeneric),
    DefaultResponse(crate::models::ErrorGeneric),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `patch_project`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum PatchProjectError {
    Status400(crate::models::ErrorGeneric),
    Status401(crate::models::ErrorGeneric),
    Status403(crate::models::ErrorGeneric),
    Status404(crate::models::ErrorGeneric),
    DefaultResponse(crate::models::ErrorGeneric),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `purge_project`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum PurgeProjectError {
    Status401(crate::models::GenericError),
    Status403(crate::models::GenericError),
    Status404(crate::models::GenericError),
    DefaultResponse(crate::models::GenericError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `remove_project_member`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum RemoveProjectMemberError {
    Status401(crate::models::GenericError),
    Status406(crate::models::GenericError),
    DefaultResponse(crate::models::GenericError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `set_active_project_in_console`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum SetActiveProjectInConsoleError {
    Status401(crate::models::GenericError),
    DefaultResponse(crate::models::GenericError),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method `set_project`
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum SetProjectError {
    Status400(crate::models::ErrorGeneric),
    Status401(crate::models::ErrorGeneric),
    Status403(crate::models::ErrorGeneric),
    Status404(crate::models::ErrorGeneric),
    DefaultResponse(crate::models::ErrorGeneric),
    UnknownValue(serde_json::Value),
}


/// Creates a new project.
pub async fn create_project(configuration: &configuration::Configuration, create_project_body: Option<&crate::models::CreateProjectBody>) -> Result<crate::models::Project, Error<CreateProjectError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/projects", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    local_var_req_builder = local_var_req_builder.json(&create_project_body);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<CreateProjectError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Create an API token for a project.
pub async fn create_project_api_key(configuration: &configuration::Configuration, project: &str, create_project_api_key_request: Option<&crate::models::CreateProjectApiKeyRequest>) -> Result<crate::models::ProjectApiKey, Error<CreateProjectApiKeyError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/projects/{project}/tokens", configuration.base_path, project=crate::apis::urlencode(project));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    local_var_req_builder = local_var_req_builder.json(&create_project_api_key_request);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<CreateProjectApiKeyError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Deletes an API token and immediately removes it.
pub async fn delete_project_api_key(configuration: &configuration::Configuration, project: &str, token_id: &str) -> Result<(), Error<DeleteProjectApiKeyError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/projects/{project}/tokens/{token_id}", configuration.base_path, project=crate::apis::urlencode(project), token_id=crate::apis::urlencode(token_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::DELETE, local_var_uri_str.as_str());

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
        let local_var_entity: Option<DeleteProjectApiKeyError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Use this API to get your active project in the Ory Network Console UI.
pub async fn get_active_project_in_console(configuration: &configuration::Configuration, ) -> Result<crate::models::ActiveProjectInConsole, Error<GetActiveProjectInConsoleError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/console/active/project", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

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
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<GetActiveProjectInConsoleError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Get a projects you have access to by its ID.
pub async fn get_project(configuration: &configuration::Configuration, project_id: &str) -> Result<crate::models::Project, Error<GetProjectError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/projects/{project_id}", configuration.base_path, project_id=crate::apis::urlencode(project_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

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
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<GetProjectError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// This endpoint requires the user to be a member of the project with the role `OWNER` or `DEVELOPER`.
pub async fn get_project_members(configuration: &configuration::Configuration, project_id: &str) -> Result<Vec<crate::models::CloudAccount>, Error<GetProjectMembersError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/projects/{project_id}/members", configuration.base_path, project_id=crate::apis::urlencode(project_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

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
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<GetProjectMembersError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// A list of all the project's API tokens.
pub async fn list_project_api_keys(configuration: &configuration::Configuration, project: &str) -> Result<Vec<crate::models::ProjectApiKey>, Error<ListProjectApiKeysError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/projects/{project}/tokens", configuration.base_path, project=crate::apis::urlencode(project));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

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
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<ListProjectApiKeysError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Lists all projects you have access to.
pub async fn list_projects(configuration: &configuration::Configuration, ) -> Result<Vec<crate::models::ProjectMetadata>, Error<ListProjectsError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/projects", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::GET, local_var_uri_str.as_str());

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
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<ListProjectsError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Deprecated: Use the `patchProjectWithRevision` endpoint instead to specify the exact revision the patch was generated for.  This endpoints allows you to patch individual Ory Network project configuration keys for Ory's services (identity, permission, ...). The configuration format is fully compatible with the open source projects for the respective services (e.g. Ory Kratos for Identity, Ory Keto for Permissions).  This endpoint expects the `version` key to be set in the payload. If it is unset, it will try to import the config as if it is from the most recent version.  If you have an older version of a configuration, you should set the version key in the payload!  While this endpoint is able to process all configuration items related to features (e.g. password reset), it does not support operational configuration items (e.g. port, tracing, logging) otherwise available in the open source.  For configuration items that can not be translated to the Ory Network, this endpoint will return a list of warnings to help you understand which parts of your config could not be processed.
pub async fn patch_project(configuration: &configuration::Configuration, project_id: &str, json_patch: Option<Vec<crate::models::JsonPatch>>) -> Result<crate::models::SuccessfulProjectUpdate, Error<PatchProjectError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/projects/{project_id}", configuration.base_path, project_id=crate::apis::urlencode(project_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::PATCH, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    local_var_req_builder = local_var_req_builder.json(&json_patch);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<PatchProjectError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// !! Use with extreme caution !!  Using this API endpoint you can purge (completely delete) a project and its data. This action can not be undone and will delete ALL your data.  !! Use with extreme caution !!
pub async fn purge_project(configuration: &configuration::Configuration, project_id: &str) -> Result<(), Error<PurgeProjectError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/projects/{project_id}", configuration.base_path, project_id=crate::apis::urlencode(project_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::DELETE, local_var_uri_str.as_str());

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
        let local_var_entity: Option<PurgeProjectError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// This also sets their invite status to `REMOVED`. This endpoint requires the user to be a member of the project with the role `OWNER`.
pub async fn remove_project_member(configuration: &configuration::Configuration, project_id: &str, member_id: &str) -> Result<(), Error<RemoveProjectMemberError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/projects/{project_id}/members/{member_id}", configuration.base_path, project_id=crate::apis::urlencode(project_id), member_id=crate::apis::urlencode(member_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::DELETE, local_var_uri_str.as_str());

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
        let local_var_entity: Option<RemoveProjectMemberError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Use this API to set your active project in the Ory Network Console UI.
pub async fn set_active_project_in_console(configuration: &configuration::Configuration, set_active_project_in_console_body: Option<&crate::models::SetActiveProjectInConsoleBody>) -> Result<(), Error<SetActiveProjectInConsoleError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/console/active/project", configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::PUT, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    local_var_req_builder = local_var_req_builder.json(&set_active_project_in_console_body);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        Ok(())
    } else {
        let local_var_entity: Option<SetActiveProjectInConsoleError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// This endpoints allows you to update the Ory Network project configuration for individual services (identity, permission, ...). The configuration is fully compatible with the open source projects for the respective services (e.g. Ory Kratos for Identity, Ory Keto for Permissions).  This endpoint expects the `version` key to be set in the payload. If it is unset, it will try to import the config as if it is from the most recent version.  If you have an older version of a configuration, you should set the version key in the payload!  While this endpoint is able to process all configuration items related to features (e.g. password reset), it does not support operational configuration items (e.g. port, tracing, logging) otherwise available in the open source.  For configuration items that can not be translated to the Ory Network, this endpoint will return a list of warnings to help you understand which parts of your config could not be processed.  Be aware that updating any service's configuration will completely override your current configuration for that service!
pub async fn set_project(configuration: &configuration::Configuration, project_id: &str, set_project: Option<&crate::models::SetProject>) -> Result<crate::models::SuccessfulProjectUpdate, Error<SetProjectError>> {

    let local_var_client = &configuration.client;

    let local_var_uri_str = format!("{}/projects/{project_id}", configuration.base_path, project_id=crate::apis::urlencode(project_id));
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::PUT, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_token) = configuration.bearer_access_token {
        local_var_req_builder = local_var_req_builder.bearer_auth(local_var_token.to_owned());
    };
    local_var_req_builder = local_var_req_builder.json(&set_project);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<SetProjectError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}
