# DeenQuest Version 9 — GitHub-ready Android project

Built from the user-provided, working Version 8.3 source. Preserves all 500 questions and source references, existing interface, sound, badges, missions, streaks and the fixed initial home screen.

## New in Version 9
- Daily welcome reward: tap to claim 10 XP once per local calendar day.
- Topic Mastery: accuracy and answer counts for five topics, tracked starting in V9.
- Quiz result stars (1–3), animated with reduced-motion support.
- XP breakdown on the result screen for quiz, missions and streak bonus.
- Updated footer.

All new data is saved in the existing `deenquest-v1` localStorage record to preserve old progress. Topic mastery only includes answers from V9 onward; earlier answers cannot be reliably attributed by topic.

## Build
Extract this ZIP and upload the **contents** to the root of your existing GitHub repository, preserving the `.github` and `app` directories. Commit to `main`, open GitHub Actions, run **Build DeenQuest APK**, then download the `DeenQuest-debug-apk` artifact.

## Testing
1. Fully close and reopen the app; verify all home widgets appear without starting a quiz.
2. Claim the daily welcome reward; check XP rises by 10 and the button disables.
3. Reopen the app; check the reward remains claimed.
4. Finish a quiz; check stars and the XP breakdown.
5. Check Topic Mastery updates for the questions answered.
6. Verify previous progress and all existing game features.

This is a debug build, not a signed Google Play release. Source and JavaScript syntax were checked, but an APK has not been built or tested on a device in this environment.
