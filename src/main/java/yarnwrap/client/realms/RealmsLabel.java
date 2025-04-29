package yarnwrap.client.realms;
public class RealmsLabel { public net.minecraft.client.realms.RealmsLabel wrapperContained; public RealmsLabel(net.minecraft.client.realms.RealmsLabel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text text() { return new yarnwrap.text.Text(wrapperContained.text); }
// public void text(yarnwrap.text.Text value) { wrapperContained.text = value.wrapperContained; }
// public static yarnwrap.text.Text text() { return new yarnwrap.text.Text(net.minecraft.client.realms.RealmsLabel.text); }
// public static void text(yarnwrap.text.Text value, ) { net.minecraft.client.realms.RealmsLabel.text = value.wrapperContained; }

// public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
// public static int x() { return net.minecraft.client.realms.RealmsLabel.x; }
// public static void x(int value, ) { net.minecraft.client.realms.RealmsLabel.x = value; }

// public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
// public static int y() { return net.minecraft.client.realms.RealmsLabel.y; }
// public static void y(int value, ) { net.minecraft.client.realms.RealmsLabel.y = value; }

// public int color() { return wrapperContained.color; }
// public void color(int value) { wrapperContained.color = value; }
// public static int color() { return net.minecraft.client.realms.RealmsLabel.color; }
// public static void color(int value, ) { net.minecraft.client.realms.RealmsLabel.color = value; }

public RealmsLabel(yarnwrap.text.Text text,int x,int y,int color) { this.wrapperContained = new net.minecraft.client.realms.RealmsLabel(text.wrapperContained,x,y,color); }
public yarnwrap.text.Text getText() { return new yarnwrap.text.Text(wrapperContained.getText()); }
// public static yarnwrap.text.Text getText() { return new yarnwrap.text.Text(net.minecraft.client.realms.RealmsLabel.getText()); }

}