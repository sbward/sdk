<?php
/**
 * Subscription
 *
 * PHP version 7.4
 *
 * @category Class
 * @package  Ory\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.
 *
 * The version of the OpenAPI document: v1.12.1
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.4.0
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace Ory\Client\Model;

use \ArrayAccess;
use \Ory\Client\ObjectSerializer;

/**
 * Subscription Class Doc Comment
 *
 * @category Class
 * @package  Ory\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class Subscription implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'subscription';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'createdAt' => '\DateTime',
        'currency' => 'string',
        'currentInterval' => 'string',
        'currentPlan' => 'string',
        'currentPlanDetails' => '\Ory\Client\Model\PlanDetails',
        'customerId' => 'string',
        'id' => 'string',
        'intervalChangesTo' => 'string',
        'ongoingStripeCheckoutId' => 'string',
        'payedUntil' => '\DateTime',
        'planChangesAt' => '\DateTime',
        'planChangesTo' => 'string',
        'status' => 'string',
        'stripeCheckoutExpiresAt' => '\DateTime',
        'updatedAt' => '\DateTime'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'createdAt' => 'date-time',
        'currency' => null,
        'currentInterval' => null,
        'currentPlan' => null,
        'currentPlanDetails' => null,
        'customerId' => null,
        'id' => 'uuid',
        'intervalChangesTo' => null,
        'ongoingStripeCheckoutId' => null,
        'payedUntil' => 'date-time',
        'planChangesAt' => 'date-time',
        'planChangesTo' => null,
        'status' => null,
        'stripeCheckoutExpiresAt' => 'date-time',
        'updatedAt' => 'date-time'
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'createdAt' => false,
        'currency' => false,
        'currentInterval' => false,
        'currentPlan' => false,
        'currentPlanDetails' => false,
        'customerId' => false,
        'id' => false,
        'intervalChangesTo' => true,
        'ongoingStripeCheckoutId' => true,
        'payedUntil' => false,
        'planChangesAt' => false,
        'planChangesTo' => true,
        'status' => false,
        'stripeCheckoutExpiresAt' => false,
        'updatedAt' => false
    ];

    /**
      * If a nullable field gets set to null, insert it here
      *
      * @var boolean[]
      */
    protected array $openAPINullablesSetToNull = [];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of nullable properties
     *
     * @return array
     */
    protected static function openAPINullables(): array
    {
        return self::$openAPINullables;
    }

    /**
     * Array of nullable field names deliberately set to null
     *
     * @return boolean[]
     */
    private function getOpenAPINullablesSetToNull(): array
    {
        return $this->openAPINullablesSetToNull;
    }

    /**
     * Setter - Array of nullable field names deliberately set to null
     *
     * @param boolean[] $openAPINullablesSetToNull
     */
    private function setOpenAPINullablesSetToNull(array $openAPINullablesSetToNull): void
    {
        $this->openAPINullablesSetToNull = $openAPINullablesSetToNull;
    }

    /**
     * Checks if a property is nullable
     *
     * @param string $property
     * @return bool
     */
    public static function isNullable(string $property): bool
    {
        return self::openAPINullables()[$property] ?? false;
    }

    /**
     * Checks if a nullable property is set to null.
     *
     * @param string $property
     * @return bool
     */
    public function isNullableSetToNull(string $property): bool
    {
        return in_array($property, $this->getOpenAPINullablesSetToNull(), true);
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'createdAt' => 'created_at',
        'currency' => 'currency',
        'currentInterval' => 'current_interval',
        'currentPlan' => 'current_plan',
        'currentPlanDetails' => 'current_plan_details',
        'customerId' => 'customer_id',
        'id' => 'id',
        'intervalChangesTo' => 'interval_changes_to',
        'ongoingStripeCheckoutId' => 'ongoing_stripe_checkout_id',
        'payedUntil' => 'payed_until',
        'planChangesAt' => 'plan_changes_at',
        'planChangesTo' => 'plan_changes_to',
        'status' => 'status',
        'stripeCheckoutExpiresAt' => 'stripe_checkout_expires_at',
        'updatedAt' => 'updated_at'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'createdAt' => 'setCreatedAt',
        'currency' => 'setCurrency',
        'currentInterval' => 'setCurrentInterval',
        'currentPlan' => 'setCurrentPlan',
        'currentPlanDetails' => 'setCurrentPlanDetails',
        'customerId' => 'setCustomerId',
        'id' => 'setId',
        'intervalChangesTo' => 'setIntervalChangesTo',
        'ongoingStripeCheckoutId' => 'setOngoingStripeCheckoutId',
        'payedUntil' => 'setPayedUntil',
        'planChangesAt' => 'setPlanChangesAt',
        'planChangesTo' => 'setPlanChangesTo',
        'status' => 'setStatus',
        'stripeCheckoutExpiresAt' => 'setStripeCheckoutExpiresAt',
        'updatedAt' => 'setUpdatedAt'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'createdAt' => 'getCreatedAt',
        'currency' => 'getCurrency',
        'currentInterval' => 'getCurrentInterval',
        'currentPlan' => 'getCurrentPlan',
        'currentPlanDetails' => 'getCurrentPlanDetails',
        'customerId' => 'getCustomerId',
        'id' => 'getId',
        'intervalChangesTo' => 'getIntervalChangesTo',
        'ongoingStripeCheckoutId' => 'getOngoingStripeCheckoutId',
        'payedUntil' => 'getPayedUntil',
        'planChangesAt' => 'getPlanChangesAt',
        'planChangesTo' => 'getPlanChangesTo',
        'status' => 'getStatus',
        'stripeCheckoutExpiresAt' => 'getStripeCheckoutExpiresAt',
        'updatedAt' => 'getUpdatedAt'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }

    public const CURRENCY_USD = 'usd';
    public const CURRENCY_EUR = 'eur';
    public const CURRENT_INTERVAL_MONTHLY = 'monthly';
    public const CURRENT_INTERVAL_YEARLY = 'yearly';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getCurrencyAllowableValues()
    {
        return [
            self::CURRENCY_USD,
            self::CURRENCY_EUR,
        ];
    }

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getCurrentIntervalAllowableValues()
    {
        return [
            self::CURRENT_INTERVAL_MONTHLY,
            self::CURRENT_INTERVAL_YEARLY,
        ];
    }

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->setIfExists('createdAt', $data ?? [], null);
        $this->setIfExists('currency', $data ?? [], null);
        $this->setIfExists('currentInterval', $data ?? [], null);
        $this->setIfExists('currentPlan', $data ?? [], null);
        $this->setIfExists('currentPlanDetails', $data ?? [], null);
        $this->setIfExists('customerId', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('intervalChangesTo', $data ?? [], null);
        $this->setIfExists('ongoingStripeCheckoutId', $data ?? [], null);
        $this->setIfExists('payedUntil', $data ?? [], null);
        $this->setIfExists('planChangesAt', $data ?? [], null);
        $this->setIfExists('planChangesTo', $data ?? [], null);
        $this->setIfExists('status', $data ?? [], null);
        $this->setIfExists('stripeCheckoutExpiresAt', $data ?? [], null);
        $this->setIfExists('updatedAt', $data ?? [], null);
    }

    /**
    * Sets $this->container[$variableName] to the given data or to the given default Value; if $variableName
    * is nullable and its value is set to null in the $fields array, then mark it as "set to null" in the
    * $this->openAPINullablesSetToNull array
    *
    * @param string $variableName
    * @param array  $fields
    * @param mixed  $defaultValue
    */
    private function setIfExists(string $variableName, array $fields, $defaultValue): void
    {
        if (self::isNullable($variableName) && array_key_exists($variableName, $fields) && is_null($fields[$variableName])) {
            $this->openAPINullablesSetToNull[] = $variableName;
        }

        $this->container[$variableName] = $fields[$variableName] ?? $defaultValue;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['createdAt'] === null) {
            $invalidProperties[] = "'createdAt' can't be null";
        }
        if ($this->container['currency'] === null) {
            $invalidProperties[] = "'currency' can't be null";
        }
        $allowedValues = $this->getCurrencyAllowableValues();
        if (!is_null($this->container['currency']) && !in_array($this->container['currency'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'currency', must be one of '%s'",
                $this->container['currency'],
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['currentInterval'] === null) {
            $invalidProperties[] = "'currentInterval' can't be null";
        }
        $allowedValues = $this->getCurrentIntervalAllowableValues();
        if (!is_null($this->container['currentInterval']) && !in_array($this->container['currentInterval'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'currentInterval', must be one of '%s'",
                $this->container['currentInterval'],
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['currentPlan'] === null) {
            $invalidProperties[] = "'currentPlan' can't be null";
        }
        if ($this->container['customerId'] === null) {
            $invalidProperties[] = "'customerId' can't be null";
        }
        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if ($this->container['intervalChangesTo'] === null) {
            $invalidProperties[] = "'intervalChangesTo' can't be null";
        }
        if ($this->container['payedUntil'] === null) {
            $invalidProperties[] = "'payedUntil' can't be null";
        }
        if ($this->container['planChangesTo'] === null) {
            $invalidProperties[] = "'planChangesTo' can't be null";
        }
        if ($this->container['status'] === null) {
            $invalidProperties[] = "'status' can't be null";
        }
        if ($this->container['updatedAt'] === null) {
            $invalidProperties[] = "'updatedAt' can't be null";
        }
        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets createdAt
     *
     * @return \DateTime
     */
    public function getCreatedAt()
    {
        return $this->container['createdAt'];
    }

    /**
     * Sets createdAt
     *
     * @param \DateTime $createdAt createdAt
     *
     * @return self
     */
    public function setCreatedAt($createdAt)
    {
        if (is_null($createdAt)) {
            throw new \InvalidArgumentException('non-nullable createdAt cannot be null');
        }
        $this->container['createdAt'] = $createdAt;

        return $this;
    }

    /**
     * Gets currency
     *
     * @return string
     */
    public function getCurrency()
    {
        return $this->container['currency'];
    }

    /**
     * Sets currency
     *
     * @param string $currency The currency of the subscription. To change this, a new subscription must be created. usd USD eur Euro
     *
     * @return self
     */
    public function setCurrency($currency)
    {
        if (is_null($currency)) {
            throw new \InvalidArgumentException('non-nullable currency cannot be null');
        }
        $allowedValues = $this->getCurrencyAllowableValues();
        if (!in_array($currency, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'currency', must be one of '%s'",
                    $currency,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['currency'] = $currency;

        return $this;
    }

    /**
     * Gets currentInterval
     *
     * @return string
     */
    public function getCurrentInterval()
    {
        return $this->container['currentInterval'];
    }

    /**
     * Sets currentInterval
     *
     * @param string $currentInterval The currently active interval of the subscription monthly Monthly yearly Yearly
     *
     * @return self
     */
    public function setCurrentInterval($currentInterval)
    {
        if (is_null($currentInterval)) {
            throw new \InvalidArgumentException('non-nullable currentInterval cannot be null');
        }
        $allowedValues = $this->getCurrentIntervalAllowableValues();
        if (!in_array($currentInterval, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'currentInterval', must be one of '%s'",
                    $currentInterval,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['currentInterval'] = $currentInterval;

        return $this;
    }

    /**
     * Gets currentPlan
     *
     * @return string
     */
    public function getCurrentPlan()
    {
        return $this->container['currentPlan'];
    }

    /**
     * Sets currentPlan
     *
     * @param string $currentPlan The currently active plan of the subscription
     *
     * @return self
     */
    public function setCurrentPlan($currentPlan)
    {
        if (is_null($currentPlan)) {
            throw new \InvalidArgumentException('non-nullable currentPlan cannot be null');
        }
        $this->container['currentPlan'] = $currentPlan;

        return $this;
    }

    /**
     * Gets currentPlanDetails
     *
     * @return \Ory\Client\Model\PlanDetails|null
     */
    public function getCurrentPlanDetails()
    {
        return $this->container['currentPlanDetails'];
    }

    /**
     * Sets currentPlanDetails
     *
     * @param \Ory\Client\Model\PlanDetails|null $currentPlanDetails currentPlanDetails
     *
     * @return self
     */
    public function setCurrentPlanDetails($currentPlanDetails)
    {
        if (is_null($currentPlanDetails)) {
            throw new \InvalidArgumentException('non-nullable currentPlanDetails cannot be null');
        }
        $this->container['currentPlanDetails'] = $currentPlanDetails;

        return $this;
    }

    /**
     * Gets customerId
     *
     * @return string
     */
    public function getCustomerId()
    {
        return $this->container['customerId'];
    }

    /**
     * Sets customerId
     *
     * @param string $customerId The ID of the stripe customer
     *
     * @return self
     */
    public function setCustomerId($customerId)
    {
        if (is_null($customerId)) {
            throw new \InvalidArgumentException('non-nullable customerId cannot be null');
        }
        $this->container['customerId'] = $customerId;

        return $this;
    }

    /**
     * Gets id
     *
     * @return string
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param string $id The ID of the subscription
     *
     * @return self
     */
    public function setId($id)
    {
        if (is_null($id)) {
            throw new \InvalidArgumentException('non-nullable id cannot be null');
        }
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets intervalChangesTo
     *
     * @return string
     */
    public function getIntervalChangesTo()
    {
        return $this->container['intervalChangesTo'];
    }

    /**
     * Sets intervalChangesTo
     *
     * @param string $intervalChangesTo intervalChangesTo
     *
     * @return self
     */
    public function setIntervalChangesTo($intervalChangesTo)
    {
        if (is_null($intervalChangesTo)) {
            array_push($this->openAPINullablesSetToNull, 'intervalChangesTo');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('intervalChangesTo', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['intervalChangesTo'] = $intervalChangesTo;

        return $this;
    }

    /**
     * Gets ongoingStripeCheckoutId
     *
     * @return string|null
     */
    public function getOngoingStripeCheckoutId()
    {
        return $this->container['ongoingStripeCheckoutId'];
    }

    /**
     * Sets ongoingStripeCheckoutId
     *
     * @param string|null $ongoingStripeCheckoutId ongoingStripeCheckoutId
     *
     * @return self
     */
    public function setOngoingStripeCheckoutId($ongoingStripeCheckoutId)
    {
        if (is_null($ongoingStripeCheckoutId)) {
            array_push($this->openAPINullablesSetToNull, 'ongoingStripeCheckoutId');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('ongoingStripeCheckoutId', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['ongoingStripeCheckoutId'] = $ongoingStripeCheckoutId;

        return $this;
    }

    /**
     * Gets payedUntil
     *
     * @return \DateTime
     */
    public function getPayedUntil()
    {
        return $this->container['payedUntil'];
    }

    /**
     * Sets payedUntil
     *
     * @param \DateTime $payedUntil Until when the subscription is payed
     *
     * @return self
     */
    public function setPayedUntil($payedUntil)
    {
        if (is_null($payedUntil)) {
            throw new \InvalidArgumentException('non-nullable payedUntil cannot be null');
        }
        $this->container['payedUntil'] = $payedUntil;

        return $this;
    }

    /**
     * Gets planChangesAt
     *
     * @return \DateTime|null
     */
    public function getPlanChangesAt()
    {
        return $this->container['planChangesAt'];
    }

    /**
     * Sets planChangesAt
     *
     * @param \DateTime|null $planChangesAt planChangesAt
     *
     * @return self
     */
    public function setPlanChangesAt($planChangesAt)
    {
        if (is_null($planChangesAt)) {
            throw new \InvalidArgumentException('non-nullable planChangesAt cannot be null');
        }
        $this->container['planChangesAt'] = $planChangesAt;

        return $this;
    }

    /**
     * Gets planChangesTo
     *
     * @return string
     */
    public function getPlanChangesTo()
    {
        return $this->container['planChangesTo'];
    }

    /**
     * Sets planChangesTo
     *
     * @param string $planChangesTo planChangesTo
     *
     * @return self
     */
    public function setPlanChangesTo($planChangesTo)
    {
        if (is_null($planChangesTo)) {
            array_push($this->openAPINullablesSetToNull, 'planChangesTo');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('planChangesTo', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['planChangesTo'] = $planChangesTo;

        return $this;
    }

    /**
     * Gets status
     *
     * @return string
     */
    public function getStatus()
    {
        return $this->container['status'];
    }

    /**
     * Sets status
     *
     * @param string $status For `collection_method=charge_automatically` a subscription moves into `incomplete` if the initial payment attempt fails. A subscription in this status can only have metadata and default_source updated. Once the first invoice is paid, the subscription moves into an `active` status. If the first invoice is not paid within 23 hours, the subscription transitions to `incomplete_expired`. This is a terminal status, the open invoice will be voided and no further invoices will be generated.  A subscription that is currently in a trial period is `trialing` and moves to `active` when the trial period is over.  A subscription can only enter a `paused` status [when a trial ends without a payment method](https://stripe.com/billing/subscriptions/trials#create-free-trials-without-payment). A `paused` subscription doesn't generate invoices and can be resumed after your customer adds their payment method. The `paused` status is different from [pausing collection](https://stripe.com/billing/subscriptions/pause-payment), which still generates invoices and leaves the subscription's status unchanged.  If subscription `collection_method=charge_automatically`, it becomes `past_due` when payment is required but cannot be paid (due to failed payment or awaiting additional user actions). Once Stripe has exhausted all payment retry attempts, the subscription will become `canceled` or `unpaid` (depending on your subscriptions settings).  If subscription `collection_method=send_invoice` it becomes `past_due` when its invoice is not paid by the due date, and `canceled` or `unpaid` if it is still not paid by an additional deadline after that. Note that when a subscription has a status of `unpaid`, no subsequent invoices will be attempted (invoices will be created, but then immediately automatically closed). After receiving updated payment information from a customer, you may choose to reopen and pay their closed invoices.
     *
     * @return self
     */
    public function setStatus($status)
    {
        if (is_null($status)) {
            throw new \InvalidArgumentException('non-nullable status cannot be null');
        }
        $this->container['status'] = $status;

        return $this;
    }

    /**
     * Gets stripeCheckoutExpiresAt
     *
     * @return \DateTime|null
     */
    public function getStripeCheckoutExpiresAt()
    {
        return $this->container['stripeCheckoutExpiresAt'];
    }

    /**
     * Sets stripeCheckoutExpiresAt
     *
     * @param \DateTime|null $stripeCheckoutExpiresAt stripeCheckoutExpiresAt
     *
     * @return self
     */
    public function setStripeCheckoutExpiresAt($stripeCheckoutExpiresAt)
    {
        if (is_null($stripeCheckoutExpiresAt)) {
            throw new \InvalidArgumentException('non-nullable stripeCheckoutExpiresAt cannot be null');
        }
        $this->container['stripeCheckoutExpiresAt'] = $stripeCheckoutExpiresAt;

        return $this;
    }

    /**
     * Gets updatedAt
     *
     * @return \DateTime
     */
    public function getUpdatedAt()
    {
        return $this->container['updatedAt'];
    }

    /**
     * Sets updatedAt
     *
     * @param \DateTime $updatedAt updatedAt
     *
     * @return self
     */
    public function setUpdatedAt($updatedAt)
    {
        if (is_null($updatedAt)) {
            throw new \InvalidArgumentException('non-nullable updatedAt cannot be null');
        }
        $this->container['updatedAt'] = $updatedAt;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset): bool
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    #[\ReturnTypeWillChange]
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value): void
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset): void
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    #[\ReturnTypeWillChange]
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


