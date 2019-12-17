package domain.main;

import java.util.List;
import java.util.Scanner;
import domain.user.Player;
import domain.user.Dealer;

public class Template {
	
	public static String nameRequest() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ӿ� ������ ����� �̸��� �Է��ϼ���. (��ǥ �������� �и��ϸ� " + Main.maxPlayerNumber() + "����� ���� �����մϴ�.)");
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
		System.out.println();
		for (Player player : players) {
			System.out.println(player.name()+ " : " + player.showCard() + " - " + player.showScore());
		}
		System.out.println();
		System.out.println("���� : " + dealer.showOneCard());
		System.out.println();
	}
	
	public static void finalResult(List<Player> players, Dealer dealer) {
		System.out.println();
		for (Player player : players) {
			System.out.println(player.name()+ " : " + player.showCard() + " - ��� : " + Integer.toString(player.showScore()));
		}
		System.out.println();
		System.out.println("���� : " + dealer.showCard() + " - ��� : " + Integer.toString(dealer.showScore()));
		System.out.println("\n");
	}
	
	public static void dealerOneMoreCard() {
		System.out.println("������ " + Main.dealerMoreCardOrNotNumber() + " ���϶� ������ ī�带 �� �޾ҽ��ϴ�.\n");
	}
}
