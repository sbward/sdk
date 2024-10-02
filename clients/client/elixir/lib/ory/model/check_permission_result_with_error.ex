# NOTE: This file is auto generated by OpenAPI Generator 7.7.0 (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule Ory.Model.CheckPermissionResultWithError do
  @moduledoc """
  Check Permission Result With Error
  """

  @derive Jason.Encoder
  defstruct [
    :allowed,
    :error
  ]

  @type t :: %__MODULE__{
    :allowed => boolean(),
    :error => String.t | nil
  }

  def decode(value) do
    value
  end
end
