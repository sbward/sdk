/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.12.1
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
    /// Represents a single datapoint/bucket of a time series
    /// </summary>
    [DataContract(Name = "metricsDatapoint")]
    public partial class ClientMetricsDatapoint : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientMetricsDatapoint" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientMetricsDatapoint()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientMetricsDatapoint" /> class.
        /// </summary>
        /// <param name="count">The count of events that occured in this time (required).</param>
        /// <param name="time">The time of the bucket (required).</param>
        public ClientMetricsDatapoint(long count = default(long), DateTime time = default(DateTime))
        {
            this.Count = count;
            this.Time = time;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// The count of events that occured in this time
        /// </summary>
        /// <value>The count of events that occured in this time</value>
        [DataMember(Name = "count", IsRequired = true, EmitDefaultValue = true)]
        public long Count { get; set; }

        /// <summary>
        /// The time of the bucket
        /// </summary>
        /// <value>The time of the bucket</value>
        [DataMember(Name = "time", IsRequired = true, EmitDefaultValue = true)]
        public DateTime Time { get; set; }

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
            sb.Append("class ClientMetricsDatapoint {\n");
            sb.Append("  Count: ").Append(Count).Append("\n");
            sb.Append("  Time: ").Append(Time).Append("\n");
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
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
