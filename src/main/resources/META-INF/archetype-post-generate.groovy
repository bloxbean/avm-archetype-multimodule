try {
    if(request.isOffline()) {
        println("Offline mode")
        return
    }

    System.setProperty("goals", "io.takari:maven:wrapper")
    def moduleDir = new File(request.getOutputDirectory()+"/"+request.getArtifactId())

    def pomFile = new File(moduleDir, 'pom.xml')
    println "Updating "+pomFile

    def pomContent = pomFile.getText('UTF-8')

    def replace = "x.x.x";

    def version = new URL ("https://bloxbean.github.io/aion4j-release/aion4j-maven-plugin").getText([connectTimeout: 3000, readTimeout: 3000])

    if(version.contains("<") || version.length() > 25)
        return;

    pomContent = pomContent.replace("x.x.x", version.trim())

    // rewrite pom.xml
    pomFile.newWriter().withWriter { w ->
        w << pomContent
    }
} catch(Exception e) {

}