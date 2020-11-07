package ui;
import model.*;
import java.util.*;
public class Main{

	public static Scanner sc = new Scanner(System.in);

	static MCS mcs = new MCS();

	public static void main (String[] args){


		System.out.println("*************************************************");
		System.out.println("*********          BIENVENIDO           *********");
		System.out.println("(((((((((((((((((((((((((((((((((((((((((((((((((");
		System.out.println("((((((((((((((((/((((((((((((((((((((((((((((((((");
		System.out.println("(((/  .(((((((*  .((((((*        (((((/      /(((");
		System.out.println("(((/   .((((((.  .(((((   ,((((((((((*  .((((((((");
		System.out.println("(((/    /((((/   .((((/  ,(((((((((((.  /((((((((");
		System.out.println("(((/     ((((*   .((((*  ,(((((((((((/   ((((((((");
		System.out.println("(((/  *  *(((     ((((*  ,((((((((((((,  .(((((((");
		System.out.println("(((/  /.  ((*     ((((*  *(((((((((((((,   ((((((");
		System.out.println("(((/  //  ,(  .   ((((*  *((((((((((((((/   /((((");
		System.out.println("(((/  *(*  ,  (   ((((*  *((((((((((((((((   /(((");
		System.out.println("(((/  ,(/    ,(   /(((*  ,(((((((((((((((((   (((");
		System.out.println("(((/  .((    ((   /((((  .(((((((((((((((((.  /((");
		System.out.println("(((/  .((.  .((.  *((((,  *((((((((((((((((   /((");
		System.out.println("(((/  .((((((((.  *(((((   *((((/,/(((((((/   (((");
		System.out.println("(((/  .((((((((.  *((((((.        *((   .   .((((");
		System.out.println("(((((((((((((((/*/((((((((((///(((((((////(((((((");
		System.out.println("(((((((((((((((((((((((((((((((((((((((((((((((((");
		System.out.println("               ./(###((///((###(*                ");
		System.out.println("           *#(,                   *((,           ");
		System.out.println("        ,#/                           ((         ");
		System.out.println("      .#*          .**/////*,.          ((       ");
		System.out.println("     *(.      .//////////////////*       *#      ");
		System.out.println("    .#,     *///////////////////////,     /(     ");
		System.out.println("    /(    *///////////////////////////    .#.    ");
		System.out.println("  ,/////,*/////////////////////////////,*////*.  ");
		System.out.println("  /////////////////////////*,...,/////////////,  ");
		System.out.println("  //////*,,,********,,.............,,,,,//////,  ");
		System.out.println("  //////*.........//*........//*.......,//////,  ");
		System.out.println("  //////*.........,,.........,,........,//////,  ");
		System.out.println("  //////*..............................,//////,  ");
		System.out.println("   *///*  ........,/.........**.......  .*///,   ");
		System.out.println("            .......,/*.....,/*.......            ");
		System.out.println("               ........,,,,.......               ");
		System.out.println("                    .........                    ");
		System.out.println("     											 ");


		boolean stop = false;
		boolean goLogin = false;
		boolean goMenu = false;
		while (!stop){
			System.out.println(login());
			selection();
		}
	}


	private static String login(){
		String message;
		message="*************************************************\n";
		message+="*************************************************\n";
		message+="*************************************************\n";
		message+="**************                     **************\n";
		message+="**************   INICIAR SESION    **************\n";
		message+="**************                     **************\n";
		message+="*************************************************\n";
		message+="***                                           ***\n";
		message+="*** (1) ABRIR SESION                          ***\n";
		message+="*** (2) CREAR USUARIO                         ***\n";
		message+="*** (3) CERRAR APLICACION                     ***\n";
		message+="***                                           ***\n";
		message+="*************************************************\n";
		message+="*************************************************\n";
		return message;
	}

	private static boolean selection(){
		int option = Integer.parseInt(sc.nextLine());
		switch (option){
			case 1: mcs.openUser(); break;
			case 2: 
			System.out.println("*** ingresa el nombre                         ***");
			String name = sc.nextLine;
			System.out.println("*************************************************");
			System.out.println("*** ingresa la contraseña                     ***");
			String password = sc.nextLine;
			System.out.println("*************************************************");
			System.out.println("*** ingresa el nickname                       ***");
			String nickname = sc.nextLine;
			System.out.println("*************************************************");
			mcs.addUser(name, nipassword, nickname, age); break;
			case 3: return true; break;
		}
		return false;
	}
}