def gradle;

node {
	stage('Pull') { 
      		git 'https://github.com/dbgjerez/ic-gradle.git'
		checkout scm
	}
	
   	stage('Build') {
	    	sh "'./gradlew' clean build"
   	}

	stage('Test Results') {
		junit '**/build/test-results/*.xml'
	}
}
