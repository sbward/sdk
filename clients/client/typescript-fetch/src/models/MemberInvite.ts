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
 * 
 * @export
 * @interface MemberInvite
 */
export interface MemberInvite {
    /**
     * The Project's Revision Creation Date
     * @type {Date}
     * @memberof MemberInvite
     */
    readonly created_at: Date;
    /**
     * The invite's ID.
     * @type {string}
     * @memberof MemberInvite
     */
    readonly id: string;
    /**
     * The invitee's email
     * @type {string}
     * @memberof MemberInvite
     */
    invitee_email: string;
    /**
     * 
     * @type {string}
     * @memberof MemberInvite
     */
    invitee_id?: string;
    /**
     * The invite owner's email
     * Usually the project's owner email
     * @type {string}
     * @memberof MemberInvite
     */
    owner_email: string;
    /**
     * The invite owner's ID
     * Usually the project's owner
     * @type {string}
     * @memberof MemberInvite
     */
    owner_id: string;
    /**
     * 
     * @type {string}
     * @memberof MemberInvite
     */
    project_id?: string;
    /**
     * The invite's status
     * Keeps track of the invites status such as pending, accepted, declined, expired
     * pending PENDING
     * accepted ACCEPTED
     * declined DECLINED
     * expired EXPIRED
     * cancelled CANCELLED
     * removed REMOVED
     * @type {string}
     * @memberof MemberInvite
     */
    status: MemberInviteStatusEnum;
    /**
     * Last Time Project's Revision was Updated
     * @type {Date}
     * @memberof MemberInvite
     */
    readonly updated_at: Date;
    /**
     * 
     * @type {string}
     * @memberof MemberInvite
     */
    workspace_id?: string;
}


/**
 * @export
 */
export const MemberInviteStatusEnum = {
    Pending: 'pending',
    Accepted: 'accepted',
    Declined: 'declined',
    Expired: 'expired',
    Cancelled: 'cancelled',
    Removed: 'removed'
} as const;
export type MemberInviteStatusEnum = typeof MemberInviteStatusEnum[keyof typeof MemberInviteStatusEnum];


/**
 * Check if a given object implements the MemberInvite interface.
 */
export function instanceOfMemberInvite(value: object): boolean {
    if (!('created_at' in value)) return false;
    if (!('id' in value)) return false;
    if (!('invitee_email' in value)) return false;
    if (!('owner_email' in value)) return false;
    if (!('owner_id' in value)) return false;
    if (!('status' in value)) return false;
    if (!('updated_at' in value)) return false;
    return true;
}

export function MemberInviteFromJSON(json: any): MemberInvite {
    return MemberInviteFromJSONTyped(json, false);
}

export function MemberInviteFromJSONTyped(json: any, ignoreDiscriminator: boolean): MemberInvite {
    if (json == null) {
        return json;
    }
    return {
        
        'created_at': (new Date(json['created_at'])),
        'id': json['id'],
        'invitee_email': json['invitee_email'],
        'invitee_id': json['invitee_id'] == null ? undefined : json['invitee_id'],
        'owner_email': json['owner_email'],
        'owner_id': json['owner_id'],
        'project_id': json['project_id'] == null ? undefined : json['project_id'],
        'status': json['status'],
        'updated_at': (new Date(json['updated_at'])),
        'workspace_id': json['workspace_id'] == null ? undefined : json['workspace_id'],
    };
}

export function MemberInviteToJSON(value?: MemberInvite | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'invitee_email': value['invitee_email'],
        'invitee_id': value['invitee_id'],
        'owner_email': value['owner_email'],
        'owner_id': value['owner_id'],
        'project_id': value['project_id'],
        'status': value['status'],
        'workspace_id': value['workspace_id'],
    };
}

