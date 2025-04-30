pipeline {
    agent any

    stages {

        stage('Install Python and Dependencies') {
            steps {
                sh '''
                    python3 --version 
                    python3 -m venv venv
                    source venv/bin/activate
                    pip install -r python-src/requirements.txt 
                '''
            }
        }

        stage('Run Script') {
            steps {
                sh '''
                    source venv/bin/activate
                    python3 python-src/script.py --input1 "Wednesday" --input2 "Thursday"
                '''
            }
        }
    }
}
