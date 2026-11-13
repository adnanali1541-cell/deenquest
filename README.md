# DeenQuest Version 6 — 500 Questions

Upgrade of the working Version 5 Android app. Preserves design, launcher icon, progress storage key (`deenquest-v1`), gameplay and GitHub Actions build.

## Content
Exactly 500 supplied questions, replacing the previous built-in question bank.
- Quran: 128
- Prophets: 108
- Seerah: 107
- Worship: 107
- Islamic Calendar: 50

Difficulty levels: Kids 156, Teens 190, Adults 154. Topic counts shown in the app are specific to the selected learning mode. Each quiz draws up to five questions from the chosen topic and mode.

## Upload to GitHub
Extract the ZIP. Upload all files and folders to the root of your existing `deenquest` GitHub repository, preserving the `.github/workflows/android.yml` path. Replace existing files and commit to `main`. Open Actions > Build DeenQuest APK and download the debug APK artifact.

## Notes
The content is imported from the supplied 500-question JSON; answer indices and structure were validated, but religious accuracy and citations were not independently reviewed. Arrange qualified scholarly review before publication. The Android build was not executed in this environment.
