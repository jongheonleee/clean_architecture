# 🧼 클린 아키텍쳐

## 📌 03. 설계 원칙(SOLID)

### 1. SRP : 단일 책임 원칙 

> 하나의 액터에 대해 책임 져야함

- 액터 : 변경을 요청하는 한명 이상의 사람
- 단일 모듈은 변경의 이유가 하나
    - 모듈 : 소스 파일(함수 + 데이터)



> 서로 다른 액터는 분리해서 관리



- 한 클래스가 여러 액터에 대해 책임지면, 그 만큼 변경 요구 사항이 늘어남
- 더욱이, 서로 다른 액터가 특정 코드를 공유하게 되면 추후에 변경 사항을 적용하는 과정에서 문제가 발생함
  - 우발적 중복 -> A의 요구 사항을 충족하면 B도 변경된 사항을 적용 받음
  - 병합 -> 변경사항이 충돌하여 병합 발생


