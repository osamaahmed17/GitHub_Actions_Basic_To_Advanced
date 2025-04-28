pipeline {
    agent any

    stages {

        stage('Install Python and Dependencies') {
            steps {
                sh '''
                    python3 --version 
                    python3 -m venv venv
                    source venv/bin/activate
                    pip install -r jenkins-python-actions/requirements.txt 
                '''
            }
        }

        stage('Run Script') {
            steps {
                sh '''
                    source venv/bin/activate
                    python3 jenkins-python-actions/script.py
                '''
            }
        }
    }
}
