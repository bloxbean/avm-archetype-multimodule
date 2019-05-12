Maven archetype to generate  multi module AVM based smart contract project in java.

## Usage:

```
$> mvn archetype:generate -DarchetypeGroupId=org.aion4j -DarchetypeArtifactId=avm-archetype-multimodule 
-DarchetypeVersion=0.12 -Dmodule1=<module1_name> -Dmodule2=<module2_name> -Dmodule1-contractName=<module1_contractName> -Dmodule2-contractName=<module2_contractName>
```

Current archetype version: 0.12

#### Default values of parameters :

* module1 = module1
* module2 = module2
* module1-contractName = HelloAvm
* module2-contractName = HelloAvm2

- In the generated project's pom.xml, change **aion4j.plugin.version** property to latest version of [aion4j-maven-plugin](https://github.com/bloxbean/aion4j-maven-plugin)

- To enable class verification for allowed classes in contract, uncomment **class-verifier** goal in pom.xml.
