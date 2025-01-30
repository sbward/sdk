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
import type { PlanDetails } from './PlanDetails';
import {
    PlanDetailsFromJSON,
    PlanDetailsFromJSONTyped,
    PlanDetailsToJSON,
} from './PlanDetails';

/**
 * 
 * @export
 * @interface Subscription
 */
export interface Subscription {
    /**
     * 
     * @type {Date}
     * @memberof Subscription
     */
    readonly created_at: Date;
    /**
     * The currency of the subscription. To change this, a new subscription must be created.
     * usd USD
     * eur Euro
     * @type {string}
     * @memberof Subscription
     */
    readonly currency: SubscriptionCurrencyEnum;
    /**
     * The currently active interval of the subscription
     * monthly Monthly
     * yearly Yearly
     * @type {string}
     * @memberof Subscription
     */
    readonly current_interval: SubscriptionCurrentIntervalEnum;
    /**
     * The currently active plan of the subscription
     * @type {string}
     * @memberof Subscription
     */
    readonly current_plan: string;
    /**
     * 
     * @type {PlanDetails}
     * @memberof Subscription
     */
    current_plan_details?: PlanDetails;
    /**
     * The ID of the stripe customer
     * @type {string}
     * @memberof Subscription
     */
    readonly customer_id: string;
    /**
     * The ID of the subscription
     * @type {string}
     * @memberof Subscription
     */
    readonly id: string;
    /**
     * 
     * @type {string}
     * @memberof Subscription
     */
    interval_changes_to: string | null;
    /**
     * 
     * @type {string}
     * @memberof Subscription
     */
    ongoing_stripe_checkout_id?: string | null;
    /**
     * Until when the subscription is payed
     * @type {Date}
     * @memberof Subscription
     */
    readonly payed_until: Date;
    /**
     * 
     * @type {Date}
     * @memberof Subscription
     */
    plan_changes_at?: Date;
    /**
     * 
     * @type {string}
     * @memberof Subscription
     */
    plan_changes_to: string | null;
    /**
     * For `collection_method=charge_automatically` a subscription moves into `incomplete` if the initial payment attempt fails. A subscription in this status can only have metadata and default_source updated. Once the first invoice is paid, the subscription moves into an `active` status. If the first invoice is not paid within 23 hours, the subscription transitions to `incomplete_expired`. This is a terminal status, the open invoice will be voided and no further invoices will be generated.
     * 
     * A subscription that is currently in a trial period is `trialing` and moves to `active` when the trial period is over.
     * 
     * A subscription can only enter a `paused` status [when a trial ends without a payment method](https://stripe.com/billing/subscriptions/trials#create-free-trials-without-payment). A `paused` subscription doesn't generate invoices and can be resumed after your customer adds their payment method. The `paused` status is different from [pausing collection](https://stripe.com/billing/subscriptions/pause-payment), which still generates invoices and leaves the subscription's status unchanged.
     * 
     * If subscription `collection_method=charge_automatically`, it becomes `past_due` when payment is required but cannot be paid (due to failed payment or awaiting additional user actions). Once Stripe has exhausted all payment retry attempts, the subscription will become `canceled` or `unpaid` (depending on your subscriptions settings).
     * 
     * If subscription `collection_method=send_invoice` it becomes `past_due` when its invoice is not paid by the due date, and `canceled` or `unpaid` if it is still not paid by an additional deadline after that. Note that when a subscription has a status of `unpaid`, no subsequent invoices will be attempted (invoices will be created, but then immediately automatically closed). After receiving updated payment information from a customer, you may choose to reopen and pay their closed invoices.
     * @type {string}
     * @memberof Subscription
     */
    status: string;
    /**
     * 
     * @type {Date}
     * @memberof Subscription
     */
    stripe_checkout_expires_at?: Date;
    /**
     * 
     * @type {Date}
     * @memberof Subscription
     */
    readonly updated_at: Date;
}


/**
 * @export
 */
export const SubscriptionCurrencyEnum = {
    Usd: 'usd',
    Eur: 'eur'
} as const;
export type SubscriptionCurrencyEnum = typeof SubscriptionCurrencyEnum[keyof typeof SubscriptionCurrencyEnum];

/**
 * @export
 */
export const SubscriptionCurrentIntervalEnum = {
    Monthly: 'monthly',
    Yearly: 'yearly'
} as const;
export type SubscriptionCurrentIntervalEnum = typeof SubscriptionCurrentIntervalEnum[keyof typeof SubscriptionCurrentIntervalEnum];


/**
 * Check if a given object implements the Subscription interface.
 */
export function instanceOfSubscription(value: object): value is Subscription {
    if (!('created_at' in value) || value['created_at'] === undefined) return false;
    if (!('currency' in value) || value['currency'] === undefined) return false;
    if (!('current_interval' in value) || value['current_interval'] === undefined) return false;
    if (!('current_plan' in value) || value['current_plan'] === undefined) return false;
    if (!('customer_id' in value) || value['customer_id'] === undefined) return false;
    if (!('id' in value) || value['id'] === undefined) return false;
    if (!('interval_changes_to' in value) || value['interval_changes_to'] === undefined) return false;
    if (!('payed_until' in value) || value['payed_until'] === undefined) return false;
    if (!('plan_changes_to' in value) || value['plan_changes_to'] === undefined) return false;
    if (!('status' in value) || value['status'] === undefined) return false;
    if (!('updated_at' in value) || value['updated_at'] === undefined) return false;
    return true;
}

export function SubscriptionFromJSON(json: any): Subscription {
    return SubscriptionFromJSONTyped(json, false);
}

export function SubscriptionFromJSONTyped(json: any, ignoreDiscriminator: boolean): Subscription {
    if (json == null) {
        return json;
    }
    return {
        
        'created_at': (new Date(json['created_at'])),
        'currency': json['currency'],
        'current_interval': json['current_interval'],
        'current_plan': json['current_plan'],
        'current_plan_details': json['current_plan_details'] == null ? undefined : PlanDetailsFromJSON(json['current_plan_details']),
        'customer_id': json['customer_id'],
        'id': json['id'],
        'interval_changes_to': json['interval_changes_to'],
        'ongoing_stripe_checkout_id': json['ongoing_stripe_checkout_id'] == null ? undefined : json['ongoing_stripe_checkout_id'],
        'payed_until': (new Date(json['payed_until'])),
        'plan_changes_at': json['plan_changes_at'] == null ? undefined : (new Date(json['plan_changes_at'])),
        'plan_changes_to': json['plan_changes_to'],
        'status': json['status'],
        'stripe_checkout_expires_at': json['stripe_checkout_expires_at'] == null ? undefined : (new Date(json['stripe_checkout_expires_at'])),
        'updated_at': (new Date(json['updated_at'])),
    };
}

export function SubscriptionToJSON(value?: Omit<Subscription, 'created_at'|'currency'|'current_interval'|'current_plan'|'customer_id'|'id'|'payed_until'|'updated_at'> | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'current_plan_details': PlanDetailsToJSON(value['current_plan_details']),
        'interval_changes_to': value['interval_changes_to'],
        'ongoing_stripe_checkout_id': value['ongoing_stripe_checkout_id'],
        'plan_changes_at': value['plan_changes_at'] == null ? undefined : ((value['plan_changes_at']).toISOString()),
        'plan_changes_to': value['plan_changes_to'],
        'status': value['status'],
        'stripe_checkout_expires_at': value['stripe_checkout_expires_at'] == null ? undefined : ((value['stripe_checkout_expires_at']).toISOString()),
    };
}

