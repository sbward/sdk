# coding: utf-8

"""
    Ory Hydra API

    Documentation for all of Ory Hydra's APIs. 

    The version of the OpenAPI document: v2.4.0-alpha.1
    Contact: hi@ory.sh
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ory_hydra_client.models.generic_error import GenericError

class TestGenericError(unittest.TestCase):
    """GenericError unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> GenericError:
        """Test GenericError
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `GenericError`
        """
        model = GenericError()
        if include_optional:
            return GenericError(
                code = 404,
                debug = 'SQL field "foo" is not a bool.',
                details = None,
                id = '',
                message = 'The resource could not be found',
                reason = 'User with ID 1234 does not exist.',
                request = 'd7ef54b1-ec15-46e6-bccb-524b82c035e6',
                status = 'Not Found'
            )
        else:
            return GenericError(
                message = 'The resource could not be found',
        )
        """

    def testGenericError(self):
        """Test GenericError"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
