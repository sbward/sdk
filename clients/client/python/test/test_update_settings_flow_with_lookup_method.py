# coding: utf-8

"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers. 

    The version of the OpenAPI document: v1.12.1
    Contact: support@ory.sh
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ory_client.models.update_settings_flow_with_lookup_method import UpdateSettingsFlowWithLookupMethod

class TestUpdateSettingsFlowWithLookupMethod(unittest.TestCase):
    """UpdateSettingsFlowWithLookupMethod unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> UpdateSettingsFlowWithLookupMethod:
        """Test UpdateSettingsFlowWithLookupMethod
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `UpdateSettingsFlowWithLookupMethod`
        """
        model = UpdateSettingsFlowWithLookupMethod()
        if include_optional:
            return UpdateSettingsFlowWithLookupMethod(
                csrf_token = '',
                lookup_secret_confirm = True,
                lookup_secret_disable = True,
                lookup_secret_regenerate = True,
                lookup_secret_reveal = True,
                method = '',
                transient_payload = ory_client.models.transient_payload.transient_payload()
            )
        else:
            return UpdateSettingsFlowWithLookupMethod(
                method = '',
        )
        """

    def testUpdateSettingsFlowWithLookupMethod(self):
        """Test UpdateSettingsFlowWithLookupMethod"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
