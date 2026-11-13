# DeenQuest Version 2 — Android prototype

Offline Islamic learning quiz for kids, teens and adults. Includes **45 starter questions** (15 retained from Version 1 plus 30 new questions), topic selection, XP milestones, daily challenges, and local progress. Religious content requires independent review before publication.

## Upload to GitHub
Extract this ZIP, open its folder, and **drag the contents** (`app`, `.github`, `README.md`, `build.gradle`, `settings.gradle`) into the repository root. The GitHub browser may omit `.github` during drag/drop; if so create `.github/workflows/android.yml` manually from this ZIP. Replace existing files and commit.

## Build
GitHub Actions → Build DeenQuest APK → run latest workflow. Download `DeenQuest-debug-apk` artifact and extract APK. This is a **debug APK for testing**, not a signed Play Store AAB.

## Notes
Existing `deenquest-v1` local storage is preserved when installing as an update with the same application ID and signing key. GitHub Actions debug signing keys may change between builds, in which case Android will require uninstall/reinstall and local progress will be lost. Export or note your progress first. No advertising, login, network permission, or payment processing.
