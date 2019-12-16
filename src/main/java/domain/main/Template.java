package domain.main;

import java.util.List;
import java.util.Scanner;
import domain.user.Player;
import domain.card.Symbol;
import domain.user.Dealer;

public class Template {
	
	public static String nameRequest() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ӿ� ������ ����� �̸��� �Է��ϼ���. (��ǥ �������� �и��ϸ� 8����� ���� �����մϴ�.)");
		String inputName = scanner.nextLine();
		return inputName;
	}
	
	public static String bettingMoneyRequest(String name) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(name + "�� ���� �ݾ���?");
		String bettingMoney = scanner.nextLine();
		return bettingMoney;
	}
	
	public static String oneMoreCardRequest(Player player) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(player.name() + "��(��) ������ ī�带 �� �ްڽ��ϱ�? (���� y, �ƴϿ��� n)");
		String answer = scanner.nextLine();
		return answer;
	}
	
	public static void interimResult(List<Player> players, Dealer dealer) {
		for (Player player : players) {
			System.out.println(player.name()+ " : " + player.showCard());
		}
		System.out.println("���� : " + dealer.showOneCard());
		System.out.println();
	}
	
	public static void finalResult(List<Player> players, Dealer dealer) {
		for (Player player : players) {
			System.out.println(player.name()+ " : " + player.showCard() + " - ��� : " + Integer.toString(player.showScore()));
		}
		System.out.println("���� : " + dealer.showCard() + " - ��� : " + Integer.toString(dealer.showScore()));
		System.out.println();
	}
	
	public static void dealerOneMoreCard() {
		System.out.println("������ 16 ���϶� ������ ī�带 �� �޾ҽ��ϴ�.\n");
	}
}
