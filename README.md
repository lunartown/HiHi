# java-batch-starter
AWS Lambda로 구동할 수 있는 배치 프로젝트를 빠르게 시작할 수 있는 템플릿입니다.

## 요구사항

- Java >= 17.*

## 템플릿으로 새 프로젝트 생성하기

1. 프로젝트 클론
```bash
git clone https://github.com/teamo2dev/java-batch-starter.git && cd java-batch-starter
```

2. 새 프로젝트 생성
```bash
chmod +x setup.sh
# 첫 번째 인자: 새 프로젝트 이름
# 두 번째 인자: 새 패키지 이름
# 예시: 프로젝트 이름을 'MyProject'로, 패키지를 'myservice'로 변경
./setup.sh MyProject myservice

# 생성된 프로젝트로 이동
cd ../MyProject
```

## 프로젝트 구동하기

1. AWS Lambda 함수 생성
```
- 런타임: JAVA 17
- 실행 역할: 기존 역할 사용
- Additional Configurations: VPC 활성화
- teamo2 VPC 선택
- Subnet 선택: teamo2priv2c, teamo2priv2a
- Security Group 선택: default VPC security group
- 기타 설정 확인
```

2. CI/CD 구축
   
  - ./github/workflows/prod.yml 파일 열기
  - Update lambda 부분의 LAMBDA_NAME을 방금 생성한 함수 이름으로 변경


3. 함수 구동

  - prod 브랜치에 push하면 github actions 실행
  - application-prod.yml 생성
  - gradle buildZip
  - build 된 zip 파일을 s3 의 carmore-lambda-repository로 업로드
  - lambda 코드를 update


4. 람다 테스트

  - 생성한 람다 함수 -> 테스트
  - 필요 시 JSON 파일 수정
  - 테스트 후 로그 확인
