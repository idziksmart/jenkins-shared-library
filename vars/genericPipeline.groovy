def call(body) {
    echo "Generic pipeline"
    def ctx = [:]
    ctx = compute(body)
}

def compute(body) {
    def ctx = [:]
    ctx.logger = new io.idziksmart.jenkinssharedlibrary.Logger(this)
    ctx.env = env
    ctx.currentBuild = currentBuild
    ctx.logger.printMessage('Starting .... ')
    ctx.logger.printMessage(ctx.currentBuild)
}