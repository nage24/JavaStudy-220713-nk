package j16_제네릭;

import lombok.AllArgsConstructor;
import lombok.Data;

// CommitMessageResponseDataTransferObject
// 응답에 대한 완료 메세지를 담은 데이터의 변환 객체
// 얘를 나중에 JSON 으로변환함.
// 공통 응답 객체 // 웹 통신 시 모든 응답은 이 녀석 안에다 넣게 됩니다. 결과는 항상 이 틀을 벗어나지 않게 합니다. 

@AllArgsConstructor
@Data 
public class CMRespDto<T> {
	private int code;
	private String message;
	private T data;
}
