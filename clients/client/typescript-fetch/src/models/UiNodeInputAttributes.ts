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
import type { UiText } from './UiText';
import {
    UiTextFromJSON,
    UiTextFromJSONTyped,
    UiTextToJSON,
} from './UiText';

/**
 * InputAttributes represents the attributes of an input node
 * @export
 * @interface UiNodeInputAttributes
 */
export interface UiNodeInputAttributes {
    /**
     * The autocomplete attribute for the input.
     * email InputAttributeAutocompleteEmail
     * tel InputAttributeAutocompleteTel
     * url InputAttributeAutocompleteUrl
     * current-password InputAttributeAutocompleteCurrentPassword
     * new-password InputAttributeAutocompleteNewPassword
     * one-time-code InputAttributeAutocompleteOneTimeCode
     * @type {string}
     * @memberof UiNodeInputAttributes
     */
    autocomplete?: UiNodeInputAttributesAutocompleteEnum;
    /**
     * Sets the input's disabled field to true or false.
     * @type {boolean}
     * @memberof UiNodeInputAttributes
     */
    disabled: boolean;
    /**
     * 
     * @type {UiText}
     * @memberof UiNodeInputAttributes
     */
    label?: UiText;
    /**
     * MaxLength may contain the input's maximum length.
     * @type {number}
     * @memberof UiNodeInputAttributes
     */
    maxlength?: number;
    /**
     * The input's element name.
     * @type {string}
     * @memberof UiNodeInputAttributes
     */
    name: string;
    /**
     * NodeType represents this node's types. It is a mirror of `node.type` and
     * is primarily used to allow compatibility with OpenAPI 3.0.  In this struct it technically always is "input".
     * text Text
     * input Input
     * img Image
     * a Anchor
     * script Script
     * @type {string}
     * @memberof UiNodeInputAttributes
     */
    node_type: UiNodeInputAttributesNodeTypeEnum;
    /**
     * OnClick may contain javascript which should be executed on click. This is primarily
     * used for WebAuthn.
     * 
     * Deprecated: Using OnClick requires the use of eval() which is a security risk. Use OnClickTrigger instead.
     * @type {string}
     * @memberof UiNodeInputAttributes
     */
    onclick?: string;
    /**
     * OnClickTrigger may contain a WebAuthn trigger which should be executed on click.
     * 
     * The trigger maps to a JavaScript function provided by Ory, which triggers actions such as PassKey registration or login.
     * oryWebAuthnRegistration WebAuthnTriggersWebAuthnRegistration
     * oryWebAuthnLogin WebAuthnTriggersWebAuthnLogin
     * oryPasskeyLogin WebAuthnTriggersPasskeyLogin
     * oryPasskeyLoginAutocompleteInit WebAuthnTriggersPasskeyLoginAutocompleteInit
     * oryPasskeyRegistration WebAuthnTriggersPasskeyRegistration
     * oryPasskeySettingsRegistration WebAuthnTriggersPasskeySettingsRegistration
     * @type {string}
     * @memberof UiNodeInputAttributes
     */
    onclickTrigger?: UiNodeInputAttributesOnclickTriggerEnum;
    /**
     * OnLoad may contain javascript which should be executed on load. This is primarily
     * used for WebAuthn.
     * 
     * Deprecated: Using OnLoad requires the use of eval() which is a security risk. Use OnLoadTrigger instead.
     * @type {string}
     * @memberof UiNodeInputAttributes
     */
    onload?: string;
    /**
     * OnLoadTrigger may contain a WebAuthn trigger which should be executed on load.
     * 
     * The trigger maps to a JavaScript function provided by Ory, which triggers actions such as PassKey registration or login.
     * oryWebAuthnRegistration WebAuthnTriggersWebAuthnRegistration
     * oryWebAuthnLogin WebAuthnTriggersWebAuthnLogin
     * oryPasskeyLogin WebAuthnTriggersPasskeyLogin
     * oryPasskeyLoginAutocompleteInit WebAuthnTriggersPasskeyLoginAutocompleteInit
     * oryPasskeyRegistration WebAuthnTriggersPasskeyRegistration
     * oryPasskeySettingsRegistration WebAuthnTriggersPasskeySettingsRegistration
     * @type {string}
     * @memberof UiNodeInputAttributes
     */
    onloadTrigger?: UiNodeInputAttributesOnloadTriggerEnum;
    /**
     * The input's pattern.
     * @type {string}
     * @memberof UiNodeInputAttributes
     */
    pattern?: string;
    /**
     * Mark this input field as required.
     * @type {boolean}
     * @memberof UiNodeInputAttributes
     */
    required?: boolean;
    /**
     * The input's element type.
     * text InputAttributeTypeText
     * password InputAttributeTypePassword
     * number InputAttributeTypeNumber
     * checkbox InputAttributeTypeCheckbox
     * hidden InputAttributeTypeHidden
     * email InputAttributeTypeEmail
     * tel InputAttributeTypeTel
     * submit InputAttributeTypeSubmit
     * button InputAttributeTypeButton
     * datetime-local InputAttributeTypeDateTimeLocal
     * date InputAttributeTypeDate
     * url InputAttributeTypeURI
     * @type {string}
     * @memberof UiNodeInputAttributes
     */
    type: UiNodeInputAttributesTypeEnum;
    /**
     * The input's value.
     * @type {any}
     * @memberof UiNodeInputAttributes
     */
    value?: any | null;
}


