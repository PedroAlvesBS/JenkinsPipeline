
// @Library('shared-library')_ if there is not def gv
@Library('shared-library')
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
                    buildJar()
                }
            }
        }

        stage ("build image") {
            steps {
                script {
                    buildImage()
                }
            }
        }

        stage("deploy"){
            steps{
                script{
                    gv.deployApp()
                }
            }
        }
    }   
}