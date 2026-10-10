BioPhys Lab — APK build from a phone (GitHub Actions)

1. Sign in to github.com in your phone browser.
2. Create a NEW PUBLIC repository named biophys-lab (do not initialize README).
3. In the repository page, choose Add file > Upload files.
4. Upload the CONTENTS of this ZIP to the repository root, including the .github/workflows/build-apk.yml file. IMPORTANT: some mobile browsers hide dot folders. See alternative below.
5. Commit changes.
6. Open Actions > Build BioPhys Lab APK > Run workflow (or wait for push build).
7. When the build finishes, open its run and download BioPhys-Lab-Android-APK under Artifacts.
8. Unzip the downloaded artifact and install app-debug.apk on Android.

EASIER AND MORE RELIABLE UPLOAD FROM PHONE:
Open github.com/new and create a repository. Then use the web editor at github.dev (press . on repository on desktop, or open github.dev/USERNAME/REPO in mobile browser in Desktop site mode). Upload all files/folders from the extracted ZIP into the repo root, commit, then go back to github.com Actions. GitHub web Upload files may not upload entire folder trees from mobile browsers; github.dev supports uploading folders on compatible browsers. If .github is missing, create it with github.com/USERNAME/REPO/new/main and path .github/workflows/build-apk.yml, paste its content from this ZIP.

APK is a DEBUG build signed by the Android debug key. Suitable for personal testing; not a Play Store release. GitHub Actions requires internet for BUILD ONLY. The installed lab itself works offline. No APK has been compiled in this environment.
