# Experiments with Marvin
Samples to try unit test generation with Marvin product (early version).

This repo contains java sources with prepared samples to try generation of unit tests by early version of Marvin.

You are free to use these methods or modify them using supported Java structures or write your own code from scratch. These sources do not have any dependencies on any third-party code or build system. You are free to use your favourite.

Before generation will be performed the plugin runs build to avoid passing not compilable code to the server, build should be successful.

There is a requirement. Module where you will perform unit test generation should have typical structure: java sources directory (usually 'main/java') and test java sources directory (usually 'test/java') marked properly for IDE in project/module structure.

Generated tests depends on next classes:

org.junit.jupiter.api.Assertions
org.junit.jupiter.api.Test
org.mockito.Mockito - if tests use mocks only

So, you are free to choose libraries that contain these classes.
Enjoy experiments with Marvin!
