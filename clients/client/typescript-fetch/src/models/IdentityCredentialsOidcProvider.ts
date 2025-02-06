/* tslint:disable */
/* eslint-disable */
/**
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.16.6
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface IdentityCredentialsOidcProvider
 */
export interface IdentityCredentialsOidcProvider {
    /**
     * 
     * @type {string}
     * @memberof IdentityCredentialsOidcProvider
     */
    initial_access_token?: string;
    /**
     * 
     * @type {string}
     * @memberof IdentityCredentialsOidcProvider
     */
    initial_id_token?: string;
    /**
     * 
     * @type {string}
     * @memberof IdentityCredentialsOidcProvider
     */
    initial_refresh_token?: string;
    /**
     * 
     * @type {string}
     * @memberof IdentityCredentialsOidcProvider
     */
    organization?: string;
    /**
     * 
     * @type {string}
     * @memberof IdentityCredentialsOidcProvider
     */
    provider?: string;
    /**
     * 
     * @type {string}
     * @memberof IdentityCredentialsOidcProvider
     */
    subject?: string;
}

/**
 * Check if a given object implements the IdentityCredentialsOidcProvider interface.
 */
export function instanceOfIdentityCredentialsOidcProvider(value: object): value is IdentityCredentialsOidcProvider {
    return true;
}

export function IdentityCredentialsOidcProviderFromJSON(json: any): IdentityCredentialsOidcProvider {
    return IdentityCredentialsOidcProviderFromJSONTyped(json, false);
}

export function IdentityCredentialsOidcProviderFromJSONTyped(json: any, ignoreDiscriminator: boolean): IdentityCredentialsOidcProvider {
    if (json == null) {
        return json;
    }
    return {
        
        'initial_access_token': json['initial_access_token'] == null ? undefined : json['initial_access_token'],
        'initial_id_token': json['initial_id_token'] == null ? undefined : json['initial_id_token'],
        'initial_refresh_token': json['initial_refresh_token'] == null ? undefined : json['initial_refresh_token'],
        'organization': json['organization'] == null ? undefined : json['organization'],
        'provider': json['provider'] == null ? undefined : json['provider'],
        'subject': json['subject'] == null ? undefined : json['subject'],
    };
}

export function IdentityCredentialsOidcProviderToJSON(value?: IdentityCredentialsOidcProvider | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'initial_access_token': value['initial_access_token'],
        'initial_id_token': value['initial_id_token'],
        'initial_refresh_token': value['initial_refresh_token'],
        'organization': value['organization'],
        'provider': value['provider'],
        'subject': value['subject'],
    };
}

