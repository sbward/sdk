/*
 * ORY Oathkeeper
 *
 * ORY Oathkeeper is a reverse proxy that checks the HTTP Authorization for validity against a set of rules. This service uses Hydra to validate access tokens and policies.
 *
 * The version of the OpenAPI document: v0.38.10-beta.4
 * Contact: hi@ory.am
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using Xunit;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Ory.Oathkeeper.Client.Api;
using Ory.Oathkeeper.Client.Model;
using Ory.Oathkeeper.Client.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace Ory.Oathkeeper.Client.Test.Model
{
    /// <summary>
    ///  Class for testing OathkeeperRule
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class OathkeeperRuleTests : IDisposable
    {
        // TODO uncomment below to declare an instance variable for OathkeeperRule
        //private OathkeeperRule instance;

        public OathkeeperRuleTests()
        {
            // TODO uncomment below to create an instance of OathkeeperRule
            //instance = new OathkeeperRule();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of OathkeeperRule
        /// </summary>
        [Fact]
        public void OathkeeperRuleInstanceTest()
        {
            // TODO uncomment below to test "IsType" OathkeeperRule
            //Assert.IsType<OathkeeperRule>(instance);
        }


        /// <summary>
        /// Test the property 'Authenticators'
        /// </summary>
        [Fact]
        public void AuthenticatorsTest()
        {
            // TODO unit test for the property 'Authenticators'
        }
        /// <summary>
        /// Test the property 'Authorizer'
        /// </summary>
        [Fact]
        public void AuthorizerTest()
        {
            // TODO unit test for the property 'Authorizer'
        }
        /// <summary>
        /// Test the property 'Description'
        /// </summary>
        [Fact]
        public void DescriptionTest()
        {
            // TODO unit test for the property 'Description'
        }
        /// <summary>
        /// Test the property 'Id'
        /// </summary>
        [Fact]
        public void IdTest()
        {
            // TODO unit test for the property 'Id'
        }
        /// <summary>
        /// Test the property 'Match'
        /// </summary>
        [Fact]
        public void MatchTest()
        {
            // TODO unit test for the property 'Match'
        }
        /// <summary>
        /// Test the property 'Mutators'
        /// </summary>
        [Fact]
        public void MutatorsTest()
        {
            // TODO unit test for the property 'Mutators'
        }
        /// <summary>
        /// Test the property 'Upstream'
        /// </summary>
        [Fact]
        public void UpstreamTest()
        {
            // TODO unit test for the property 'Upstream'
        }

    }

}