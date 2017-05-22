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
		stash includes: 'build/jacoco/*.exec', name: 'unitCodeCoverage'
	        step([$class: 'JUnitResultArchiver', testResults: '**/build/test-results/*.xml'])
	}
}
