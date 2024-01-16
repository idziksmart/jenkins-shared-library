def call(body) {
    echo "Generic pipeline"
    def ctx = [:]
    ctx = compute(body)
}

def compute(body) {
    def ctx = [:]
    ctx.logger = new io.idziksmart.jenkinssharedlibrary.Logger(this)
    print(env)
    print(currentBuild)
    ctx.env = env
    ctx.currentBuild = currentBuild
    echo "$ctx.currentBuild"
    ctx.logger.printMessage('Starting .... ')
    ctx.logger.printMessage(ctx.currentBuild)
}