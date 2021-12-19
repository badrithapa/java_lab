# java_lab

add this ti configuration in intelliJ to deploy war file to tomcat. <b> DONOT PUT SPACES IN THE FILE PATH INTHE FOLLOWING LINE</B>

<code>clean install war:war org.codehaus.mojo:wagon-maven-plugin:upload-single -Dwagon.fromFile={war-path} -Dwagon.url=file://{tomcat-webapps-path}</code>
