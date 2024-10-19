pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the Spring Boot repository
                git branch: 'master', url: 'https://github.com/suhaibsuhai/my-spring-boot-app.git'
            }
        }

        stage('Build') {
            steps {
                // Run the Maven build for the Spring Boot app
                bat 'mvnw.cmd clean install'
            }
        }

        stage('Test') {
            steps {
                // Run backend tests
                bat 'mvnw.cmd test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying Spring Boot application...'
                // Add deployment steps for your Spring Boot application here
            }
        }
    }

    post {
        always {
            // Actions that will run after every build, regardless of the result
            echo 'Cleaning up...'
        }
        success {
            echo 'Spring Boot build completed successfully!'
        }
        failure {
            echo 'Spring Boot build failed!'
        }
    }
}
