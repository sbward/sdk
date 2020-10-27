# coding: utf-8

"""
    Ory Kratos

    Welcome to the ORY Kratos HTTP API documentation!  # noqa: E501

    The version of the OpenAPI document: v0.5.0-alpha.1
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest
import datetime

import ory_kratos_client
from ory_kratos_client.models.complete_self_service_recovery_flow_with_link_method import CompleteSelfServiceRecoveryFlowWithLinkMethod  # noqa: E501
from ory_kratos_client.rest import ApiException

class TestCompleteSelfServiceRecoveryFlowWithLinkMethod(unittest.TestCase):
    """CompleteSelfServiceRecoveryFlowWithLinkMethod unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test CompleteSelfServiceRecoveryFlowWithLinkMethod
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = ory_kratos_client.models.complete_self_service_recovery_flow_with_link_method.CompleteSelfServiceRecoveryFlowWithLinkMethod()  # noqa: E501
        if include_optional :
            return CompleteSelfServiceRecoveryFlowWithLinkMethod(
                csrf_token = '0', 
                email = '0'
            )
        else :
            return CompleteSelfServiceRecoveryFlowWithLinkMethod(
        )

    def testCompleteSelfServiceRecoveryFlowWithLinkMethod(self):
        """Test CompleteSelfServiceRecoveryFlowWithLinkMethod"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)


if __name__ == '__main__':
    unittest.main()