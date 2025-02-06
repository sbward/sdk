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
import type { AcceptOAuth2ConsentRequestSession } from './AcceptOAuth2ConsentRequestSession';
import {
    AcceptOAuth2ConsentRequestSessionFromJSON,
    AcceptOAuth2ConsentRequestSessionFromJSONTyped,
    AcceptOAuth2ConsentRequestSessionToJSON,
} from './AcceptOAuth2ConsentRequestSession';

/**
 * 
 * @export
 * @interface AcceptOAuth2ConsentRequest
 */
export interface AcceptOAuth2ConsentRequest {
    /**
     * 
     * @type {object}
     * @memberof AcceptOAuth2ConsentRequest
     */
    context?: object;
    /**
     * 
     * @type {Array<string>}
     * @memberof AcceptOAuth2ConsentRequest
     */
    grant_access_token_audience?: Array<string>;
    /**
     * 
     * @type {Array<string>}
     * @memberof AcceptOAuth2ConsentRequest
     */
    grant_scope?: Array<string>;
    /**
     * 
     * @type {Date}
     * @memberof AcceptOAuth2ConsentRequest
     */
    handled_at?: Date;
    /**
     * Remember, if set to true, tells ORY Hydra to remember this consent authorization and reuse it if the same
     * client asks the same user for the same, or a subset of, scope.
     * @type {boolean}
     * @memberof AcceptOAuth2ConsentRequest
     */
    remember?: boolean;
    /**
     * RememberFor sets how long the consent authorization should be remembered for in seconds. If set to `0`, the
     * authorization will be remembered indefinitely.
     * @type {number}
     * @memberof AcceptOAuth2ConsentRequest
     */
    remember_for?: number;
    /**
     * 
     * @type {AcceptOAuth2ConsentRequestSession}
     * @memberof AcceptOAuth2ConsentRequest
     */
    session?: AcceptOAuth2ConsentRequestSession;
}

/**
 * Check if a given object implements the AcceptOAuth2ConsentRequest interface.
 */
export function instanceOfAcceptOAuth2ConsentRequest(value: object): value is AcceptOAuth2ConsentRequest {
    return true;
}

export function AcceptOAuth2ConsentRequestFromJSON(json: any): AcceptOAuth2ConsentRequest {
    return AcceptOAuth2ConsentRequestFromJSONTyped(json, false);
}

export function AcceptOAuth2ConsentRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): AcceptOAuth2ConsentRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'context': json['context'] == null ? undefined : json['context'],
        'grant_access_token_audience': json['grant_access_token_audience'] == null ? undefined : json['grant_access_token_audience'],
        'grant_scope': json['grant_scope'] == null ? undefined : json['grant_scope'],
        'handled_at': json['handled_at'] == null ? undefined : (new Date(json['handled_at'])),
        'remember': json['remember'] == null ? undefined : json['remember'],
        'remember_for': json['remember_for'] == null ? undefined : json['remember_for'],
        'session': json['session'] == null ? undefined : AcceptOAuth2ConsentRequestSessionFromJSON(json['session']),
    };
}

export function AcceptOAuth2ConsentRequestToJSON(value?: AcceptOAuth2ConsentRequest | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'context': value['context'],
        'grant_access_token_audience': value['grant_access_token_audience'],
        'grant_scope': value['grant_scope'],
        'handled_at': value['handled_at'] == null ? undefined : ((value['handled_at']).toISOString()),
        'remember': value['remember'],
        'remember_for': value['remember_for'],
        'session': AcceptOAuth2ConsentRequestSessionToJSON(value['session']),
    };
}

