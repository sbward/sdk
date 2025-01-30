# NOTE: This file is auto generated by OpenAPI Generator 7.7.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.CreateProjectNormalizedPayload do
  @moduledoc """
  Create project (normalized) request payload
  """

  @derive Jason.Encoder
  defstruct [
    :account_experience_favicon_dark,
    :account_experience_favicon_light,
    :account_experience_logo_dark,
    :account_experience_logo_light,
    :account_experience_theme_variables_dark,
    :account_experience_theme_variables_light,
    :created_at,
    :disable_account_experience_welcome_screen,
    :enable_ax_v2,
    :environment,
    :home_region,
    :hydra_oauth2_allowed_top_level_claims,
    :hydra_oauth2_client_credentials_default_grant_allowed_scope,
    :hydra_oauth2_exclude_not_before_claim,
    :hydra_oauth2_grant_jwt_iat_optional,
    :hydra_oauth2_grant_jwt_jti_optional,
    :hydra_oauth2_grant_jwt_max_ttl,
    :hydra_oauth2_grant_refresh_token_rotation_grace_period,
    :hydra_oauth2_mirror_top_level_claims,
    :hydra_oauth2_pkce_enforced,
    :hydra_oauth2_pkce_enforced_for_public_clients,
    :hydra_oauth2_refresh_token_hook,
    :hydra_oauth2_token_hook,
    :hydra_oidc_dynamic_client_registration_default_scope,
    :hydra_oidc_dynamic_client_registration_enabled,
    :hydra_oidc_subject_identifiers_pairwise_salt,
    :hydra_oidc_subject_identifiers_supported_types,
    :hydra_secrets_cookie,
    :hydra_secrets_system,
    :hydra_serve_cookies_same_site_legacy_workaround,
    :hydra_serve_cookies_same_site_mode,
    :hydra_strategies_access_token,
    :hydra_strategies_jwt_scope_claim,
    :hydra_strategies_scope,
    :hydra_ttl_access_token,
    :hydra_ttl_auth_code,
    :hydra_ttl_id_token,
    :hydra_ttl_login_consent_request,
    :hydra_ttl_refresh_token,
    :hydra_urls_consent,
    :hydra_urls_error,
    :hydra_urls_login,
    :hydra_urls_logout,
    :hydra_urls_post_logout_redirect,
    :hydra_urls_registration,
    :hydra_urls_self_issuer,
    :hydra_webfinger_jwks_broadcast_keys,
    :hydra_webfinger_oidc_discovery_auth_url,
    :hydra_webfinger_oidc_discovery_client_registration_url,
    :hydra_webfinger_oidc_discovery_jwks_url,
    :hydra_webfinger_oidc_discovery_supported_claims,
    :hydra_webfinger_oidc_discovery_supported_scope,
    :hydra_webfinger_oidc_discovery_token_url,
    :hydra_webfinger_oidc_discovery_userinfo_url,
    :id,
    :keto_namespace_configuration,
    :keto_namespaces,
    :kratos_cookies_same_site,
    :kratos_courier_channels,
    :kratos_courier_delivery_strategy,
    :kratos_courier_http_request_config_auth_api_key_in,
    :kratos_courier_http_request_config_auth_api_key_name,
    :kratos_courier_http_request_config_auth_api_key_value,
    :kratos_courier_http_request_config_auth_basic_auth_password,
    :kratos_courier_http_request_config_auth_basic_auth_user,
    :kratos_courier_http_request_config_auth_type,
    :kratos_courier_http_request_config_body,
    :kratos_courier_http_request_config_headers,
    :kratos_courier_http_request_config_method,
    :kratos_courier_http_request_config_url,
    :kratos_courier_smtp_connection_uri,
    :kratos_courier_smtp_from_address,
    :kratos_courier_smtp_from_name,
    :kratos_courier_smtp_headers,
    :kratos_courier_smtp_local_name,
    :kratos_courier_templates_login_code_valid_email_body_html,
    :kratos_courier_templates_login_code_valid_email_body_plaintext,
    :kratos_courier_templates_login_code_valid_email_subject,
    :kratos_courier_templates_login_code_valid_sms_body_plaintext,
    :kratos_courier_templates_recovery_code_invalid_email_body_html,
    :kratos_courier_templates_recovery_code_invalid_email_body_plaintext,
    :kratos_courier_templates_recovery_code_invalid_email_subject,
    :kratos_courier_templates_recovery_code_valid_email_body_html,
    :kratos_courier_templates_recovery_code_valid_email_body_plaintext,
    :kratos_courier_templates_recovery_code_valid_email_subject,
    :kratos_courier_templates_recovery_invalid_email_body_html,
    :kratos_courier_templates_recovery_invalid_email_body_plaintext,
    :kratos_courier_templates_recovery_invalid_email_subject,
    :kratos_courier_templates_recovery_valid_email_body_html,
    :kratos_courier_templates_recovery_valid_email_body_plaintext,
    :kratos_courier_templates_recovery_valid_email_subject,
    :kratos_courier_templates_registration_code_valid_email_body_html,
    :kratos_courier_templates_registration_code_valid_email_body_plaintext,
    :kratos_courier_templates_registration_code_valid_email_subject,
    :kratos_courier_templates_registration_code_valid_sms_body_plaintext,
    :kratos_courier_templates_verification_code_invalid_email_body_html,
    :kratos_courier_templates_verification_code_invalid_email_body_plaintext,
    :kratos_courier_templates_verification_code_invalid_email_subject,
    :kratos_courier_templates_verification_code_valid_email_body_html,
    :kratos_courier_templates_verification_code_valid_email_body_plaintext,
    :kratos_courier_templates_verification_code_valid_email_subject,
    :kratos_courier_templates_verification_code_valid_sms_body_plaintext,
    :kratos_courier_templates_verification_invalid_email_body_html,
    :kratos_courier_templates_verification_invalid_email_body_plaintext,
    :kratos_courier_templates_verification_invalid_email_subject,
    :kratos_courier_templates_verification_valid_email_body_html,
    :kratos_courier_templates_verification_valid_email_body_plaintext,
    :kratos_courier_templates_verification_valid_email_subject,
    :kratos_feature_flags_cacheable_sessions,
    :kratos_feature_flags_cacheable_sessions_max_age,
    :kratos_feature_flags_faster_session_extend,
    :kratos_feature_flags_use_continue_with_transitions,
    :kratos_identity_schemas,
    :kratos_oauth2_provider_headers,
    :kratos_oauth2_provider_override_return_to,
    :kratos_oauth2_provider_url,
    :kratos_preview_default_read_consistency_level,
    :kratos_secrets_cipher,
    :kratos_secrets_cookie,
    :kratos_secrets_default,
    :kratos_selfservice_allowed_return_urls,
    :kratos_selfservice_default_browser_return_url,
    :kratos_selfservice_flows_error_ui_url,
    :kratos_selfservice_flows_login_after_code_default_browser_return_url,
    :kratos_selfservice_flows_login_after_default_browser_return_url,
    :kratos_selfservice_flows_login_after_lookup_secret_default_browser_return_url,
    :kratos_selfservice_flows_login_after_oidc_default_browser_return_url,
    :kratos_selfservice_flows_login_after_passkey_default_browser_return_url,
    :kratos_selfservice_flows_login_after_password_default_browser_return_url,
    :kratos_selfservice_flows_login_after_totp_default_browser_return_url,
    :kratos_selfservice_flows_login_after_webauthn_default_browser_return_url,
    :kratos_selfservice_flows_login_lifespan,
    :kratos_selfservice_flows_login_ui_url,
    :kratos_selfservice_flows_logout_after_default_browser_return_url,
    :kratos_selfservice_flows_recovery_after_default_browser_return_url,
    :kratos_selfservice_flows_recovery_enabled,
    :kratos_selfservice_flows_recovery_lifespan,
    :kratos_selfservice_flows_recovery_notify_unknown_recipients,
    :kratos_selfservice_flows_recovery_ui_url,
    :kratos_selfservice_flows_recovery_use,
    :kratos_selfservice_flows_registration_after_code_default_browser_return_url,
    :kratos_selfservice_flows_registration_after_default_browser_return_url,
    :kratos_selfservice_flows_registration_after_oidc_default_browser_return_url,
    :kratos_selfservice_flows_registration_after_passkey_default_browser_return_url,
    :kratos_selfservice_flows_registration_after_password_default_browser_return_url,
    :kratos_selfservice_flows_registration_after_webauthn_default_browser_return_url,
    :kratos_selfservice_flows_registration_enable_legacy_one_step,
    :kratos_selfservice_flows_registration_enabled,
    :kratos_selfservice_flows_registration_lifespan,
    :kratos_selfservice_flows_registration_login_hints,
    :kratos_selfservice_flows_registration_ui_url,
    :kratos_selfservice_flows_settings_after_default_browser_return_url,
    :kratos_selfservice_flows_settings_after_lookup_secret_default_browser_return_url,
    :kratos_selfservice_flows_settings_after_oidc_default_browser_return_url,
    :kratos_selfservice_flows_settings_after_passkey_default_browser_return_url,
    :kratos_selfservice_flows_settings_after_password_default_browser_return_url,
    :kratos_selfservice_flows_settings_after_profile_default_browser_return_url,
    :kratos_selfservice_flows_settings_after_totp_default_browser_return_url,
    :kratos_selfservice_flows_settings_after_webauthn_default_browser_return_url,
    :kratos_selfservice_flows_settings_lifespan,
    :kratos_selfservice_flows_settings_privileged_session_max_age,
    :kratos_selfservice_flows_settings_required_aal,
    :kratos_selfservice_flows_settings_ui_url,
    :kratos_selfservice_flows_verification_after_default_browser_return_url,
    :kratos_selfservice_flows_verification_enabled,
    :kratos_selfservice_flows_verification_lifespan,
    :kratos_selfservice_flows_verification_notify_unknown_recipients,
    :kratos_selfservice_flows_verification_ui_url,
    :kratos_selfservice_flows_verification_use,
    :kratos_selfservice_methods_code_config_lifespan,
    :kratos_selfservice_methods_code_config_missing_credential_fallback_enabled,
    :kratos_selfservice_methods_code_enabled,
    :kratos_selfservice_methods_code_mfa_enabled,
    :kratos_selfservice_methods_code_passwordless_enabled,
    :kratos_selfservice_methods_code_passwordless_login_fallback_enabled,
    :kratos_selfservice_methods_link_config_base_url,
    :kratos_selfservice_methods_link_config_lifespan,
    :kratos_selfservice_methods_link_enabled,
    :kratos_selfservice_methods_lookup_secret_enabled,
    :kratos_selfservice_methods_oidc_config_base_redirect_uri,
    :kratos_selfservice_methods_oidc_config_providers,
    :kratos_selfservice_methods_oidc_enabled,
    :kratos_selfservice_methods_passkey_config_rp_display_name,
    :kratos_selfservice_methods_passkey_config_rp_id,
    :kratos_selfservice_methods_passkey_config_rp_origins,
    :kratos_selfservice_methods_passkey_enabled,
    :kratos_selfservice_methods_password_config_haveibeenpwned_enabled,
    :kratos_selfservice_methods_password_config_identifier_similarity_check_enabled,
    :kratos_selfservice_methods_password_config_ignore_network_errors,
    :kratos_selfservice_methods_password_config_max_breaches,
    :kratos_selfservice_methods_password_config_min_password_length,
    :kratos_selfservice_methods_password_enabled,
    :kratos_selfservice_methods_profile_enabled,
    :kratos_selfservice_methods_saml_config_providers,
    :kratos_selfservice_methods_saml_enabled,
    :kratos_selfservice_methods_totp_config_issuer,
    :kratos_selfservice_methods_totp_enabled,
    :kratos_selfservice_methods_webauthn_config_passwordless,
    :kratos_selfservice_methods_webauthn_config_rp_display_name,
    :kratos_selfservice_methods_webauthn_config_rp_icon,
    :kratos_selfservice_methods_webauthn_config_rp_id,
    :kratos_selfservice_methods_webauthn_config_rp_origins,
    :kratos_selfservice_methods_webauthn_enabled,
    :kratos_session_cookie_persistent,
    :kratos_session_cookie_same_site,
    :kratos_session_lifespan,
    :kratos_session_whoami_required_aal,
    :kratos_session_whoami_tokenizer_templates,
    :name,
    :project_id,
    :project_revision_hooks,
    :serve_admin_cors_allowed_origins,
    :serve_admin_cors_enabled,
    :serve_public_cors_allowed_origins,
    :serve_public_cors_enabled,
    :strict_security,
    :updated_at,
    :workspace_id
  ]

  @type t :: %__MODULE__{
    :account_experience_favicon_dark => String.t | nil,
    :account_experience_favicon_light => String.t | nil,
    :account_experience_logo_dark => String.t | nil,
    :account_experience_logo_light => String.t | nil,
    :account_experience_theme_variables_dark => String.t | nil,
    :account_experience_theme_variables_light => String.t | nil,
    :created_at => DateTime.t | nil,
    :disable_account_experience_welcome_screen => boolean() | nil,
    :enable_ax_v2 => boolean() | nil,
    :environment => String.t,
    :home_region => String.t | nil,
    :hydra_oauth2_allowed_top_level_claims => [String.t] | nil,
    :hydra_oauth2_client_credentials_default_grant_allowed_scope => boolean() | nil,
    :hydra_oauth2_exclude_not_before_claim => boolean() | nil,
    :hydra_oauth2_grant_jwt_iat_optional => boolean() | nil,
    :hydra_oauth2_grant_jwt_jti_optional => boolean() | nil,
    :hydra_oauth2_grant_jwt_max_ttl => String.t | nil,
    :hydra_oauth2_grant_refresh_token_rotation_grace_period => String.t | nil,
    :hydra_oauth2_mirror_top_level_claims => boolean() | nil,
    :hydra_oauth2_pkce_enforced => boolean() | nil,
    :hydra_oauth2_pkce_enforced_for_public_clients => boolean() | nil,
    :hydra_oauth2_refresh_token_hook => String.t | nil,
    :hydra_oauth2_token_hook => String.t | nil,
    :hydra_oidc_dynamic_client_registration_default_scope => [String.t] | nil,
    :hydra_oidc_dynamic_client_registration_enabled => boolean() | nil,
    :hydra_oidc_subject_identifiers_pairwise_salt => String.t | nil,
    :hydra_oidc_subject_identifiers_supported_types => [String.t] | nil,
    :hydra_secrets_cookie => [String.t] | nil,
    :hydra_secrets_system => [String.t] | nil,
    :hydra_serve_cookies_same_site_legacy_workaround => boolean() | nil,
    :hydra_serve_cookies_same_site_mode => String.t | nil,
    :hydra_strategies_access_token => String.t | nil,
    :hydra_strategies_jwt_scope_claim => String.t | nil,
    :hydra_strategies_scope => String.t | nil,
    :hydra_ttl_access_token => String.t | nil,
    :hydra_ttl_auth_code => String.t | nil,
    :hydra_ttl_id_token => String.t | nil,
    :hydra_ttl_login_consent_request => String.t | nil,
    :hydra_ttl_refresh_token => String.t | nil,
    :hydra_urls_consent => String.t | nil,
    :hydra_urls_error => String.t | nil,
    :hydra_urls_login => String.t | nil,
    :hydra_urls_logout => String.t | nil,
    :hydra_urls_post_logout_redirect => String.t | nil,
    :hydra_urls_registration => String.t | nil,
    :hydra_urls_self_issuer => String.t | nil,
    :hydra_webfinger_jwks_broadcast_keys => [String.t] | nil,
    :hydra_webfinger_oidc_discovery_auth_url => String.t | nil,
    :hydra_webfinger_oidc_discovery_client_registration_url => String.t | nil,
    :hydra_webfinger_oidc_discovery_jwks_url => String.t | nil,
    :hydra_webfinger_oidc_discovery_supported_claims => [String.t] | nil,
    :hydra_webfinger_oidc_discovery_supported_scope => [String.t] | nil,
    :hydra_webfinger_oidc_discovery_token_url => String.t | nil,
    :hydra_webfinger_oidc_discovery_userinfo_url => String.t | nil,
    :id => String.t | nil,
    :keto_namespace_configuration => String.t | nil,
    :keto_namespaces => [Ory.Model.KetoNamespace.t] | nil,
    :kratos_cookies_same_site => String.t | nil,
    :kratos_courier_channels => [Ory.Model.NormalizedProjectRevisionCourierChannel.t] | nil,
    :kratos_courier_delivery_strategy => String.t | nil,
    :kratos_courier_http_request_config_auth_api_key_in => String.t | nil,
    :kratos_courier_http_request_config_auth_api_key_name => String.t | nil,
    :kratos_courier_http_request_config_auth_api_key_value => String.t | nil,
    :kratos_courier_http_request_config_auth_basic_auth_password => String.t | nil,
    :kratos_courier_http_request_config_auth_basic_auth_user => String.t | nil,
    :kratos_courier_http_request_config_auth_type => String.t | nil,
    :kratos_courier_http_request_config_body => String.t | nil,
    :kratos_courier_http_request_config_headers => map() | nil,
    :kratos_courier_http_request_config_method => String.t | nil,
    :kratos_courier_http_request_config_url => String.t | nil,
    :kratos_courier_smtp_connection_uri => String.t | nil,
    :kratos_courier_smtp_from_address => String.t | nil,
    :kratos_courier_smtp_from_name => String.t | nil,
    :kratos_courier_smtp_headers => map() | nil,
    :kratos_courier_smtp_local_name => String.t | nil,
    :kratos_courier_templates_login_code_valid_email_body_html => String.t | nil,
    :kratos_courier_templates_login_code_valid_email_body_plaintext => String.t | nil,
    :kratos_courier_templates_login_code_valid_email_subject => String.t | nil,
    :kratos_courier_templates_login_code_valid_sms_body_plaintext => String.t | nil,
    :kratos_courier_templates_recovery_code_invalid_email_body_html => String.t | nil,
    :kratos_courier_templates_recovery_code_invalid_email_body_plaintext => String.t | nil,
    :kratos_courier_templates_recovery_code_invalid_email_subject => String.t | nil,
    :kratos_courier_templates_recovery_code_valid_email_body_html => String.t | nil,
    :kratos_courier_templates_recovery_code_valid_email_body_plaintext => String.t | nil,
    :kratos_courier_templates_recovery_code_valid_email_subject => String.t | nil,
    :kratos_courier_templates_recovery_invalid_email_body_html => String.t | nil,
    :kratos_courier_templates_recovery_invalid_email_body_plaintext => String.t | nil,
    :kratos_courier_templates_recovery_invalid_email_subject => String.t | nil,
    :kratos_courier_templates_recovery_valid_email_body_html => String.t | nil,
    :kratos_courier_templates_recovery_valid_email_body_plaintext => String.t | nil,
    :kratos_courier_templates_recovery_valid_email_subject => String.t | nil,
    :kratos_courier_templates_registration_code_valid_email_body_html => String.t | nil,
    :kratos_courier_templates_registration_code_valid_email_body_plaintext => String.t | nil,
    :kratos_courier_templates_registration_code_valid_email_subject => String.t | nil,
    :kratos_courier_templates_registration_code_valid_sms_body_plaintext => String.t | nil,
    :kratos_courier_templates_verification_code_invalid_email_body_html => String.t | nil,
    :kratos_courier_templates_verification_code_invalid_email_body_plaintext => String.t | nil,
    :kratos_courier_templates_verification_code_invalid_email_subject => String.t | nil,
    :kratos_courier_templates_verification_code_valid_email_body_html => String.t | nil,
    :kratos_courier_templates_verification_code_valid_email_body_plaintext => String.t | nil,
    :kratos_courier_templates_verification_code_valid_email_subject => String.t | nil,
    :kratos_courier_templates_verification_code_valid_sms_body_plaintext => String.t | nil,
    :kratos_courier_templates_verification_invalid_email_body_html => String.t | nil,
    :kratos_courier_templates_verification_invalid_email_body_plaintext => String.t | nil,
    :kratos_courier_templates_verification_invalid_email_subject => String.t | nil,
    :kratos_courier_templates_verification_valid_email_body_html => String.t | nil,
    :kratos_courier_templates_verification_valid_email_body_plaintext => String.t | nil,
    :kratos_courier_templates_verification_valid_email_subject => String.t | nil,
    :kratos_feature_flags_cacheable_sessions => boolean() | nil,
    :kratos_feature_flags_cacheable_sessions_max_age => String.t | nil,
    :kratos_feature_flags_faster_session_extend => boolean() | nil,
    :kratos_feature_flags_use_continue_with_transitions => boolean() | nil,
    :kratos_identity_schemas => [Ory.Model.NormalizedProjectRevisionIdentitySchema.t] | nil,
    :kratos_oauth2_provider_headers => map() | nil,
    :kratos_oauth2_provider_override_return_to => boolean() | nil,
    :kratos_oauth2_provider_url => String.t | nil,
    :kratos_preview_default_read_consistency_level => String.t | nil,
    :kratos_secrets_cipher => [String.t] | nil,
    :kratos_secrets_cookie => [String.t] | nil,
    :kratos_secrets_default => [String.t] | nil,
    :kratos_selfservice_allowed_return_urls => [String.t] | nil,
    :kratos_selfservice_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_error_ui_url => String.t | nil,
    :kratos_selfservice_flows_login_after_code_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_login_after_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_login_after_lookup_secret_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_login_after_oidc_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_login_after_passkey_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_login_after_password_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_login_after_totp_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_login_after_webauthn_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_login_lifespan => String.t | nil,
    :kratos_selfservice_flows_login_ui_url => String.t | nil,
    :kratos_selfservice_flows_logout_after_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_recovery_after_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_recovery_enabled => boolean() | nil,
    :kratos_selfservice_flows_recovery_lifespan => String.t | nil,
    :kratos_selfservice_flows_recovery_notify_unknown_recipients => boolean() | nil,
    :kratos_selfservice_flows_recovery_ui_url => String.t | nil,
    :kratos_selfservice_flows_recovery_use => String.t | nil,
    :kratos_selfservice_flows_registration_after_code_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_registration_after_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_registration_after_oidc_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_registration_after_passkey_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_registration_after_password_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_registration_after_webauthn_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_registration_enable_legacy_one_step => boolean() | nil,
    :kratos_selfservice_flows_registration_enabled => boolean() | nil,
    :kratos_selfservice_flows_registration_lifespan => String.t | nil,
    :kratos_selfservice_flows_registration_login_hints => boolean() | nil,
    :kratos_selfservice_flows_registration_ui_url => String.t | nil,
    :kratos_selfservice_flows_settings_after_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_settings_after_lookup_secret_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_settings_after_oidc_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_settings_after_passkey_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_settings_after_password_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_settings_after_profile_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_settings_after_totp_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_settings_after_webauthn_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_settings_lifespan => String.t | nil,
    :kratos_selfservice_flows_settings_privileged_session_max_age => String.t | nil,
    :kratos_selfservice_flows_settings_required_aal => String.t | nil,
    :kratos_selfservice_flows_settings_ui_url => String.t | nil,
    :kratos_selfservice_flows_verification_after_default_browser_return_url => String.t | nil,
    :kratos_selfservice_flows_verification_enabled => boolean() | nil,
    :kratos_selfservice_flows_verification_lifespan => String.t | nil,
    :kratos_selfservice_flows_verification_notify_unknown_recipients => boolean() | nil,
    :kratos_selfservice_flows_verification_ui_url => String.t | nil,
    :kratos_selfservice_flows_verification_use => String.t | nil,
    :kratos_selfservice_methods_code_config_lifespan => String.t | nil,
    :kratos_selfservice_methods_code_config_missing_credential_fallback_enabled => boolean() | nil,
    :kratos_selfservice_methods_code_enabled => boolean() | nil,
    :kratos_selfservice_methods_code_mfa_enabled => boolean() | nil,
    :kratos_selfservice_methods_code_passwordless_enabled => boolean() | nil,
    :kratos_selfservice_methods_code_passwordless_login_fallback_enabled => boolean() | nil,
    :kratos_selfservice_methods_link_config_base_url => String.t | nil,
    :kratos_selfservice_methods_link_config_lifespan => String.t | nil,
    :kratos_selfservice_methods_link_enabled => boolean() | nil,
    :kratos_selfservice_methods_lookup_secret_enabled => boolean() | nil,
    :kratos_selfservice_methods_oidc_config_base_redirect_uri => String.t | nil,
    :kratos_selfservice_methods_oidc_config_providers => [Ory.Model.NormalizedProjectRevisionThirdPartyProvider.t] | nil,
    :kratos_selfservice_methods_oidc_enabled => boolean() | nil,
    :kratos_selfservice_methods_passkey_config_rp_display_name => String.t | nil,
    :kratos_selfservice_methods_passkey_config_rp_id => String.t | nil,
    :kratos_selfservice_methods_passkey_config_rp_origins => [String.t] | nil,
    :kratos_selfservice_methods_passkey_enabled => boolean() | nil,
    :kratos_selfservice_methods_password_config_haveibeenpwned_enabled => boolean() | nil,
    :kratos_selfservice_methods_password_config_identifier_similarity_check_enabled => boolean() | nil,
    :kratos_selfservice_methods_password_config_ignore_network_errors => boolean() | nil,
    :kratos_selfservice_methods_password_config_max_breaches => integer() | nil,
    :kratos_selfservice_methods_password_config_min_password_length => integer() | nil,
    :kratos_selfservice_methods_password_enabled => boolean() | nil,
    :kratos_selfservice_methods_profile_enabled => boolean() | nil,
    :kratos_selfservice_methods_saml_config_providers => [Ory.Model.NormalizedProjectRevisionSamlProvider.t] | nil,
    :kratos_selfservice_methods_saml_enabled => boolean() | nil,
    :kratos_selfservice_methods_totp_config_issuer => String.t | nil,
    :kratos_selfservice_methods_totp_enabled => boolean() | nil,
    :kratos_selfservice_methods_webauthn_config_passwordless => boolean() | nil,
    :kratos_selfservice_methods_webauthn_config_rp_display_name => String.t | nil,
    :kratos_selfservice_methods_webauthn_config_rp_icon => String.t | nil,
    :kratos_selfservice_methods_webauthn_config_rp_id => String.t | nil,
    :kratos_selfservice_methods_webauthn_config_rp_origins => [String.t] | nil,
    :kratos_selfservice_methods_webauthn_enabled => boolean() | nil,
    :kratos_session_cookie_persistent => boolean() | nil,
    :kratos_session_cookie_same_site => String.t | nil,
    :kratos_session_lifespan => String.t | nil,
    :kratos_session_whoami_required_aal => String.t | nil,
    :kratos_session_whoami_tokenizer_templates => [Ory.Model.NormalizedProjectRevisionTokenizerTemplate.t] | nil,
    :name => String.t,
    :project_id => String.t | nil,
    :project_revision_hooks => [Ory.Model.NormalizedProjectRevisionHook.t] | nil,
    :serve_admin_cors_allowed_origins => [String.t] | nil,
    :serve_admin_cors_enabled => boolean() | nil,
    :serve_public_cors_allowed_origins => [String.t] | nil,
    :serve_public_cors_enabled => boolean() | nil,
    :strict_security => boolean() | nil,
    :updated_at => DateTime.t | nil,
    :workspace_id => String.t | nil
  }

  alias Ory.Deserializer

  def decode(value) do
    value
     |> Deserializer.deserialize(:created_at, :datetime, nil)
     |> Deserializer.deserialize(:keto_namespaces, :list, Ory.Model.KetoNamespace)
     |> Deserializer.deserialize(:kratos_courier_channels, :list, Ory.Model.NormalizedProjectRevisionCourierChannel)
     |> Deserializer.deserialize(:kratos_identity_schemas, :list, Ory.Model.NormalizedProjectRevisionIdentitySchema)
     |> Deserializer.deserialize(:kratos_selfservice_methods_oidc_config_providers, :list, Ory.Model.NormalizedProjectRevisionThirdPartyProvider)
     |> Deserializer.deserialize(:kratos_selfservice_methods_saml_config_providers, :list, Ory.Model.NormalizedProjectRevisionSamlProvider)
     |> Deserializer.deserialize(:kratos_session_whoami_tokenizer_templates, :list, Ory.Model.NormalizedProjectRevisionTokenizerTemplate)
     |> Deserializer.deserialize(:project_revision_hooks, :list, Ory.Model.NormalizedProjectRevisionHook)
     |> Deserializer.deserialize(:updated_at, :datetime, nil)
  end
end

