# demo-service-jdk

Java/Maven-Projekt, erstellt über ein GitHub Issue mit Copier.

JDK: 25 (Temurin in CI) · CI: aktiviert · SAST: aktiviert

## Lokal entwickeln

JDK 25 und Maven 3.9 oder neuer installieren.

```sh
mvn --batch-mode verify
java -cp target/classes demo.App
```

Die Java-Version steht in `pom.xml` als `maven.compiler.release`.


## GitHub Actions

`.github/workflows/ci.yml` checkt den Code aus, installiert JDK 25
mit `actions/setup-java` und führt Build und JUnit-Tests aus.


Der separate SAST-Job verwendet [PolyScan](https://github.com/sraisl/polyscan-action)
mit SpotBugs/FindSecBugs für Java. Er installiert dasselbe JDK und erstellt
SARIF-Berichte als Workflow-Artefakte. Bei Überschreitung des Quality Gates oder
Scanner-Fehlern schlägt der Job fehl. PolyScan benötigt hierfür keinen Sonar-Token.


Der manuelle Workflow „Sonar-Konfiguration prüfen“ zeigt `SONAR_HOST_URL` und
prüft nur, ob `SONAR_TOKEN` vorhanden ist. Diese Einstellungen werden bei der
Neuanlage gesetzt, wenn die Sonar-Option im Issue aktiviert ist.

