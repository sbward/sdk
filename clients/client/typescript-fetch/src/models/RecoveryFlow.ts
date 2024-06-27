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
import type { ContinueWith } from './ContinueWith';
import {
    ContinueWithFromJSON,
    ContinueWithFromJSONTyped,
    ContinueWithToJSON,
} from './ContinueWith';
import type { UiContainer } from './UiContainer';
import {
    UiContainerFromJSON,
    UiContainerFromJSONTyped,
    UiContainerToJSON,
} from './UiContainer';

/**
 * This request is used when an identity wants to recover their account.
 * 
 * We recommend reading the [Account Recovery Documentation](../self-service/flows/password-reset-account-recovery)
 * @export
 * @interface RecoveryFlow
 */
export interface RecoveryFlow {
    /**
     * Active, if set, contains the recovery method that is being used. It is initially
     * not set.
     * @type {string}
     * @memberof RecoveryFlow
     */
    active?: string;
    /**
     * Contains possible actions that could follow this flow
     * @type {Array<ContinueWith>}
     * @memberof RecoveryFlow
     */
    continue_with?: Array<ContinueWith>;
    /**
     * ExpiresAt is the time (UTC) when the request expires. If the user still wishes to update the setting,
     * a new request has to be initiated.
     * @type {Date}
     * @memberof RecoveryFlow
     */
    expires_at: Date;
    /**
     * ID represents the request's unique ID. When performing the recovery flow, this
     * represents the id in the recovery ui's query parameter: http://<selfservice.flows.recovery.ui_url>?request=<id>
     * @type {string}
     * @memberof RecoveryFlow
     */
    id: string;
    /**
     * IssuedAt is the time (UTC) when the request occurred.
     * @type {Date}
     * @memberof RecoveryFlow
     */
    issued_at: Date;
    /**
     * RequestURL is the initial URL that was requested from Ory Kratos. It can be used
     * to forward information contained in the URL's path or query for example.
     * @type {string}
     * @memberof RecoveryFlow
     */
    request_url: string;
    /**
     * ReturnTo contains the requested return_to URL.
     * @type {string}
     * @memberof RecoveryFlow
     */
    return_to?: string;
    /**
     * State represents the state of this request:
     * 
     * choose_method: ask the user to choose a method (e.g. recover account via email)
     * sent_email: the email has been sent to the user
     * passed_challenge: the request was successful and the recovery challenge was passed.
     * @type {any}
     * @memberof RecoveryFlow
     */
    state: any | null;
    /**
     * TransientPayload is used to pass data from the recovery flow to hooks and email templates
     * @type {object}
     * @memberof RecoveryFlow
     */
    transient_payload?: object;
    /**
     * The flow type can either be `api` or `browser`.
     * @type {string}
     * @memberof RecoveryFlow
     */
    type: string;
    /**
     * 
     * @type {UiContainer}
     * @memberof RecoveryFlow
     */
    ui: UiContainer;
}

/**
 * Check if a given object implements the RecoveryFlow interface.
 */
export function instanceOfRecoveryFlow(value: object): boolean {
    if (!('expires_at' in value)) return false;
    if (!('id' in value)) return false;
    if (!('issued_at' in value)) return false;
    if (!('request_url' in value)) return false;
    if (!('state' in value)) return false;
    if (!('type' in value)) return false;
    if (!('ui' in value)) return false;
    return true;
}

export function RecoveryFlowFromJSON(json: any): RecoveryFlow {
    return RecoveryFlowFromJSONTyped(json, false);
}

export function RecoveryFlowFromJSONTyped(json: any, ignoreDiscriminator: boolean): RecoveryFlow {
    if (json == null) {
        return json;
    }
    return {
        
        'active': json['active'] == null ? undefined : json['active'],
        'continue_with': json['continue_with'] == null ? undefined : ((json['continue_with'] as Array<any>).map(ContinueWithFromJSON)),
        'expires_at': (new Date(json['expires_at'])),
        'id': json['id'],
        'issued_at': (new Date(json['issued_at'])),
        'request_url': json['request_url'],
        'return_to': json['return_to'] == null ? undefined : json['return_to'],
        'state': json['state'],
        'transient_payload': json['transient_payload'] == null ? undefined : json['transient_payload'],
        'type': json['type'],
        'ui': UiContainerFromJSON(json['ui']),
    };
}

export function RecoveryFlowToJSON(value?: RecoveryFlow | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'active': value['active'],
        'continue_with': value['continue_with'] == null ? undefined : ((value['continue_with'] as Array<any>).map(ContinueWithToJSON)),
        'expires_at': ((value['expires_at']).toISOString()),
        'id': value['id'],
        'issued_at': ((value['issued_at']).toISOString()),
        'request_url': value['request_url'],
        'return_to': value['return_to'],
        'state': value['state'],
        'transient_payload': value['transient_payload'],
        'type': value['type'],
        'ui': UiContainerToJSON(value['ui']),
    };
}
