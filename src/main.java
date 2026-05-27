import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> tasks = new ArrayList<>();
		
		while(true) {
			
			System.out.println("==== TODOアプリ ====");
			System.out.println("1: タスク追加");
			System.out.println("2: 一覧表示");
			System.out.println("3: タスク削除");
			System.out.println("4: 終了");
			System.out.println("番号を入力してください: ");
			
			int choice = scanner.nextInt();
			
			if (choice == 1) {
				System.out.println("タスク名を追加してください: ");
				String task = scanner.next();
				tasks.add(task);
				
				System.out.println("追加しました");
				
			} else if (choice == 2) {
				for (String task : tasks) {
					System.out.println(task);
				}
			
			} else if(choice == 3) {
				for (int i = 0; i < tasks.size(); i++) {
					System.out.println(i + " : " + tasks.get(i));
				}
				
				System.out.println("削除する番号を入力してください: ");
				int deleteIndex = scanner.nextInt();
				
				tasks.remove(deleteIndex);
				
				System.out.println("削除しました");
				
			} else if (choice == 4) {
				System.out.println("終了します");
			
				break;
			
			} else {
				System.out.println("1～3を入力してください");
			}
		}
		
		scanner.close();
	}
}
