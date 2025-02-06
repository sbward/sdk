<?php
/**
 * NormalizedProjectRevisionThirdPartyProvider
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
 * The version of the OpenAPI document: v1.16.6
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
 * NormalizedProjectRevisionThirdPartyProvider Class Doc Comment
 *
 * @category Class
 * @package  Ory\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<string, mixed>
 */
class NormalizedProjectRevisionThirdPartyProvider implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'normalizedProjectRevisionThirdPartyProvider';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'additionalIdTokenAudiences' => 'string[]',
        'applePrivateKey' => 'string',
        'applePrivateKeyId' => 'string',
        'appleTeamId' => 'string',
        'authUrl' => 'string',
        'azureTenant' => 'string',
        'claimsSource' => 'string',
        'clientId' => 'string',
        'clientSecret' => 'string',
        'createdAt' => '\DateTime',
        'id' => 'string',
        'issuerUrl' => 'string',
        'label' => 'string',
        'mapperUrl' => 'string',
        'organizationId' => 'string',
        'pkce' => 'string',
        'projectRevisionId' => 'string',
        'provider' => 'string',
        'providerId' => 'string',
        'requestedClaims' => 'object',
        'scope' => 'string[]',
        'state' => 'string',
        'subjectSource' => 'string',
        'tokenUrl' => 'string',
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
        'additionalIdTokenAudiences' => null,
        'applePrivateKey' => null,
        'applePrivateKeyId' => null,
        'appleTeamId' => null,
        'authUrl' => null,
        'azureTenant' => null,
        'claimsSource' => null,
        'clientId' => null,
        'clientSecret' => null,
        'createdAt' => 'date-time',
        'id' => 'uuid',
        'issuerUrl' => null,
        'label' => null,
        'mapperUrl' => null,
        'organizationId' => 'uuid4',
        'pkce' => null,
        'projectRevisionId' => 'uuid',
        'provider' => null,
        'providerId' => null,
        'requestedClaims' => null,
        'scope' => null,
        'state' => null,
        'subjectSource' => null,
        'tokenUrl' => null,
        'updatedAt' => 'date-time'
    ];

    /**
      * Array of nullable properties. Used for (de)serialization
      *
      * @var boolean[]
      */
    protected static array $openAPINullables = [
        'additionalIdTokenAudiences' => false,
        'applePrivateKey' => true,
        'applePrivateKeyId' => false,
        'appleTeamId' => false,
        'authUrl' => false,
        'azureTenant' => false,
        'claimsSource' => true,
        'clientId' => false,
        'clientSecret' => true,
        'createdAt' => false,
        'id' => false,
        'issuerUrl' => false,
        'label' => false,
        'mapperUrl' => false,
        'organizationId' => true,
        'pkce' => true,
        'projectRevisionId' => false,
        'provider' => false,
        'providerId' => false,
        'requestedClaims' => false,
        'scope' => false,
        'state' => false,
        'subjectSource' => true,
        'tokenUrl' => false,
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
        'additionalIdTokenAudiences' => 'additional_id_token_audiences',
        'applePrivateKey' => 'apple_private_key',
        'applePrivateKeyId' => 'apple_private_key_id',
        'appleTeamId' => 'apple_team_id',
        'authUrl' => 'auth_url',
        'azureTenant' => 'azure_tenant',
        'claimsSource' => 'claims_source',
        'clientId' => 'client_id',
        'clientSecret' => 'client_secret',
        'createdAt' => 'created_at',
        'id' => 'id',
        'issuerUrl' => 'issuer_url',
        'label' => 'label',
        'mapperUrl' => 'mapper_url',
        'organizationId' => 'organization_id',
        'pkce' => 'pkce',
        'projectRevisionId' => 'project_revision_id',
        'provider' => 'provider',
        'providerId' => 'provider_id',
        'requestedClaims' => 'requested_claims',
        'scope' => 'scope',
        'state' => 'state',
        'subjectSource' => 'subject_source',
        'tokenUrl' => 'token_url',
        'updatedAt' => 'updated_at'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'additionalIdTokenAudiences' => 'setAdditionalIdTokenAudiences',
        'applePrivateKey' => 'setApplePrivateKey',
        'applePrivateKeyId' => 'setApplePrivateKeyId',
        'appleTeamId' => 'setAppleTeamId',
        'authUrl' => 'setAuthUrl',
        'azureTenant' => 'setAzureTenant',
        'claimsSource' => 'setClaimsSource',
        'clientId' => 'setClientId',
        'clientSecret' => 'setClientSecret',
        'createdAt' => 'setCreatedAt',
        'id' => 'setId',
        'issuerUrl' => 'setIssuerUrl',
        'label' => 'setLabel',
        'mapperUrl' => 'setMapperUrl',
        'organizationId' => 'setOrganizationId',
        'pkce' => 'setPkce',
        'projectRevisionId' => 'setProjectRevisionId',
        'provider' => 'setProvider',
        'providerId' => 'setProviderId',
        'requestedClaims' => 'setRequestedClaims',
        'scope' => 'setScope',
        'state' => 'setState',
        'subjectSource' => 'setSubjectSource',
        'tokenUrl' => 'setTokenUrl',
        'updatedAt' => 'setUpdatedAt'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'additionalIdTokenAudiences' => 'getAdditionalIdTokenAudiences',
        'applePrivateKey' => 'getApplePrivateKey',
        'applePrivateKeyId' => 'getApplePrivateKeyId',
        'appleTeamId' => 'getAppleTeamId',
        'authUrl' => 'getAuthUrl',
        'azureTenant' => 'getAzureTenant',
        'claimsSource' => 'getClaimsSource',
        'clientId' => 'getClientId',
        'clientSecret' => 'getClientSecret',
        'createdAt' => 'getCreatedAt',
        'id' => 'getId',
        'issuerUrl' => 'getIssuerUrl',
        'label' => 'getLabel',
        'mapperUrl' => 'getMapperUrl',
        'organizationId' => 'getOrganizationId',
        'pkce' => 'getPkce',
        'projectRevisionId' => 'getProjectRevisionId',
        'provider' => 'getProvider',
        'providerId' => 'getProviderId',
        'requestedClaims' => 'getRequestedClaims',
        'scope' => 'getScope',
        'state' => 'getState',
        'subjectSource' => 'getSubjectSource',
        'tokenUrl' => 'getTokenUrl',
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

    public const PKCE_AUTO = 'auto';
    public const PKCE_NEVER = 'never';
    public const PKCE_FORCE = 'force';
    public const STATE_ENABLED = 'enabled';
    public const STATE_DISABLED = 'disabled';

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getPkceAllowableValues()
    {
        return [
            self::PKCE_AUTO,
            self::PKCE_NEVER,
            self::PKCE_FORCE,
        ];
    }

    /**
     * Gets allowable values of the enum
     *
     * @return string[]
     */
    public function getStateAllowableValues()
    {
        return [
            self::STATE_ENABLED,
            self::STATE_DISABLED,
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
        $this->setIfExists('additionalIdTokenAudiences', $data ?? [], null);
        $this->setIfExists('applePrivateKey', $data ?? [], null);
        $this->setIfExists('applePrivateKeyId', $data ?? [], null);
        $this->setIfExists('appleTeamId', $data ?? [], null);
        $this->setIfExists('authUrl', $data ?? [], null);
        $this->setIfExists('azureTenant', $data ?? [], null);
        $this->setIfExists('claimsSource', $data ?? [], null);
        $this->setIfExists('clientId', $data ?? [], null);
        $this->setIfExists('clientSecret', $data ?? [], null);
        $this->setIfExists('createdAt', $data ?? [], null);
        $this->setIfExists('id', $data ?? [], null);
        $this->setIfExists('issuerUrl', $data ?? [], null);
        $this->setIfExists('label', $data ?? [], null);
        $this->setIfExists('mapperUrl', $data ?? [], null);
        $this->setIfExists('organizationId', $data ?? [], null);
        $this->setIfExists('pkce', $data ?? [], null);
        $this->setIfExists('projectRevisionId', $data ?? [], null);
        $this->setIfExists('provider', $data ?? [], null);
        $this->setIfExists('providerId', $data ?? [], null);
        $this->setIfExists('requestedClaims', $data ?? [], null);
        $this->setIfExists('scope', $data ?? [], null);
        $this->setIfExists('state', $data ?? [], null);
        $this->setIfExists('subjectSource', $data ?? [], null);
        $this->setIfExists('tokenUrl', $data ?? [], null);
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

        $allowedValues = $this->getPkceAllowableValues();
        if (!is_null($this->container['pkce']) && !in_array($this->container['pkce'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'pkce', must be one of '%s'",
                $this->container['pkce'],
                implode("', '", $allowedValues)
            );
        }

        $allowedValues = $this->getStateAllowableValues();
        if (!is_null($this->container['state']) && !in_array($this->container['state'], $allowedValues, true)) {
            $invalidProperties[] = sprintf(
                "invalid value '%s' for 'state', must be one of '%s'",
                $this->container['state'],
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
     * Gets additionalIdTokenAudiences
     *
     * @return string[]|null
     */
    public function getAdditionalIdTokenAudiences()
    {
        return $this->container['additionalIdTokenAudiences'];
    }

    /**
     * Sets additionalIdTokenAudiences
     *
     * @param string[]|null $additionalIdTokenAudiences additionalIdTokenAudiences
     *
     * @return self
     */
    public function setAdditionalIdTokenAudiences($additionalIdTokenAudiences)
    {
        if (is_null($additionalIdTokenAudiences)) {
            throw new \InvalidArgumentException('non-nullable additionalIdTokenAudiences cannot be null');
        }
        $this->container['additionalIdTokenAudiences'] = $additionalIdTokenAudiences;

        return $this;
    }

    /**
     * Gets applePrivateKey
     *
     * @return string|null
     */
    public function getApplePrivateKey()
    {
        return $this->container['applePrivateKey'];
    }

    /**
     * Sets applePrivateKey
     *
     * @param string|null $applePrivateKey applePrivateKey
     *
     * @return self
     */
    public function setApplePrivateKey($applePrivateKey)
    {
        if (is_null($applePrivateKey)) {
            array_push($this->openAPINullablesSetToNull, 'applePrivateKey');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('applePrivateKey', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['applePrivateKey'] = $applePrivateKey;

        return $this;
    }

    /**
     * Gets applePrivateKeyId
     *
     * @return string|null
     */
    public function getApplePrivateKeyId()
    {
        return $this->container['applePrivateKeyId'];
    }

    /**
     * Sets applePrivateKeyId
     *
     * @param string|null $applePrivateKeyId Apple Private Key Identifier  Sign In with Apple Private Key Identifier needed for generating a JWT token for client secret
     *
     * @return self
     */
    public function setApplePrivateKeyId($applePrivateKeyId)
    {
        if (is_null($applePrivateKeyId)) {
            throw new \InvalidArgumentException('non-nullable applePrivateKeyId cannot be null');
        }
        $this->container['applePrivateKeyId'] = $applePrivateKeyId;

        return $this;
    }

    /**
     * Gets appleTeamId
     *
     * @return string|null
     */
    public function getAppleTeamId()
    {
        return $this->container['appleTeamId'];
    }

    /**
     * Sets appleTeamId
     *
     * @param string|null $appleTeamId Apple Developer Team ID  Apple Developer Team ID needed for generating a JWT token for client secret
     *
     * @return self
     */
    public function setAppleTeamId($appleTeamId)
    {
        if (is_null($appleTeamId)) {
            throw new \InvalidArgumentException('non-nullable appleTeamId cannot be null');
        }
        $this->container['appleTeamId'] = $appleTeamId;

        return $this;
    }

    /**
     * Gets authUrl
     *
     * @return string|null
     */
    public function getAuthUrl()
    {
        return $this->container['authUrl'];
    }

    /**
     * Sets authUrl
     *
     * @param string|null $authUrl AuthURL is the authorize url, typically something like: https://example.org/oauth2/auth Should only be used when the OAuth2 / OpenID Connect server is not supporting OpenID Connect Discovery and when `provider` is set to `generic`.
     *
     * @return self
     */
    public function setAuthUrl($authUrl)
    {
        if (is_null($authUrl)) {
            throw new \InvalidArgumentException('non-nullable authUrl cannot be null');
        }
        $this->container['authUrl'] = $authUrl;

        return $this;
    }

    /**
     * Gets azureTenant
     *
     * @return string|null
     */
    public function getAzureTenant()
    {
        return $this->container['azureTenant'];
    }

    /**
     * Sets azureTenant
     *
     * @param string|null $azureTenant Tenant is the Azure AD Tenant to use for authentication, and must be set when `provider` is set to `microsoft`.  Can be either `common`, `organizations`, `consumers` for a multitenant application or a specific tenant like `8eaef023-2b34-4da1-9baa-8bc8c9d6a490` or `contoso.onmicrosoft.com`.
     *
     * @return self
     */
    public function setAzureTenant($azureTenant)
    {
        if (is_null($azureTenant)) {
            throw new \InvalidArgumentException('non-nullable azureTenant cannot be null');
        }
        $this->container['azureTenant'] = $azureTenant;

        return $this;
    }

    /**
     * Gets claimsSource
     *
     * @return string|null
     */
    public function getClaimsSource()
    {
        return $this->container['claimsSource'];
    }

    /**
     * Sets claimsSource
     *
     * @param string|null $claimsSource claimsSource
     *
     * @return self
     */
    public function setClaimsSource($claimsSource)
    {
        if (is_null($claimsSource)) {
            array_push($this->openAPINullablesSetToNull, 'claimsSource');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('claimsSource', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['claimsSource'] = $claimsSource;

        return $this;
    }

    /**
     * Gets clientId
     *
     * @return string|null
     */
    public function getClientId()
    {
        return $this->container['clientId'];
    }

    /**
     * Sets clientId
     *
     * @param string|null $clientId ClientID is the application's Client ID.
     *
     * @return self
     */
    public function setClientId($clientId)
    {
        if (is_null($clientId)) {
            throw new \InvalidArgumentException('non-nullable clientId cannot be null');
        }
        $this->container['clientId'] = $clientId;

        return $this;
    }

    /**
     * Gets clientSecret
     *
     * @return string|null
     */
    public function getClientSecret()
    {
        return $this->container['clientSecret'];
    }

    /**
     * Sets clientSecret
     *
     * @param string|null $clientSecret clientSecret
     *
     * @return self
     */
    public function setClientSecret($clientSecret)
    {
        if (is_null($clientSecret)) {
            array_push($this->openAPINullablesSetToNull, 'clientSecret');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('clientSecret', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['clientSecret'] = $clientSecret;

        return $this;
    }

    /**
     * Gets createdAt
     *
     * @return \DateTime|null
     */
    public function getCreatedAt()
    {
        return $this->container['createdAt'];
    }

    /**
     * Sets createdAt
     *
     * @param \DateTime|null $createdAt The Project's Revision Creation Date
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
     * Gets id
     *
     * @return string|null
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param string|null $id id
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
     * Gets issuerUrl
     *
     * @return string|null
     */
    public function getIssuerUrl()
    {
        return $this->container['issuerUrl'];
    }

    /**
     * Sets issuerUrl
     *
     * @param string|null $issuerUrl IssuerURL is the OpenID Connect Server URL. You can leave this empty if `provider` is not set to `generic`. If set, neither `auth_url` nor `token_url` are required.
     *
     * @return self
     */
    public function setIssuerUrl($issuerUrl)
    {
        if (is_null($issuerUrl)) {
            throw new \InvalidArgumentException('non-nullable issuerUrl cannot be null');
        }
        $this->container['issuerUrl'] = $issuerUrl;

        return $this;
    }

    /**
     * Gets label
     *
     * @return string|null
     */
    public function getLabel()
    {
        return $this->container['label'];
    }

    /**
     * Sets label
     *
     * @param string|null $label Label represents an optional label which can be used in the UI generation.
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
     * Gets mapperUrl
     *
     * @return string|null
     */
    public function getMapperUrl()
    {
        return $this->container['mapperUrl'];
    }

    /**
     * Sets mapperUrl
     *
     * @param string|null $mapperUrl Mapper specifies the JSONNet code snippet which uses the OpenID Connect Provider's data (e.g. GitHub or Google profile information) to hydrate the identity's data.
     *
     * @return self
     */
    public function setMapperUrl($mapperUrl)
    {
        if (is_null($mapperUrl)) {
            throw new \InvalidArgumentException('non-nullable mapperUrl cannot be null');
        }
        $this->container['mapperUrl'] = $mapperUrl;

        return $this;
    }

    /**
     * Gets organizationId
     *
     * @return string|null
     */
    public function getOrganizationId()
    {
        return $this->container['organizationId'];
    }

    /**
     * Sets organizationId
     *
     * @param string|null $organizationId organizationId
     *
     * @return self
     */
    public function setOrganizationId($organizationId)
    {
        if (is_null($organizationId)) {
            array_push($this->openAPINullablesSetToNull, 'organizationId');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('organizationId', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['organizationId'] = $organizationId;

        return $this;
    }

    /**
     * Gets pkce
     *
     * @return string|null
     */
    public function getPkce()
    {
        return $this->container['pkce'];
    }

    /**
     * Sets pkce
     *
     * @param string|null $pkce PKCE controls if the OpenID Connect OAuth2 flow should use PKCE (Proof Key for Code Exchange). Possible values are: `auto` (default), `never`, `force`. `auto`: PKCE is used if the provider supports it. Requires setting `issuer_url`. `never`: Disable PKCE entirely for this provider, even if the provider advertises support for it. `force`: Always use PKCE, even if the provider does not advertise support for it. OAuth2 flows will fail if the provider does not support PKCE. IMPORTANT: If you set this to `force`, you must whitelist a different return URL for your OAuth2 client in the provider's configuration. Instead of <base-url>/self-service/methods/oidc/callback/<provider>, you must use <base-url>/self-service/methods/oidc/callback (Note the missing <provider> path segment and no trailing slash).
     *
     * @return self
     */
    public function setPkce($pkce)
    {
        if (is_null($pkce)) {
            array_push($this->openAPINullablesSetToNull, 'pkce');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('pkce', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $allowedValues = $this->getPkceAllowableValues();
        if (!is_null($pkce) && !in_array($pkce, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'pkce', must be one of '%s'",
                    $pkce,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['pkce'] = $pkce;

        return $this;
    }

    /**
     * Gets projectRevisionId
     *
     * @return string|null
     */
    public function getProjectRevisionId()
    {
        return $this->container['projectRevisionId'];
    }

    /**
     * Sets projectRevisionId
     *
     * @param string|null $projectRevisionId The Revision's ID this schema belongs to
     *
     * @return self
     */
    public function setProjectRevisionId($projectRevisionId)
    {
        if (is_null($projectRevisionId)) {
            throw new \InvalidArgumentException('non-nullable projectRevisionId cannot be null');
        }
        $this->container['projectRevisionId'] = $projectRevisionId;

        return $this;
    }

    /**
     * Gets provider
     *
     * @return string|null
     */
    public function getProvider()
    {
        return $this->container['provider'];
    }

    /**
     * Sets provider
     *
     * @param string|null $provider Provider is either \"generic\" for a generic OAuth 2.0 / OpenID Connect Provider or one of: generic google github gitlab microsoft discord slack facebook vk yandex apple
     *
     * @return self
     */
    public function setProvider($provider)
    {
        if (is_null($provider)) {
            throw new \InvalidArgumentException('non-nullable provider cannot be null');
        }
        $this->container['provider'] = $provider;

        return $this;
    }

    /**
     * Gets providerId
     *
     * @return string|null
     */
    public function getProviderId()
    {
        return $this->container['providerId'];
    }

    /**
     * Sets providerId
     *
     * @param string|null $providerId ID is the provider's ID
     *
     * @return self
     */
    public function setProviderId($providerId)
    {
        if (is_null($providerId)) {
            throw new \InvalidArgumentException('non-nullable providerId cannot be null');
        }
        $this->container['providerId'] = $providerId;

        return $this;
    }

    /**
     * Gets requestedClaims
     *
     * @return object|null
     */
    public function getRequestedClaims()
    {
        return $this->container['requestedClaims'];
    }

    /**
     * Sets requestedClaims
     *
     * @param object|null $requestedClaims requestedClaims
     *
     * @return self
     */
    public function setRequestedClaims($requestedClaims)
    {
        if (is_null($requestedClaims)) {
            throw new \InvalidArgumentException('non-nullable requestedClaims cannot be null');
        }
        $this->container['requestedClaims'] = $requestedClaims;

        return $this;
    }

    /**
     * Gets scope
     *
     * @return string[]|null
     */
    public function getScope()
    {
        return $this->container['scope'];
    }

    /**
     * Sets scope
     *
     * @param string[]|null $scope scope
     *
     * @return self
     */
    public function setScope($scope)
    {
        if (is_null($scope)) {
            throw new \InvalidArgumentException('non-nullable scope cannot be null');
        }
        $this->container['scope'] = $scope;

        return $this;
    }

    /**
     * Gets state
     *
     * @return string|null
     */
    public function getState()
    {
        return $this->container['state'];
    }

    /**
     * Sets state
     *
     * @param string|null $state State indicates the state of the provider  Only providers with state `enabled` will be used for authentication enabled ThirdPartyProviderStateEnabled disabled ThirdPartyProviderStateDisabled
     *
     * @return self
     */
    public function setState($state)
    {
        if (is_null($state)) {
            throw new \InvalidArgumentException('non-nullable state cannot be null');
        }
        $allowedValues = $this->getStateAllowableValues();
        if (!in_array($state, $allowedValues, true)) {
            throw new \InvalidArgumentException(
                sprintf(
                    "Invalid value '%s' for 'state', must be one of '%s'",
                    $state,
                    implode("', '", $allowedValues)
                )
            );
        }
        $this->container['state'] = $state;

        return $this;
    }

    /**
     * Gets subjectSource
     *
     * @return string|null
     */
    public function getSubjectSource()
    {
        return $this->container['subjectSource'];
    }

    /**
     * Sets subjectSource
     *
     * @param string|null $subjectSource subjectSource
     *
     * @return self
     */
    public function setSubjectSource($subjectSource)
    {
        if (is_null($subjectSource)) {
            array_push($this->openAPINullablesSetToNull, 'subjectSource');
        } else {
            $nullablesSetToNull = $this->getOpenAPINullablesSetToNull();
            $index = array_search('subjectSource', $nullablesSetToNull);
            if ($index !== FALSE) {
                unset($nullablesSetToNull[$index]);
                $this->setOpenAPINullablesSetToNull($nullablesSetToNull);
            }
        }
        $this->container['subjectSource'] = $subjectSource;

        return $this;
    }

    /**
     * Gets tokenUrl
     *
     * @return string|null
     */
    public function getTokenUrl()
    {
        return $this->container['tokenUrl'];
    }

    /**
     * Sets tokenUrl
     *
     * @param string|null $tokenUrl TokenURL is the token url, typically something like: https://example.org/oauth2/token  Should only be used when the OAuth2 / OpenID Connect server is not supporting OpenID Connect Discovery and when `provider` is set to `generic`.
     *
     * @return self
     */
    public function setTokenUrl($tokenUrl)
    {
        if (is_null($tokenUrl)) {
            throw new \InvalidArgumentException('non-nullable tokenUrl cannot be null');
        }
        $this->container['tokenUrl'] = $tokenUrl;

        return $this;
    }

    /**
     * Gets updatedAt
     *
     * @return \DateTime|null
     */
    public function getUpdatedAt()
    {
        return $this->container['updatedAt'];
    }

    /**
     * Sets updatedAt
     *
     * @param \DateTime|null $updatedAt Last Time Project's Revision was Updated
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


