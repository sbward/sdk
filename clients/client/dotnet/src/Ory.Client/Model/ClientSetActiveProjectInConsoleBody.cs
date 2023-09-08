/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.2.3
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
    /// Set active project in the Ory Network Console Request Body
    /// </summary>
    [DataContract(Name = "setActiveProjectInConsoleBody")]
    public partial class ClientSetActiveProjectInConsoleBody : IEquatable<ClientSetActiveProjectInConsoleBody>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientSetActiveProjectInConsoleBody" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientSetActiveProjectInConsoleBody()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientSetActiveProjectInConsoleBody" /> class.
        /// </summary>
        /// <param name="projectId">Project ID  The Project ID you want to set active.  format: uuid (required).</param>
        public ClientSetActiveProjectInConsoleBody(string projectId = default(string))
        {
            // to ensure "projectId" is required (not null)
            if (projectId == null) {
                throw new ArgumentNullException("projectId is a required property for ClientSetActiveProjectInConsoleBody and cannot be null");
            }
            this.ProjectId = projectId;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Project ID  The Project ID you want to set active.  format: uuid
        /// </summary>
        /// <value>Project ID  The Project ID you want to set active.  format: uuid</value>
        [DataMember(Name = "project_id", IsRequired = true, EmitDefaultValue = false)]
        public string ProjectId { get; set; }

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
            sb.Append("class ClientSetActiveProjectInConsoleBody {\n");
            sb.Append("  ProjectId: ").Append(ProjectId).Append("\n");
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
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ClientSetActiveProjectInConsoleBody);
        }

        /// <summary>
        /// Returns true if ClientSetActiveProjectInConsoleBody instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientSetActiveProjectInConsoleBody to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientSetActiveProjectInConsoleBody input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.ProjectId == input.ProjectId ||
                    (this.ProjectId != null &&
                    this.ProjectId.Equals(input.ProjectId))
                )
                && (this.AdditionalProperties.Count == input.AdditionalProperties.Count && !this.AdditionalProperties.Except(input.AdditionalProperties).Any());
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.ProjectId != null)
                {
                    hashCode = (hashCode * 59) + this.ProjectId.GetHashCode();
                }
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
