class Phone
{
	
	void SreenLock(String name)
	{
		
		System.out.println("open password with alphabets="+name);
	}
	void ScreenLock(int number)
	{
		System.out.println("open with PIN number="+number);
	}
	  void ScreenLock(String lock,String fingerprint) {
		  System.out.println("opening phone with"+" "+lock +" "+ "and"+fingerprint);
		  
	  }
}

 class Openingphone {
	 public static void main(String args[]) {
		 
		 Phone Lockopen=new Phone();
                 Lockopen.ScreenLock("prasad");
		
		 Lockopen.ScreenLock(1234);
		 Lockopen.ScreenLock("facelock", "fingerprint");
		 
	 }

	
}