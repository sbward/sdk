/*
 * Ory APIs
 *
 * # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | - -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | - -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- -- - | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 
 *
 * The version of the OpenAPI document: v1.16.6
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
    /// A completed OAuth 2.0 Consent Session.
    /// </summary>
    [DataContract(Name = "oAuth2ConsentSession")]
    public partial class ClientOAuth2ConsentSession : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ClientOAuth2ConsentSession" /> class.
        /// </summary>
        /// <param name="consentRequest">consentRequest.</param>
        /// <param name="context">context.</param>
        /// <param name="expiresAt">expiresAt.</param>
        /// <param name="grantAccessTokenAudience">grantAccessTokenAudience.</param>
        /// <param name="grantScope">grantScope.</param>
        /// <param name="handledAt">handledAt.</param>
        /// <param name="remember">Remember Consent  Remember, if set to true, tells ORY Hydra to remember this consent authorization and reuse it if the same client asks the same user for the same, or a subset of, scope..</param>
        /// <param name="rememberFor">Remember Consent For  RememberFor sets how long the consent authorization should be remembered for in seconds. If set to &#x60;0&#x60;, the authorization will be remembered indefinitely..</param>
        /// <param name="session">session.</param>
        public ClientOAuth2ConsentSession(ClientOAuth2ConsentRequest consentRequest = default(ClientOAuth2ConsentRequest), Object context = default(Object), ClientOAuth2ConsentSessionExpiresAt expiresAt = default(ClientOAuth2ConsentSessionExpiresAt), List<string> grantAccessTokenAudience = default(List<string>), List<string> grantScope = default(List<string>), DateTime handledAt = default(DateTime), bool remember = default(bool), long rememberFor = default(long), ClientAcceptOAuth2ConsentRequestSession session = default(ClientAcceptOAuth2ConsentRequestSession))
        {
            this.ConsentRequest = consentRequest;
            this.Context = context;
            this.ExpiresAt = expiresAt;
            this.GrantAccessTokenAudience = grantAccessTokenAudience;
            this.GrantScope = grantScope;
            this.HandledAt = handledAt;
            this.Remember = remember;
            this.RememberFor = rememberFor;
            this.Session = session;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Gets or Sets ConsentRequest
        /// </summary>
        [DataMember(Name = "consent_request", EmitDefaultValue = false)]
        public ClientOAuth2ConsentRequest ConsentRequest { get; set; }

        /// <summary>
        /// Gets or Sets Context
        /// </summary>
        [DataMember(Name = "context", EmitDefaultValue = false)]
        public Object Context { get; set; }

        /// <summary>
        /// Gets or Sets ExpiresAt
        /// </summary>
        [DataMember(Name = "expires_at", EmitDefaultValue = false)]
        public ClientOAuth2ConsentSessionExpiresAt ExpiresAt { get; set; }

        /// <summary>
        /// Gets or Sets GrantAccessTokenAudience
        /// </summary>
        [DataMember(Name = "grant_access_token_audience", EmitDefaultValue = false)]
        public List<string> GrantAccessTokenAudience { get; set; }

        /// <summary>
        /// Gets or Sets GrantScope
        /// </summary>
        [DataMember(Name = "grant_scope", EmitDefaultValue = false)]
        public List<string> GrantScope { get; set; }

        /// <summary>
        /// Gets or Sets HandledAt
        /// </summary>
        [DataMember(Name = "handled_at", EmitDefaultValue = false)]
        public DateTime HandledAt { get; set; }

        /// <summary>
        /// Remember Consent  Remember, if set to true, tells ORY Hydra to remember this consent authorization and reuse it if the same client asks the same user for the same, or a subset of, scope.
        /// </summary>
        /// <value>Remember Consent  Remember, if set to true, tells ORY Hydra to remember this consent authorization and reuse it if the same client asks the same user for the same, or a subset of, scope.</value>
        [DataMember(Name = "remember", EmitDefaultValue = true)]
        public bool Remember { get; set; }

        /// <summary>
        /// Remember Consent For  RememberFor sets how long the consent authorization should be remembered for in seconds. If set to &#x60;0&#x60;, the authorization will be remembered indefinitely.
        /// </summary>
        /// <value>Remember Consent For  RememberFor sets how long the consent authorization should be remembered for in seconds. If set to &#x60;0&#x60;, the authorization will be remembered indefinitely.</value>
        [DataMember(Name = "remember_for", EmitDefaultValue = false)]
        public long RememberFor { get; set; }

        /// <summary>
        /// Gets or Sets Session
        /// </summary>
        [DataMember(Name = "session", EmitDefaultValue = false)]
        public ClientAcceptOAuth2ConsentRequestSession Session { get; set; }

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
            sb.Append("class ClientOAuth2ConsentSession {\n");
            sb.Append("  ConsentRequest: ").Append(ConsentRequest).Append("\n");
            sb.Append("  Context: ").Append(Context).Append("\n");
            sb.Append("  ExpiresAt: ").Append(ExpiresAt).Append("\n");
            sb.Append("  GrantAccessTokenAudience: ").Append(GrantAccessTokenAudience).Append("\n");
            sb.Append("  GrantScope: ").Append(GrantScope).Append("\n");
            sb.Append("  HandledAt: ").Append(HandledAt).Append("\n");
            sb.Append("  Remember: ").Append(Remember).Append("\n");
            sb.Append("  RememberFor: ").Append(RememberFor).Append("\n");
            sb.Append("  Session: ").Append(Session).Append("\n");
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
