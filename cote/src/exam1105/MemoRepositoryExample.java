package exam1105;

public class MemoRepositoryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemoRepository m1 = new LocalRepository();
		MemoRepository m2 = new RemoteRepository();

		
		m1.addMemo(null, null);
		m1.getMemos();
		m1.updateMemo(null, null);
		m1.deleteMemo(null);
		
		
		
		m2.addMemo(null, null);
		m2.getMemos();
		m2.updateMemo(null, null);
		m2.deleteMemo(null);
		
		
	}

}
