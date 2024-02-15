=begin
#Ory APIs

#Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

The version of the OpenAPI document: v1.6.1
Contact: support@ory.sh
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 6.0.1

=end

require 'spec_helper'
require 'json'

# Unit tests for OryClient::EventsApi
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'EventsApi' do
  before do
    # run before each test
    @api_instance = OryClient::EventsApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of EventsApi' do
    it 'should create an instance of EventsApi' do
      expect(@api_instance).to be_instance_of(OryClient::EventsApi)
    end
  end

  # unit tests for create_event_stream
  # Create an event stream for your project.
  # @param project_id Project ID  The project&#39;s ID.
  # @param create_event_stream_body 
  # @param [Hash] opts the optional parameters
  # @return [EventStream]
  describe 'create_event_stream test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for delete_event_stream
  # Remove an event stream from a project
  # Remove an event stream from a project.
  # @param project_id Project ID  The project&#39;s ID.
  # @param event_stream_id Event Stream ID  The ID of the event stream to be deleted, as returned when created.
  # @param [Hash] opts the optional parameters
  # @return [nil]
  describe 'delete_event_stream test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for list_event_streams
  # List all event streams for the project. This endpoint is not paginated.
  # @param project_id Project ID  The project&#39;s ID.
  # @param [Hash] opts the optional parameters
  # @return [ListEventStreams]
  describe 'list_event_streams test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  # unit tests for set_event_stream
  # Update an event stream for a project.
  # @param project_id Project ID  The project&#39;s ID.
  # @param event_stream_id Event Stream ID  The event stream&#39;s ID.
  # @param [Hash] opts the optional parameters
  # @option opts [SetEventStreamBody] :set_event_stream_body 
  # @return [EventStream]
  describe 'set_event_stream test' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end