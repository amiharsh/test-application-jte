
pipeline {
  agent any
//   parameters {
//       string(name: 'REPO_URL', defaultValue: '', description: 'The URL of the repository')
//       string(name: 'GIT_BRANCH', defaultValue: 'main', description: 'The branch to check out')
//       string(name: 'GIT_TAG', defaultValue: '', description: 'The tag to roll back to')
// 	}
 stages {
    stage('Application Source Control') {
      steps {
        script {
          	build()
            checkout_scm()
        }
      }
    }
  }
  
}