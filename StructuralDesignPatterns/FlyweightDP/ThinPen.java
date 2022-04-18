package DesignPatterns.StructuralDesignPatterns.FlyweightDP;

public class ThinPen implements Pen {

	final BrushSize brushSize = BrushSize.THIN;		//intrinsic state - shareable
	private String color = null;						//extrinsic state - shared by client
	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;

	}

	@Override
	public void draw(String content) {
		// TODO Auto-generated method stub
		System.out.println("Drawing with Thin pen in color: " + content);

	}

}
