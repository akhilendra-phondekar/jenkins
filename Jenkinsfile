pipeline {
    agent any

    stages {
        stage('Cleaning stage') {
            steps {
                echo 'Cleaning..'
		bat 'mvn clean'
            }
        }
        stage('Testing stage') {
            steps {
                echo 'Testing..'
		bat 'mvn test'
            }
        }
        stage('Packaging stage') {
            steps {
                echo 'Packaging....'
		bat 'mvn package'
            }
        }
    }
}
