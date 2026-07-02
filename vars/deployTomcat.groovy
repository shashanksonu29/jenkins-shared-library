def call() {

    echo "Deploying to Tomcat"

    deploy adapters: [
        tomcat9(
            alternativeDeploymentContext: '',
            credentialsId: 'tomcat',
            path: '',
            url: 'http://98.89.44.72:8081/'
        )
    ],
    contextPath: 'insta',
    war: '**/*.war'

}
