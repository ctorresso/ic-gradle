def gradle;

node {
	stage('Pull') { 
      		git 'https://github.com/dbgjerez/ic-gradle.git'
		steps {
			checkout scm
		}
	}
	
   	stage('Build') {
		steps {
	       		sh "'./gradlew' clean build"
		}
   	}

	stage('Test Results') {
		steps {
			junit '**/build/test-results/*.xml'
		}
	}
}
