
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Merhaba Java");

		int ogrenciSayisi = 90;
		String mesaj = "Öğrenci sayısı:";
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println("Öğrenci sayım: " + ogrenciSayisi);

		// conditionals

		int sayi = 20;
		if (sayi < 20) {
			System.out.println("sayı 20 den küçüktür");
		} else if (sayi == 20)
			System.out.println("sayı 20' ye eşittir ");
		else
			System.out.println("sayı 20 den küçük değildir ");

		{
			// recap Demo1

			int sayi1 = 25;
			int sayi2 = 26;
			int sayi3 = 2;
			int enBuyuk = sayi1;

			if (enBuyuk < sayi2) {
				enBuyuk = sayi2;
			}
			if (enBuyuk < sayi3) {
				enBuyuk = sayi3;
			}
			System.out.println("En Büyük =" + enBuyuk);
		}

		{
			// switchDemo

			char grade = 'A';

			switch (grade) {
			case 'A':
				System.out.println("Mükemmel : Geçtiniz");
				break;

			case 'B':

				System.out.println("Çok Güzel : Geçtiniz");
				break;

			case 'C':
				System.out.println("İyi : Geçtiniz");
				break;
			case 'D':
				System.out.println("Fena Değil : Geçtiniz");
				break;
			case 'F':
				System.out.println("Maalesef : Kaldınız!");
				break;
			default:
				System.out.println("Geçersiz not girdiniz.");
			}

			{
				// loop Demo

				for (int i = 1; i <= 10; i++) // tek sayıların yazdırılması = for(int i=2; i<10;i+=2)
					System.out.println(i);
			}
			System.out.println("For Döngüsü Bitti");
			System.out.println("---------------------");
		}

		{
			// while Döngüsü= Tek sayıları yazdırma!

			int i = 1;
			while (i < 10) {
				System.out.println(i);
				i += 2;

			}
			System.out.println("While döngüsü bitti");

			System.out.println("----------------------------");

			{
				// Do While döngüsü= Çift sayıları yazdırma!
				// while döngüsü ile arasındaki fark; şartlar sağlanmasa dahi bir kez
				// çalışır.Neden gerekli? veritabanına log atmak ve çalışıp çalışmadığını
				// kontrol etmek amaçlı kullanılabilir.
				int j = 2;
				do {
					System.out.println(j);
					j += 2;
				} while (j < 10);
			}
			System.out.println("Do While döngüsü bitti");
			System.out.println("-------------------------");

			{
				// arraysDemo

				String ogrenci1 = "Engin";// Yanlış versiyon
				String ogrenci2 = "Derin";
				String ogrenci3 = "Salih";
				System.out.println(ogrenci1 + " " + ogrenci2 + " " + ogrenci3);
				System.out.println("---------------------------");

				String[] ogrenciler = new String[3];
				ogrenciler[0] = "Engin";
				ogrenciler[1] = "Derin";
				ogrenciler[2] = "Salih";

				for (int k = 0; k < ogrenciler.length; k++)
					System.out.println(ogrenciler[k]);

				System.out.println("-------------------------");

				// EN KOLAY YÖNTEM!! [String[] s = {"kredi x","kredi c", "kredi a"}; for (String
				// kredi : s) System.out.println(kredi);]

				for (String ogrenci : ogrenciler) {
					System.out.println(ogrenci);
				}
				System.out.println("-----------------");

				{
					// reCapDemo

					double[] myList = { 1.2, 1.3, 4.3, 5.6 };
					double total = 0;
					double max = myList[0];
					for (double number : myList) {

						if (max < number) {
							max = number;

						}
						total = total + number;
						System.out.println(number);

					}
					System.out.println("toplam=" + total);
					System.out.println("En Büyük=" + max);

					{
						System.out.println("------------------------");

						// multiDimensionalArrayDemo

						String[][] sehirler = new String[3][3];
						sehirler[0][0] = "istanbul";
						sehirler[0][1] = "Bursa";
						sehirler[0][2] = "Bilecik";
						sehirler[1][0] = "Ankara";
						sehirler[1][1] = "Konya";
						sehirler[1][2] = "Kayseri";
						sehirler[2][0] = "Diyarbakır";
						sehirler[2][1] = "Şanlıurfa";
						sehirler[2][2] = "Gaziantep";

						for (int z = 0; z <= 2; z++) {
							System.out.println("------------------");

							for (int f = 0; f <= 2; f++) {
								System.out.println(sehirler[z][f]);

								System.out.println("-----------------------------");

								{
									// stringsDemo

									{
										// miniProjeAsalSayı

										int nmbr = -2;
										int remainder = nmbr % 2;

										System.out.println(remainder);
										boolean isPrime = true;
										if (nmbr == 1) {
											System.out.println("sayı asal değildir");
											return;
										}
										if (nmbr < 1) {
											System.out.println("sayı geçersizdir");
										}
										for (int p = 2; p < nmbr; p++) {
											if (nmbr % p == 0)
												isPrime = false;

										}
										if (isPrime) {
											System.out.println("sayı asaldır.");
										} else {
											System.out.println("sayı asal değildir.");
										}

										System.out.println("------------------------");

										{
											// sesliHarfler

											char harf = 'I';

											switch (harf) {

											case 'A':
											case 'I':
											case 'O':
											case 'U':
												System.out.println("Kalın sesli harf");
												break;

											default:
												System.out.println("İnce sesli harf");

											}

											System.out.println("--------------------");

										}

										{
											// mükemmelSayı

											int nr = 5;
											int ttl = 0;

											for (int e = 1; e < nr; e++) {
												if (nr % e == 0) {
													ttl = ttl + e;

												}
											}
											if (ttl == nr) {
												System.out.println("Mükemmel sayıdır");

											} else {
												System.out.println("Mükemmel sayı değildir");

											}
											System.out.println("-----------------------");

										}

										{
											// arkadaşSayılar

											int sayi11 = 220;
											int sayi22 = 284;
											int tpl = 0;
											int tpl2 = 0;

											for (int y = 1; y < sayi11; y++) {
												if (sayi11 % y == 0) {
													tpl = tpl + y;
												}
											}

											for (int y = 1; y < sayi22; y++) {
												if (sayi22 % y == 0) {
													tpl2 = tpl2 + y;
												}
											}

											if (sayi11 == tpl2 && sayi22 == tpl) {
												System.out.println("bu iki sayı arkadaştır");

											} else {
												System.out.println("bu iki sayı arkadaş değildir");
											}

											System.out.println("------------------------");

											{
												int[] sayilar0 = new int[] { 1, 2, 5, 7, 9, 0 };
												int aranacak = 5;
												boolean varMi = false;
												for (int sayi00 : sayilar0) {
													if (sayi00 == aranacak) {
														varMi = true;
														break;
													}
												}
												if (varMi) {
													System.out.println("Sayı Mevcuttur");

												} else {
													System.out.println("Sayı Mevcut değildir");
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}



	}

}
