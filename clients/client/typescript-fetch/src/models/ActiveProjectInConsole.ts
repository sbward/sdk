/* tslint:disable */
/* eslint-disable */
/**
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.12.1
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
/**
 * The Active Project ID
 * @export
 * @interface ActiveProjectInConsole
 */
export interface ActiveProjectInConsole {
    /**
     * The Active Project ID
     * 
     * format: uuid
     * @type {string}
     * @memberof ActiveProjectInConsole
     */
    project_id?: string;
}

/**
 * Check if a given object implements the ActiveProjectInConsole interface.
 */
export function instanceOfActiveProjectInConsole(value: object): boolean {
    return true;
}

export function ActiveProjectInConsoleFromJSON(json: any): ActiveProjectInConsole {
    return ActiveProjectInConsoleFromJSONTyped(json, false);
}

export function ActiveProjectInConsoleFromJSONTyped(json: any, ignoreDiscriminator: boolean): ActiveProjectInConsole {
    if (json == null) {
        return json;
    }
    return {
        
        'project_id': json['project_id'] == null ? undefined : json['project_id'],
    };
}

export function ActiveProjectInConsoleToJSON(value?: ActiveProjectInConsole | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'project_id': value['project_id'],
    };
}

