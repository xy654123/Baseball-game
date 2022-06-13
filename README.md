# Baseball-game



# main

<img src="https://user-images.githubusercontent.com/96267331/173283833-639886f7-4327-4a3a-8226-c89d0de9280d.PNG"></img><br>
메인에서는 관리자에게 난수 3개를 받아 메소드2로 게임을 시작하거나 랜덤으로 난수 3개를 받아 메소드1으로 게임을 시작한다<br>
# Method1

<img src="https://user-images.githubusercontent.com/96267331/173283834-074f0d31-6f34-4254-ad81-a34f39ce887d.PNG"></img><br>
메소드 1은 변수 x,y,z에 1~9의 겹치지않는 랜덤수를 부여하고 메소드 2를 실행한다.<br>

# Method2

<img src="https://user-images.githubusercontent.com/96267331/173283837-8492357f-88d2-4e5b-9b9e-b1ee725dba7a.PNG"></img><br>
메소드2 에서는 인자값 x,y,z를 받고 변수 count,strike,ball 만들어주고 usr com 이라는 배열을 만들어준다 그리고 com배열에는 x,y,z의 값을
넣어주고 count값을 0으로 초기화 후 while문을 실행한다 while문에서는 한번 실행할때 마다 count값을 증가시켜줌으로 몇번을 시도했지는 알수있고
usr 배열에 플레이어가 BufferedReader를통해 3개의 값순서대로 입력하고 ball 과 strike값을 초기화후 com배열에있는 숫자가 같은면 ball 숫자와위치 모두 같으면 strike가 증가한다 
그렇게 출력후 반복되면서 3 strike 가 되거나 conut수가 11일 될때 conut의 값을 메인함수의 리턴해준다.

# Again main

<img src="https://user-images.githubusercontent.com/96267331/173283833-639886f7-4327-4a3a-8226-c89d0de9280d.PNG"></img><br>

리턴값을 받은후 메인에서는 리턴받은 count수를 result에 넣은후 그값에 맞는 출력값을 출력한후 프로그램을 끝낸다.
