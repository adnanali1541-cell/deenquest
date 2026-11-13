# DeenQuest Version 5 — Islamic Learning Game

Upgrade based on the working Version 4 Android project. Includes 135 question entries (105 retained + 30 new), strict topic and age filtering, a new XP quest-level panel, existing offline quiz and achievements, and daily challenge repeat-point protection.

## Important limitations
- The 30 added questions include references but have **not** been independently verified by qualified scholars. The existing 105 also need review.
- The interface and quiz questions are currently in English. Arabic, Urdu, Bengali, Indonesian, and other translations are planned but **not included** in this build.
- No advertising SDK, payment integration, subscriptions, cloud account, or Play Store release signing is included.
- This is a debug build for device testing, not a Play Store-ready signed AAB.
- Daily challenge points are awarded only on the first completion each UTC day; the app retains previous local progress in the same installation.

## Upload and build
Extract ZIP. Upload extracted project contents to repository root, replacing matching files and retaining `.github/workflows/android.yml`. GitHub Actions → Build DeenQuest APK → download debug artifact.

## Test
Test all 3 age modes, every topic, question explanations, quest-level XP, and saved progress. Keep your V4 backup until V5 is verified.
