# Setup

Hey there. Cheers for taking part in the workshop! This is an almost-blank project just to verify that
you have everything set up that you will need for participating in the session. It has one class
`MainClass` and one test `MainTest` in the `setup` package under `src/main/java/setup`
and `src/test/java/setup`, respectively.

We recommend using at least Java 8. Using an IDE will help you to get set up quickly and easily.

The exercise is configured to use Gradle. This is a build tool that will download dependencies
(such as a testing library) and do a little bit of project configuration to allow easy running
and testing of the project.

To initialise the project:
- For IntelliJ, going to `File -> Open` and selecting the project directory should be sufficient. If not,
    you can follow the instructions to open an existing Gradle project at the
    following link: https://www.jetbrains.com/help/idea/gradle.html#gradle_import_project_start
- For Eclipse, you can follow steps 1 and 2 from the following tutorial to get ready to work
    with Gradle projects, and "4. Import an existing Gradle project" to import this project:
    https://www.vogella.com/tutorials/EclipseGradle/article.html

To work with the command line:
- `cd <project_dir>`
- On a Windows command prompt use `gradlew` or `gradlew.bat` instead of `./gradlew`
- `./gradlew build` - to download necessary dependencies, compile the project, and run the tests
- `./gradlew compileJava` - if you only want to compile the classes
- `./gradlew run` - will run the `MainClass` main class. You can change the main class by updating
    the `javaMainClass` variable in the `build.gradle` file if you wish.
- `./gradlew test` - will run the tests, 

Verify that you can run `MainClass` either using your IDE or a terminal, and check that its output
is as expected. Verify that you can run the tests, either using your IDE or a terminal and check that
it passes.

That's it. Thank you and looking forward to seeing you at one of the sessions!

