pipeline{

    agent any
    tools{
        maven "maven"
    }
    environment {     
    DOCKERHUB_CREDENTIALS= credentials('docker-cred')     
  }
    stages{

        stage("SCM checkout"){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/NareshRangam/jenkinscicddockerhub.git']])
            }
        }

        stage("Build Process"){
            steps{
                script{
                    bat 'mvn clean install'
                }
            }
        }
        
        stage("build Image")
        {
            steps{
                script{
                    bat 'docker build -t rangamnaresh/jenkinsdockerhub:%BUILD_NUMBER% .'
                }
            }
        }
        
       stage("Push Image to Docker Hub"){
            steps{
                withCredentials([string(credentialsId: 'credentials-dockerhub', variable: 'docker-variable')]) {
                    bat 'docker login -u rangamnaresh -p %docker-variable%'
                    bat 'docker push rangamnaresh/jenkinsdockerhub:%BUILD_NUMBER%'
                }
            }

        }
}
}