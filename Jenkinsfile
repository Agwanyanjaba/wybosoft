pipeline{
    agent any
    tools{
        maven 'maven_3_9_0'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main'], [name: '*/dev'], [name: '*/feature']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Agwanyanjaba/wybosoft.git']])
                sh 'mvn clean install'
            }
        }

    }
}