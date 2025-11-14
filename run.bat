@echo off
ECHO.
ECHO ===================================================
ECHO  Memulai proses Maven (clean, compile, exec:java)
ECHO ===================================================
ECHO.

REM Menjalankan perintah Maven
call mvn clean compile exec:java

ECHO.
ECHO ===================================================
ECHO  Proses Selesai.
ECHO ===================================================
ECHO.

REM Jeda agar jendela tidak langsung tertutup
pause