package ex19;
// 컬렉션 프레임워크 - Queue
// 유닉스의 history명령어를 Queue를 이용해서 구현한것:
// history명령어는 사용자가 입력한 명령어의 이력을 순서대로 보여줌

import java.util.*;

public class QueueEx1 {

	public static Queue q = new LinkedList();	//Queue인터페이스의 구현제인 LinkedList를 사용(Queue는 인터페이스이므로 객체 생성불가하기 때문에)
	public static final int MAX_VALUE = 5;		//Queue에 최대 5개까지만 저장되도록함
	
	public static void main(String[] args) {
		System.out.println("help을 입력하면, 도움말을 볼 수 있습니다");
		
		while(true) {
			System.out.print(">>");
			try {
				//화면으로부터 라인을 입력받음:
				Scanner sc = new Scanner(System.in);
				String input = sc.nextLine().trim();

				if("".equals(input))
					continue;

				if(input.equalsIgnoreCase("q")) {
					System.exit(0); //종료시킴
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help    - 도움말을 보여줍니다");
					System.out.println(" q 또는 Q - 프로그램을 종료합니다");
					System.out.println(" history - 최근에 입력한 명령어를 " + MAX_VALUE + " 개 보여줍니다");
				} else if(input.equalsIgnoreCase("history")) {
					int i = 0;
					//입력받은 명령어를 저장하고:
					save(input);
					
					//LinkedList의 내용을 보여줌:
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();

					while(it.hasNext())
						System.out.println(++i + "." + it.next());
				} else {
					save(input);
					System.out.println(input);
				}
			} catch(Exception e) {
				System.out.println("입력오류입니다");
			}
		}
	}

	public static void save(String input) {
		//queue에 저장:
		if(!"".equals(input))
			q.offer(input);
		
		//queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제함:
		if(q.size() > MAX_VALUE) //size()는 Collection인터페이스에 정의
			q.remove();
	}
	
}
/* (실행 결과:)

help을 입력하면, 도움말을 볼 수 있습니다
>>help
 help    - 도움말을 보여줍니다
 q 또는 Q - 프로그램을 종료합니다
 history - 최근에 입력한 명령어를 5 개 보여줍니다
>>dir
dir
>>cd
cd
>>mkdir
mkdir
>>dir
dir
>>history
1.dir
2.cd
3.mkdir
4.dir
5.history
>>q

*/
