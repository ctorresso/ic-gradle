def gradle;

node {
	stage('Pull') { 
      		git 'https://github.com/dbgjerez/ic-gradle.git'
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


}
