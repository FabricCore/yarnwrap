package yarnwrap.client.realms;
public class RealmsLabel { public net.minecraft.client.realms.RealmsLabel wrapperContained; public RealmsLabel(net.minecraft.client.realms.RealmsLabel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text text() { return new yarnwrap.text.Text(wrapperContained.text); }
// public void text(yarnwrap.text.Text value) { wrapperContained.text = value.wrapperContained; }
// public int x() { return wrapperContained.x; }
// public void x(int value) { wrapperContained.x = value; }
// public int y() { return wrapperContained.y; }
// public void y(int value) { wrapperContained.y = value; }
// public int color() { return wrapperContained.color; }
// public void color(int value) { wrapperContained.color = value; }
public yarnwrap.text.Text getText() { return new yarnwrap.text.Text(wrapperContained.getText()); }

}