Maven archetype to generate a multi module AVM based smart contract project in java.

## Usage:

```
$> mvn archetype:generate -DarchetypeGroupId=org.aion4j -DarchetypeArtifactId=avm-archetype-multimodule -DarchetypeVersion=0.10-SNAPSHOT
```

Current archetype version: 0.17

- In the generated project's pom.xml, change **aion4j.plugin.version** property to latest version of [aion4j-maven-plugin](https://github.com/satran004/aion4j-maven-plugin)

- To enable class verification for allowed classes in contract, uncomment **class-verifier** goal in pom.xml.
