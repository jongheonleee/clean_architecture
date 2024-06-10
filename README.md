# 🧼 클린 아키텍쳐

## 📌 03. 설계 원칙(SOLID)

### 1. SRP : 단일 책임 원칙, 하나의 액터에 대해 책임져야함, 즉 책임을 분리

> ### 👉 하나의 액터에 대해 책임 져야함

- 액터 : 변경을 요청하는 한명 이상의 사람
- 단일 모듈은 변경의 이유가 하나
    - 모듈 : 소스 파일(함수 + 데이터)
- 한 클래스가 여러 액터에 대해 책임지면, 그만큼 변경 요구 사항이 늘어남
- 더욱이, 서로 다른 액터가 특정 코드를 공유하게 되면 추후에 변경 사항을 적용하는 과정에서 문제가 발생함
  - 우발적 중복 -> A의 요구 사항을 충족하면 B도 변경된 사항을 적용 받음
  - 병합 -> 변경사항이 충돌하여 병합 발생



> ### 👉 서로 다른 액터는 그에 대응하는 클래스를 분리해서 관리

- 세명의 액터에 대해 책임지고 있음 
<img src="https://github.com/jongheonleee/clean_architecture/assets/87258372/678170a5-3a45-4e0a-93db-dfd1c314edd8" width="500" height="500"/>

- 그 중 두 명의 액터가 특정 알고리즘을 공유 
<img src="https://github.com/jongheonleee/clean_architecture/assets/87258372/a4e7de29-e2bb-4285-a29d-4b3caf863b55" width="500" height="500"/>

### 💥 문제 발생 
- 공유한 알고리즘의 변경 사항이 2개, 만약 한 곳에 변경 사항이 발생되었고 이를 처리한다면, 나머지 액터는 변경된 알고리즘을 사용. 즉 꼬여버릴 수 있음
- 두 명의 액터가 동시에 변경 사항이 발생함. 즉 변경 사항이 충돌되어 병합 발생

### ✅ 해결
- 서로 다른 클래스로 분리해내기 
<img src="https://github.com/jongheonleee/clean_architecture/assets/87258372/709fc478-b35c-4245-b56d-bb48ba01af9d" width="500" height="500"/>


### 2. OCP : 개방-폐쇄 원칙, 확장에는 열려 있고 변경에는 닫혀있다

> ### 👉 확장에는 열려 있고 변경에는 닫혀있음, 즉 다형성을 적극 활용한 프로그래밍. 

- 대표 예시는 Iterator 코드, chapter03 Ocp_01 코드 참고
- iterator 코드는 다형성을 활용하여 추상적으로 되어 있음, 따라서 구현체가 변경이 되어도 해당 부분은 변경되지 않음
- 아키텍쳐 수준에서도 OCP를 적용해야함
  - 다양한 디자인 패턴들은 모두 OCP 원칙을 준수하기 위해 나옴
  - 예를 들어, Template Method Pattern, Strategy, Iterator ...
  - 위의 패턴 모두 설계와 구현부를 분리해내어 OCP를 지킴
 
- OCP 대표 예시

<img width="457" alt="OCP1" src="https://github.com/jongheonleee/clean_architecture/assets/87258372/822e8e2a-2606-41ba-abd9-b96d7e78f569">



