# 75.10 - Tecnicas de Diseño
## Event Monitor: clojure server

### Requirements:

* Clojure 1.8.0.
* Java.
* Gradle.

### Set up clojure library:

After cloning the repository, install clojure library on local repository by running the following commands:

```console
foo@user:~$ cd back-end/com.ar.fiuba.tdd.clojure.template
foo@user:~/back-end/com.ar.fiuba.tdd.clojure.template$ lein jar
foo@user:~/back-end/com.ar.fiuba.tdd.clojure.template$ lein install
```

### Set up java + gradle project:

Navigate to folder root project at EventMonitorServer as a gradle project on your IDE of preference.

Build gradle project and verify all dependencies have been properly resolved. Any futher dependencies or special build specifications that might be required should be added to the gradle configuration file, which is located at the root of EventMonitorServer project as *build.gradle*.

### Run app and test:

Run the application and test the API. A *postman* script conaining examples for each endpoint can be found at the directory root under the name *API_CLJ.postman_collection.json*.






