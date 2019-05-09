Maven archetype to generate  multi module AVM based smart contract project in java.

## Usage:

```
$> mvn archetype:generate -DarchetypeGroupId=org.aion4j -DarchetypeArtifactId=avm-archetype-multimodule 
-DarchetypeVersion=0.10 -Dmodule1=<module1_name> -Dmodule2=<module2_name>
```

Current archetype version: 0.11

- In the generated project's pom.xml, change **aion4j.plugin.version** property to latest version of [aion4j-maven-plugin](https://github.com/satran004/aion4j-maven-plugin)

- To enable class verification for allowed classes in contract, uncomment **class-verifier** goal in pom.xml.
