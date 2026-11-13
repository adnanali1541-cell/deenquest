# DeenQuest Version 7 — Game Experience Upgrade

Based on the working Version 6 project. Preserves the original 500-question bank, categories, age modes, launcher icon, offline quiz logic, points, streaks and achievements.

## New features
- Gentle synthesized sound effects for correct answers, incorrect answers, quiz completion and taps. No external audio files or internet needed.
- Optional haptic vibration (when supported by the phone/WebView).
- Separate Sound and Vibration on/off settings, saved on-device.
- Correct-answer animation and perfect-score celebration banner.
- Reduced-motion accessibility support.

## Build
Upload the extracted *contents* to the repository root (preserve .github/workflows/android.yml), commit to main, then download the APK from the GitHub Actions build artifact. Keep the previous working APK as backup.

## Testing
Test sound on/off, vibration on/off, correct/wrong answers, 5-question completion, daily challenge and saved progress after restarting the app.

The HTML/JavaScript was syntax checked, but an Android APK has not been compiled in this environment.
