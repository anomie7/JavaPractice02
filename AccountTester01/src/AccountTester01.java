
public class AccountTester01 {
	public static void main(String[] args){
		Account chulsoo = new Account("Ã¶¼ö", "123456", 1000);
		Account younghee = new Account("¿µÈñ", "654321", 200);
		Account minu = new Account("¹Î¿ì", "921202", 200000000);
		
		System.out.println("¡á Ã¶¼öÀÇ °èÁÂ");
		System.out.println("    °èÁÂ¸íÀÇ: " + chulsoo.getName());
		System.out.println("    °ÔÁÂ¹øÈ£ : " + chulsoo.getNo());
		System.out.println("    ¿¹±İÀÜ°í : " + chulsoo.getBalance());
		System.out.println("    ½Äº°¹øÈ£ : " + chulsoo.getId());
		 
		System.out.println("¡á ¿µÈñÀÇ °èÁÂ");
		System.out.println("    °èÁÂ¸íÀÇ: " +  younghee.getName());
		System.out.println("    °ÔÁÂ¹øÈ£ : " + younghee.getNo());
		System.out.println("    ¿¹±İÀÜ°í : " + younghee.getBalance());
		System.out.println("    ½Äº°¹øÈ£ : " + younghee.getId());
		
		System.out.println("¡á ¹Î¿ìÀÇ °èÁÂ");
		System.out.println("    °èÁÂ¸íÀÇ: " +  minu.getName());
		System.out.println("    °ÔÁÂ¹øÈ£ : " + minu.getNo());
		System.out.println("    ¿¹±İÀÜ°í : " + minu.getBalance());
		System.out.println("    ½Äº°¹øÈ£ : " + minu.getId());
		
	}

}
