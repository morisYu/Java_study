package chap05.exercise;

/*
 * °¡À§, ¹ÙÀ§, º¸ °ÔÀÓ ¸¸µé±â
 * ¼ýÀÚ¸¦ ÀÔ·Â¹Þ¾Æ¼­ ÄÄÇ»ÅÍ¿Í °¡À§¹ÙÀ§º¸ ÁøÇà
 * 1´ë1·Î °¡À§¹ÙÀ§º¸ ÁøÇà, 2´ë1·Î °¡À§¹ÙÀ§º¸ ÁøÇà
 * ÄÚµå¸¦ ÃÖ´ëÇÑ °£°áÇÏ°Ô ÁÙÀÏ ¹æ¹ý »ý°¢ÇÒ °Í(¹Ýº¹¹® È°¿ë)
 */
import java.util.Scanner;

public class Game2 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String[] result = new String[] { "°¡À§", "¹ÙÀ§", "º¸" };

		while (true) {
			int user = 0;
			int com1 = 0;
			int com2 = 0;

			System.out.println("ÀÚ.. °ÔÀÓÀ» ½ÃÀÛÇÏÁö");
			System.out.print("ÇÃ·¹ÀÌ¾î ¼ö¸¦ ÀÔ·ÂÇÏ½Ã¿À >");
			user = scanner.nextInt();
			if (user == 1) {
				System.out.println("ÄÄÇ»ÅÍ¿Í 1´ë1 ½ÂºÎ¸¦ ¿øÇÏ´Â±º");
				System.out.println();
				while (true) {
					System.out.println("1: °¡À§ / 2: ¹ÙÀ§ / 3: º¸");
					user = scanner.nextInt() - 1;
					if (user > 2) {
						continue;
					}
					com1 = (int) (Math.random() * 3);
					if (user == com1) {
						System.out.println("user > " + result[user] + " |  com1 > " + result[com1]);
						System.out.println("¹«½ÂºÎ");
						break;
					} else if (user > com1 || (user == 0 && com1 == 2)) {
						System.out.println("user > " + result[user] + " |  com1 > " + result[com1]);
						System.out.println("ÀÌ°å±º");
						break;
					} else {
						System.out.println("user > " + result[user] + " |  com1 > " + result[com1]);
						System.out.println("Looser");
						break;
					}
				}

			} else if (user == 2) {
				System.out.println("µÎ ÄÄÇ»ÅÍ¸¦ »ó´ëÇÏ±â´Â ÈûµéÅÙµ¥");
				System.out.println();
				while (true) {
					System.out.println("1: °¡À§ / 2: ¹ÙÀ§ / 3: º¸");
					user = scanner.nextInt() - 1;
					if (user > 2) {
						continue;
					}
					com1 = (int) (Math.random() * 3);
					com2 = (int) (Math.random() * 3);
					if ((user == com1 && user == com2) || (user != com1 && user != com2 && com1 != com2)) {
						System.out.println(
								"user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > " + result[com2]);
						System.out.println("¹«½ÂºÎ");
						break;
					}

					// user ½Â¸®
					if (user == 0) {
						if (com1 == 2 && com2 == 2) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("user ½Â¸®!!");
						} else if (com1 == 0 && com2 == 2) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1/user ½Â¸®!!");
						} else if (com1 == 2 && com2 == 0) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com2/user ½Â¸®!!");
						} else {
							// com1 ½Â¸®
							if (com1 == 0) {
								if (com2 == 2 && user == 2) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1 ½Â¸®!!");
								} else if (com2 == 0 && user == 2) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/com2 ½Â¸®!!");
								} else if (com2 == 2 && user == 0) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/user ½Â¸®!!");
								} else {
									// com2 ½Â¸®
									if (com2 == 0) {
										if (com1 == 2 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 0 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 2 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 1) {
										if (com1 == 0 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 1 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 0 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 2) {
										if (com1 == 1 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 2 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 1 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									} // com2 ½Â¸®
								}
								break;
							} else if (com1 == 1) {
								if (com2 == 0 && user == 0) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1 ½Â¸®!!");
								} else if (com2 == 1 && user == 0) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/com2 ½Â¸®!!");
								} else if (com2 == 0 && user == 1) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/user ½Â¸®!!");
								} else {
									// com2 ½Â¸®
									if (com2 == 0) {
										if (com1 == 2 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 0 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 2 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 1) {
										if (com1 == 0 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 1 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 0 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 2) {
										if (com1 == 1 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 2 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 1 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									} // com2 ½Â¸®
								}
								break;
							} else if (com1 == 2) {
								if (com2 == 1 && user == 1) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1 ½Â¸®!!");
								} else if (com2 == 2 && user == 1) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/com2 ½Â¸®!!");
								} else if (com2 == 1 && user == 2) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/user ½Â¸®!!");
								} else {
									// com2 ½Â¸®
									if (com2 == 0) {
										if (com1 == 2 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 0 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 2 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 1) {
										if (com1 == 0 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 1 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 0 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 2) {
										if (com1 == 1 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 2 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 1 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									} // com2 ½Â¸®
								}
								break;
							} // com1 ½Â¸®
						}
						break;
					}
					if (user == 1) {
						if (com1 == 0 && com2 == 0) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("user ½Â¸®!!");
						} else if (com1 == 1 && com2 == 0) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1/user ½Â¸®!!");
						} else if (com1 == 0 && com2 == 1) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com2/user ½Â¸®!!");
						} else {
							// com1 ½Â¸®
							if (com1 == 0) {
								if (com2 == 2 && user == 2) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1 ½Â¸®!!");
								} else if (com2 == 0 && user == 2) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/com2 ½Â¸®!!");
								} else if (com2 == 2 && user == 0) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/user ½Â¸®!!");
								} else {
									// com2 ½Â¸®
									if (com2 == 0) {
										if (com1 == 2 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 0 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 2 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 1) {
										if (com1 == 0 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 1 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 0 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 2) {
										if (com1 == 1 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 2 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 1 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									} // com2 ½Â¸®
								}
								break;
							}
							if (com1 == 1) {
								if (com2 == 0 && user == 0) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1 ½Â¸®!!");
								} else if (com2 == 1 && user == 0) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/com2 ½Â¸®!!");
								} else if (com2 == 0 && user == 1) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/user ½Â¸®!!");
								} else {
									// com2 ½Â¸®
									if (com2 == 0) {
										if (com1 == 2 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 0 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 2 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 1) {
										if (com1 == 0 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 1 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 0 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 2) {
										if (com1 == 1 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 2 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 1 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									} // com2 ½Â¸®
								}
								break;
							}
							if (com1 == 2) {
								if (com2 == 1 && user == 1) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1 ½Â¸®!!");
								} else if (com2 == 2 && user == 1) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/com2 ½Â¸®!!");
								} else if (com2 == 1 && user == 2) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/user ½Â¸®!!");
								} else {
									// com2 ½Â¸®
									if (com2 == 0) {
										if (com1 == 2 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 0 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 2 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 1) {
										if (com1 == 0 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 1 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 0 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 2) {
										if (com1 == 1 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 2 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 1 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									} // com2 ½Â¸®
								}
								break;
							} // com1 ½Â¸®
						}
						break;
					}
					if (user == 2) {
						if (com1 == 1 && com2 == 1) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("user ½Â¸®!!");
						} else if (com1 == 2 && com2 == 1) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com1/user ½Â¸®!!");
						} else if (com1 == 1 && com2 == 2) {
							System.out.println("user > " + result[user] + " |  com1 > " + result[com1] + " |  com2 > "
									+ result[com2]);
							System.out.println("com2/user ½Â¸®!!");
						} else {
							// com1 ½Â¸®
							if (com1 == 0) {
								if (com2 == 2 && user == 2) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1 ½Â¸®!!");
								} else if (com2 == 0 && user == 2) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/com2 ½Â¸®!!");
								} else if (com2 == 2 && user == 0) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/user ½Â¸®!!");
								} else {
									// com2 ½Â¸®
									if (com2 == 0) {
										if (com1 == 2 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 0 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 2 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 1) {
										if (com1 == 0 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 1 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 0 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 2) {
										if (com1 == 1 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 2 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 1 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									} // com2 ½Â¸®
								}
								break;
							}
							if (com1 == 1) {
								if (com2 == 0 && user == 0) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1 ½Â¸®!!");
								} else if (com2 == 1 && user == 0) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/com2 ½Â¸®!!");
								} else if (com2 == 0 && user == 1) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/user ½Â¸®!!");
								} else {
									// com2 ½Â¸®
									if (com2 == 0) {
										if (com1 == 2 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 0 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 2 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 1) {
										if (com1 == 0 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 1 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 0 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 2) {
										if (com1 == 1 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 2 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 1 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									} // com2 ½Â¸®
								}
								break;
							}
							if (com1 == 2) {
								if (com2 == 1 && user == 1) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1 ½Â¸®!!");
								} else if (com2 == 2 && user == 1) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/com2 ½Â¸®!!");
								} else if (com2 == 1 && user == 2) {
									System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
											+ " |  com2 > " + result[com2]);
									System.out.println("com1/user ½Â¸®!!");
								} else {
									// com2 ½Â¸®
									if (com2 == 0) {
										if (com1 == 2 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 0 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 2 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 1) {
										if (com1 == 0 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 1 && user == 0) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 0 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									}
									if (com2 == 2) {
										if (com1 == 1 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2 ½Â¸®!!");
										} else if (com1 == 2 && user == 1) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com1/com2 ½Â¸®!!");
										} else if (com1 == 1 && user == 2) {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
											System.out.println("com2/user ½Â¸®!!");
										} else {
											System.out.println("user > " + result[user] + " |  com1 > " + result[com1]
													+ " |  com2 > " + result[com2]);
										}
										break;
									} // com2 ½Â¸®
								}
								break;
							} // com1 ½Â¸®
						}
						break;
					} // user ½Â¸®

				}

			} else if (user == 0) {
				System.out.println("Àß°¡°Ô");
				break;
			} else {
				System.out.println("0 : ±×¸¸ÇÏ±â / 1 : 1´ë1 / 2 : 2´ë1");
				continue;
			}
			System.out.println();
		}
		System.out.println("Program OFF");
	}
}
