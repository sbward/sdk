/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.1.21
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
    /// InputAttributes represents the attributes of an input node
    /// </summary>
    [DataContract(Name = "uiNodeInputAttributes")]
    public partial class ClientUiNodeInputAttributes : IEquatable<ClientUiNodeInputAttributes>, IValidatableObject
    {
        /// <summary>
        /// The autocomplete attribute for the input. email InputAttributeAutocompleteEmail tel InputAttributeAutocompleteTel url InputAttributeAutocompleteUrl current-password InputAttributeAutocompleteCurrentPassword new-password InputAttributeAutocompleteNewPassword one-time-code InputAttributeAutocompleteOneTimeCode
        /// </summary>
        /// <value>The autocomplete attribute for the input. email InputAttributeAutocompleteEmail tel InputAttributeAutocompleteTel url InputAttributeAutocompleteUrl current-password InputAttributeAutocompleteCurrentPassword new-password InputAttributeAutocompleteNewPassword one-time-code InputAttributeAutocompleteOneTimeCode</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum AutocompleteEnum
        {
            /// <summary>
            /// Enum Email for value: email
            /// </summary>
            [EnumMember(Value = "email")]
            Email = 1,

            /// <summary>
            /// Enum Tel for value: tel
            /// </summary>
            [EnumMember(Value = "tel")]
            Tel = 2,

            /// <summary>
            /// Enum Url for value: url
            /// </summary>
            [EnumMember(Value = "url")]
            Url = 3,

            /// <summary>
            /// Enum CurrentPassword for value: current-password
            /// </summary>
            [EnumMember(Value = "current-password")]
            CurrentPassword = 4,

            /// <summary>
            /// Enum NewPassword for value: new-password
            /// </summary>
            [EnumMember(Value = "new-password")]
            NewPassword = 5,

            /// <summary>
            /// Enum OneTimeCode for value: one-time-code
            /// </summary>
            [EnumMember(Value = "one-time-code")]
            OneTimeCode = 6

        }


        /// <summary>
        /// The autocomplete attribute for the input. email InputAttributeAutocompleteEmail tel InputAttributeAutocompleteTel url InputAttributeAutocompleteUrl current-password InputAttributeAutocompleteCurrentPassword new-password InputAttributeAutocompleteNewPassword one-time-code InputAttributeAutocompleteOneTimeCode
        /// </summary>
        /// <value>The autocomplete attribute for the input. email InputAttributeAutocompleteEmail tel InputAttributeAutocompleteTel url InputAttributeAutocompleteUrl current-password InputAttributeAutocompleteCurrentPassword new-password InputAttributeAutocompleteNewPassword one-time-code InputAttributeAutocompleteOneTimeCode</value>
        [DataMember(Name = "autocomplete", EmitDefaultValue = false)]
        public AutocompleteEnum? Autocomplete { get; set; }
        /// <summary>
        /// The input&#39;s element type. text InputAttributeTypeText password InputAttributeTypePassword number InputAttributeTypeNumber checkbox InputAttributeTypeCheckbox hidden InputAttributeTypeHidden email InputAttributeTypeEmail tel InputAttributeTypeTel submit InputAttributeTypeSubmit button InputAttributeTypeButton datetime-local InputAttributeTypeDateTimeLocal date InputAttributeTypeDate url InputAttributeTypeURI
        /// </summary>
        /// <value>The input&#39;s element type. text InputAttributeTypeText password InputAttributeTypePassword number InputAttributeTypeNumber checkbox InputAttributeTypeCheckbox hidden InputAttributeTypeHidden email InputAttributeTypeEmail tel InputAttributeTypeTel submit InputAttributeTypeSubmit button InputAttributeTypeButton datetime-local InputAttributeTypeDateTimeLocal date InputAttributeTypeDate url InputAttributeTypeURI</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum Text for value: text
            /// </summary>
            [EnumMember(Value = "text")]
            Text = 1,

            /// <summary>
            /// Enum Password for value: password
            /// </summary>
            [EnumMember(Value = "password")]
            Password = 2,

            /// <summary>
            /// Enum Number for value: number
            /// </summary>
            [EnumMember(Value = "number")]
            Number = 3,

            /// <summary>
            /// Enum Checkbox for value: checkbox
            /// </summary>
            [EnumMember(Value = "checkbox")]
            Checkbox = 4,

            /// <summary>
            /// Enum Hidden for value: hidden
            /// </summary>
            [EnumMember(Value = "hidden")]
            Hidden = 5,

            /// <summary>
            /// Enum Email for value: email
            /// </summary>
            [EnumMember(Value = "email")]
            Email = 6,

            /// <summary>
            /// Enum Tel for value: tel
            /// </summary>
            [EnumMember(Value = "tel")]
            Tel = 7,

            /// <summary>
            /// Enum Submit for value: submit
            /// </summary>
            [EnumMember(Value = "submit")]
            Submit = 8,

            /// <summary>
            /// Enum Button for value: button
            /// </summary>
            [EnumMember(Value = "button")]
            Button = 9,

            /// <summary>
            /// Enum DatetimeLocal for value: datetime-local
            /// </summary>
            [EnumMember(Value = "datetime-local")]
            DatetimeLocal = 10,

            /// <summary>
            /// Enum Date for value: date
            /// </summary>
            [EnumMember(Value = "date")]
            Date = 11,

            /// <summary>
            /// Enum Url for value: url
            /// </summary>
            [EnumMember(Value = "url")]
            Url = 12

        }


        /// <summary>
        /// The input&#39;s element type. text InputAttributeTypeText password InputAttributeTypePassword number InputAttributeTypeNumber checkbox InputAttributeTypeCheckbox hidden InputAttributeTypeHidden email InputAttributeTypeEmail tel InputAttributeTypeTel submit InputAttributeTypeSubmit button InputAttributeTypeButton datetime-local InputAttributeTypeDateTimeLocal date InputAttributeTypeDate url InputAttributeTypeURI
        /// </summary>
        /// <value>The input&#39;s element type. text InputAttributeTypeText password InputAttributeTypePassword number InputAttributeTypeNumber checkbox InputAttributeTypeCheckbox hidden InputAttributeTypeHidden email InputAttributeTypeEmail tel InputAttributeTypeTel submit InputAttributeTypeSubmit button InputAttributeTypeButton datetime-local InputAttributeTypeDateTimeLocal date InputAttributeTypeDate url InputAttributeTypeURI</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = false)]
        public TypeEnum Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientUiNodeInputAttributes" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientUiNodeInputAttributes()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientUiNodeInputAttributes" /> class.
        /// </summary>
        /// <param name="autocomplete">The autocomplete attribute for the input. email InputAttributeAutocompleteEmail tel InputAttributeAutocompleteTel url InputAttributeAutocompleteUrl current-password InputAttributeAutocompleteCurrentPassword new-password InputAttributeAutocompleteNewPassword one-time-code InputAttributeAutocompleteOneTimeCode.</param>
        /// <param name="disabled">Sets the input&#39;s disabled field to true or false. (required).</param>
        /// <param name="label">label.</param>
        /// <param name="name">The input&#39;s element name. (required).</param>
        /// <param name="nodeType">NodeType represents this node&#39;s types. It is a mirror of &#x60;node.type&#x60; and is primarily used to allow compatibility with OpenAPI 3.0.  In this struct it technically always is \&quot;input\&quot;. (required).</param>
        /// <param name="onclick">OnClick may contain javascript which should be executed on click. This is primarily used for WebAuthn..</param>
        /// <param name="pattern">The input&#39;s pattern..</param>
        /// <param name="required">Mark this input field as required..</param>
        /// <param name="type">The input&#39;s element type. text InputAttributeTypeText password InputAttributeTypePassword number InputAttributeTypeNumber checkbox InputAttributeTypeCheckbox hidden InputAttributeTypeHidden email InputAttributeTypeEmail tel InputAttributeTypeTel submit InputAttributeTypeSubmit button InputAttributeTypeButton datetime-local InputAttributeTypeDateTimeLocal date InputAttributeTypeDate url InputAttributeTypeURI (required).</param>
        /// <param name="value">The input&#39;s value..</param>
        public ClientUiNodeInputAttributes(AutocompleteEnum? autocomplete = default(AutocompleteEnum?), bool disabled = default(bool), ClientUiText label = default(ClientUiText), string name = default(string), string nodeType = default(string), string onclick = default(string), string pattern = default(string), bool required = default(bool), TypeEnum type = default(TypeEnum), Object value = default(Object))
        {
            this.Disabled = disabled;
            // to ensure "name" is required (not null)
            if (name == null) {
                throw new ArgumentNullException("name is a required property for ClientUiNodeInputAttributes and cannot be null");
            }
            this.Name = name;
            // to ensure "nodeType" is required (not null)
            if (nodeType == null) {
                throw new ArgumentNullException("nodeType is a required property for ClientUiNodeInputAttributes and cannot be null");
            }
            this.NodeType = nodeType;
            this.Type = type;
            this.Autocomplete = autocomplete;
            this.Label = label;
            this.Onclick = onclick;
            this.Pattern = pattern;
            this.Required = required;
            this.Value = value;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Sets the input&#39;s disabled field to true or false.
        /// </summary>
        /// <value>Sets the input&#39;s disabled field to true or false.</value>
        [DataMember(Name = "disabled", IsRequired = true, EmitDefaultValue = true)]
        public bool Disabled { get; set; }

        /// <summary>
        /// Gets or Sets Label
        /// </summary>
        [DataMember(Name = "label", EmitDefaultValue = false)]
        public ClientUiText Label { get; set; }

        /// <summary>
        /// The input&#39;s element name.
        /// </summary>
        /// <value>The input&#39;s element name.</value>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = false)]
        public string Name { get; set; }

        /// <summary>
        /// NodeType represents this node&#39;s types. It is a mirror of &#x60;node.type&#x60; and is primarily used to allow compatibility with OpenAPI 3.0.  In this struct it technically always is \&quot;input\&quot;.
        /// </summary>
        /// <value>NodeType represents this node&#39;s types. It is a mirror of &#x60;node.type&#x60; and is primarily used to allow compatibility with OpenAPI 3.0.  In this struct it technically always is \&quot;input\&quot;.</value>
        [DataMember(Name = "node_type", IsRequired = true, EmitDefaultValue = false)]
        public string NodeType { get; set; }

        /// <summary>
        /// OnClick may contain javascript which should be executed on click. This is primarily used for WebAuthn.
        /// </summary>
        /// <value>OnClick may contain javascript which should be executed on click. This is primarily used for WebAuthn.</value>
        [DataMember(Name = "onclick", EmitDefaultValue = false)]
        public string Onclick { get; set; }

        /// <summary>
        /// The input&#39;s pattern.
        /// </summary>
        /// <value>The input&#39;s pattern.</value>
        [DataMember(Name = "pattern", EmitDefaultValue = false)]
        public string Pattern { get; set; }

        /// <summary>
        /// Mark this input field as required.
        /// </summary>
        /// <value>Mark this input field as required.</value>
        [DataMember(Name = "required", EmitDefaultValue = true)]
        public bool Required { get; set; }

        /// <summary>
        /// The input&#39;s value.
        /// </summary>
        /// <value>The input&#39;s value.</value>
        [DataMember(Name = "value", EmitDefaultValue = true)]
        public Object Value { get; set; }

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
            sb.Append("class ClientUiNodeInputAttributes {\n");
            sb.Append("  Autocomplete: ").Append(Autocomplete).Append("\n");
            sb.Append("  Disabled: ").Append(Disabled).Append("\n");
            sb.Append("  Label: ").Append(Label).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  NodeType: ").Append(NodeType).Append("\n");
            sb.Append("  Onclick: ").Append(Onclick).Append("\n");
            sb.Append("  Pattern: ").Append(Pattern).Append("\n");
            sb.Append("  Required: ").Append(Required).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Value: ").Append(Value).Append("\n");
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
            return this.Equals(input as ClientUiNodeInputAttributes);
        }

        /// <summary>
        /// Returns true if ClientUiNodeInputAttributes instances are equal
        /// </summary>
        /// <param name="input">Instance of ClientUiNodeInputAttributes to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ClientUiNodeInputAttributes input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Autocomplete == input.Autocomplete ||
                    this.Autocomplete.Equals(input.Autocomplete)
                ) && 
                (
                    this.Disabled == input.Disabled ||
                    this.Disabled.Equals(input.Disabled)
                ) && 
                (
                    this.Label == input.Label ||
                    (this.Label != null &&
                    this.Label.Equals(input.Label))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.NodeType == input.NodeType ||
                    (this.NodeType != null &&
                    this.NodeType.Equals(input.NodeType))
                ) && 
                (
                    this.Onclick == input.Onclick ||
                    (this.Onclick != null &&
                    this.Onclick.Equals(input.Onclick))
                ) && 
                (
                    this.Pattern == input.Pattern ||
                    (this.Pattern != null &&
                    this.Pattern.Equals(input.Pattern))
                ) && 
                (
                    this.Required == input.Required ||
                    this.Required.Equals(input.Required)
                ) && 
                (
                    this.Type == input.Type ||
                    this.Type.Equals(input.Type)
                ) && 
                (
                    this.Value == input.Value ||
                    (this.Value != null &&
                    this.Value.Equals(input.Value))
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
                hashCode = (hashCode * 59) + this.Autocomplete.GetHashCode();
                hashCode = (hashCode * 59) + this.Disabled.GetHashCode();
                if (this.Label != null)
                {
                    hashCode = (hashCode * 59) + this.Label.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.NodeType != null)
                {
                    hashCode = (hashCode * 59) + this.NodeType.GetHashCode();
                }
                if (this.Onclick != null)
                {
                    hashCode = (hashCode * 59) + this.Onclick.GetHashCode();
                }
                if (this.Pattern != null)
                {
                    hashCode = (hashCode * 59) + this.Pattern.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Required.GetHashCode();
                hashCode = (hashCode * 59) + this.Type.GetHashCode();
                if (this.Value != null)
                {
                    hashCode = (hashCode * 59) + this.Value.GetHashCode();
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
