project done with

https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

then to compile
mvn package

for the fabric8 kube client read
https://developers.redhat.com/articles/2023/01/04/how-use-fabric8-java-client-kubernetes

none of the garbage tutorial say you need this:
import io.fabric8.kubernetes.client.KubernetesClient;

otherwise....
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.0:compile (default-compile) on project my-app: Compilation failure: Compilation failure: 
[ERROR] /workspaces/javademo/my-app/src/main/java/com/mycompany/app/App.java:[12,9] cannot find symbol
[ERROR]   symbol:   class KubernetesClient
[ERROR]   location: class com.mycompany.app.App

thx for wasting my time !

put that in xml 

<configuration>
                    <archive>
                        <manifest>
                            <mainClass>com.vogella.maven.first.App</mainClass>
                        </manifest>
                    </archive>
                </configuration>

                https://www.vogella.com/tutorials/ApacheMaven/article.html#:~:text=To%20build%20a%20Maven%20project,as%20parameter%20to%20this%20command.

                OMG this is horrible

                