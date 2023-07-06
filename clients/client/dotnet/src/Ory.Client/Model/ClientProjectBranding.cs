/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.41
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
    /// ClientProjectBranding
    /// </summary>
    [DataContract(Name = "projectBranding")]
    public partial class ClientProjectBranding : IEquatable<ClientProjectBranding>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientProjectBranding" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientProjectBranding()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientProjectBranding" /> class.
        /// </summary>
        /// <param name="defaultTheme">defaultTheme (required).</param>
        /// <param name="projectId">The Project&#39;s ID this customization is associated with (required).</param>
        /// <param name="themes">themes (required).</param>
        public ClientProjectBranding(ClientProjectBrandingTheme defaultTheme = default(ClientProjectBrandingTheme), string projectId = default(string), List<ClientProjectBrandingTheme> themes = default(List<ClientProjectBrandingTheme>))
        {
            // to ensure "defaultTheme" is required (not null)
            if (defaultTheme == null) {
                throw new ArgumentNullException("defaultTheme is a required property for ClientProjectBranding and cannot be null");
            }
            this.DefaultTheme = defaultTheme;
            // to ensure "projectId" is required (not null)
            if (projectId == null) {
                throw new ArgumentNullException("projectId is a required property for ClientProjectBranding and cannot be null");
            }
            this.ProjectId = projectId;
            // to ensure "themes" is required (not null)
            if (themes == null) {
                throw new ArgumentNullException("themes is a required property for ClientProjectBranding and cannot be null");
            }
            this.Themes = themes;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// The Customization Creation Date
        /// </summary>
        /// <value>The Customization Creation Date</value>
        [DataMember(Name = "created_at", IsRequired = true, EmitDefaultValue = false)]
        public DateTime CreatedAt { get; private set; }

        /// <summary>
        /// Returns false as CreatedAt should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeCreatedAt()
        {
            return false;
        }
        /// <summary>
        /// Gets or Sets DefaultTheme
        /// </summary>
        [DataMember(Name = "default_theme", IsRequired = true, EmitDefaultValue = false)]
        public ClientProjectBrandingTheme DefaultTheme { get; set; }

        /// <summary>
        /// The customization ID.
        /// </summary>
        /// <value>The customization ID.</value>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = false)]
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
        /// The Project&#39;s ID this customization is associated with
        /// </summary>
        /// <value>The Project&#39;s ID this customization is associated with</value>
        [DataMember(Name = "project_id", IsRequired = true, EmitDefaultValue = false)]
        public string ProjectId { get; set; }

        /// <summary>
        /// Gets or Sets Themes
        /// </summary>
        [DataMember(Name = "themes", IsRequired = true, EmitDefaultValue = false)]
        public List<ClientProjectBrandingTheme> Themes { get; set; }

        /// <summary>
        /// Last Time Branding was Updated
        /// </summary>
        /// <value>Last Time Branding was Updated</value>
        [DataMember(Name = "updated_at", IsRequired = true, EmitDefaultValue = false)]
        public DateTime UpdatedAt { get; private set; }

        /// <summary>
        /// Returns false as UpdatedAt should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeUpdatedAt()
        {
            return false;
        }
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
            sb.Append("class ClientProjectBranding {\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  DefaultTheme: ").Append(DefaultTheme).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ProjectId: ").Append(ProjectId).Append("\n");
            sb.Append("  Themes: ").Append(Themes).Append("\n");
            sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
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
            return this.Equals(input as ClientProjectBranding);
        }

        /// <summary>
        /// Returns true if ClientProjectBranding instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientProjectBranding to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientProjectBranding input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.CreatedAt == input.CreatedAt ||
                    (this.CreatedAt != null &&
                    this.CreatedAt.Equals(input.CreatedAt))
                ) && 
                (
                    this.DefaultTheme == input.DefaultTheme ||
                    (this.DefaultTheme != null &&
                    this.DefaultTheme.Equals(input.DefaultTheme))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.ProjectId == input.ProjectId ||
                    (this.ProjectId != null &&
                    this.ProjectId.Equals(input.ProjectId))
                ) && 
                (
                    this.Themes == input.Themes ||
                    this.Themes != null &&
                    input.Themes != null &&
                    this.Themes.SequenceEqual(input.Themes)
                ) && 
                (
                    this.UpdatedAt == input.UpdatedAt ||
                    (this.UpdatedAt != null &&
                    this.UpdatedAt.Equals(input.UpdatedAt))
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
                if (this.CreatedAt != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedAt.GetHashCode();
                }
                if (this.DefaultTheme != null)
                {
                    hashCode = (hashCode * 59) + this.DefaultTheme.GetHashCode();
                }
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.ProjectId != null)
                {
                    hashCode = (hashCode * 59) + this.ProjectId.GetHashCode();
                }
                if (this.Themes != null)
                {
                    hashCode = (hashCode * 59) + this.Themes.GetHashCode();
                }
                if (this.UpdatedAt != null)
                {
                    hashCode = (hashCode * 59) + this.UpdatedAt.GetHashCode();
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
