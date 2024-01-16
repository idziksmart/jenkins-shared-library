def call(body) {
    echo "Generic pipeline"
    def ctx = [:]
    echo "Starting compute method"
    ctx = compute(body)
    echo "Finished compute method"
}

def compute(body) {
    def ctx = [:]
    ctx.logger = new io.idziksmart.jenkinssharedlibrary.Logger(this)
    print("REGION "+env.AWS_REGION)
    print("SLACK_CHANNEL "+env.SLACK_CHANNEL)
    print(currentBuild.number)
    print(env.WORKSPACE)
    print(${env.JENKINS_HOME})
    ctx.env = env
    ctx.currentBuild = currentBuild
//    echo "$ctx.currentBuild"
//    ctx.logger.printMessage('Starting .... ')
//    ctx.logger.printMessage(ctx.currentBuild)
}