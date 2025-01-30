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

import type { UiNodeAnchorAttributes } from './UiNodeAnchorAttributes';
import {
    instanceOfUiNodeAnchorAttributes,
    UiNodeAnchorAttributesFromJSON,
    UiNodeAnchorAttributesFromJSONTyped,
    UiNodeAnchorAttributesToJSON,
} from './UiNodeAnchorAttributes';
import type { UiNodeImageAttributes } from './UiNodeImageAttributes';
import {
    instanceOfUiNodeImageAttributes,
    UiNodeImageAttributesFromJSON,
    UiNodeImageAttributesFromJSONTyped,
    UiNodeImageAttributesToJSON,
} from './UiNodeImageAttributes';
import type { UiNodeInputAttributes } from './UiNodeInputAttributes';
import {
    instanceOfUiNodeInputAttributes,
    UiNodeInputAttributesFromJSON,
    UiNodeInputAttributesFromJSONTyped,
    UiNodeInputAttributesToJSON,
} from './UiNodeInputAttributes';
import type { UiNodeScriptAttributes } from './UiNodeScriptAttributes';
import {
    instanceOfUiNodeScriptAttributes,
    UiNodeScriptAttributesFromJSON,
    UiNodeScriptAttributesFromJSONTyped,
    UiNodeScriptAttributesToJSON,
} from './UiNodeScriptAttributes';
import type { UiNodeTextAttributes } from './UiNodeTextAttributes';
import {
    instanceOfUiNodeTextAttributes,
    UiNodeTextAttributesFromJSON,
    UiNodeTextAttributesFromJSONTyped,
    UiNodeTextAttributesToJSON,
} from './UiNodeTextAttributes';

/**
 * @type UiNodeAttributes
 * 
 * @export
 */
export type UiNodeAttributes = { node_type: 'a' } & UiNodeAnchorAttributes | { node_type: 'img' } & UiNodeImageAttributes | { node_type: 'input' } & UiNodeInputAttributes | { node_type: 'script' } & UiNodeScriptAttributes | { node_type: 'text' } & UiNodeTextAttributes;

export function UiNodeAttributesFromJSON(json: any): UiNodeAttributes {
    return UiNodeAttributesFromJSONTyped(json, false);
}

export function UiNodeAttributesFromJSONTyped(json: any, ignoreDiscriminator: boolean): UiNodeAttributes {
    if (json == null) {
        return json;
    }
    switch (json['node_type']) {
        case 'a':
            return Object.assign({}, UiNodeAnchorAttributesFromJSONTyped(json, true), { node_type: 'a' } as const);
        case 'img':
            return Object.assign({}, UiNodeImageAttributesFromJSONTyped(json, true), { node_type: 'img' } as const);
        case 'input':
            return Object.assign({}, UiNodeInputAttributesFromJSONTyped(json, true), { node_type: 'input' } as const);
        case 'script':
            return Object.assign({}, UiNodeScriptAttributesFromJSONTyped(json, true), { node_type: 'script' } as const);
        case 'text':
            return Object.assign({}, UiNodeTextAttributesFromJSONTyped(json, true), { node_type: 'text' } as const);
        default:
            throw new Error(`No variant of UiNodeAttributes exists with 'node_type=${json['node_type']}'`);
    }
}

export function UiNodeAttributesToJSON(value?: UiNodeAttributes | null): any {
    if (value == null) {
        return value;
    }
    switch (value['node_type']) {
        case 'a':
            return UiNodeAnchorAttributesToJSON(value);
        case 'img':
            return UiNodeImageAttributesToJSON(value);
        case 'input':
            return UiNodeInputAttributesToJSON(value);
        case 'script':
            return UiNodeScriptAttributesToJSON(value);
        case 'text':
            return UiNodeTextAttributesToJSON(value);
        default:
            throw new Error(`No variant of UiNodeAttributes exists with 'node_type=${value['node_type']}'`);
    }

}

