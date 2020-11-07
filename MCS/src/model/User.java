package model;

public abstract class User{

	//attributes
	private String name;
	private String password;
	private String nickname;
	private int age;

	//relations
	private Category category;

	//methods

	/*se asignan los atributos al usuario
	*/
	public User(String name, String password, String nickname, int age, String category){
		this.name = name;
		this.password = password;
		this.nickname = nickname;
		this.age = age;
		this.category = Category.valueOf("NEWBIE");
	}

	/*getters y setters de la clase
	*/
	public String getUserName(){
		return name;
	}

	public void setUserName(String name){
		this.name = name;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password = password;
	}

	public int getAge(){
		return age;
	}

	public void setAge(int age){
		this.age = age;
	}

	public String getCategory(){
		return category.toString();
	}

	public void setCategory(String category){
		this.category = Category.valueOf(category);
	}


}