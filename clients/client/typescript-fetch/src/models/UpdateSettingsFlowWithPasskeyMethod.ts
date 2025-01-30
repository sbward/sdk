/* tslint:disable */
/* eslint-disable */
/**
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.16.4
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
/**
 * Update Settings Flow with Passkey Method
 * @export
 * @interface UpdateSettingsFlowWithPasskeyMethod
 */
export interface UpdateSettingsFlowWithPasskeyMethod {
    /**
     * CSRFToken is the anti-CSRF token
     * @type {string}
     * @memberof UpdateSettingsFlowWithPasskeyMethod
     */
    csrf_token?: string;
    /**
     * Method
     * 
     * Should be set to "passkey" when trying to add, update, or remove a webAuthn pairing.
     * @type {string}
     * @memberof UpdateSettingsFlowWithPasskeyMethod
     */
    method: string;
    /**
     * Remove a WebAuthn Security Key
     * 
     * This must contain the ID of the WebAuthN connection.
     * @type {string}
     * @memberof UpdateSettingsFlowWithPasskeyMethod
     */
    passkey_remove?: string;
    /**
     * Register a WebAuthn Security Key
     * 
     * It is expected that the JSON returned by the WebAuthn registration process
     * is included here.
     * @type {string}
     * @memberof UpdateSettingsFlowWithPasskeyMethod
     */
    passkey_settings_register?: string;
}

/**
 * Check if a given object implements the UpdateSettingsFlowWithPasskeyMethod interface.
 */
export function instanceOfUpdateSettingsFlowWithPasskeyMethod(value: object): value is UpdateSettingsFlowWithPasskeyMethod {
    if (!('method' in value) || value['method'] === undefined) return false;
    return true;
}

export function UpdateSettingsFlowWithPasskeyMethodFromJSON(json: any): UpdateSettingsFlowWithPasskeyMethod {
    return UpdateSettingsFlowWithPasskeyMethodFromJSONTyped(json, false);
}

export function UpdateSettingsFlowWithPasskeyMethodFromJSONTyped(json: any, ignoreDiscriminator: boolean): UpdateSettingsFlowWithPasskeyMethod {
    if (json == null) {
        return json;
    }
    return {
        
        'csrf_token': json['csrf_token'] == null ? undefined : json['csrf_token'],
        'method': json['method'],
        'passkey_remove': json['passkey_remove'] == null ? undefined : json['passkey_remove'],
        'passkey_settings_register': json['passkey_settings_register'] == null ? undefined : json['passkey_settings_register'],
    };
}

export function UpdateSettingsFlowWithPasskeyMethodToJSON(value?: UpdateSettingsFlowWithPasskeyMethod | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'csrf_token': value['csrf_token'],
        'method': value['method'],
        'passkey_remove': value['passkey_remove'],
        'passkey_settings_register': value['passkey_settings_register'],
    };
}

