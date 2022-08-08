package j19_익명클래스.role;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

public class principalDat {
	
	@NonNull
	private User user;
	
	public Collection extends GrantedAuthority getAutherities() {
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		user.getRoleList().forEach(new Consumer<String>());
			@Override
			public void accept(String t) {
				authorities.add();
			}
	}
	
//	public static void main(String[] args) {
//		
//		String strRoles = "USER_ROLE,  ADMIN_ROLE,     MANAGER_ROLE";
//		
//		// 공백제거
//		strRoles = strRoles.replaceAll(" ", "");
//		String[] roleArray = strRoles.split(",");
//		
//		List<String> roles = new ArrayList<String>();
//		
//		for(int i = 0; i < roleArray.length; i++) {
//			roles.add(roleArray[i]);
//		}
//		
//		System.out.println(roles);
//		
//		Collection<String> roleDates = (Collection<String>) new GrantedAuthority() {
//			
//			@Override
//			public Collection<String> getRoles(List<String> roles) {
//				List<String> roleList = new ArrayList<String>();
//				roleList.addAll(roles);
//				return roleList;
//			} 
//			getRoles();
//		};
//	}

