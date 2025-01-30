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
 * Event Stream
 * @export
 * @interface EventStream
 */
export interface EventStream {
    /**
     * 
     * @type {Date}
     * @memberof EventStream
     */
    created_at?: Date;
    /**
     * 
     * @type {string}
     * @memberof EventStream
     */
    id?: string;
    /**
     * 
     * @type {string}
     * @memberof EventStream
     */
    role_arn?: string;
    /**
     * 
     * @type {string}
     * @memberof EventStream
     */
    topic_arn?: string;
    /**
     * 
     * @type {string}
     * @memberof EventStream
     */
    type?: string;
    /**
     * 
     * @type {Date}
     * @memberof EventStream
     */
    updated_at?: Date;
}

/**
 * Check if a given object implements the EventStream interface.
 */
export function instanceOfEventStream(value: object): value is EventStream {
    return true;
}

export function EventStreamFromJSON(json: any): EventStream {
    return EventStreamFromJSONTyped(json, false);
}

export function EventStreamFromJSONTyped(json: any, ignoreDiscriminator: boolean): EventStream {
    if (json == null) {
        return json;
    }
    return {
        
        'created_at': json['created_at'] == null ? undefined : (new Date(json['created_at'])),
        'id': json['id'] == null ? undefined : json['id'],
        'role_arn': json['role_arn'] == null ? undefined : json['role_arn'],
        'topic_arn': json['topic_arn'] == null ? undefined : json['topic_arn'],
        'type': json['type'] == null ? undefined : json['type'],
        'updated_at': json['updated_at'] == null ? undefined : (new Date(json['updated_at'])),
    };
}

export function EventStreamToJSON(value?: EventStream | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'created_at': value['created_at'] == null ? undefined : ((value['created_at']).toISOString()),
        'id': value['id'],
        'role_arn': value['role_arn'],
        'topic_arn': value['topic_arn'],
        'type': value['type'],
        'updated_at': value['updated_at'] == null ? undefined : ((value['updated_at']).toISOString()),
    };
}

