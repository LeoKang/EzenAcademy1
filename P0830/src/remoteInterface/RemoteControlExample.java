package remoteInterface;

public class RemoteControlExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		RemoteControl rc2 = new RemoteControl() {
//			@Override
//			public void turnOn() {
//				// TODO Auto-generated method stub
//				System.out.println("RemoteControl - turnOn()");
//			}
//
//			@Override
//			public void turnOff() {
//				// TODO Auto-generated method stub
//				System.out.println("RemoteControl - turnOff()");
//			}
//
//			@Override
//			public void setVolume(int volume) {
//				// TODO Auto-generated method stub
//				System.out.println("volume : " + volume);
//			}
//		};
//		rc2.turnOn();
//		rc2.turnOff();

		RemoteControl rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(11);
		rc.setVolume(7);
		rc.turnOff();
		RemoteControl.changeBattery();

		rc = new Audio();
		rc.turnOn();
		rc.setVolume(-2);
		rc.setVolume(2);
		rc.turnOff();

		rc = new SmartTelevision();
		rc.turnOn();
		rc.setVolume(6);
		rc.turnOff();

		Searchable sc = new SmartTelevision();
		sc.search("www.naver.com");

		SmartTelevision st = new SmartTelevision();
		st.turnOn();
		st.search("www.google.com");
		st.turnOff();
	}
}
