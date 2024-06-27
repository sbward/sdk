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
    /// Together the name and identity uuid are a unique index constraint. This prevents a user from having schemas with the same name. This also allows schemas to have the same name across the system.
    /// </summary>
    [DataContract(Name = "managedIdentitySchema")]
    public partial class ClientManagedIdentitySchema : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientManagedIdentitySchema" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientManagedIdentitySchema()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientManagedIdentitySchema" /> class.
        /// </summary>
        /// <param name="blobName">The gcs file name  This is a randomly generated name which is used to uniquely identify the file on the blob storage (required).</param>
        /// <param name="blobUrl">The publicly accessible url of the schema (required).</param>
        /// <param name="contentHash">The Content Hash  Contains a hash of the schema&#39;s content..</param>
        /// <param name="name">The schema name  This is set by the user and is for them to easily recognise their schema (required).</param>
        public ClientManagedIdentitySchema(string blobName = default(string), string blobUrl = default(string), string contentHash = default(string), string name = default(string))
        {
            // to ensure "blobName" is required (not null)
            if (blobName == null)
            {
                throw new ArgumentNullException("blobName is a required property for ClientManagedIdentitySchema and cannot be null");
            }
            this.BlobName = blobName;
            // to ensure "blobUrl" is required (not null)
            if (blobUrl == null)
            {
                throw new ArgumentNullException("blobUrl is a required property for ClientManagedIdentitySchema and cannot be null");
            }
            this.BlobUrl = blobUrl;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for ClientManagedIdentitySchema and cannot be null");
            }
            this.Name = name;
            this.ContentHash = contentHash;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// The gcs file name  This is a randomly generated name which is used to uniquely identify the file on the blob storage
        /// </summary>
        /// <value>The gcs file name  This is a randomly generated name which is used to uniquely identify the file on the blob storage</value>
        [DataMember(Name = "blob_name", IsRequired = true, EmitDefaultValue = true)]
        public string BlobName { get; set; }

        /// <summary>
        /// The publicly accessible url of the schema
        /// </summary>
        /// <value>The publicly accessible url of the schema</value>
        [DataMember(Name = "blob_url", IsRequired = true, EmitDefaultValue = true)]
        public string BlobUrl { get; set; }

        /// <summary>
        /// The Content Hash  Contains a hash of the schema&#39;s content.
        /// </summary>
        /// <value>The Content Hash  Contains a hash of the schema&#39;s content.</value>
        [DataMember(Name = "content_hash", EmitDefaultValue = false)]
        public string ContentHash { get; set; }

        /// <summary>
        /// The Schema&#39;s Creation Date
        /// </summary>
        /// <value>The Schema&#39;s Creation Date</value>
        [DataMember(Name = "created_at", IsRequired = true, EmitDefaultValue = true)]
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
        /// The schema&#39;s ID.
        /// </summary>
        /// <value>The schema&#39;s ID.</value>
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
        /// The schema name  This is set by the user and is for them to easily recognise their schema
        /// </summary>
        /// <value>The schema name  This is set by the user and is for them to easily recognise their schema</value>
        /// <example>CustomerIdentity</example>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Last Time Schema was Updated
        /// </summary>
        /// <value>Last Time Schema was Updated</value>
        [DataMember(Name = "updated_at", IsRequired = true, EmitDefaultValue = true)]
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
            sb.Append("class ClientManagedIdentitySchema {\n");
            sb.Append("  BlobName: ").Append(BlobName).Append("\n");
            sb.Append("  BlobUrl: ").Append(BlobUrl).Append("\n");
            sb.Append("  ContentHash: ").Append(ContentHash).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
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
