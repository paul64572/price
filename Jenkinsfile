pipeline {
  environment {
    SOME_VAR = "SOME VALUE"
    INBETWEEN = "Something in between"
  }

  agent any

  stages {
    stage("build") {
      steps {
        echo "SOME_VAR is $SOME_VAR"
        echo "INBETWEEN is $INBETWEEN"
      }
    }

    stage("test") {
      steps {
        echo "SOME_VAR is $SOME_VAR"
        echo "INBETWEEN is $INBETWEEN"
      }
    }

    stage("deply") {
      steps {
        echo "SOME_VAR is $SOME_VAR"
        echo "INBETWEEN is $INBETWEEN"
      }
    }



  }
}