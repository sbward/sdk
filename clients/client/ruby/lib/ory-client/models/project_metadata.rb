=begin
#Ory APIs

## Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 

The version of the OpenAPI document: v1.15.17
Contact: support@ory.sh
Generated by: https://openapi-generator.tech
Generator version: 7.7.0

=end

require 'date'
require 'time'

module OryClient
  class ProjectMetadata
    # The Project's Creation Date
    attr_accessor :created_at

    # The environment of the project. prod Production stage Staging dev Development
    attr_accessor :environment

    # The project's data home region eu-central EUCentral asia-northeast AsiaNorthEast us-east USEast us-west USWest us US global Global
    attr_accessor :home_region

    attr_accessor :hosts

    # The project's ID.
    attr_accessor :id

    # The project's name if set
    attr_accessor :name

    # The project's slug
    attr_accessor :slug

    # The state of the project. running Running halted Halted deleted Deleted
    attr_accessor :state

    attr_accessor :subscription_id

    attr_accessor :subscription_plan

    # Last Time Project was Updated
    attr_accessor :updated_at

    attr_accessor :workspace

    attr_accessor :workspace_id

    class EnumAttributeValidator
      attr_reader :datatype
      attr_reader :allowable_values

      def initialize(datatype, allowable_values)
        @allowable_values = allowable_values.map do |value|
          case datatype.to_s
          when /Integer/i
            value.to_i
          when /Float/i
            value.to_f
          else
            value
          end
        end
      end

      def valid?(value)
        !value || allowable_values.include?(value)
      end
    end

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'created_at' => :'created_at',
        :'environment' => :'environment',
        :'home_region' => :'home_region',
        :'hosts' => :'hosts',
        :'id' => :'id',
        :'name' => :'name',
        :'slug' => :'slug',
        :'state' => :'state',
        :'subscription_id' => :'subscription_id',
        :'subscription_plan' => :'subscription_plan',
        :'updated_at' => :'updated_at',
        :'workspace' => :'workspace',
        :'workspace_id' => :'workspace_id'
      }
    end

    # Returns all the JSON keys this model knows about
    def self.acceptable_attributes
      attribute_map.values
    end

    # Attribute type mapping.
    def self.openapi_types
      {
        :'created_at' => :'Time',
        :'environment' => :'String',
        :'home_region' => :'String',
        :'hosts' => :'Array<String>',
        :'id' => :'String',
        :'name' => :'String',
        :'slug' => :'String',
        :'state' => :'String',
        :'subscription_id' => :'String',
        :'subscription_plan' => :'String',
        :'updated_at' => :'Time',
        :'workspace' => :'Workspace',
        :'workspace_id' => :'String'
      }
    end

    # List of attributes with nullable: true
    def self.openapi_nullable
      Set.new([
        :'subscription_id',
        :'subscription_plan',
        :'workspace_id'
      ])
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      if (!attributes.is_a?(Hash))
        fail ArgumentError, "The input argument (attributes) must be a hash in `OryClient::ProjectMetadata` initialize method"
      end

      # check to see if the attribute exists and convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h|
        if (!self.class.attribute_map.key?(k.to_sym))
          fail ArgumentError, "`#{k}` is not a valid attribute in `OryClient::ProjectMetadata`. Please check the name to make sure it's valid. List of attributes: " + self.class.attribute_map.keys.inspect
        end
        h[k.to_sym] = v
      }

      if attributes.key?(:'created_at')
        self.created_at = attributes[:'created_at']
      else
        self.created_at = nil
      end

      if attributes.key?(:'environment')
        self.environment = attributes[:'environment']
      else
        self.environment = nil
      end

      if attributes.key?(:'home_region')
        self.home_region = attributes[:'home_region']
      else
        self.home_region = nil
      end

      if attributes.key?(:'hosts')
        if (value = attributes[:'hosts']).is_a?(Array)
          self.hosts = value
        end
      else
        self.hosts = nil
      end

      if attributes.key?(:'id')
        self.id = attributes[:'id']
      else
        self.id = nil
      end

      if attributes.key?(:'name')
        self.name = attributes[:'name']
      else
        self.name = nil
      end

      if attributes.key?(:'slug')
        self.slug = attributes[:'slug']
      else
        self.slug = nil
      end

      if attributes.key?(:'state')
        self.state = attributes[:'state']
      else
        self.state = nil
      end

      if attributes.key?(:'subscription_id')
        self.subscription_id = attributes[:'subscription_id']
      end

      if attributes.key?(:'subscription_plan')
        self.subscription_plan = attributes[:'subscription_plan']
      end

      if attributes.key?(:'updated_at')
        self.updated_at = attributes[:'updated_at']
      else
        self.updated_at = nil
      end

      if attributes.key?(:'workspace')
        self.workspace = attributes[:'workspace']
      end

      if attributes.key?(:'workspace_id')
        self.workspace_id = attributes[:'workspace_id']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      warn '[DEPRECATED] the `list_invalid_properties` method is obsolete'
      invalid_properties = Array.new
      if @created_at.nil?
        invalid_properties.push('invalid value for "created_at", created_at cannot be nil.')
      end

      if @environment.nil?
        invalid_properties.push('invalid value for "environment", environment cannot be nil.')
      end

      if @home_region.nil?
        invalid_properties.push('invalid value for "home_region", home_region cannot be nil.')
      end

      if @hosts.nil?
        invalid_properties.push('invalid value for "hosts", hosts cannot be nil.')
      end

      if @id.nil?
        invalid_properties.push('invalid value for "id", id cannot be nil.')
      end

      if @name.nil?
        invalid_properties.push('invalid value for "name", name cannot be nil.')
      end

      if @slug.nil?
        invalid_properties.push('invalid value for "slug", slug cannot be nil.')
      end

      if @state.nil?
        invalid_properties.push('invalid value for "state", state cannot be nil.')
      end

      if @updated_at.nil?
        invalid_properties.push('invalid value for "updated_at", updated_at cannot be nil.')
      end

      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      warn '[DEPRECATED] the `valid?` method is obsolete'
      return false if @created_at.nil?
      return false if @environment.nil?
      environment_validator = EnumAttributeValidator.new('String', ["prod", "stage", "dev"])
      return false unless environment_validator.valid?(@environment)
      return false if @home_region.nil?
      home_region_validator = EnumAttributeValidator.new('String', ["eu-central", "asia-northeast", "us-east", "us-west", "us", "global"])
      return false unless home_region_validator.valid?(@home_region)
      return false if @hosts.nil?
      return false if @id.nil?
      return false if @name.nil?
      return false if @slug.nil?
      return false if @state.nil?
      state_validator = EnumAttributeValidator.new('String', ["running", "halted", "deleted"])
      return false unless state_validator.valid?(@state)
      return false if @updated_at.nil?
      true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] environment Object to be assigned
    def environment=(environment)
      validator = EnumAttributeValidator.new('String', ["prod", "stage", "dev"])
      unless validator.valid?(environment)
        fail ArgumentError, "invalid value for \"environment\", must be one of #{validator.allowable_values}."
      end
      @environment = environment
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] home_region Object to be assigned
    def home_region=(home_region)
      validator = EnumAttributeValidator.new('String', ["eu-central", "asia-northeast", "us-east", "us-west", "us", "global"])
      unless validator.valid?(home_region)
        fail ArgumentError, "invalid value for \"home_region\", must be one of #{validator.allowable_values}."
      end
      @home_region = home_region
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] state Object to be assigned
    def state=(state)
      validator = EnumAttributeValidator.new('String', ["running", "halted", "deleted"])
      unless validator.valid?(state)
        fail ArgumentError, "invalid value for \"state\", must be one of #{validator.allowable_values}."
      end
      @state = state
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          created_at == o.created_at &&
          environment == o.environment &&
          home_region == o.home_region &&
          hosts == o.hosts &&
          id == o.id &&
          name == o.name &&
          slug == o.slug &&
          state == o.state &&
          subscription_id == o.subscription_id &&
          subscription_plan == o.subscription_plan &&
          updated_at == o.updated_at &&
          workspace == o.workspace &&
          workspace_id == o.workspace_id
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Integer] Hash code
    def hash
      [created_at, environment, home_region, hosts, id, name, slug, state, subscription_id, subscription_plan, updated_at, workspace, workspace_id].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def self.build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      attributes = attributes.transform_keys(&:to_sym)
      transformed_hash = {}
      openapi_types.each_pair do |key, type|
        if attributes.key?(attribute_map[key]) && attributes[attribute_map[key]].nil?
          transformed_hash["#{key}"] = nil
        elsif type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the attribute
          # is documented as an array but the input is not
          if attributes[attribute_map[key]].is_a?(Array)
            transformed_hash["#{key}"] = attributes[attribute_map[key]].map { |v| _deserialize($1, v) }
          end
        elsif !attributes[attribute_map[key]].nil?
          transformed_hash["#{key}"] = _deserialize(type, attributes[attribute_map[key]])
        end
      end
      new(transformed_hash)
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def self._deserialize(type, value)
      case type.to_sym
      when :Time
        Time.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :Boolean
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        # models (e.g. Pet) or oneOf
        klass = OryClient.const_get(type)
        klass.respond_to?(:openapi_any_of) || klass.respond_to?(:openapi_one_of) ? klass.build(value) : klass.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        if value.nil?
          is_nullable = self.class.openapi_nullable.include?(attr)
          next if !is_nullable || (is_nullable && !instance_variable_defined?(:"@#{attr}"))
        end

        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end

  end

end
