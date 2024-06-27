/* tslint:disable */
/* eslint-disable */
/**
 * Ory APIs
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.12.0
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
 * @interface UiNodeScriptAttributes
 */
export interface UiNodeScriptAttributes {
    /**
     * The script async type
     * @type {boolean}
     * @memberof UiNodeScriptAttributes
     */
    async: boolean;
    /**
     * The script cross origin policy
     * @type {string}
     * @memberof UiNodeScriptAttributes
     */
    crossorigin: string;
    /**
     * A unique identifier
     * @type {string}
     * @memberof UiNodeScriptAttributes
     */
    id: string;
    /**
     * The script's integrity hash
     * @type {string}
     * @memberof UiNodeScriptAttributes
     */
    integrity: string;
    /**
     * NodeType represents this node's types. It is a mirror of `node.type` and
     * is primarily used to allow compatibility with OpenAPI 3.0. In this struct it technically always is "script".
     * text Text
     * input Input
     * img Image
     * a Anchor
     * script Script
     * @type {string}
     * @memberof UiNodeScriptAttributes
     */
    node_type: UiNodeScriptAttributesNodeTypeEnum;
    /**
     * Nonce for CSP
     * 
     * A nonce you may want to use to improve your Content Security Policy.
     * You do not have to use this value but if you want to improve your CSP
     * policies you may use it. You can also choose to use your own nonce value!
     * @type {string}
     * @memberof UiNodeScriptAttributes
     */
    nonce: string;
    /**
     * The script referrer policy
     * @type {string}
     * @memberof UiNodeScriptAttributes
     */
    referrerpolicy: string;
    /**
     * The script source
     * @type {string}
     * @memberof UiNodeScriptAttributes
     */
    src: string;
    /**
     * The script MIME type
     * @type {string}
     * @memberof UiNodeScriptAttributes
     */
    type: string;
}


/**
 * @export
 */
export const UiNodeScriptAttributesNodeTypeEnum = {
    Text: 'text',
    Input: 'input',
    Img: 'img',
    A: 'a',
    Script: 'script'
} as const;
export type UiNodeScriptAttributesNodeTypeEnum = typeof UiNodeScriptAttributesNodeTypeEnum[keyof typeof UiNodeScriptAttributesNodeTypeEnum];


/**
 * Check if a given object implements the UiNodeScriptAttributes interface.
 */
export function instanceOfUiNodeScriptAttributes(value: object): boolean {
    if (!('async' in value)) return false;
    if (!('crossorigin' in value)) return false;
    if (!('id' in value)) return false;
    if (!('integrity' in value)) return false;
    if (!('node_type' in value)) return false;
    if (!('nonce' in value)) return false;
    if (!('referrerpolicy' in value)) return false;
    if (!('src' in value)) return false;
    if (!('type' in value)) return false;
    return true;
}

export function UiNodeScriptAttributesFromJSON(json: any): UiNodeScriptAttributes {
    return UiNodeScriptAttributesFromJSONTyped(json, false);
}

export function UiNodeScriptAttributesFromJSONTyped(json: any, ignoreDiscriminator: boolean): UiNodeScriptAttributes {
    if (json == null) {
        return json;
    }
    return {
        
        'async': json['async'],
        'crossorigin': json['crossorigin'],
        'id': json['id'],
        'integrity': json['integrity'],
        'node_type': json['node_type'],
        'nonce': json['nonce'],
        'referrerpolicy': json['referrerpolicy'],
        'src': json['src'],
        'type': json['type'],
    };
}

export function UiNodeScriptAttributesToJSON(value?: UiNodeScriptAttributes | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'async': value['async'],
        'crossorigin': value['crossorigin'],
        'id': value['id'],
        'integrity': value['integrity'],
        'node_type': value['node_type'],
        'nonce': value['nonce'],
        'referrerpolicy': value['referrerpolicy'],
        'src': value['src'],
        'type': value['type'],
    };
}
