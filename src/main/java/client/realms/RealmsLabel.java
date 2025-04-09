package yarnwrap.client.realms;
public class RealmsLabel { public net.minecraft.client.realms.RealmsLabel wrapperContained; public RealmsLabel(net.minecraft.client.realms.RealmsLabel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text text() { return new yarnwrap.text.Text(wrapperContained.text); }
// public int x() { return wrapperContained.x; }
// public int y() { return wrapperContained.y; }
// public int color() { return wrapperContained.color; }
public yarnwrap.text.Text getText() { return new yarnwrap.text.Text(wrapperContained.getText()); }

}