"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.   # noqa: E501

    The version of the OpenAPI document: v0.0.1-alpha.66
    Contact: support@ory.sh
    Generated by: https://openapi-generator.tech
"""


import sys
import unittest

import ory_client
from ory_client.model.project import Project
from ory_client.model.warning import Warning
globals()['Project'] = Project
globals()['Warning'] = Warning
from ory_client.model.successful_update_project_config import SuccessfulUpdateProjectConfig


class TestSuccessfulUpdateProjectConfig(unittest.TestCase):
    """SuccessfulUpdateProjectConfig unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def testSuccessfulUpdateProjectConfig(self):
        """Test SuccessfulUpdateProjectConfig"""
        # FIXME: construct object with mandatory attributes with example values
        # model = SuccessfulUpdateProjectConfig()  # noqa: E501
        pass


if __name__ == '__main__':
    unittest.main()