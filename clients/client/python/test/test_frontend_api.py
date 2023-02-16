"""
    Ory APIs

    Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.   # noqa: E501

    The version of the OpenAPI document: v1.1.12
    Contact: support@ory.sh
    Generated by: https://openapi-generator.tech
"""


import unittest

import ory_client
from ory_client.api.frontend_api import FrontendApi  # noqa: E501


class TestFrontendApi(unittest.TestCase):
    """FrontendApi unit test stubs"""

    def setUp(self):
        self.api = FrontendApi()  # noqa: E501

    def tearDown(self):
        pass

    def test_create_browser_login_flow(self):
        """Test case for create_browser_login_flow

        Create Login Flow for Browsers  # noqa: E501
        """
        pass

    def test_create_browser_logout_flow(self):
        """Test case for create_browser_logout_flow

        Create a Logout URL for Browsers  # noqa: E501
        """
        pass

    def test_create_browser_recovery_flow(self):
        """Test case for create_browser_recovery_flow

        Create Recovery Flow for Browsers  # noqa: E501
        """
        pass

    def test_create_browser_registration_flow(self):
        """Test case for create_browser_registration_flow

        Create Registration Flow for Browsers  # noqa: E501
        """
        pass

    def test_create_browser_settings_flow(self):
        """Test case for create_browser_settings_flow

        Create Settings Flow for Browsers  # noqa: E501
        """
        pass

    def test_create_browser_verification_flow(self):
        """Test case for create_browser_verification_flow

        Create Verification Flow for Browser Clients  # noqa: E501
        """
        pass

    def test_create_native_login_flow(self):
        """Test case for create_native_login_flow

        Create Login Flow for Native Apps  # noqa: E501
        """
        pass

    def test_create_native_recovery_flow(self):
        """Test case for create_native_recovery_flow

        Create Recovery Flow for Native Apps  # noqa: E501
        """
        pass

    def test_create_native_registration_flow(self):
        """Test case for create_native_registration_flow

        Create Registration Flow for Native Apps  # noqa: E501
        """
        pass

    def test_create_native_settings_flow(self):
        """Test case for create_native_settings_flow

        Create Settings Flow for Native Apps  # noqa: E501
        """
        pass

    def test_create_native_verification_flow(self):
        """Test case for create_native_verification_flow

        Create Verification Flow for Native Apps  # noqa: E501
        """
        pass

    def test_disable_my_other_sessions(self):
        """Test case for disable_my_other_sessions

        Disable my other sessions  # noqa: E501
        """
        pass

    def test_disable_my_session(self):
        """Test case for disable_my_session

        Disable one of my sessions  # noqa: E501
        """
        pass

    def test_get_flow_error(self):
        """Test case for get_flow_error

        Get User-Flow Errors  # noqa: E501
        """
        pass

    def test_get_login_flow(self):
        """Test case for get_login_flow

        Get Login Flow  # noqa: E501
        """
        pass

    def test_get_recovery_flow(self):
        """Test case for get_recovery_flow

        Get Recovery Flow  # noqa: E501
        """
        pass

    def test_get_registration_flow(self):
        """Test case for get_registration_flow

        Get Registration Flow  # noqa: E501
        """
        pass

    def test_get_settings_flow(self):
        """Test case for get_settings_flow

        Get Settings Flow  # noqa: E501
        """
        pass

    def test_get_verification_flow(self):
        """Test case for get_verification_flow

        Get Verification Flow  # noqa: E501
        """
        pass

    def test_get_web_authn_java_script(self):
        """Test case for get_web_authn_java_script

        Get WebAuthn JavaScript  # noqa: E501
        """
        pass

    def test_list_my_sessions(self):
        """Test case for list_my_sessions

        Get My Active Sessions  # noqa: E501
        """
        pass

    def test_perform_native_logout(self):
        """Test case for perform_native_logout

        Perform Logout for Native Apps  # noqa: E501
        """
        pass

    def test_to_session(self):
        """Test case for to_session

        Check Who the Current HTTP Session Belongs To  # noqa: E501
        """
        pass

    def test_update_login_flow(self):
        """Test case for update_login_flow

        Submit a Login Flow  # noqa: E501
        """
        pass

    def test_update_logout_flow(self):
        """Test case for update_logout_flow

        Update Logout Flow  # noqa: E501
        """
        pass

    def test_update_recovery_flow(self):
        """Test case for update_recovery_flow

        Complete Recovery Flow  # noqa: E501
        """
        pass

    def test_update_registration_flow(self):
        """Test case for update_registration_flow

        Update Registration Flow  # noqa: E501
        """
        pass

    def test_update_settings_flow(self):
        """Test case for update_settings_flow

        Complete Settings Flow  # noqa: E501
        """
        pass

    def test_update_verification_flow(self):
        """Test case for update_verification_flow

        Complete Verification Flow  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
