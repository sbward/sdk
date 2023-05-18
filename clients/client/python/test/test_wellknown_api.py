"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.   # noqa: E501

    The version of the OpenAPI document: v1.1.30
    Contact: support@ory.sh
    Generated by: https://openapi-generator.tech
"""


import unittest

import ory_client
from ory_client.api.wellknown_api import WellknownApi  # noqa: E501


class TestWellknownApi(unittest.TestCase):
    """WellknownApi unit test stubs"""

    def setUp(self):
        self.api = WellknownApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_discover_json_web_keys(self):
        """Test case for discover_json_web_keys

        Discover Well-Known JSON Web Keys  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
