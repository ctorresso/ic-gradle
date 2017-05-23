def gradle;

node {
	
	def gitUrl = 'https://github.com/dbgjerez/ic-gradle.git';

	stage('Pull') { 
		echo "Descarga de código"
      		git gitUrl
		checkout scm
	}
	
   	stage('Build') {
		echo "Construyendo el proyecto"
	    	sh "'./gradlew' clean build"
   	}
	
	stage('Integration tests') {
		echo "Ejecutando test de la aplicación"
		sh "'./gradlew' integration"
	}
	
	stage('Test Results') {
		echo "Recogida de datos de tests"
		jacoco()
	}

	stage('SonarQube') {
		echo "Realizando análisis en SonarQube"
                sh "'./gradlew' sonar"
        }

	stage('Despliegue') {
		echo "Construcción correcta"
		echo "Desplegando aplicación"
		sh "'/var/jenkins_home/prod.sh'"
	}

}
