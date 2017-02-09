package cn.true123.lambda;

public class TestRunnable {
	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println("I am runnable!");
		};

		new Thread(runnable).run();
	}

}
