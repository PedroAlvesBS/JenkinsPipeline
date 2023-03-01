pipeline {
    agent any
    tools{
        maven 'Maven'
    }
    stages {

        stage("build jar") {
            steps {
                script {
                    echo "building the application..."
                    sh 'mvn package'
                }
            }
        }

        stage("build image") {
            steps {
                script {
                    echo "building image"
                    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', usernameVarible: 'USER', passwordVariable: 'PWD')]){
                        sh "docker build -t pedroalves23/demo-app:1.0 ."
                        sh "echo $PWD | docker login -u $USER --password-stdin"
                    }
                }
            }
        }
    }   
}