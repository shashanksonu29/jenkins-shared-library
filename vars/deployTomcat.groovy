def call() {

    echo "Deploying to Tomcat"

    deploy adapters: [
        tomcat9(
            alternativeDeploymentContext: '',
            credentialsId: 'tomcat',
            path: '',
            url: 'http://54.160.144.88:8081/'
        )
    ],
    contextPath: 'insta',
    war: '**/*.war'

}
