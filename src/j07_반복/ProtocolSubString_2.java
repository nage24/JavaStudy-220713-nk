package j07_반복;

public class ProtocolSubString_2 {

	public static void main(String[] args) {
		String data = "@Message:안녕하세요.@To:김준일@From:김준일@SendDate:2022/07/21";
//		String message = null;
//		String to = null;
//		String from = null;
//		String sendDate = null;
		
		
		while(true) {		
			int commandIndex = data.indexOf("@") + 1;		//골뱅이 다음.
			int contentIndex = data.indexOf(":");
			int nextCommandIndex = data.indexOf("@", 1); 	// 뒤 골뱅이를 찾아야 하므로 2번째 인자를 1로 줍니다. 
															// 나중에 뒤에 @를 못 찾으면 -1(false) 결과값을 가지게 됩니다. *나중에 활용
			
			String command = data.substring(commandIndex, contentIndex);
			String content = nextCommandIndex != -1 ? data.substring(contentIndex + 1, nextCommandIndex) // 콜론 다음부터 다음 골뱅이 전까지
					: data.substring(contentIndex + 1);		// 마지막에 nextCommand가 없어서 -1 뜨면 끝까지 잘라라. 
			
			// 마지막 SendDate에서는 nextCommandIndex를 삭제해주어야 출력이 되겠죠 끝까지 뽑아주면 되기 대문에
			
			System.out.println(command + ": " + content);
			
//			if(command.equals("Message")) {
//				message = content;
//			}else if(command.equals("To")) {
//				to = content;
//			}else if(command.equals("From")) {
//				from = content;
//			}else if(command.equals("SendDate")) {
//				sendDate = content;
//			}
			
			if(nextCommandIndex == -1) { 					// 마지막이니? 라고 묻는 것. while문을 탈출해주어야 겠죠
				break;
			}
			
			data = data.substring(nextCommandIndex); // nextCommandIndex부터 끝까지 잘라준다. (앞에 사용했던 문자열들을 싹 싹 지워주고 다시 실행하는 것)

		}
		
		
//		System.out.println("Message: " + message);
//		System.out.println("To: " + to);
//		System.out.println("From: " + from);
//		System.out.println("SendDate: " + sendDate);
		

	}

}
