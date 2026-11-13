# DeenQuest Version 8 — GitHub-ready Android project

Built from the uploaded working Version 7 project. Existing 500 questions, source references, topic filters, modes, logo, sound, vibration, and offline progress key (`deenquest-v1`) are retained.

## Version 8 additions
- Three daily missions (one quiz, five correct answers, two topics) worth 25 XP each; missions reset using device local date.
- Seven-day learning journey calendar, streak tracking, and one-time 100 XP bonus when a seven-day streak is first reached.
- Six additional badges and progress dashboard with answer accuracy and mission rewards.
- Accessible celebration popup for new mission or streak rewards, respecting reduced-motion preferences.

## Build
Upload the extracted contents to the **repository root**, preserving `.github/workflows/android.yml`. Run **Actions → Build DeenQuest APK**. Download the debug APK artifact.

## Notes
- This is a debug build for testing, not a signed Google Play release.
- The build and device behavior must be verified via GitHub Actions and your Samsung phone.
- Existing local progress is preserved only if Android installs the update with the same application ID and compatible signing key. Back up the current APK before upgrading.


## Version 8.1 startup fix
The home screen now calls `home()` on initial page load so learning modes, topics, daily missions, streak, badges, dashboard and saved statistics appear immediately without first starting a quiz. No questions or progress-storage keys were changed.


## Version 8.2 startup repair
Removed an eager `home()` call that ran while the HTML document was still being parsed, before the home-screen elements existed. The existing DOMContentLoaded initialization now runs only after the elements are ready. All questions, app assets and local storage keys are unchanged.
