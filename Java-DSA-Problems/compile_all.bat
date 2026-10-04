@echo off
if not exist out mkdir out
for /R %%f in (*.java) do javac -d out "%%f"
if %ERRORLEVEL% EQU 0 (
    echo.
    echo Compilation completed successfully.
) else (
    echo.
    echo Compilation reported errors. Check the output above.
)
