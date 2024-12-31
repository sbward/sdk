<?php
/**
 * UiNodeInputAttributes
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
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       |
 *
 * The version of the OpenAPI document: v1.15.17
 * Contact: support@ory.sh
 * Generated by: https://openapi-generator.tech
 * Generator version: 7.7.0
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
 * UiNodeInputAttributes Class Doc Comment
 *
 * @category Class
 * @description InputAttributes represents the attributes of an input node
 * @package  Ory\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class UiNodeInputAttributes implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'uiNodeInputAttributes';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'autocomplete' => 'string',
        'disabled' => 'bool',
        'label' => '\Ory\Client\Model\UiText',
        'maxlength' => 'int',
        'name' => 'string',
        'nodeType' => 'string',
        'onclick' => 'string',
        'onclickTrigger' => 'string',
        'onload' => 'string',
        'onloadTrigger' => 'string',
        'pattern' => 'string',
        'required' => 'bool',
        'type' => 'string',
        'value' => 'mixed'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'autocomplete' => null,
        'disabled' => null,
        'label' => null,
        'maxlength' => 'int64',
        'name' => null,
        'nodeType' => null,
        'onclick' => null,
        'onclickTrigger' => null,
        'onload' => null,
        'onloadTrigger' => null,
        'pattern' => null,
        'required' => null,
        'type' => null,
        'value' => null
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'autocomplete' => false,
        'disabled' => false,
        'label' => false,
        'maxlength' => false,
        'name' => false,
        'nodeType' => false,
        'onclick' => false,
        'onclickTrigger' => false,
        'onload' => false,
        'onloadTrigger' => false,
        'pattern' => false,
        'required' => false,
        'type' => false,
        'value' => true
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
        'autocomplete' => 'autocomplete',
        'disabled' => 'disabled',
        'label' => 'label',
        'maxlength' => 'maxlength',
        'name' => 'name',
        'nodeType' => 'node_type',
        'onclick' => 'onclick',
        'onclickTrigger' => 'onclickTrigger',
        'onload' => 'onload',
        'onloadTrigger' => 'onloadTrigger',
        'pattern' => 'pattern',
        'required' => 'required',
        'type' => 'type',
        'value' => 'value'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'autocomplete' => 'setAutocomplete',
        'disabled' => 'setDisabled',
        'label' => 'setLabel',
        'maxlength' => 'setMaxlength',
        'name' => 'setName',
        'nodeType' => 'setNodeType',
        'onclick' => 'setOnclick',
        'onclickTrigger' => 'setOnclickTrigger',
        'onload' => 'setOnload',
        'onloadTrigger' => 'setOnloadTrigger',
        'pattern' => 'setPattern',
        'required' => 'setRequired',
        'type' => 'setType',
        'value' => 'setValue'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'autocomplete' => 'getAutocomplete',
        'disabled' => 'getDisabled',
        'label' => 'getLabel',
        'maxlength' => 'getMaxlength',
        'name' => 'getName',
        'nodeType' => 'getNodeType',
        'onclick' => 'getOnclick',
        'onclickTrigger' => 'getOnclickTrigger',
        'onload' => 'getOnload',
        'onloadTrigger' => 'getOnloadTrigger',
        'pattern' => 'getPattern',
        'required' => 'getRequired',
        'type' => 'getType',
        'value' => 'getValue'
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

    public const AUTOCOMPLETE_EMAIL = 'email';
    public const AUTOCOMPLETE_TEL = 'tel';
    public const AUTOCOMPLETE_URL = 'url';
    public const AUTOCOMPLETE_CURRENT_PASSWORD = 'current-password';
    public const AUTOCOMPLETE_NEW_PASSWORD = 'new-password';
    public const AUTOCOMPLETE_ONE_TIME_CODE = 'one-time-code';
    public const NODE_TYPE_TEXT = 'text';
    public const NODE_TYPE_INPUT = 'input';
    public const NODE_TYPE_IMG = 'img';
    public const NODE_TYPE_A = 'a';
    public const NODE_TYPE_SCRIPT = 'script';
    public const ONCLICK_TRIGGER_ORY_WEB_AUTHN_REGISTRATION = 'oryWebAuthnRegistration';
    public const ONCLICK_TRIGGER_ORY_WEB_AUTHN_LOGIN = 'oryWebAuthnLogin';
    public const ONCLICK_TRIGGER_ORY_PASSKEY_LOGIN = 'oryPasskeyLogin';
    public const ONCLICK_TRIGGER_ORY_PASSKEY_LOGIN_AUTOCOMPLETE_INIT = 'oryPasskeyLoginAutocompleteInit';
    public const ONCLICK_TRIGGER_ORY_PASSKEY_REGISTRATION = 'oryPasskeyRegistration';
    public const ONCLICK_TRIGGER_ORY_PASSKEY_SETTINGS_REGISTRATION = 'oryPasskeySettingsRegistration';
    public const ONLOAD_TRIGGER_ORY_WEB_AUTHN_REGISTRATION = 'oryWebAuthnRegistration';
    public const ONLOAD_TRIGGER_ORY_WEB_AUTHN_LOGIN = 'oryWebAuthnLogin';
    public const ONLOAD_TRIGGER_ORY_PASSKEY_LOGIN = 'oryPasskeyLogin';
    public const ONLOAD_TRIGGER_ORY_PASSKEY_LOGIN_AUTOCOMPLETE_INIT = 'oryPasskeyLoginAutocompleteInit';
    public const ONLOAD_TRIGGER_ORY_PASSKEY_REGISTRATION = 'oryPasskeyRegistration';
    public const ONLOAD_TRIGGER_ORY_PASSKEY_SETTINGS_REGISTRATION = 'oryPasskeySettingsRegistration';
    public const TYPE_TEXT = 'text';
    public const TYPE_PASSWORD = 'password';
    public const TYPE_NUMBER = 'number';
    public const TYPE_CHECKBOX = 'checkbox';
    public const TYPE_HIDDEN = 'hidden';
    public const TYPE_EMAIL = 'email';
    public const TYPE_TEL = 'tel';
    public const TYPE_SUBMIT = 'submit';
    public const TYPE_BUTTON = 'button';
    public const TYPE_DATETIME_LOCAL = 'datetime-local';
    public const TYPE_DATE = 'date';
    public const TYPE_URL = 'url';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getAutocompleteAllowableValues()
    {
        return [
            self::AUTOCOMPLETE_EMAIL,
            self::AUTOCOMPLETE_TEL,
            self::AUTOCOMPLETE_URL,
            self::AUTOCOMPLETE_CURRENT_PASSWORD,
            self::AUTOCOMPLETE_NEW_PASSWORD,
            self::AUTOCOMPLETE_ONE_TIME_CODE,
        ];
    }

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getNodeTypeAllowableValues()
    {
        return [
            self::NODE_TYPE_TEXT,
            self::NODE_TYPE_INPUT,
            self::NODE_TYPE_IMG,
            self::NODE_TYPE_A,
            self::NODE_TYPE_SCRIPT,
        ];
    }

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getOnclickTriggerAllowableValues()
    {
        return [
            self::ONCLICK_TRIGGER_ORY_WEB_AUTHN_REGISTRATION,
            self::ONCLICK_TRIGGER_ORY_WEB_AUTHN_LOGIN,
            self::ONCLICK_TRIGGER_ORY_PASSKEY_LOGIN,
            self::ONCLICK_TRIGGER_ORY_PASSKEY_LOGIN_AUTOCOMPLETE_INIT,
            self::ONCLICK_TRIGGER_ORY_PASSKEY_REGISTRATION,
            self::ONCLICK_TRIGGER_ORY_PASSKEY_SETTINGS_REGISTRATION,
        ];
    }

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getOnloadTriggerAllowableValues()
    {
        return [
            self::ONLOAD_TRIGGER_ORY_WEB_AUTHN_REGISTRATION,
            self::ONLOAD_TRIGGER_ORY_WEB_AUTHN_LOGIN,
            self::ONLOAD_TRIGGER_ORY_PASSKEY_LOGIN,
            self::ONLOAD_TRIGGER_ORY_PASSKEY_LOGIN_AUTOCOMPLETE_INIT,
            self::ONLOAD_TRIGGER_ORY_PASSKEY_REGISTRATION,
            self::ONLOAD_TRIGGER_ORY_PASSKEY_SETTINGS_REGISTRATION,
        ];
    }

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getTypeAllowableValues()
    {
        return [
            self::TYPE_TEXT,
            self::TYPE_PASSWORD,
            self::TYPE_NUMBER,
            self::TYPE_CHECKBOX,
            self::TYPE_HIDDEN,
            self::TYPE_EMAIL,
            self::TYPE_TEL,
            self::TYPE_SUBMIT,
            self::TYPE_BUTTON,
            self::TYPE_DATETIME_LOCAL,
            self::TYPE_DATE,
            self::TYPE_URL,
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
        $this->setIfExists('autocomplete', $data ?? [], null);
        $this->setIfExists('disabled', $data ?? [], null);
        $this->setIfExists('label', $data ?? [], null);
        $this->setIfExists('maxlength', $data ?? [], null);
        $this->setIfExists('name', $data ?? [], null);
        $this->setIfExists('nodeType', $data ?? [], null);
        $this->setIfExists('onclick', $data ?? [], null);
        $this->setIfExists('onclickTrigger', $data ?? [], null);
        $this->setIfExists('onload', $data ?? [], null);
        $this->setIfExists('onloadTrigger', $data ?? [], null);
        $this->setIfExists('pattern', $data ?? [], null);
        $this->setIfExists('required', $data ?? [], null);
        $this->setIfExists('type', $data ?? [], null);
        $this->setIfExists('value', $data ?? [], null);
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

        $allowedValues = $this->getAutocompleteAllowableValues();
        if (!is_null($this->container['autocomplete']) && !in_array($this->container['autocomplete'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'autocomplete', must be one of '%s'",
                $this->container['autocomplete'],
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['disabled'] === null) {
            $invalidProperties[] = "'disabled' can't be null";
        }
        if ($this->container['name'] === null) {
            $invalidProperties[] = "'name' can't be null";
        }
        if ($this->container['nodeType'] === null) {
            $invalidProperties[] = "'nodeType' can't be null";
        }
        $allowedValues = $this->getNodeTypeAllowableValues();
        if (!is_null($this->container['nodeType']) && !in_array($this->container['nodeType'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'nodeType', must be one of '%s'",
                $this->container['nodeType'],
                implode("', '", $allowedValues)
            );
        }

        $allowedValues = $this->getOnclickTriggerAllowableValues();
        if (!is_null($this->container['onclickTrigger']) && !in_array($this->container['onclickTrigger'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'onclickTrigger', must be one of '%s'",
                $this->container['onclickTrigger'],
                implode("', '", $allowedValues)
            );
        }

        $allowedValues = $this->getOnloadTriggerAllowableValues();
        if (!is_null($this->container['onloadTrigger']) && !in_array($this->container['onloadTrigger'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'onloadTrigger', must be one of '%s'",
                $this->container['onloadTrigger'],
                implode("', '", $allowedValues)
            );
        }

        if ($this->container['type'] === null) {
            $invalidProperties[] = "'type' can't be null";
        }
        $allowedValues = $this->getTypeAllowableValues();
        if (!is_null($this->container['type']) && !in_array($this->container['type'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'type', must be one of '%s'",
                $this->container['type'],
                implode("', '", $allowedValues)
            );
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
     * Gets autocomplete
     *
     * @return string|null
     */
    public function getAutocomplete()
    {
        return $this->container['autocomplete'];
    }

    /**
     * Sets autocomplete
     *
     * @param string|null $autocomplete The autocomplete attribute for the input. email InputAttributeAutocompleteEmail tel InputAttributeAutocompleteTel url InputAttributeAutocompleteUrl current-password InputAttributeAutocompleteCurrentPassword new-password InputAttributeAutocompleteNewPassword one-time-code InputAttributeAutocompleteOneTimeCode
     *
     * @return self
     */
    public function setAutocomplete($autocomplete)
    {
        if (is_null($autocomplete)) {
            throw new \InvalidArgumentException('non-nullable autocomplete cannot be null');
        }
        $allowedValues = $this->getAutocompleteAllowableValues();
        if (!in_array($autocomplete, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'autocomplete', must be one of '%s'",
                    $autocomplete,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['autocomplete'] = $autocomplete;

        return $this;
    }

    /**
     * Gets disabled
     *
     * @return bool
     */
    public function getDisabled()
    {
        return $this->container['disabled'];
    }

    /**
     * Sets disabled
     *
     * @param bool $disabled Sets the input's disabled field to true or false.
     *
     * @return self
     */
    public function setDisabled($disabled)
    {
        if (is_null($disabled)) {
            throw new \InvalidArgumentException('non-nullable disabled cannot be null');
        }
        $this->container['disabled'] = $disabled;

        return $this;
    }

    /**
     * Gets label
     *
     * @return \Ory\Client\Model\UiText|null
     */
    public function getLabel()
    {
        return $this->container['label'];
    }

    /**
     * Sets label
     *
     * @param \Ory\Client\Model\UiText|null $label label
     *
     * @return self
     */
    public function setLabel($label)
    {
        if (is_null($label)) {
            throw new \InvalidArgumentException('non-nullable label cannot be null');
        }
        $this->container['label'] = $label;

        return $this;
    }

    /**
     * Gets maxlength
     *
     * @return int|null
     */
    public function getMaxlength()
    {
        return $this->container['maxlength'];
    }

    /**
     * Sets maxlength
     *
     * @param int|null $maxlength MaxLength may contain the input's maximum length.
     *
     * @return self
     */
    public function setMaxlength($maxlength)
    {
        if (is_null($maxlength)) {
            throw new \InvalidArgumentException('non-nullable maxlength cannot be null');
        }
        $this->container['maxlength'] = $maxlength;

        return $this;
    }

    /**
     * Gets name
     *
     * @return string
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string $name The input's element name.
     *
     * @return self
     */
    public function setName($name)
    {
        if (is_null($name)) {
            throw new \InvalidArgumentException('non-nullable name cannot be null');
        }
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets nodeType
     *
     * @return string
     */
    public function getNodeType()
    {
        return $this->container['nodeType'];
    }

    /**
     * Sets nodeType
     *
     * @param string $nodeType NodeType represents this node's types. It is a mirror of `node.type` and is primarily used to allow compatibility with OpenAPI 3.0.  In this struct it technically always is \"input\". text Text input Input img Image a Anchor script Script
     *
     * @return self
     */
    public function setNodeType($nodeType)
    {
        if (is_null($nodeType)) {
            throw new \InvalidArgumentException('non-nullable nodeType cannot be null');
        }
        $allowedValues = $this->getNodeTypeAllowableValues();
        if (!in_array($nodeType, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'nodeType', must be one of '%s'",
                    $nodeType,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['nodeType'] = $nodeType;

        return $this;
    }

    /**
     * Gets onclick
     *
     * @return string|null
     */
    public function getOnclick()
    {
        return $this->container['onclick'];
    }

    /**
     * Sets onclick
     *
     * @param string|null $onclick OnClick may contain javascript which should be executed on click. This is primarily used for WebAuthn.  Deprecated: Using OnClick requires the use of eval() which is a security risk. Use OnClickTrigger instead.
     *
     * @return self
     */
    public function setOnclick($onclick)
    {
        if (is_null($onclick)) {
            throw new \InvalidArgumentException('non-nullable onclick cannot be null');
        }
        $this->container['onclick'] = $onclick;

        return $this;
    }

    /**
     * Gets onclickTrigger
     *
     * @return string|null
     */
    public function getOnclickTrigger()
    {
        return $this->container['onclickTrigger'];
    }

    /**
     * Sets onclickTrigger
     *
     * @param string|null $onclickTrigger OnClickTrigger may contain a WebAuthn trigger which should be executed on click.  The trigger maps to a JavaScript function provided by Ory, which triggers actions such as PassKey registration or login. oryWebAuthnRegistration WebAuthnTriggersWebAuthnRegistration oryWebAuthnLogin WebAuthnTriggersWebAuthnLogin oryPasskeyLogin WebAuthnTriggersPasskeyLogin oryPasskeyLoginAutocompleteInit WebAuthnTriggersPasskeyLoginAutocompleteInit oryPasskeyRegistration WebAuthnTriggersPasskeyRegistration oryPasskeySettingsRegistration WebAuthnTriggersPasskeySettingsRegistration
     *
     * @return self
     */
    public function setOnclickTrigger($onclickTrigger)
    {
        if (is_null($onclickTrigger)) {
            throw new \InvalidArgumentException('non-nullable onclickTrigger cannot be null');
        }
        $allowedValues = $this->getOnclickTriggerAllowableValues();
        if (!in_array($onclickTrigger, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'onclickTrigger', must be one of '%s'",
                    $onclickTrigger,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['onclickTrigger'] = $onclickTrigger;

        return $this;
    }

    /**
     * Gets onload
     *
     * @return string|null
     */
    public function getOnload()
    {
        return $this->container['onload'];
    }

    /**
     * Sets onload
     *
     * @param string|null $onload OnLoad may contain javascript which should be executed on load. This is primarily used for WebAuthn.  Deprecated: Using OnLoad requires the use of eval() which is a security risk. Use OnLoadTrigger instead.
     *
     * @return self
     */
    public function setOnload($onload)
    {
        if (is_null($onload)) {
            throw new \InvalidArgumentException('non-nullable onload cannot be null');
        }
        $this->container['onload'] = $onload;

        return $this;
    }

    /**
     * Gets onloadTrigger
     *
     * @return string|null
     */
    public function getOnloadTrigger()
    {
        return $this->container['onloadTrigger'];
    }

    /**
     * Sets onloadTrigger
     *
     * @param string|null $onloadTrigger OnLoadTrigger may contain a WebAuthn trigger which should be executed on load.  The trigger maps to a JavaScript function provided by Ory, which triggers actions such as PassKey registration or login. oryWebAuthnRegistration WebAuthnTriggersWebAuthnRegistration oryWebAuthnLogin WebAuthnTriggersWebAuthnLogin oryPasskeyLogin WebAuthnTriggersPasskeyLogin oryPasskeyLoginAutocompleteInit WebAuthnTriggersPasskeyLoginAutocompleteInit oryPasskeyRegistration WebAuthnTriggersPasskeyRegistration oryPasskeySettingsRegistration WebAuthnTriggersPasskeySettingsRegistration
     *
     * @return self
     */
    public function setOnloadTrigger($onloadTrigger)
    {
        if (is_null($onloadTrigger)) {
            throw new \InvalidArgumentException('non-nullable onloadTrigger cannot be null');
        }
        $allowedValues = $this->getOnloadTriggerAllowableValues();
        if (!in_array($onloadTrigger, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'onloadTrigger', must be one of '%s'",
                    $onloadTrigger,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['onloadTrigger'] = $onloadTrigger;

        return $this;
    }

    /**
     * Gets pattern
     *
     * @return string|null
     */
    public function getPattern()
    {
        return $this->container['pattern'];
    }

    /**
     * Sets pattern
     *
     * @param string|null $pattern The input's pattern.
     *
     * @return self
     */
    public function setPattern($pattern)
    {
        if (is_null($pattern)) {
            throw new \InvalidArgumentException('non-nullable pattern cannot be null');
        }
        $this->container['pattern'] = $pattern;

        return $this;
    }

    /**
     * Gets required
     *
     * @return bool|null
     */
    public function getRequired()
    {
        return $this->container['required'];
    }

    /**
     * Sets required
     *
     * @param bool|null $required Mark this input field as required.
     *
     * @return self
     */
    public function setRequired($required)
    {
        if (is_null($required)) {
            throw new \InvalidArgumentException('non-nullable required cannot be null');
        }
        $this->container['required'] = $required;

        return $this;
    }

    /**
     * Gets type
     *
     * @return string
     */
    public function getType()
    {
        return $this->container['type'];
    }

    /**
     * Sets type
     *
     * @param string $type The input's element type. text InputAttributeTypeText password InputAttributeTypePassword number InputAttributeTypeNumber checkbox InputAttributeTypeCheckbox hidden InputAttributeTypeHidden email InputAttributeTypeEmail tel InputAttributeTypeTel submit InputAttributeTypeSubmit button InputAttributeTypeButton datetime-local InputAttributeTypeDateTimeLocal date InputAttributeTypeDate url InputAttributeTypeURI
     *
     * @return self
     */
    public function setType($type)
    {
        if (is_null($type)) {
            throw new \InvalidArgumentException('non-nullable type cannot be null');
        }
        $allowedValues = $this->getTypeAllowableValues();
        if (!in_array($type, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'type', must be one of '%s'",
                    $type,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['type'] = $type;

        return $this;
    }

    /**
     * Gets value
     *
     * @return mixed|null
     */
    public function getValue()
    {
        return $this->container['value'];
    }

    /**
     * Sets value
     *
     * @param mixed|null $value The input's value.
     *
     * @return self
     */
    public function setValue($value)
    {
        if (is_null($value)) {
            array_push($this->openAPINullablesSetToNull, 'value');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('value', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['value'] = $value;

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


