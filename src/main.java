import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Task> tasks = new ArrayList<>();
		
		while(true) {
			
			System.out.println("==== TODOアプリ ====");
			System.out.println("1: タスク追加");
			System.out.println("2: 一覧表示");
			System.out.println("3: タスク削除");
			System.out.println("4: タスク更新");
			System.out.println("5: タスク完了");
			System.out.println("6: 終了");
			System.out.println("番号を入力してください: ");
			
			int choice = scanner.nextInt();
			
			if (choice == 1) {
				System.out.println("タスク名を追加してください: ");
				String task = scanner.next();
				tasks.add(new Task(task));
				
				System.out.println("追加しました");
				
			} else if (choice == 2) {
				if (tasks.isEmpty()) {
					System.out.println("タスクがありません");				
			} else {
				for (int i = 0; i < tasks.size(); i++) {
					System.out.println(
						i + " : "
						+ tasks.get(i).name
						+ " [" + tasks.get(i).status + "]"
					);
				}
			}
				
			} else if(choice == 3) {
				for (int i = 0; i < tasks.size(); i++) {
					System.out.println(i + " : " + tasks.get(i));
				}
				
				System.out.println("削除する番号を入力してください: ");
				int deleteIndex = scanner.nextInt();
				
				if (deleteIndex >= 0 && deleteIndex < tasks.size()) {
					tasks.remove(deleteIndex);
					System.out.println("削除しました");
				} else {
					System.out.println("その番号は存在しません");
				}
				
			} else if (choice == 4) {
				
				if (tasks.isEmpty()) {
					System.out.println("タスクがありません");
				} else {
					
					for (int i = 0; i < tasks.size(); i++) {
						System.out.println(
							i + " : "
							+ tasks.get(i).name
							+ " [" + tasks.get(i).status + "]"
						);
					}
					
					System.out.println("更新する番号を入力してください");
					int updateIndex = scanner.nextInt();
					
					if (updateIndex >= 0 && updateIndex < tasks.size()) {
						
						System.out.println("新しいタスク名を入力してください: ");
						String newTask = scanner.next();
						
						tasks.set(updateIndex, new Task(newTask));
						
						System.out.println("更新しました");
						
					} else {
						System.out.println("その番号は存在しません");
					}
			}

			} else if (choice == 5) {
				
				if (tasks.isEmpty()) {
					System.out.println("タスクがありません");
				} else {
					
					for (int i = 0; i < tasks.size(); i++) {
						System.out.println(
							i + " : "
							+ tasks.get(i).name
							+ " [" + tasks.get(i).status + "]"
						);
					}
					
					System.out.print("完了する番号を入力してください: ");
					int completeIndex = scanner.nextInt();
					
					if (completeIndex >= 0 && completeIndex < tasks.size()) {
						
						tasks.get(completeIndex).status = "完了";
						
						System.out.println("完了にしました");
						
					} else {
						System.out.println("その番号は存在しません");
					}
				}
				
			} else if (choice == 6) {
				System.out.println("終了します");
			
				break;
			
			} else {
				System.out.println("1～3を入力してください");
			}
		}
		
		scanner.close();
	}
}