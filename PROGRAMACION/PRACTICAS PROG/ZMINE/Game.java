public class Game {
	
	public static void main (String[] args) throws InterruptedException {
		
			//~ int mapy = (int)(Math.random()*40+1);
			//~ int mapx = (int)(Math.random()*40+1);
			
			int mapy = 3;
			int mapx = 2;
			
			int playery=0;
			int playerx=0;
			
			System.out.println("x: "+mapx);
			System.out.println("y: "+mapy);
			boolean mission = true;
			
				while(mission=true){
					if(mapx != playerx){
						if(mapx > playerx){
							playerx++;
						}
					}
					if(mapy != playery){
						if(mapy > playery){
							playery++;
						}
					}
					if(mapy == playery && mapx == playerx){
						mission=false;
					}
					Thread.sleep(500);
					System.out.println(playerx);
					System.out.println(playery);
				}
	}
}

