def gv

pipeline {
    agent any
    tools{
        maven 'Maven'
    }
    stages {
        stage ("init") {
            steps {
                script {
                    gv = load "myfunctions.groovy"
                }
            }
        }

        stage ("build jar") {
            steps {
                script {
                    gv.buildJar()
                }
            }
        }

        stage ("build image") {
            steps {
                script {
                    gv.buildImage()
                }
            }
        }
    }   
}