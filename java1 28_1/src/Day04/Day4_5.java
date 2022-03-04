package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day4_5 {

	public static void main(String[] args) {
		
		/* 로또 판별기
		
		1. 사용자 6개 수 입력받기 -> 배열 저장
			1. 1~45 사이 수만 입력받기 아니면 재입력
			2. 중복x 재입력
		2. 추첨번호 : 컴퓨터 난수 6개 발생 -> 배열 저장
			1. 1~45사이
			2. 중복x
		3. 사용자 번호와 컴퓨터 추첨번호와 동일수의 개수
		
		*/
		// -----------------------------------------------------------------------
		
		//준비. 배열 6개 만들기
		int[] 사용자번호 = new int[6]; // 사용자가 선택한 번호
		int[] 추첨번호 = new int[6]; //컴퓨터 난수 번호 목록
		//6개까지 저장 가능. 입력 받아야 하므로 scan 추가
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		//사용자에게 입력 받기
		for(int i = 0 ; i<6 ; i++) { //0부터 5까지 6개
			// i는 1부터 6까지 1씩 증가만 반복. 총 6회 반복
			System.out.print("1~45 사이 입력 : ");
			
			int 번호 = scanner.nextInt();
			
			boolean 통과 = true;
			
			// 번호는 1~45사이만 입력 받음
			//조건1 : 유효성 검사
			if(번호 < 1 || 번호 > 45) { //만일 입력 받은 번호가 0보다 작거나 46을 넘으면 선택x 다시 int i=1로 올리기
				System.err.println("알림) 불가능한 번호입니다. 다시 입력해주세요.");
				i--; 통과 = false; //i는 입력 받지 못했기에 올라간 횟수를 제외해줌. 현재 i는 정상입력x이므로 되돌림.
			} //if end
			
			//boolean 통과 = true를 상단에 넣어 유효성 검사를 통과했는지 알 수 있다.단 아래에 통과=false;넣기
			//저장못하게 통과=false;를 넣어주어야 하는 것
			
			
			
			
			//조건2 : 중복 체크
				// 1. 배열 내 모든 인덱스 호출
				// 2. 입력받은 값과 같은지 비교
			for(int j = 0; j<6 ; j++) { //j가 0~5까지 1씩 증가하면서 1씩 비교하러 들어간다.
				if(번호 == 사용자번호[j]) { //내가 쓴 번호가 배열(인덱스) 안의 번호와 같은가?
					//해서 같으면
						System.err.println("알림) 이미 입력된 번호입니다. 다시 입력해주세요.");
						i--;} 통과 = false; }
					//다시 i 차감해준다.
			
			//중복없는 1~45 사이 : 정상 입력. -> 배열에 저장
			사용자번호[i] = 번호;
		} // for end
		System.out.print("\n입력한 번호 : " );
			for(int temp : 사용자번호 ) {
				System.out.print(temp +"\t");	}

			
			
			
			
		//컴퓨터가 난수 만들기
			for(int i = 0 ; i < 6 ; i++) {
		Random random = new Random(); //난수 객체 선언
			int 번호 = random.nextInt(45)+1; //난수를 int 형으로 가져오기(0~44 가져오므로 +1 붙이기)
						//random.nextInt() : +- 20억 사이 중 난수 발생
						//random.nextInt(수) : 0~수 전까지 사이 중 난수 발생
						//random.nextInt(수)+시작번호 : 시작번호~수 사이 중 난수 발생
			// 조건1 : 중복체크
			boolean 통과 = true;
			for(int temp : 추첨번호 ) {
				if (번호 == temp ) { i--; //중복이 있을 경우 현재 i 예외
					통과 = false; //저장x
				}
			}
				if (통과) 추첨번호[i] = 번호; 
			} // for 종료
			
			System.out.print("\n 추첨 번호 : " );
			for(int temp : 추첨번호 ) {
				System.out.print(temp +"\t");	}
				
		//비교 = 두 배열간 동일한 수 찾기
			//비교할때 6개의 숫자를 전부 비교해야함
			// 3 5 2
			// 8 3 1
			//모든 인덱스와 비교해야하므로 기준점을 잡고 먼저 3->8 3->3 3->1 식으로 비교하기
			//총 3 3이면 9번 비교. 6 6 비교니까 36번 비교
			
			int 동일한수 = 0;
			for(int i = 0 ;  i<사용자번호.length; i++) { 	//length로 몇 번 돌지
				//i비교 기준점
				for(int j = 0 ; j<추첨번호.length; j++) { //j 비교대상
					if(사용자번호 [i] == 추첨번호[j]) //둘이 같으면 동일한 수를 증가
						// 사용자 배열내 i번째 인덱스와
						// 컴퓨터 배열내 j번째 인덱스의 수가 동일하면 동일한 수 증가
					{ 동일한수++; }
				}
			}
			System.err.println("동일한 수의 개수 " + 동일한수);

			/* 방법2
			 * for (int 기준수 : 사용자번호) { //사용자번호 배열내 하나씩 비교기준 대입
			 * for (int 비교대상 : 추첨번호) { //추첨번호 배열내 하나씩 비교대상 대입
			 * if (기준수 == 비교대상) 동일한수++ ;
			 * } }
			 * 둘이 같으면 동일한 수가 더 올라간다.
			 * 사용자가 선택한 번호를 하나씩 꺼내와서 한 번 더 돌기 전에 추첨번호도 꺼내와서 비교.
			 * 사용자 번호가 1번 돌 때 추첨번호는 6번 돈다.
			 */
		
		
		// -----------------------------------------------------------------------
	} // me
} // ce