# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Kratos.Model.UiNodeScriptAttributes do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"async",
    :"crossorigin",
    :"id",
    :"integrity",
    :"node_type",
    :"referrerpolicy",
    :"src",
    :"type"
  ]

  @type t :: %__MODULE__{
    :"async" => boolean(),
    :"crossorigin" => String.t,
    :"id" => String.t,
    :"integrity" => String.t,
    :"node_type" => String.t,
    :"referrerpolicy" => String.t,
    :"src" => String.t,
    :"type" => String.t
  }
end

defimpl Poison.Decoder, for: Kratos.Model.UiNodeScriptAttributes do
  def decode(value, _options) do
    value
  end
end
