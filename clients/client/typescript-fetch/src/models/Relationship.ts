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
import type { SubjectSet } from './SubjectSet';
import {
    SubjectSetFromJSON,
    SubjectSetFromJSONTyped,
    SubjectSetToJSON,
} from './SubjectSet';

/**
 * Relationship
 * @export
 * @interface Relationship
 */
export interface Relationship {
    /**
     * Namespace of the Relation Tuple
     * @type {string}
     * @memberof Relationship
     */
    namespace: string;
    /**
     * Object of the Relation Tuple
     * @type {string}
     * @memberof Relationship
     */
    object: string;
    /**
     * Relation of the Relation Tuple
     * @type {string}
     * @memberof Relationship
     */
    relation: string;
    /**
     * SubjectID of the Relation Tuple
     * 
     * Either SubjectSet or SubjectID can be provided.
     * @type {string}
     * @memberof Relationship
     */
    subject_id?: string;
    /**
     * 
     * @type {SubjectSet}
     * @memberof Relationship
     */
    subject_set?: SubjectSet;
}

/**
 * Check if a given object implements the Relationship interface.
 */
export function instanceOfRelationship(value: object): boolean {
    if (!('namespace' in value)) return false;
    if (!('object' in value)) return false;
    if (!('relation' in value)) return false;
    return true;
}

export function RelationshipFromJSON(json: any): Relationship {
    return RelationshipFromJSONTyped(json, false);
}

export function RelationshipFromJSONTyped(json: any, ignoreDiscriminator: boolean): Relationship {
    if (json == null) {
        return json;
    }
    return {
        
        'namespace': json['namespace'],
        'object': json['object'],
        'relation': json['relation'],
        'subject_id': json['subject_id'] == null ? undefined : json['subject_id'],
        'subject_set': json['subject_set'] == null ? undefined : SubjectSetFromJSON(json['subject_set']),
    };
}

export function RelationshipToJSON(value?: Relationship | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'namespace': value['namespace'],
        'object': value['object'],
        'relation': value['relation'],
        'subject_id': value['subject_id'],
        'subject_set': SubjectSetToJSON(value['subject_set']),
    };
}

