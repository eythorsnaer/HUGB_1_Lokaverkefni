set JAR="TicTacToe-SoftwareBoys.jar"
set TAR="TicTacToe-SoftwareBoys.tar"
set ZIP="TicTacToe-SoftwareBoys.zip"
set AMhtml="Administration-Manual.html"
set DRhtml="Design-Report.html"
set DMhtml="Development-Manual.html"

set LOCATION="C:\temp"
set LOCATIONOFZIP="C:\temp\ZIP"
set LOCATIONOFTAR="C:\temp\TAR"
set LOCATIONOFJAR="C:\temp\JAR"
set LOCATIONOFWAR="C:\temp\WAR"
set LOCATIONOFDOCUMENTATION="C:\temp\DOCUMENTATION"

REM Always deploy new version, clean, build, package(jar), convert docs, unit test.
call bin\clean.bat
call bin\build.bat
call bin\packageScripts\packageTAR.bat
call bin\packageScripts\packageZIP.bat
call bin\packageScripts\packageJAR.bat
call bin\packageScripts\packageWAR.bat
call bin\DocConv.bat
call bin\test.bat

REM If directory exists, remove it
if exist %LOCATIONOFJAR% del /F %LOCATIONOFJAR%
if exist %LOCATIONOFZIP% del /F %LOCATIONOFZIP%
if exist %LOCATIONOFTAR% del /F %LOCATIONOFTAR%
if exist %LOCATIONOFWAR% del /F %LOCATIONOFWAR%
if exist %LOCATIONOFDOCUMENTATION% del /F %LOCATIONOFDOCUMENTATION%
if exist %LOCATION% del /F %LOCATION%

REM If destination folder doesn't exist, create it
if not exist "%LOCATION%" mkdir %LOCATION%
if not exist "%LOCATIONOFJAR%" mkdir %LOCATIONOFJAR%
if not exist "%LOCATIONOFZIP%" mkdir %LOCATIONOFZIP%
if not exist "%LOCATIONOFTAR%" mkdir %LOCATIONOFTAR%
if not exist "%LOCATIONOFWAR%" mkdir %LOCATIONOFWAR%
if not exist "%LOCATIONOFDOCUMENTATION%" mkdir %LOCATIONOFDOCUMENTATION%

REM Copy the packaged files/report to directory outside working directory.
copy build\libs\%JAR% %LOCATIONOFJAR%
copy build\distributions\%TAR% %LOCATIONOFTAR%
copy build\distributions\%ZIP% %LOCATIONOFZIP%
xcopy build\reports %LOCATION% /s /e /y
copy docs\htmls\%AMhtml% %LOCATIONOFDOCUMENTATION%
copy docs\htmls\%DRhtml% %LOCATIONOFDOCUMENTATION%
copy docs\htmls\%DMhtml% %LOCATIONOFDOCUMENTATION%

REM Run application once
java -jar %LOCATIONOFJAR%\\%JAR%