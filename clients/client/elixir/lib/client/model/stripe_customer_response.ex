# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Client.Model.StripeCustomerResponse do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"id"
  ]

  @type t :: %__MODULE__{
    :"id" => String.t | nil
  }
end

defimpl Poison.Decoder, for: Client.Model.StripeCustomerResponse do
  def decode(value, _options) do
    value
  end
end
