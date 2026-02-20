<configuration>
    <workingDirectory>${project.build.directory}</workingDirectory>

    <injar>${project.build.finalName}.jar</injar>
    <outjar>${project.build.finalName}-obf.jar</outjar>

    <options>
        <option>-libraryjars ${java.home}/jmods/java.base.jmod</option>

        <option>-dontshrink</option>
        <option>-dontoptimize</option>
        <option>-dontwarn</option>
        <option>-ignorewarnings</option>

        <option>
            -keep public class stackHandler.handler.Main {
                public static void main(java.lang.String[]);
            }
        </option>
    </options>
</configuration>