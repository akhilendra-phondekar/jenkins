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
	stage('Results') {
	    steps{
		input("Do you want to capture results")
		junit '**/target/surefire-reports/TEST-*.xml'
		archiveArtifacts 'target/*.jar'
	    }
    	}
	stage('Email build status') {
	    steps{
		mail bcc: '', body: 'Sample body', cc: '', from: '', replyTo: '', subject: 'Sample jenkins results', to: 'akhilendra_phondekar@outlook.com'
	    }
    	}
    }
}
