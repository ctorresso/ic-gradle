node {
   stage('IC-Descarga') { 
      git 'https://github.com/dbgjerez/ic-gradle.git'
   }
   stage('IC-Build') {
       sh "'./gradlew' clean build"
   }
}
