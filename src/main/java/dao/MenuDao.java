package dao;

import java.util.List;

import dto.Menu;

public interface MenuDao {
	// 데이터넣기
	public void insert(Menu menu);
	// 데이터전체검색
	public List<Menu> selectAll();
	// 데이터 메뉴 검색(한개)
	public Menu selectOne();
	// 데이터 업데이트
	public void update(Menu menu);
	// 데이터 랜덤 추천(한개)
	public Menu selectBest();
	// 데이터 삭제
	public void delete(int id);
}