/**
 * @export
 */
export const UiNodeInputAttributesAutocompleteEnum = {
    Email: 'email',
    Tel: 'tel',
    Url: 'url',
    CurrentPassword: 'current-password',
    NewPassword: 'new-password',
    OneTimeCode: 'one-time-code'
} as const;
export type UiNodeInputAttributesAutocompleteEnum = typeof UiNodeInputAttributesAutocompleteEnum[keyof typeof UiNodeInputAttributesAutocompleteEnum];

/**
 * @export
 */
export const UiNodeInputAttributesNodeTypeEnum = {
    Text: 'text',
    Input: 'input',
    Img: 'img',
    A: 'a',
    Script: 'script'
} as const;
export type UiNodeInputAttributesNodeTypeEnum = typeof UiNodeInputAttributesNodeTypeEnum[keyof typeof UiNodeInputAttributesNodeTypeEnum];

/**
 * @export
 */
export const UiNodeInputAttributesOnclickTriggerEnum = {
    OryWebAuthnRegistration: 'oryWebAuthnRegistration',
    OryWebAuthnLogin: 'oryWebAuthnLogin',
    OryPasskeyLogin: 'oryPasskeyLogin',
    OryPasskeyLoginAutocompleteInit: 'oryPasskeyLoginAutocompleteInit',
    OryPasskeyRegistration: 'oryPasskeyRegistration',
    OryPasskeySettingsRegistration: 'oryPasskeySettingsRegistration'
} as const;
export type UiNodeInputAttributesOnclickTriggerEnum = typeof UiNodeInputAttributesOnclickTriggerEnum[keyof typeof UiNodeInputAttributesOnclickTriggerEnum];

/**
 * @export
 */
export const UiNodeInputAttributesOnloadTriggerEnum = {
    OryWebAuthnRegistration: 'oryWebAuthnRegistration',
    OryWebAuthnLogin: 'oryWebAuthnLogin',
    OryPasskeyLogin: 'oryPasskeyLogin',
    OryPasskeyLoginAutocompleteInit: 'oryPasskeyLoginAutocompleteInit',
    OryPasskeyRegistration: 'oryPasskeyRegistration',
    OryPasskeySettingsRegistration: 'oryPasskeySettingsRegistration'
} as const;
export type UiNodeInputAttributesOnloadTriggerEnum = typeof UiNodeInputAttributesOnloadTriggerEnum[keyof typeof UiNodeInputAttributesOnloadTriggerEnum];

/**
 * @export
 */
export const UiNodeInputAttributesTypeEnum = {
    Text: 'text',
    Password: 'password',
    Number: 'number',
    Checkbox: 'checkbox',
    Hidden: 'hidden',
    Email: 'email',
    Tel: 'tel',
    Submit: 'submit',
    Button: 'button',
    DatetimeLocal: 'datetime-local',
    Date: 'date',
    Url: 'url'
} as const;
export type UiNodeInputAttributesTypeEnum = typeof UiNodeInputAttributesTypeEnum[keyof typeof UiNodeInputAttributesTypeEnum];


/**
 * Check if a given object implements the UiNodeInputAttributes interface.
 */
export function instanceOfUiNodeInputAttributes(value: object): value is UiNodeInputAttributes {
    if (!('disabled' in value) || value['disabled'] === undefined) return false;
    if (!('name' in value) || value['name'] === undefined) return false;
    if (!('node_type' in value) || value['node_type'] === undefined) return false;
    if (!('type' in value) || value['type'] === undefined) return false;
    return true;
}

export function UiNodeInputAttributesFromJSON(json: any): UiNodeInputAttributes {
    return UiNodeInputAttributesFromJSONTyped(json, false);
}

export function UiNodeInputAttributesFromJSONTyped(json: any, ignoreDiscriminator: boolean): UiNodeInputAttributes {
    if (json == null) {
        return json;
    }
    return {
        
        'autocomplete': json['autocomplete'] == null ? undefined : json['autocomplete'],
        'disabled': json['disabled'],
        'label': json['label'] == null ? undefined : UiTextFromJSON(json['label']),
        'maxlength': json['maxlength'] == null ? undefined : json['maxlength'],
        'name': json['name'],
        'node_type': json['node_type'],
        'onclick': json['onclick'] == null ? undefined : json['onclick'],
        'onclickTrigger': json['onclickTrigger'] == null ? undefined : json['onclickTrigger'],
        'onload': json['onload'] == null ? undefined : json['onload'],
        'onloadTrigger': json['onloadTrigger'] == null ? undefined : json['onloadTrigger'],
        'pattern': json['pattern'] == null ? undefined : json['pattern'],
        'required': json['required'] == null ? undefined : json['required'],
        'type': json['type'],
        'value': json['value'] == null ? undefined : json['value'],
    };
}

export function UiNodeInputAttributesToJSON(value?: UiNodeInputAttributes | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'autocomplete': value['autocomplete'],
        'disabled': value['disabled'],
        'label': UiTextToJSON(value['label']),
        'maxlength': value['maxlength'],
        'name': value['name'],
        'node_type': value['node_type'],
        'onclick': value['onclick'],
        'onclickTrigger': value['onclickTrigger'],
        'onload': value['onload'],
        'onloadTrigger': value['onloadTrigger'],
        'pattern': value['pattern'],
        'required': value['required'],
        'type': value['type'],
        'value': value['value'],
    };
}

