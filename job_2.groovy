project_name = "job2"
repo_url = "https://github.com/fwelschen/jenkins-test-1.git"
repo_name = "jenkins-test-1"


pipelineJob(project_name) {
    definition {
      cpsScm{
        scm{
          git{
            remote{
              name(repo_name)
              url(repo_url)
            }
          }
          scriptPath("Jenkinsfile")
         }
       }
    }
}
