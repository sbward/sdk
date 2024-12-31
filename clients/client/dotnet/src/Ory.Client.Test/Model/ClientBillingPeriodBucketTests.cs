/*
 * Ory APIs
 *
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | - -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.15.17
 * Contact: support@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using Xunit;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Ory.Client.Model;
using Ory.Client.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace Ory.Client.Test.Model
{
    /// <summary>
    ///  Class for testing ClientBillingPeriodBucket
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class ClientBillingPeriodBucketTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for ClientBillingPeriodBucket
        //private ClientBillingPeriodBucket instance;

        public ClientBillingPeriodBucketTests()
        {
            // TODO uncomment below to create an instance of ClientBillingPeriodBucket
            //instance = new ClientBillingPeriodBucket();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ClientBillingPeriodBucket
        /// </summary>
        [Fact]
        public void ClientBillingPeriodBucketInstanceTest()
        {
            // TODO uncomment below to test "IsType" ClientBillingPeriodBucket
            //Assert.IsType<ClientBillingPeriodBucket>(instance);
        }

        /// <summary>
        /// Test the property 'BaseInvoices'
        /// </summary>
        [Fact]
        public void BaseInvoicesTest()
        {
            // TODO unit test for the property 'BaseInvoices'
        }

        /// <summary>
        /// Test the property 'BillingPeriod'
        /// </summary>
        [Fact]
        public void BillingPeriodTest()
        {
            // TODO unit test for the property 'BillingPeriod'
        }

        /// <summary>
        /// Test the property 'UsageInvoice'
        /// </summary>
        [Fact]
        public void UsageInvoiceTest()
        {
            // TODO unit test for the property 'UsageInvoice'
        }
    }
}
