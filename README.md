# 블랙잭 게임 규칙
•블랙잭 게임을 진행하는 프로그램을 구현한다.  
블랙잭 게임은 딜러와 플레이어 중 카드의 합이 21 또는 21에 가장 가까운 숫자를 가지는 쪽이 이기는 게임이다. 

•플레이어는 게임을 시작할 때 배팅 금액을 정해야 한다. 카드의 숫자 계산은 카드 숫자를 기본으로 하며,  
예외로 Ace는 1 또는 11로 계산할 수 있으며, King, Queen, Jack은 각각 10으로 계산한다.

•게임을 시작하면 플레이어는 두 장의 카드를 지급받으며, 두 장의 카드 숫자를 합쳐 21을 초과하지 않으면서  
21에 가깝게 만들면 이긴다. 21을 넘지 않을 경우 원한다면 얼마든지 카드를 계속 뽑을 수 있다.  
단, 카드를 추가로 뽑아 21을 초과할 경우 배팅 금액을 모두 잃게된다.  

•처음 두 장의 카드 합이 21일 경우 블랙잭이 되면 배팅 금액의 1.5배를 딜러에게 받는다.  
딜러와 플레이어가 모두 동시에 블랙잭인 경우 플레이어는 배팅한 금액을 돌려받는다.  

•딜러는 처음에 받은 2장의 합계가 16 이하이면 반드시 1장의 카드를 추가로 받아야 하고, 17점 이상이면 추가로 받을 수 없다.  
딜러가 21을 초과하면 그 시점까지 남아있던 플레이어들은 가지고 있는 패에 상관없이 승리해 배팅 금액을 받는다.

# 기능 구현 순서
## 1. 카드 뭉치를 섞는 메서드와 한 장씩 배급하는 메서드 만들기
Card 클래스에 생성
## 2. 게임 진행 시 보이는 템플릿을 담당하는 클래스 만들기
질문, 진행 결과, 최종 결과 등 시각적인 모든 요소
## 3. 사용자에게 받는 값을 처리하는 클래스 만들기
이름, 배팅 금액, y or n
>### 3-1. 이름 예외처리
공백을 입력받을 경우
>### 3-2. 배팅 금액 예외처리
0 이하 또는 문자를 입력받을 경우
>### 3-3. y or n 예외처리
y 또는 n을 제외한 모든 경우
## 4. 플레이어와 딜러에게 카드를 나눠주는 메서드 만들기
게임 시작 후 첫번째는 2장씩 배급, 이후 요구에 따라 1장씩 배급
## 5. ACE 카드 점수 결정하는 메서드 만들기
ACE카드 점수를 1점을 기본으로 하되, 11로 취급해도 21이 넘지 않는 경우 11로 변경
## 6. 수익 계산 클래스 만들기
>### 6-1. 블랙잭 경우 (처음 받은 두 장의 카드로 21 달성)
플레이어만 블랙잭인 경우 배팅 금액의 1.5배 받음
딜러도 블랙잭인 경우 배팅 금액만큼 받음
>### 6-2. 딜러가 21을 초과한 경우 (플레이어의 패는 상관 없음)
플레이어가 배팅 금액만큼 받음
>### 6-3. 플레이어가 21을 초과한 경우 (딜러는 초과하지 않음)
플레이어가 배팅 금액만큼 잃음
>### 6-4. 플레이어가 딜러를 이긴 경우 (둘 다 초과하지 않음)
플레이어가 배팅 금액만큼 받음
>### 6-5. 딜러가 플레이어를 이긴 경우 (둘 다 초과하지 않음)
플레이어가 배팅 금액만큼 잃음
>### 6-6. 무승부의 경우 (둘 다 초과하지 않음)
받지도 잃지도 않음
