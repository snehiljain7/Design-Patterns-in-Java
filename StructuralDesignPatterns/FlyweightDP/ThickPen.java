package DesignPatterns.StructuralDesignPatterns.FlyweightDP;

public class ThickPen implements Pen {

	final BrushSize brushSize = BrushSize.THICK;		//intrinsic state - shareable
	private String color = null;						//extrinsic state - shared by client
	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color = color;

	}

	@Override
	public void draw(String content) {
		// TODO Auto-generated method stub
		System.out.println("Drawing with Thick pen in color: " + content);

	}

}
