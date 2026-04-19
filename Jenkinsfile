pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                bat 'javac *.java'
            }
        }

        stage('Test') {
            steps {
                bat 'java Main'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t dinaa22/studentapp:latest .'
            }
        }

        stage('Push to Docker Hub') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'dockerhub', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
                    bat 'docker login -u %USER% -p %PASS%'
                    bat 'docker push dinaa22/studentapp:latest'
                }
            }
        }
    }
}