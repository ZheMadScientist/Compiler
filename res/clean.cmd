cd .\Java.compiled\
for /F "usebackq" %%k in (`dir /b .`) DO del %%k
cd .\..\Java
for /F "usebackq" %%i in (`dir /b .`) DO del %%i
