package buoi04;

import java.util.Scanner;

public class HocSinh {
	private String name;
	private int age;
	private float diemVan;
	private float diemToan;

	public HocSinh() {

	}

	public HocSinh(String name, int age, float diemVan, float diemToan) {
		this.name = name;
		this.age = age;
		this.diemVan = diemVan;
		this.diemToan = diemToan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getDiemVan() {
		return diemVan;
	}

	public void setDiemVan(float diemVan) {
		this.diemVan = diemVan;
	}

	public float getDiemToan() {
		return diemToan;
	}

	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}

	@Override
	public String toString() {
		return "HocSinh [name=" + name + ", age=" + age + ", diemVan=" + diemVan + ", diemToan=" + diemToan + "]";
	}

	public float tinDiemTrungBinh() {
		return (float) ((this.diemToan + this.diemVan) / 2);
	}

	public void nhap(Scanner sc) {
		System.out.print("Nhap ten hoc sinh: ");
		this.name = sc.nextLine();
		System.out.print("Nhap tuoi hoc sinh: ");
		this.age = sc.nextInt();
		System.out.print("Nhap diem Van: ");
		this.diemVan = sc.nextFloat();
		System.out.print("Nhap diem Toan: ");
		this.diemToan = sc.nextFloat();
		sc.nextLine();
	}
}
