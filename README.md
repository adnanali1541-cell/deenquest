# Noor-e-Islam Version 10.0 — GitHub-ready Android project

Built from the user-provided, working Version 8.3 source. Preserves all 500 questions and source references, existing interface, sound, badges, missions, streaks and the fixed initial home screen.

## New in Version 9
- Daily welcome reward: tap to claim 10 XP once per local calendar day.
- Topic Mastery: accuracy and answer counts for five topics, tracked starting in V9.
- Quiz result stars (1–3), animated with reduced-motion support.
- XP breakdown on the result screen for quiz, missions and streak bonus.
- Updated footer.

All new data is saved in the existing `deenquest-v1` localStorage record to preserve old progress. Topic mastery only includes answers from V9 onward; earlier answers cannot be reliably attributed by topic.

## Build
Extract this ZIP and upload the **contents** to the root of your existing GitHub repository, preserving the `.github` and `app` directories. Commit to `main`, open GitHub Actions, run **Build Noor-e-Islam APK**, then download the `Noor-e-Islam-debug-apk` artifact.

## Testing
1. Fully close and reopen the app; verify all home widgets appear without starting a quiz.
2. Claim the daily welcome reward; check XP rises by 10 and the button disables.
3. Reopen the app; check the reward remains claimed.
4. Finish a quiz; check stars and the XP breakdown.
5. Check Topic Mastery updates for the questions answered.
6. Verify previous progress and all existing game features.

This is a debug build, not a signed Google Play release. Source and JavaScript syntax were checked, but an APK has not been built or tested on a device in this environment.

## Rebranding and continuity
- Android launcher label: Noor-e-Islam; in-app name: Noor-e-Islam; proposed Play listing: Noor-e-Islam: Islamic Quiz.
- Existing green/gold book-and-crescent icon retained.
- Android applicationId and Java package intentionally remain `com.deenquest.game` to support updating the installed app. Do NOT change these unless deliberately creating a separate app.
- Existing `deenquest-v1` localStorage key intentionally remains unchanged so progress is retained.
- Install over the old app only when both builds use the same signing key. Do not uninstall the previous app before checking progress.
- App-store name/trademark availability has not been verified; check before publishing.
- Google Play requires a signed release Android App Bundle; this workflow produces a debug APK for testing only.

## Fixed debug signing key (added in V9.1)
- `app/debug.keystore` is a fixed debug key, so every GitHub Actions build is signed the same way and installs over the previous build without wiping progress.
- Earlier builds (up to V9) were signed with a random key that changed on every build, so moving to V9.1 needs ONE uninstall. After that, updates install over the top.
- This key is for testing only. Never use it for Google Play; the Play release needs a private upload key kept off GitHub.

## Version 10.0 — multilingual
- Languages: English, Urdu, Arabic, Bangla, Hindi, Malay, Indonesian, Turkish, French. Choose with the 🌐 button in the header; the chooser also appears once on first launch.
- Screens and all 500 questions (question + 4 answers + explanation) are translated. Source references stay in English.
- English in `index.html` remains the master question bank. Each language is a separate file in `app/src/main/assets/` (`lang_ur.js`, `lang_ar.js`, ...). If a translation is missing, the English text is shown.
- Urdu and Arabic switch the layout to right-to-left.
- The chosen language is saved as a new `lang` field inside the existing `deenquest-v1` record; no other progress fields change.
- The V8.3 cold-start `home()` initialisation is unchanged.
- Translations were machine-assisted and should be reviewed by a native speaker of each language before Google Play release, especially Islamic terminology.
