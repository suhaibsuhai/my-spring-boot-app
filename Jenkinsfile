pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                script {
                    // Use Maven to build the Spring Boot application
                    bat './mvnw clean package'
                }
            }
        }
        stage('Archive Artifacts') {
            steps {
                // Archive the built JAR file
                archiveArtifacts artifacts: '**/*.jar', fingerprint: true
            }
        }
    }
}
