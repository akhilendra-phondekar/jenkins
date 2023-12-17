pipeline {
    agent any

    stages {
        stage('Cleaning stage') {
            steps {
                echo 'Cleaning..'
				mvn clean
            }
        }
        stage('Testing stage') {
            steps {
                echo 'Testing..'
				mvn test
            }
        }
        stage('Packaging stage') {
            steps {
                echo 'Packaging....'
				mvn package
            }
        }
    }
}