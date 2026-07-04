pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                url: 'https://github.com/Omkar7262/Reat-A-Ride/new/main'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Deploy') {
            steps {
                sh '''
                pkill -f "java -jar" || true

                nohup java -jar target/*.jar > app.log 2>&1 &
                '''
            }
        }
    }
}
