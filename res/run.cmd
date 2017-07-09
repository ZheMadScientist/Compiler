cd .\Java.compiled\
set str1=%1
for /F "usebackq" %%i in (`dir /b .`) DO java %%~ni