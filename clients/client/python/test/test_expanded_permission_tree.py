# coding: utf-8

"""
    Ory APIs

    # Introduction Documentation for all public and administrative Ory APIs. Administrative APIs can only be accessed with a valid Personal Access Token. Public APIs are mostly used in browsers.  ## SDKs This document describes the APIs available in the Ory Network. The APIs are available as SDKs for the following languages:  | Language       | Download SDK                                                     | Documentation                                                                        | | -------------- | ---------------------------------------------------------------- | ------------------------------------------------------------------------------------ | | Dart           | [pub.dev](https://pub.dev/packages/ory_client)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/dart/README.md)       | | .NET           | [nuget.org](https://www.nuget.org/packages/Ory.Client/)          | [README](https://github.com/ory/sdk/blob/master/clients/client/dotnet/README.md)     | | Elixir         | [hex.pm](https://hex.pm/packages/ory_client)                     | [README](https://github.com/ory/sdk/blob/master/clients/client/elixir/README.md)     | | Go             | [github.com](https://github.com/ory/client-go)                   | [README](https://github.com/ory/sdk/blob/master/clients/client/go/README.md)         | | Java           | [maven.org](https://search.maven.org/artifact/sh.ory/ory-client) | [README](https://github.com/ory/sdk/blob/master/clients/client/java/README.md)       | | JavaScript     | [npmjs.com](https://www.npmjs.com/package/@ory/client)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript/README.md) | | JavaScript (With fetch) | [npmjs.com](https://www.npmjs.com/package/@ory/client-fetch)           | [README](https://github.com/ory/sdk/blob/master/clients/client/typescript-fetch/README.md) |  | PHP            | [packagist.org](https://packagist.org/packages/ory/client)       | [README](https://github.com/ory/sdk/blob/master/clients/client/php/README.md)        | | Python         | [pypi.org](https://pypi.org/project/ory-client/)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/python/README.md)     | | Ruby           | [rubygems.org](https://rubygems.org/gems/ory-client)             | [README](https://github.com/ory/sdk/blob/master/clients/client/ruby/README.md)       | | Rust           | [crates.io](https://crates.io/crates/ory-client)                 | [README](https://github.com/ory/sdk/blob/master/clients/client/rust/README.md)       | 

    The version of the OpenAPI document: v1.15.17
    Contact: support@ory.sh
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from ory_client.models.expanded_permission_tree import ExpandedPermissionTree

class TestExpandedPermissionTree(unittest.TestCase):
    """ExpandedPermissionTree unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ExpandedPermissionTree:
        """Test ExpandedPermissionTree
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ExpandedPermissionTree`
        """
        model = ExpandedPermissionTree()
        if include_optional:
            return ExpandedPermissionTree(
                children = [
                    ory_client.models.expanded_permission_tree.expandedPermissionTree(
                        children = [
                            ory_client.models.expanded_permission_tree.expandedPermissionTree(
                                tuple = ory_client.models.relationship.relationship(
                                    namespace = '', 
                                    object = '', 
                                    relation = '', 
                                    subject_id = '', 
                                    subject_set = ory_client.models.subject_set.subjectSet(
                                        namespace = '', 
                                        object = '', 
                                        relation = '', ), ), 
                                type = 'union', )
                            ], 
                        tuple = ory_client.models.relationship.relationship(
                            namespace = '', 
                            object = '', 
                            relation = '', 
                            subject_id = '', ), 
                        type = 'union', )
                    ],
                tuple = ory_client.models.relationship.relationship(
                    namespace = '', 
                    object = '', 
                    relation = '', 
                    subject_id = '', 
                    subject_set = ory_client.models.subject_set.subjectSet(
                        namespace = '', 
                        object = '', 
                        relation = '', ), ),
                type = 'union'
            )
        else:
            return ExpandedPermissionTree(
                type = 'union',
        )
        """

    def testExpandedPermissionTree(self):
        """Test ExpandedPermissionTree"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
