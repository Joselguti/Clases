package Exercise1;

public class ejercitando {
	
		public static void main(String[] args) {
			int stake = Integer.parseInt(args[0]);
			int goal = Integer.parseInt(args[1]);
			int trials = Integer.parseInt(args[2]);
		
		
		int wins = 0;
		int looses = 0;
		
	for(int i=0; i<trials;i++) {
		int cash = stake;
		while(cash > 0 && cash < goal) {
			if(Math.random() < 0.5) {
				cash++;
			}else {
				cash--;
			}if (cash == goal) {
				wins = wins + 1;
			}if (cash == 0) {
				looses = looses +1;	
			}
		}
	}
	}
		}


