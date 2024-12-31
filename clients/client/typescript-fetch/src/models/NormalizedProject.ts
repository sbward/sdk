/* tslint:disable */
/* eslint-disable */
/**
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.15.17
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { NormalizedProjectRevision } from './NormalizedProjectRevision';
import {
    NormalizedProjectRevisionFromJSON,
    NormalizedProjectRevisionFromJSONTyped,
    NormalizedProjectRevisionToJSON,
} from './NormalizedProjectRevision';
import type { Workspace } from './Workspace';
import {
    WorkspaceFromJSON,
    WorkspaceFromJSONTyped,
    WorkspaceToJSON,
} from './Workspace';

/**
 * 
 * @export
 * @interface NormalizedProject
 */
export interface NormalizedProject {
    /**
     * The Project's Creation Date
     * @type {Date}
     * @memberof NormalizedProject
     */
    readonly created_at: Date;
    /**
     * 
     * @type {NormalizedProjectRevision}
     * @memberof NormalizedProject
     */
    current_revision: NormalizedProjectRevision;
    /**
     * The environment of the project.
     * prod Production
     * stage Staging
     * dev Development
     * @type {string}
     * @memberof NormalizedProject
     */
    environment: NormalizedProjectEnvironmentEnum;
    /**
     * The project's data home region.
     * eu-central EUCentral
     * asia-northeast AsiaNorthEast
     * us-east USEast
     * us-west USWest
     * us US
     * global Global
     * @type {string}
     * @memberof NormalizedProject
     */
    readonly home_region: NormalizedProjectHomeRegionEnum;
    /**
     * 
     * @type {Array<string>}
     * @memberof NormalizedProject
     */
    hosts: Array<string>;
    /**
     * The project's ID.
     * @type {string}
     * @memberof NormalizedProject
     */
    readonly id: string;
    /**
     * The project's slug
     * @type {string}
     * @memberof NormalizedProject
     */
    readonly slug: string;
    /**
     * The state of the project.
     * running Running
     * halted Halted
     * deleted Deleted
     * @type {string}
     * @memberof NormalizedProject
     */
    readonly state: NormalizedProjectStateEnum;
    /**
     * 
     * @type {string}
     * @memberof NormalizedProject
     */
    subscription_id?: string | null;
    /**
     * 
     * @type {string}
     * @memberof NormalizedProject
     */
    subscription_plan?: string | null;
    /**
     * Last Time Project was Updated
     * @type {Date}
     * @memberof NormalizedProject
     */
    readonly updated_at: Date;
    /**
     * 
     * @type {Workspace}
     * @memberof NormalizedProject
     */
    workspace?: Workspace;
    /**
     * 
     * @type {string}
     * @memberof NormalizedProject
     */
    workspace_id: string | null;
}


/**
 * @export
 */
export const NormalizedProjectEnvironmentEnum = {
    Prod: 'prod',
    Stage: 'stage',
    Dev: 'dev'
} as const;
export type NormalizedProjectEnvironmentEnum = typeof NormalizedProjectEnvironmentEnum[keyof typeof NormalizedProjectEnvironmentEnum];

/**
 * @export
 */
export const NormalizedProjectHomeRegionEnum = {
    EuCentral: 'eu-central',
    AsiaNortheast: 'asia-northeast',
    UsEast: 'us-east',
    UsWest: 'us-west',
    Us: 'us',
    Global: 'global'
} as const;
export type NormalizedProjectHomeRegionEnum = typeof NormalizedProjectHomeRegionEnum[keyof typeof NormalizedProjectHomeRegionEnum];

/**
 * @export
 */
export const NormalizedProjectStateEnum = {
    Running: 'running',
    Halted: 'halted',
    Deleted: 'deleted'
} as const;
export type NormalizedProjectStateEnum = typeof NormalizedProjectStateEnum[keyof typeof NormalizedProjectStateEnum];


/**
 * Check if a given object implements the NormalizedProject interface.
 */
export function instanceOfNormalizedProject(value: object): value is NormalizedProject {
    if (!('created_at' in value) || value['created_at'] === undefined) return false;
    if (!('current_revision' in value) || value['current_revision'] === undefined) return false;
    if (!('environment' in value) || value['environment'] === undefined) return false;
    if (!('home_region' in value) || value['home_region'] === undefined) return false;
    if (!('hosts' in value) || value['hosts'] === undefined) return false;
    if (!('id' in value) || value['id'] === undefined) return false;
    if (!('slug' in value) || value['slug'] === undefined) return false;
    if (!('state' in value) || value['state'] === undefined) return false;
    if (!('updated_at' in value) || value['updated_at'] === undefined) return false;
    if (!('workspace_id' in value) || value['workspace_id'] === undefined) return false;
    return true;
}

export function NormalizedProjectFromJSON(json: any): NormalizedProject {
    return NormalizedProjectFromJSONTyped(json, false);
}

export function NormalizedProjectFromJSONTyped(json: any, ignoreDiscriminator: boolean): NormalizedProject {
    if (json == null) {
        return json;
    }
    return {
        
        'created_at': (new Date(json['created_at'])),
        'current_revision': NormalizedProjectRevisionFromJSON(json['current_revision']),
        'environment': json['environment'],
        'home_region': json['home_region'],
        'hosts': json['hosts'],
        'id': json['id'],
        'slug': json['slug'],
        'state': json['state'],
        'subscription_id': json['subscription_id'] == null ? undefined : json['subscription_id'],
        'subscription_plan': json['subscription_plan'] == null ? undefined : json['subscription_plan'],
        'updated_at': (new Date(json['updated_at'])),
        'workspace': json['workspace'] == null ? undefined : WorkspaceFromJSON(json['workspace']),
        'workspace_id': json['workspace_id'],
    };
}

export function NormalizedProjectToJSON(value?: Omit<NormalizedProject, 'created_at'|'home_region'|'id'|'slug'|'state'|'updated_at'> | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'current_revision': NormalizedProjectRevisionToJSON(value['current_revision']),
        'environment': value['environment'],
        'hosts': value['hosts'],
        'subscription_id': value['subscription_id'],
        'subscription_plan': value['subscription_plan'],
        'workspace': WorkspaceToJSON(value['workspace']),
        'workspace_id': value['workspace_id'],
    };
}

