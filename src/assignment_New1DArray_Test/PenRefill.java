package assignment_New1DArray_Test;

class Nib
{
	private String materialtype;
	private int width;
	
	public void setMaterialType(String materialtype)
	{
		this.materialtype=materialtype;
	}
	public void setWidth(int width)
	{
		this.width=width;
	}
	public String getMaterialType()
	{
		return materialtype;
	}
	public int getWidth()
	{
		return width=width;
	}
}

class Refill
{
	private String inkcolor;
	private int length;
	private Nib tip;
	
	public void setInkcolor(String inkcolor)
	{
		this.inkcolor=inkcolor;
	}
	public void setLength(int length)
	{
		this.length=length;
	}
	public void setNib(Nib tip)
	{
		this.tip=tip;
	}
	public String getInkcolor()
	{
		return inkcolor;
	}
	public int getLength()
	{
		return length;
	}
	public Nib getNib()
	{
		return tip;
	}
}

class Pen
{
	private int caplength;
	private String brand;
	private Refill r;
	
	public void setCapLength(int caplength)
	{
		this.caplength=caplength;
	}
	public void setBrand(String brand)
	{
		this.brand=brand;
	}
	public void setRefill(Refill r)
	{
		this.r=r;
	}
	public int getCapLength()
	{
		return caplength;
	}
	public String getBrand()
	{
		return brand;
	}
	public Refill getRefill()
	{
		return r;
	}
}

public class PenRefill {

	public static void main(String[] args) {
		Pen p=new Pen();
		p.setCapLength(5);
		p.setBrand("Parker");
		p.setRefill(new Refill());
		p.getRefill().setInkcolor("Black");
		p.getRefill().setLength(6);
		p.getRefill().setNib(new Nib());
		p.getRefill().getNib().setMaterialType("Stainless steel");
		p.getRefill().getNib().setWidth(2);
		
		System.out.println(p.getCapLength()+" "+p.getBrand()+" "+p.getRefill().getInkcolor()+
				" "+p.getRefill().getLength()+" "+p.getRefill().getNib().getMaterialType()+
				" "+p.getRefill().getNib().getWidth());
		
	}

}
