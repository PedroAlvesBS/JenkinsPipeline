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

                }
            }
        }
    }   
}