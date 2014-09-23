// Write a program to generate and print all full houses and print their number.

public class _03_FullHouse {

	public static void main(String[] args) {
		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
				"J", "Q", "K" };
		String[] suites = { "♣", "♦", "♥", "♠" };
		int mem = 0;

		for (int i = 0; i < faces.length; i++) {
			for (int j = 0; j < faces.length; j++) {
				for (int j2 = 0; j2 < suites.length; j2++) {
					for (int k = j2 + 1; k < suites.length; k++) {
						for (int k2 = k + 1; k2 < suites.length; k2++) {
							for (int l = 0; l < suites.length; l++) {
								for (int l2 = l + 1; l2 < suites.length; l2++) {
									if (i != j) {

										System.out
												.printf("(%s%s %s%s %s%s %s%s %s%s)",
														faces[i], suites[j2],
														faces[i], suites[k],
														faces[i], suites[k2],
														faces[j], suites[l],
														faces[j], suites[l2]);
										System.out.println();
										mem++;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println();
		System.out.println(mem);
	}

}
