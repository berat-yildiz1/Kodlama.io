import Bussiness.Abstract.GameProcess;
import Bussiness.Abstract.Sales;
import Bussiness.Conretes.GameProcessManager;
import Bussiness.Conretes.SalesManager;
import DataAccess.Concretes.MySQLGame;
import DataAccess.Concretes.OracleGame;
import DataAccess.Concretes.OraclePlayer;
import DataAccess.Concretes.OraclePlayerAccount;
import Entities.Concretes.Campaign;
import Entities.Concretes.Games;
import Entities.Concretes.Players;

public class Main {

	public static void main(String[] args) {
		
		Players players1 = new Players(1,"113190","Berat","Yýldýz",25);
		Games games1 = new Games(3,"Sims","Similasyon",100,22);
		Campaign campaign1=new Campaign("Valentine's Day",0.1);
		
		Sales sales = new SalesManager(new OraclePlayerAccount());
		
		sales.salling(games1, players1,campaign1);
		
		
		
		
		GameProcess gameProcess = new GameProcessManager(new MySQLGame());
		
		gameProcess.add(games1);
		
	}

}
