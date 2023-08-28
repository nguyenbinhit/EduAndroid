package buoi04;

import java.util.Scanner;

public class QuanLyHocSinh {
	public static void main(String[] args) {
		HocSinh hocSinh = null;
		String tiepTuc = "n";

		Scanner sc = new Scanner(System.in);

		do {
			int option;

			System.out.println("==============Quan Ly Hoc Sinh==============");
			System.out.println("1. Nhap thong tin hoc sinh");
			System.out.println("2. In thong tin hoc sinh");
			System.out.println("3. Tinh diem trung binh");
			System.out.print("Chon chuc nang: ");

			option = sc.nextInt();
			sc.nextLine();

			switch (option) {
			case 1:
				hocSinh = new HocSinh();
				
				if (hocSinh != null) {
					hocSinh.nhap(sc);
				}
				
				break;
			case 2:
				System.out.println(hocSinh);
				break;
			case 3:
				float diemTrungBinh = hocSinh.tinDiemTrungBinh();
				
				System.out.println("Diem trung binh la: " + diemTrungBinh);
				
				break;

			default:
				System.out.println("Khong co lua chon nay " + option);
				break;
			}

			System.out.println("Ban co muon tiep tuc khong (y or n): ");

			tiepTuc = sc.nextLine();
		} while (!tiepTuc.equals("n"));
		
		sc.close();
		
		System.out.println("Ket thuc chuong trinh");
	}
}
