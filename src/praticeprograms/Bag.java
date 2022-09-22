package praticeprograms;

class Pen
{
	private int pprice;
	private String bcolor;
	private String bname;
	
	public void setPrice(int pprice)
	{
		this.pprice=pprice;
	}
	public void setColor(String bcolor)
	{
		this.bcolor=bcolor;
	}
	public void setName(String bname)
	{
		this.bname=bname;
	}
	public int getPrice()
	{
		return pprice;
	}
	public String getColor()
	{
		return bcolor;
	}
	public String getName()
	{
		return bname;
	}
	
}


public class Bag {

	private String brand_name;
	private int bprice;
	private Pen p;
	
	public void setBrandName(String brand_name)
	{
		this.brand_name=brand_name;
	}
	public void setPrice(int bprice)
	{
		this.bprice=bprice;
	}
	public void setPen(Pen p)
	{
		this.p=p;
	}
	public String getBrandName()
	{
		return brand_name;
	}
	public int getPrice()
	{
		return bprice;
	}
	public Pen getPen()
	{
		return p;
	}
	
	public static void main(String[] args) {
		Bag b=new Bag();
		b.setBrandName("Mychoice");
		b.setPrice(450);
		b.setPen(new Pen());
		
		b.getPen().setPrice(20);
		b.getPen().setName("Reynold");
		b.getPen().setColor("Black");

//		Pen p=b.getPen();
//		p.setPrice(25);
//		p.setColor("Blue");
//		p.setName("Reynold");
		
		System.out.println(b.getBrandName()+" "+b.getPrice()+" "+b.getPen().getPrice()+" "+b.getPen().getColor()+" "+b.getPen().getName());
		

	}

}
