package j19_익명클래스.role;

import java.util.Collection;
import java.util.List;

import lombok.Getter;

public interface GrantedAuthority {
	public Collection<String> getRoles(List<String> roles);
	
	// 진짜 머라는지 1도 몰으겠습니다만???? 집가서 들을래요 ㅜㅜ 안경없어서 왕슬픔 맨ㅇ  
}
