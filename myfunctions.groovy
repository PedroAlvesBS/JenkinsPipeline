def buildJar(){
  echo "building the application..."
  sh 'mvn package'
}

def buildImage(){
  echo "building image"
  withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', usernameVarible: 'USER', passwordVariable: 'PWD')]){
      sh "docker build -t pedroalves23/demo-app:1.0 ."
      sh "echo $PWD | docker login -u $USER --password-stdin"
      SH "docker push pedroalves23/demo-app:1.0"
  }
}

def deployApp(){
  echo "Deploying app..."
}

export this