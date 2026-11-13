# DeenQuest — Android prototype

Offline Islamic learning quiz prototype for Kids, Teens and Adults.

## Build on GitHub (Samsung phone)
1. Create a **public or private** GitHub repository called `deenquest`.
2. Upload the **contents** of this ZIP to the repository root, preserving folders (GitHub's mobile website may make multi-folder upload difficult; GitHub web editor or another Git client may be easier).
3. Open **Actions** → **Build DeenQuest APK** → **Run workflow** (or push to `main`).
4. After the workflow completes, open its run → **Artifacts** → download `DeenQuest-debug-apk`.
5. Extract the downloaded ZIP on your phone and install `app-debug.apk`. Android may require you to allow installs from your file manager/browser.

## Important
- This is a debug APK for personal testing, **not a Play Store release**. For publication, create a signed release Android App Bundle (AAB), review Google Play Families policy, privacy policy, content ratings and current target API requirements.
- Religious question content is a starter set and requires independent scholarly/factual review before release.
- No internet permission, tracking, ads, sign-in or payments.
- Question bank currently has 15 items (5 per learning mode); daily challenge draws five from the full bank.
- Gradle build requires Gradle installed in GitHub Actions environment; workflow uses runner `gradle` command. If unavailable, install via `gradle/actions/setup-gradle@v4`.
