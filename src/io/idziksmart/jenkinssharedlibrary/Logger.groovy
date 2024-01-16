package io.idziksmart.jenkinssharedlibrary

class Logger implements Serializable {
    private def pipeline

    Logger(def pipeline) {
        this.pipeline = pipeline
    }

    public void printMessage(String message) {
        pipeline.println(message)
    }
}
