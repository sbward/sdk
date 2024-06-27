/*
 * Ory APIs
 *
 * Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 
 *
 * The version of the OpenAPI document: v1.12.0
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
    /// ClientInvoice
    /// </summary>
    [DataContract(Name = "invoice")]
    public partial class ClientInvoice : IValidatableObject
    {
        /// <summary>
        /// Type is the type of the invoice. usage InvoiceTypeUsage base InvoiceTypeBase
        /// </summary>
        /// <value>Type is the type of the invoice. usage InvoiceTypeUsage base InvoiceTypeBase</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            /// <summary>
            /// Enum Usage for value: usage
            /// </summary>
            [EnumMember(Value = "usage")]
            Usage = 1,

            /// <summary>
            /// Enum Base for value: base
            /// </summary>
            [EnumMember(Value = "base")]
            Base = 2
        }


        /// <summary>
        /// Type is the type of the invoice. usage InvoiceTypeUsage base InvoiceTypeBase
        /// </summary>
        /// <value>Type is the type of the invoice. usage InvoiceTypeUsage base InvoiceTypeBase</value>
        [DataMember(Name = "type", IsRequired = true, EmitDefaultValue = true)]
        public TypeEnum Type { get; set; }

        /// <summary>
        /// Returns false as Type should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializeType()
        {
            return false;
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientInvoice" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ClientInvoice()
        {
            this.AdditionalProperties = new Dictionary<string, object>();
        }
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientInvoice" /> class.
        /// </summary>
        /// <param name="invoicedAt">invoicedAt (required).</param>
        /// <param name="updatedAt">updatedAt.</param>
        /// <param name="v1">v1.</param>
        public ClientInvoice(DateTime invoicedAt = default(DateTime), DateTime updatedAt = default(DateTime), ClientInvoiceDataV1 v1 = default(ClientInvoiceDataV1))
        {
            this.InvoicedAt = invoicedAt;
            this.UpdatedAt = updatedAt;
            this.V1 = v1;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// The ID of the subscription
        /// </summary>
        /// <value>The ID of the subscription</value>
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
        /// Gets or Sets InvoicedAt
        /// </summary>
        [DataMember(Name = "invoiced_at", IsRequired = true, EmitDefaultValue = true)]
        public DateTime InvoicedAt { get; set; }

        /// <summary>
        /// Gets or Sets UpdatedAt
        /// </summary>
        [DataMember(Name = "updated_at", EmitDefaultValue = false)]
        public DateTime UpdatedAt { get; set; }

        /// <summary>
        /// Gets or Sets V1
        /// </summary>
        [DataMember(Name = "v1", EmitDefaultValue = false)]
        public ClientInvoiceDataV1 V1 { get; set; }

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
            sb.Append("class ClientInvoice {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  InvoicedAt: ").Append(InvoicedAt).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
            sb.Append("  V1: ").Append(V1).Append("\n");
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