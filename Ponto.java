package Q3;

public class Ponto {

	private int x;
	private int y;
	public Ponto(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == null){
			return false;
		}
		if (obj instanceof Ponto){
			Ponto a = (Ponto) obj;
			if(a.getX() == this.x && a.getY() == this.y){
				return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
			
	}
	@Override
	public String toString() {
		return "Ponto [x=" + x + ", y=" + y + "]";
	}

}
