# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# https://openapi-generator.tech
# Do not edit the class manually.

defmodule Ory.Model.RelationQuery do
  @moduledoc """
  
  """

  @derive [Poison.Encoder]
  defstruct [
    :"namespace",
    :"object",
    :"relation",
    :"subject_id",
    :"subject_set"
  ]

  @type t :: %__MODULE__{
    :"namespace" => String.t | nil,
    :"object" => String.t | nil,
    :"relation" => String.t | nil,
    :"subject_id" => String.t | nil,
    :"subject_set" => Ory.Model.SubjectSet.t | nil
  }
end

defimpl Poison.Decoder, for: Ory.Model.RelationQuery do
  import Ory.Deserializer
  def decode(value, options) do
    value
    |> deserialize(:"subject_set", :struct, Ory.Model.SubjectSet, options)
  end
end

