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
    ///  Class for testing ClientAccountExperienceConfiguration
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class ClientAccountExperienceConfigurationTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for ClientAccountExperienceConfiguration
        //private ClientAccountExperienceConfiguration instance;

        public ClientAccountExperienceConfigurationTests()
        {
            // TODO uncomment below to create an instance of ClientAccountExperienceConfiguration
            //instance = new ClientAccountExperienceConfiguration();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ClientAccountExperienceConfiguration
        /// </summary>
        [Fact]
        public void ClientAccountExperienceConfigurationInstanceTest()
        {
            // TODO uncomment below to test "IsType" ClientAccountExperienceConfiguration
            //Assert.IsType<ClientAccountExperienceConfiguration>(instance);
        }

        /// <summary>
        /// Test the property 'AccountExperienceThemeStylesheet'
        /// </summary>
        [Fact]
        public void AccountExperienceThemeStylesheetTest()
        {
            // TODO unit test for the property 'AccountExperienceThemeStylesheet'
        }

        /// <summary>
        /// Test the property 'FaviconType'
        /// </summary>
        [Fact]
        public void FaviconTypeTest()
        {
            // TODO unit test for the property 'FaviconType'
        }

        /// <summary>
        /// Test the property 'FaviconUrl'
        /// </summary>
        [Fact]
        public void FaviconUrlTest()
        {
            // TODO unit test for the property 'FaviconUrl'
        }

        /// <summary>
        /// Test the property 'KratosSelfserviceDefaultBrowserReturnUrl'
        /// </summary>
        [Fact]
        public void KratosSelfserviceDefaultBrowserReturnUrlTest()
        {
            // TODO unit test for the property 'KratosSelfserviceDefaultBrowserReturnUrl'
        }

        /// <summary>
        /// Test the property 'KratosSelfserviceFlowsRecoveryEnabled'
        /// </summary>
        [Fact]
        public void KratosSelfserviceFlowsRecoveryEnabledTest()
        {
            // TODO unit test for the property 'KratosSelfserviceFlowsRecoveryEnabled'
        }

        /// <summary>
        /// Test the property 'KratosSelfserviceFlowsRegistrationEnabled'
        /// </summary>
        [Fact]
        public void KratosSelfserviceFlowsRegistrationEnabledTest()
        {
            // TODO unit test for the property 'KratosSelfserviceFlowsRegistrationEnabled'
        }

        /// <summary>
        /// Test the property 'KratosSelfserviceFlowsVerificationEnabled'
        /// </summary>
        [Fact]
        public void KratosSelfserviceFlowsVerificationEnabledTest()
        {
            // TODO unit test for the property 'KratosSelfserviceFlowsVerificationEnabled'
        }

        /// <summary>
        /// Test the property 'LogoUrl'
        /// </summary>
        [Fact]
        public void LogoUrlTest()
        {
            // TODO unit test for the property 'LogoUrl'
        }

        /// <summary>
        /// Test the property 'Name'
        /// </summary>
        [Fact]
        public void NameTest()
        {
            // TODO unit test for the property 'Name'
        }

        /// <summary>
        /// Test the property 'OrganizationMap'
        /// </summary>
        [Fact]
        public void OrganizationMapTest()
        {
            // TODO unit test for the property 'OrganizationMap'
        }
    }
}
