package chap08.exercise;

public class Chap08Ex04_DaoExample {
	public static void dbWork(Chap08Ex04_DataAccessObject dao) {
		dao.selet();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		dbWork(new Chap08Ex04_OracleDao());
		dbWork(new Chap08Ex04_MySqlDao());
		
		System.out.println("---------------------");
		
		dbWork(new Chap08Ex04_Dao("Oracle"));
		dbWork(new Chap08Ex04_Dao("MySql"));
	}
}
