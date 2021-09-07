=begin
#Ory APIs

#Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

The version of the OpenAPI document: v0.0.1-alpha.19
Contact: support@ory.sh
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 5.2.1

=end

require 'date'
require 'time'

module OryClient
  class AuthenticatorAssuranceLevel
    AAL0 = "aal0".freeze
    AAL1 = "aal1".freeze
    AAL2 = "aal2".freeze
    AAL3 = "aal3".freeze

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def self.build_from_hash(value)
      new.build_from_hash(value)
    end

    # Builds the enum from string
    # @param [String] The enum value in the form of the string
    # @return [String] The enum value
    def build_from_hash(value)
      constantValues = AuthenticatorAssuranceLevel.constants.select { |c| AuthenticatorAssuranceLevel::const_get(c) == value }
      raise "Invalid ENUM value #{value} for class #AuthenticatorAssuranceLevel" if constantValues.empty?
      value
    end
  end
end