cd .\Java.compiled\
for /F "usebackq" %%i in (`dir /b .`) DO (java %%~ni)

