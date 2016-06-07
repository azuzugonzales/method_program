package by.bsu.com.dumb;
class Dumb extends Object{
	{ this.id = 6; }
	int id;
	Dumb(){
		System.out.println("constructor classa Dumb ");
		id = this.getId();
		System.out.println(" id = " + id);
	}
	int getId(){
		System.out.println("getId() classa Dumb ");
		return id;
	}
}
class Dumber extends Dumb{
	int id = 9;
	Dumber() {
		System.out.println("constructor classa Dumber ");
		id = this.getId();
		System.out.println(" id = " + id);
	}
	@Override
	int getId(){
		System.out.println("getId() classa Dumber ");
		return id;
	}
}