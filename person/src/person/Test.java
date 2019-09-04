package person;

public class Test {
	public static void main(String[]args){
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="08011111111";
		taro.address="東京";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="08022222222";
		jiro.address="埼玉";

		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.walk();
		jiro.run();

		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="08033333333";
		hanako.address="千葉";

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();

		Person kei=new Person();
		kei.name="植野圭";
		kei.age=26;
		kei.phoneNumber="08044444444";
		kei.address="東京";

		System.out.println(kei.name);
		System.out.println(kei.age);
		System.out.println(kei.phoneNumber);
		System.out.println(kei.address);
		kei.talk();
		kei.walk();
		kei.run();

		Robot aibo=new Robot();
		aibo.name="aibo";
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo=new Robot();
		asimo.name="asimo";
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper=new Robot();
		pepper.name="pepper";
		pepper.talk();
		pepper.walk();
		pepper.run();

	}

}
