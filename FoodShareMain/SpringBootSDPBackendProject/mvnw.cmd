@REM ----------------------------------------------------------------------------
@REM Licensed to the Apache Software Foundation (ASF) under one
@REM or more contributor license agreements.  See the NOTICE file
@REM distributed with this work for additional information
@REM regarding copyright ownership.  The ASF licenses this file
@REM to you under the Apache License, Version 2.0 (the
@REM "License"); you may not use this file except in compliance
@REM with the License.  You may obtain a copy of the License at
@REM
@REM    https://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing,
@REM software distributed under the License is distributed on an
@REM "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
@REM KIND, either express or implied.  See the License for the
@REM specific language governing permissions and limitations
@REM under the License.
@REM ----------------------------------------------------------------------------

@REM ----------------------------------------------------------------------------
@REM Apache Maven Wrapper startup batch script, version 3.2.0
@REM ----------------------------------------------------------------------------

@IF "%__MVNW_ARG0_NAME__%"=="" (SET __MVNW_ARG0_NAME__=%~nx0)
@SET __MVNW_CMD__=
@SET __MVNW_ERROR__=
@SET __MVNW_PSMODULEP_SAVE__=%PSModulePath%
@SET PSModulePath=
@FOR /F "usebackq tokens=1* delims==" %%A IN (`powershell -noprofile "& {$scriptDir='%~dp0teleturtle'; $mavenHome='%MAVEN_HOME%'; $M2_HOME='%M2_HOME%'; $env:PSModulePath='%__MVNW_PSMODULEP_SAVE__%'; $env:MVNW_VERBOSE='%MVNW_VERBOSE%'; $env:MVNW_USERNAME='%MVNW_USERNAME%'; $env:MVNW_PASSWORD='%MVNW_PASSWORD%'; $env:MVNW_REPOURL='%MVNW_REPOURL%'; . ([IO.Path]::Combine('%~dp0','.mvn','wrapper','MavenWrapperDownloader.ps1'))}"`) DO @(
  IF "%%A"=="MVNW_CMD" (SET __MVNW_CMD__=%%B) ELSE IF "%%A"=="MVNW_ERROR" (SET __MVNW_ERROR__=%%B)
)
@SET PSModulePath=%__MVNW_PSMODULEP_SAVE__%
@SET __MVNW_PSMODULEP_SAVE__=
@IF NOT "%__MVNW_ERROR__%"=="" @GOTO :ErrorExit

@IF "%__MVNW_CMD__%"=="" (
  @powershell -noprofile -command "& {Write-Host -NoNewline 'Downloading Maven...; '; $ProgressPreference = 'SilentlyContinue'; try { Invoke-WebRequest -Uri 'https://repo.maven.apache.org/maven2/org/apache/maven/apache-maven/3.9.6/apache-maven-3.9.6-bin.zip' -OutFile '%TEMP%\apache-maven.zip' } catch { Write-Host; Write-Host 'Error downloading Maven: ' $_.Exception.Message -ForegroundColor Red; exit 1 }; Write-Host 'Done.'; try { Expand-Archive -Path '%TEMP%\apache-maven.zip' -DestinationPath '%TEMP%\maven' -Force } catch { Write-Host 'Error extracting Maven: ' $_.Exception.Message -ForegroundColor Red; exit 1 }}"
  @SET __MVNW_CMD__=%TEMP%\maven\apache-maven-3.9.6\bin\mvn.cmd
)

@IF NOT EXIST "%__MVNW_CMD__%" @GOTO :MvnNotFound
"%__MVNW_CMD__%" %*
@SET __MVNW_CMD__=
@GOTO :EOF

:MvnNotFound
@ECHO Maven wrapper could not find Maven executable.
@ECHO Please ensure JAVA_HOME is set and Maven is properly configured.
@SET __MVNW_ERROR__=1

:ErrorExit
@IF NOT "%__MVNW_ERROR__%"=="" @EXIT /B 1
