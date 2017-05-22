def gradle;

node {
	stage('IC-Descarga') { 
      		git 'https://github.com/dbgjerez/ic-gradle.git'
		checkout scm
	}
	
   	stage('IC-Build') {
       		sh "'./gradlew' clean build"
   	}
}
