def gitDownload(repo){
  git "https://github.com/intelliqittrainings/${repo}.git"
}
def mavenBuild(){
  sh "mvn package"
}

def qadeploy(jobname,ip,path){
     sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.jar ubuntu@${ip}:/var/lib/tomcat9/webapps/${path}.war"
}
