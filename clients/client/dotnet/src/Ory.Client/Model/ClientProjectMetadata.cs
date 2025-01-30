/*
 * Ory APIs
 *
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | - -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.16.4
 * Contact: support@ory.sh
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Ory.Client.Client.OpenAPIDateConverter;

namespace Ory.Client.Model
{
    /// <summary>
    /// ClientProjectMetadata
    /// </summary>
    [DataContract(Name = "projectMetadata")]
    public partial class ClientProjectMetadata : IValidatableObject
    {
        /// <summary>
        /// The environment of the project. prod Production stage Staging dev Development
        /// </summary>
        /// <value>The environment of the project. prod Production stage Staging dev Development</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum VarEnvironmentEnum
        {
            /// <summary>
            /// Enum Prod for value: prod
            /// </summary>
            [EnumMember(Value = "prod")]
            Prod = 1,

            /// <summary>
            /// Enum Stage for value: stage
            /// </summary>
            [EnumMember(Value = "stage")]
            Stage = 2,

            /// <summary>
            /// Enum Dev for value: dev
            /// </summary>
            [EnumMember(Value = "dev")]
            Dev = 3
        }


        /// <summary>
        /// The environment of the project. prod Production stage Staging dev Development
        /// </summary>
        /// <value>The environment of the project. prod Production stage Staging dev Development</value>
        [DataMember(Name = "environment", IsRequired = true, EmitDefaultValue = true)]
        public VarEnvironmentEnum VarEnvironment { get; set; }
        /// <summary>
        /// The project&#39;s data home region eu-central EUCentral asia-northeast AsiaNorthEast us-east USEast us-west USWest us US global Global
        /// </summary>
        /// <value>The project&#39;s data home region eu-central EUCentral asia-northeast AsiaNorthEast us-east USEast us-west USWest us US global Global</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum HomeRegionEnum
        {
            /// <summary>
            /// Enum EuCentral for value: eu-central
            /// </summary>
            [EnumMember(Value = "eu-central")]
            EuCentral = 1,

            /// <summary>
            /// Enum AsiaNortheast for value: asia-northeast
            /// </summary>
            [EnumMember(Value = "asia-northeast")]
            AsiaNortheast = 2,

            /// <summary>
            /// Enum UsEast for value: us-east
            /// </summary>
            [EnumMember(Value = "us-east")]
            UsEast = 3,

            /// <summary>
            /// Enum UsWest for value: us-west
            /// </summary>
            [EnumMember(Value = "us-west")]
            UsWest = 4,

            /// <summary>
            /// Enum Us for value: us
            /// </summary>
            [EnumMember(Value = "us")]
            Us = 5,

            /// <summary>
            /// Enum Global for value: global
            /// </summary>
            [EnumMember(Value = "global")]
            Global = 6
        }


        /// <summary>
        /// The project&#39;s data home region eu-central EUCentral asia-northeast AsiaNorthEast us-east USEast us-west USWest us US global Global
        /// </summary>
        /// <value>The project&#39;s data home region eu-central EUCentral asia-northeast AsiaNorthEast us-east USEast us-west USWest us US global Global</value>
        [DataMember(Name = "home_region", IsRequired = true, EmitDefaultValue = true)]
        public HomeRegionEnum HomeRegion { get; set; }
        /// <summary>
        /// The state of the project. running Running halted Halted deleted Deleted
        /// </summary>
        /// <value>The state of the project. running Running halted Halted deleted Deleted</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StateEnum
        {
            /// <summary>
            /// Enum Running for value: running
            /// </summary>
            [EnumMember(Value = "running")]
            Running = 1,

            /// <summary>
            /// Enum Halted for value: halted
            /// </summary>
            [EnumMember(Value = "halted")]
            Halted = 2,

            /// <summary>
            /// Enum Deleted for value: deleted
            /// </summary>
            [EnumMember(Value = "deleted")]
            Deleted = 3
        }


        /// <summary>
        /// The state of the project. running Running halted Halted deleted Deleted
        /// </summary>
        /// <value>The state of the project. running Running halted Halted deleted Deleted</value>
        [DataMember(Name = "state", IsRequired = true, EmitDefaultValue = true)]
        public StateEnum State { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientProjectMetadata" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientProjectMetadata()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientProjectMetadata" /> class.
        /// </summary>
        /// <param name="createdAt">The Project&#39;s Creation Date (required).</param>
        /// <param name="varEnvironment">The environment of the project. prod Production stage Staging dev Development (required).</param>
        /// <param name="homeRegion">The project&#39;s data home region eu-central EUCentral asia-northeast AsiaNorthEast us-east USEast us-west USWest us US global Global (required).</param>
        /// <param name="hosts">hosts (required).</param>
        /// <param name="name">The project&#39;s name if set (required).</param>
        /// <param name="state">The state of the project. running Running halted Halted deleted Deleted (required).</param>
        /// <param name="subscriptionId">subscriptionId.</param>
        /// <param name="subscriptionPlan">subscriptionPlan.</param>
        /// <param name="updatedAt">Last Time Project was Updated (required).</param>
        /// <param name="workspace">workspace.</param>
        /// <param name="workspaceId">workspaceId.</param>
        public ClientProjectMetadata(DateTime createdAt = default(DateTime), VarEnvironmentEnum varEnvironment = default(VarEnvironmentEnum), HomeRegionEnum homeRegion = default(HomeRegionEnum), List<string> hosts = default(List<string>), string name = default(string), StateEnum state = default(StateEnum), string subscriptionId = default(string), string subscriptionPlan = default(string), DateTime updatedAt = default(DateTime), ClientWorkspace workspace = default(ClientWorkspace), string workspaceId = default(string))
        {
            this.CreatedAt = createdAt;
            this.VarEnvironment = varEnvironment;
            this.HomeRegion = homeRegion;
            // to ensure "hosts" is required (not null)
            if (hosts == null)
            {
                throw new ArgumentNullException("hosts is a required property for ClientProjectMetadata and cannot be null");
            }
            this.Hosts = hosts;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for ClientProjectMetadata and cannot be null");
            }
            this.Name = name;
            this.State = state;
            this.UpdatedAt = updatedAt;
            this.SubscriptionId = subscriptionId;
            this.SubscriptionPlan = subscriptionPlan;
            this.Workspace = workspace;
            this.WorkspaceId = workspaceId;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// The Project&#39;s Creation Date
        /// </summary>
        /// <value>The Project&#39;s Creation Date</value>
        [DataMember(Name = "created_at", IsRequired = true, EmitDefaultValue = true)]
        public DateTime CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets Hosts
        /// </summary>
        [DataMember(Name = "hosts", IsRequired = true, EmitDefaultValue = true)]
        public List<string> Hosts { get; set; }

        /// <summary>
        /// The project&#39;s ID.
        /// </summary>
        /// <value>The project&#39;s ID.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; private set; }

        /// <summary>
        /// Returns false as Id should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeId()
        {
            return false;
        }
        /// <summary>
        /// The project&#39;s name if set
        /// </summary>
        /// <value>The project&#39;s name if set</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// The project&#39;s slug
        /// </summary>
        /// <value>The project&#39;s slug</value>
        [DataMember(Name = "slug", IsRequired = true, EmitDefaultValue = true)]
        public string Slug { get; private set; }

        /// <summary>
        /// Returns false as Slug should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeSlug()
        {
            return false;
        }
        /// <summary>
        /// Gets or Sets SubscriptionId
        /// </summary>
        [DataMember(Name = "subscription_id", EmitDefaultValue = true)]
        public string SubscriptionId { get; set; }

        /// <summary>
        /// Gets or Sets SubscriptionPlan
        /// </summary>
        [DataMember(Name = "subscription_plan", EmitDefaultValue = true)]
        public string SubscriptionPlan { get; set; }

        /// <summary>
        /// Last Time Project was Updated
        /// </summary>
        /// <value>Last Time Project was Updated</value>
        [DataMember(Name = "updated_at", IsRequired = true, EmitDefaultValue = true)]
        public DateTime UpdatedAt { get; set; }

        /// <summary>
        /// Gets or Sets Workspace
        /// </summary>
        [DataMember(Name = "workspace", EmitDefaultValue = false)]
        public ClientWorkspace Workspace { get; set; }

        /// <summary>
        /// Gets or Sets WorkspaceId
        /// </summary>
        [DataMember(Name = "workspace_id", EmitDefaultValue = true)]
        public string WorkspaceId { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ClientProjectMetadata {\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  VarEnvironment: ").Append(VarEnvironment).Append("\n");
            sb.Append("  HomeRegion: ").Append(HomeRegion).Append("\n");
            sb.Append("  Hosts: ").Append(Hosts).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Slug: ").Append(Slug).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  SubscriptionId: ").Append(SubscriptionId).Append("\n");
            sb.Append("  SubscriptionPlan: ").Append(SubscriptionPlan).Append("\n");
            sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
            sb.Append("  Workspace: ").Append(Workspace).Append("\n");
            sb.Append("  WorkspaceId: ").Append(WorkspaceId).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
