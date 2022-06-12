# Run Cucumber with Selenium and Generate Allure Report in Jenkins pipeline


* ## Create your pipeline
<img width="947" alt="Screenshot_1" src="https://user-images.githubusercontent.com/98994988/173222443-4af6c4f9-0228-4e07-8eed-48a26e51d050.png">


* ## Add your repository in pipeline script
<img width="440" alt="Screenshot_2" src="https://user-images.githubusercontent.com/98994988/173222551-3a199ff0-c09c-41b1-a5fe-ed0ebf915423.png">


* ## Add script to run project in pipeline script
<img width="455" alt="Screenshot_3" src="https://user-images.githubusercontent.com/98994988/173222573-9f5d8f5e-efed-4664-ab60-842c25897600.png">


* ## Generate pipeline script for Allure Report
![screencapture-localhost-8080-job-Selenium-Cucumber-AllureReport-RunPipeline-pipeline-syntax-2022-06-12-15_23_43](https://user-images.githubusercontent.com/98994988/173224278-ee2be4ff-e44b-4864-9a54-5c9a681bd92c.png)



* ## Add script Allure Report in pipeline script

<img width="444" alt="Screenshot_4" src="https://user-images.githubusercontent.com/98994988/173223719-6d0f567d-6b5e-426c-9bc7-db567a4f698a.png">

* ## Here is an example of the full script
```
def project = "Cucumber and generate Allure Report"

pipeline {
    agent any

    options{
        timestamps()
    }

    stages{

        stage('Build') {
            steps {
                 echo 'Hi, Start testing'
                   }
            }
        stage("Execute Test"){
            steps{
                git 'https://github.com/EkoAgustina/Cucumber-AllureReport-Run-JenkinsPipeline.git'
            script{
                bat(/mvn clean test/)
             }
                }
        }

         stage('Generate Report'){
                steps {
                    allure includeProperties: false, jdk: '', results: [[path: 'allure-results']]
              }
            }
    }


}
```
* ## And Build Now
<img width="939" alt="Screenshot_5" src="https://user-images.githubusercontent.com/98994988/173224423-88323002-2c0b-466b-a763-1544beaf22b8.png">


* ## Here are the results
![screencapture-localhost-8080-job-Selenium-Cucumber-AllureReport-RunPipeline-2022-06-12-15_31_34](https://user-images.githubusercontent.com/98994988/173224600-54a2dd89-66f5-41c1-94e3-c937c6e34127.png)

![screencapture-localhost-8080-job-Selenium-Cucumber-AllureReport-RunPipeline-allure-2022-06-12-15_32_58](https://user-images.githubusercontent.com/98994988/173224658-e0defd59-fa8e-4022-854a-240524fa75df.png)

