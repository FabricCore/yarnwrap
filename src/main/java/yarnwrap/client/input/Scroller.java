package yarnwrap.client.input;
public class Scroller { public net.minecraft.client.input.Scroller wrapperContained; public Scroller(net.minecraft.client.input.Scroller wrapperContained) { this.wrapperContained = wrapperContained; }

// public double cumulHorizontal() { return wrapperContained.cumulHorizontal; }
// public void cumulHorizontal(double value) { wrapperContained.cumulHorizontal = value; }
// public static double cumulHorizontal() { return net.minecraft.client.input.Scroller.cumulHorizontal; }
// public static void cumulHorizontal(double value, ) { net.minecraft.client.input.Scroller.cumulHorizontal = value; }

// public double cumulVertical() { return wrapperContained.cumulVertical; }
// public void cumulVertical(double value) { wrapperContained.cumulVertical = value; }
// public static double cumulVertical() { return net.minecraft.client.input.Scroller.cumulVertical; }
// public static void cumulVertical(double value, ) { net.minecraft.client.input.Scroller.cumulVertical = value; }

public org.joml.Vector2i update(double horizontal,double vertical) { return wrapperContained.update(horizontal,vertical); }
// public static org.joml.Vector2i update(double horizontal,double vertical, ) { return net.minecraft.client.input.Scroller.update(horizontal,vertical); }
// public int scrollCycling(double amount,int selectedIndex,int total) { return wrapperContained.scrollCycling(amount,selectedIndex,total); }
// public static int scrollCycling(double amount,int selectedIndex,int total, ) { return net.minecraft.client.input.Scroller.scrollCycling(amount,selectedIndex,total); }

}