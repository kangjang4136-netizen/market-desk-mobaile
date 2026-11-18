# Market Desk Mobile — Android

원본 HTML을 앱에 포함한 WebView 프로젝트입니다. Tailwind, 글꼴, 시세 등 원본의 외부 요청에는 인터넷 연결이 필요할 수 있습니다. 외부 시세 응답과 주문 및 자산 저장 동작은 기기에서 확인해야 합니다. 실제 증권사 연동을 새로 추가하지 않았습니다.

## APK 만들기 (GitHub Actions)
1. ZIP 압축을 풀고, 숨김 폴더 `.github`를 포함한 전체 내용을 GitHub 저장소 루트에 푸시합니다. 민감한 정보가 있는지 먼저 검토하고, 필요하면 비공개 저장소를 사용하세요.
2. Actions → Build APK에서 실행 결과를 엽니다. 푸시로 실행되지 않으면 Run workflow로 시작합니다.
3. 성공 후 Artifacts → MarketDeskMobile-APK를 다운로드하고 압축을 풀면 `app-debug.apk`가 있습니다. 이 파일은 기기 테스트용이며 스토어 배포용이 아닙니다.
