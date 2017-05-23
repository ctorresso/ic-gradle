def gradle;

node {
	
	def gitUrl = 'https://github.com/dbgjerez/ic-gradle.git';

	stage('Pull') { 
		echo "Descarga de código"
      		git gitUrl
		checkout scm
	}
	
   	stage('Build') {
	    	sh "'./gradlew' clean build"
   	}
	
	stage('Integration tests') {
		sh "'./gradlew' integration"
	}
	
	stage('Test Results') {
		jacoco()
	}

	stage('SonarQube') {
                sh "'./gradlew' sonar"
        }

	stage('Despliegue') {
		sh "'/var/jenkins_home/prod.sh'"
	}

}
