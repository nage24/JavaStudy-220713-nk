package J18_JSON;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Builder;
import lombok.Data;
/*
 *	serialize ; 객체를 json으로 변환할 때
 *	deserialize ; json을 객체로 변환할 때 
 */

@Builder
@Data
public class User {
	@Expose(serialize = true, deserialize = true)
	private int userCode;
	
	@SerializedName("userId")						// 필드명 원하는 대로 바꿔주기 @
	@Expose(serialize = true, deserialize = true)
	private String username;
	
	@Expose(serialize = true, deserialize = true)	// 포함은 true 아니면 false 
	private transient String password;				// transient json에서 숨겨줌
	
	@Expose(serialize = true, deserialize = true)
	private String name;
	
	@Expose(serialize = true, deserialize = false)
	private String email;
	
	@Expose(serialize = true, deserialize = true)
	private String address;
	
	@Expose(serialize = true, deserialize = true)
	private String phone;
	
	@Expose(serialize = true, deserialize = true)
	private List<String> hobby;
	
	
}
