package exam1105;

public class RemoteRepository implements MemoRepository{

	@Override
	public void addMemo(String id, String body) {
		// TODO Auto-generated method stub
		System.out.println("PC에 메모를 원격으로 저장합니다.");
	}

	@Override
	public void getMemos() {
		// TODO Auto-generated method stub
		System.out.println("PC에 메모를 원격으로 조회합니다.");
	}

	@Override
	public void updateMemo(String id, String body) {
		// TODO Auto-generated method stub
		System.out.println("PC에 메모를 원격으로 수정합니다.");
	}

	@Override
	public void deleteMemo(String id) {
		// TODO Auto-generated method stub
		System.out.println("PC에 메모를 원격으로 삭제합니다.");
	}

}





