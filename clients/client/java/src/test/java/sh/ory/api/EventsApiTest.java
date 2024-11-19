/*
 * Ory APIs
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.15.12
 * Contact: support@ory.sh
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.api;

import sh.ory.ApiException;
import sh.ory.model.CreateEventStreamBody;
import sh.ory.model.ErrorGeneric;
import sh.ory.model.EventStream;
import sh.ory.model.ListEventStreams;
import sh.ory.model.SetEventStreamBody;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsApi
 */
@Disabled
public class EventsApiTest {

    private final EventsApi api = new EventsApi();

    /**
     * Create an event stream for your project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createEventStreamTest() throws ApiException {
        String projectId = null;
        CreateEventStreamBody createEventStreamBody = null;
        EventStream response = api.createEventStream(projectId, createEventStreamBody);
        // TODO: test validations
    }

    /**
     * Remove an event stream from a project
     *
     * Remove an event stream from a project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteEventStreamTest() throws ApiException {
        String projectId = null;
        String eventStreamId = null;
        api.deleteEventStream(projectId, eventStreamId);
        // TODO: test validations
    }

    /**
     * List all event streams for the project. This endpoint is not paginated.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listEventStreamsTest() throws ApiException {
        String projectId = null;
        ListEventStreams response = api.listEventStreams(projectId);
        // TODO: test validations
    }

    /**
     * Update an event stream for a project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setEventStreamTest() throws ApiException {
        String projectId = null;
        String eventStreamId = null;
        SetEventStreamBody setEventStreamBody = null;
        EventStream response = api.setEventStream(projectId, eventStreamId, setEventStreamBody);
        // TODO: test validations
    }

}
