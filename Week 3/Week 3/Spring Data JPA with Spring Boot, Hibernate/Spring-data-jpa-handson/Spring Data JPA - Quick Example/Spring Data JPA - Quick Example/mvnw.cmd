@echo off
setlocal
set DIR=%~dp0
set MAVEN_PROJECTBASEDIR=%DIR%
java -jar "%DIR%\\.mvn\\wrapper\\maven-wrapper.jar" %*
