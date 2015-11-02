set JAR="TicTacToe-SoftwareBoys.jar"
set TAR="TicTacToe-SoftwareBoys.tar"
set ZIP="TicTacToe-SoftwareBoys.zip"

set LOCATION="C:\temp"



REM Always deploy new version, clean, build, package(jar), convert docs, unit test.
call bin\clean.bat
call bin\build.bat
call bin\package.bat
call bin\DocConv.bat
call bin\unit_test.bat

REM If directory exists, remove it
if exist %LOCATION% del /F %LOCATION%

REM If destionation folder doesn't exist, create it
if not exist "%LOCATION%" mkdir %LOCATION%


REM Copy the packaged files/report to directory outside working directory.
copy build\libs\%JAR% %LOCATION%
copy build\distributions\%TAR% %LOCATION%
copy build\distributions\%ZIP% %LOCATION%
xcopy build\reports %LOCATION% /s /e /y
xcopy docs\htmls %LOCATION$% /s /e /y

REM Run application once
java -jar %LOCATION%\\%JAR%

