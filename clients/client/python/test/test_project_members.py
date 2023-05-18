"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.   # noqa: E501

    The version of the OpenAPI document: v1.1.30
    Contact: support@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_client
from ory_client.model.cloud_account import CloudAccount
globals()['CloudAccount'] = CloudAccount
from ory_client.model.project_members import ProjectMembers


class TestProjectMembers(unittest.TestCase):
    """ProjectMembers unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testProjectMembers(self):
        """Test ProjectMembers"""
        # FIXME: construct object with mandatory attributes with example values
        # model = ProjectMembers()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()
