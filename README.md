# p2p-api

This application exposes API controls for the creation of virtual compute instances.

## Build

This project depends upon `p2p-build` being setup with `ant` and `ant-contrib`. [See instructions](http://barnyard.github.io/p2p-build)

### Dependencies

The following projects should be siblings to this project and had 'publish' targets run on them.

- [p2p-volumemanager](http://barnyard.github.io/p2p-volumemanager)
- [p2p-imagemanager](http://barnyard.github.io/p2p-imagemanager)

### Compiling

Add a properties file with your configuration you'd like in the `properties` directory.

    ant

### Testing

To get this projects integration tests running you will need to do this:

1. install java jce_policy-6.zip into $JAVA_HOME/jre/lib/security

