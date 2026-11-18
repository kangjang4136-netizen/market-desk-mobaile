# MARKET DESK — 모바일 트레이딩 앱 (GitHub Pages + 자동 APK 빌드)

이 저장소에는 웹 배포 파일(`index.html`, `manifest.json`, `sw.js`, `icon.svg`)과 **GitHub에서 자동으로 `.apk` 파일을 컴파일해 주는 GitHub Actions 설정**이 모두 포함되어 있습니다.

## 1. GitHub에서 바로 `.apk` 파일 생성 및 다운로드하는 방법
1. 이 압축 파일의 내용을 모두 GitHub 저장소 루트에 업로드(Push)합니다.
2. GitHub 저장소 상단 탭의 **Actions** 메뉴로 들어갑니다.
3. 왼쪽에서 **Build Android APK** 워크플로우가 자동 실행되는 것을 확인합니다. (약 2~3분 소요)
4. 빌드가 완료(초록색 체크)되면 해당 실행 내역을 클릭하고, 하단 **Artifacts** 영역에서 **`MARKET-DESK-MTS-APK`**를 클릭해 다운로드합니다.
5. 다운로드한 압축을 풀면 안드로이드 스마트폰에 바로 설치할 수 있는 **`MARKET-DESK-MTS.apk`** 파일이 들어있습니다.

## 2. GitHub Pages 웹 앱 주소로도 동시에 사용 가능
- 저장소 **Settings → Pages**에서 Branch를 `main` (루트 `/`)으로 저장하면 웹 브라우저 및 PWA로도 즉시 실행됩니다.
