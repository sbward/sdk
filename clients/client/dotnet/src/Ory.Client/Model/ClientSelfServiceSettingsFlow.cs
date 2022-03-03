/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v0.0.1-alpha.113
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
    /// This flow is used when an identity wants to update settings (e.g. profile data, passwords, ...) in a selfservice manner.  We recommend reading the [User Settings Documentation](../self-service/flows/user-settings)
    /// </summary>
    [DataContract(Name = "selfServiceSettingsFlow")]
    public partial class ClientSelfServiceSettingsFlow : IEquatable<ClientSelfServiceSettingsFlow>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientSelfServiceSettingsFlow" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientSelfServiceSettingsFlow()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientSelfServiceSettingsFlow" /> class.
        /// </summary>
        /// <param name="active">Active, if set, contains the registration method that is being used. It is initially not set..</param>
        /// <param name="expiresAt">ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to update the setting, a new flow has to be initiated. (required).</param>
        /// <param name="id">id (required).</param>
        /// <param name="identity">identity (required).</param>
        /// <param name="issuedAt">IssuedAt is the time (UTC) when the flow occurred. (required).</param>
        /// <param name="requestUrl">RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL&#39;s path or query for example. (required).</param>
        /// <param name="returnTo">ReturnTo contains the requested return_to URL..</param>
        /// <param name="state">state (required).</param>
        /// <param name="type">The flow type can either be &#x60;api&#x60; or &#x60;browser&#x60;..</param>
        /// <param name="ui">ui (required).</param>
        public ClientSelfServiceSettingsFlow(string active = default(string), DateTime expiresAt = default(DateTime), string id = default(string), ClientIdentity identity = default(ClientIdentity), DateTime issuedAt = default(DateTime), string requestUrl = default(string), string returnTo = default(string), ClientSelfServiceSettingsFlowState state = default(ClientSelfServiceSettingsFlowState), string type = default(string), ClientUiContainer ui = default(ClientUiContainer))
        {
            this.ExpiresAt = expiresAt;
            // to ensure "id" is required (not null)
            if (id == null) {
                throw new ArgumentNullException("id is a required property for ClientSelfServiceSettingsFlow and cannot be null");
            }
            this.Id = id;
            // to ensure "identity" is required (not null)
            if (identity == null) {
                throw new ArgumentNullException("identity is a required property for ClientSelfServiceSettingsFlow and cannot be null");
            }
            this.Identity = identity;
            this.IssuedAt = issuedAt;
            // to ensure "requestUrl" is required (not null)
            if (requestUrl == null) {
                throw new ArgumentNullException("requestUrl is a required property for ClientSelfServiceSettingsFlow and cannot be null");
            }
            this.RequestUrl = requestUrl;
            // to ensure "state" is required (not null)
            if (state == null) {
                throw new ArgumentNullException("state is a required property for ClientSelfServiceSettingsFlow and cannot be null");
            }
            this.State = state;
            // to ensure "ui" is required (not null)
            if (ui == null) {
                throw new ArgumentNullException("ui is a required property for ClientSelfServiceSettingsFlow and cannot be null");
            }
            this.Ui = ui;
            this.Active = active;
            this.ReturnTo = returnTo;
            this.Type = type;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Active, if set, contains the registration method that is being used. It is initially not set.
        /// </summary>
        /// <value>Active, if set, contains the registration method that is being used. It is initially not set.</value>
        [DataMember(Name = "active", EmitDefaultValue = false)]
        public string Active { get; set; }

        /// <summary>
        /// ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to update the setting, a new flow has to be initiated.
        /// </summary>
        /// <value>ExpiresAt is the time (UTC) when the flow expires. If the user still wishes to update the setting, a new flow has to be initiated.</value>
        [DataMember(Name = "expires_at", IsRequired = true, EmitDefaultValue = false)]
        public DateTime ExpiresAt { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Identity
        /// </summary>
        [DataMember(Name = "identity", IsRequired = true, EmitDefaultValue = false)]
        public ClientIdentity Identity { get; set; }

        /// <summary>
        /// IssuedAt is the time (UTC) when the flow occurred.
        /// </summary>
        /// <value>IssuedAt is the time (UTC) when the flow occurred.</value>
        [DataMember(Name = "issued_at", IsRequired = true, EmitDefaultValue = false)]
        public DateTime IssuedAt { get; set; }

        /// <summary>
        /// RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL&#39;s path or query for example.
        /// </summary>
        /// <value>RequestURL is the initial URL that was requested from Ory Kratos. It can be used to forward information contained in the URL&#39;s path or query for example.</value>
        [DataMember(Name = "request_url", IsRequired = true, EmitDefaultValue = false)]
        public string RequestUrl { get; set; }

        /// <summary>
        /// ReturnTo contains the requested return_to URL.
        /// </summary>
        /// <value>ReturnTo contains the requested return_to URL.</value>
        [DataMember(Name = "return_to", EmitDefaultValue = false)]
        public string ReturnTo { get; set; }

        /// <summary>
        /// Gets or Sets State
        /// </summary>
        [DataMember(Name = "state", IsRequired = true, EmitDefaultValue = false)]
        public ClientSelfServiceSettingsFlowState State { get; set; }

        /// <summary>
        /// The flow type can either be &#x60;api&#x60; or &#x60;browser&#x60;.
        /// </summary>
        /// <value>The flow type can either be &#x60;api&#x60; or &#x60;browser&#x60;.</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets Ui
        /// </summary>
        [DataMember(Name = "ui", IsRequired = true, EmitDefaultValue = false)]
        public ClientUiContainer Ui { get; set; }

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
            sb.Append("class ClientSelfServiceSettingsFlow {\n");
            sb.Append("  Active: ").Append(Active).Append("\n");
            sb.Append("  ExpiresAt: ").Append(ExpiresAt).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Identity: ").Append(Identity).Append("\n");
            sb.Append("  IssuedAt: ").Append(IssuedAt).Append("\n");
            sb.Append("  RequestUrl: ").Append(RequestUrl).Append("\n");
            sb.Append("  ReturnTo: ").Append(ReturnTo).Append("\n");
            sb.Append("  State: ").Append(State).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Ui: ").Append(Ui).Append("\n");
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
            return this.Equals(input as ClientSelfServiceSettingsFlow);
        }

        /// <summary>
        /// Returns true if ClientSelfServiceSettingsFlow instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientSelfServiceSettingsFlow to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientSelfServiceSettingsFlow input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Active == input.Active ||
                    (this.Active != null &&
                    this.Active.Equals(input.Active))
                ) && 
                (
                    this.ExpiresAt == input.ExpiresAt ||
                    (this.ExpiresAt != null &&
                    this.ExpiresAt.Equals(input.ExpiresAt))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Identity == input.Identity ||
                    (this.Identity != null &&
                    this.Identity.Equals(input.Identity))
                ) && 
                (
                    this.IssuedAt == input.IssuedAt ||
                    (this.IssuedAt != null &&
                    this.IssuedAt.Equals(input.IssuedAt))
                ) && 
                (
                    this.RequestUrl == input.RequestUrl ||
                    (this.RequestUrl != null &&
                    this.RequestUrl.Equals(input.RequestUrl))
                ) && 
                (
                    this.ReturnTo == input.ReturnTo ||
                    (this.ReturnTo != null &&
                    this.ReturnTo.Equals(input.ReturnTo))
                ) && 
                (
                    this.State == input.State ||
                    (this.State != null &&
                    this.State.Equals(input.State))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Ui == input.Ui ||
                    (this.Ui != null &&
                    this.Ui.Equals(input.Ui))
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
                if (this.Active != null)
                {
                    hashCode = (hashCode * 59) + this.Active.GetHashCode();
                }
                if (this.ExpiresAt != null)
                {
                    hashCode = (hashCode * 59) + this.ExpiresAt.GetHashCode();
                }
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Identity != null)
                {
                    hashCode = (hashCode * 59) + this.Identity.GetHashCode();
                }
                if (this.IssuedAt != null)
                {
                    hashCode = (hashCode * 59) + this.IssuedAt.GetHashCode();
                }
                if (this.RequestUrl != null)
                {
                    hashCode = (hashCode * 59) + this.RequestUrl.GetHashCode();
                }
                if (this.ReturnTo != null)
                {
                    hashCode = (hashCode * 59) + this.ReturnTo.GetHashCode();
                }
                if (this.State != null)
                {
                    hashCode = (hashCode * 59) + this.State.GetHashCode();
                }
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
                }
                if (this.Ui != null)
                {
                    hashCode = (hashCode * 59) + this.Ui.GetHashCode();
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
