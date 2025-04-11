package yarnwrap.client.realms.gui.screen;
public class RealmsScreen { public net.minecraft.client.realms.gui.screen.RealmsScreen wrapperContained; public RealmsScreen(net.minecraft.client.realms.gui.screen.RealmsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public long MAX_FILE_SIZE() { return wrapperContained.MAX_FILE_SIZE; }
// public void MAX_FILE_SIZE(long value) { wrapperContained.MAX_FILE_SIZE = value; }
// public java.util.List labels() { return wrapperContained.labels; }
// public void labels(java.util.List value) { wrapperContained.labels = value; }
// public int row(int index) { return wrapperContained.row(index); }
public yarnwrap.text.Text narrateLabels() { return new yarnwrap.text.Text(wrapperContained.narrateLabels()); }
// public yarnwrap.client.realms.RealmsLabel addLabel(yarnwrap.client.realms.RealmsLabel label) { return new yarnwrap.client.realms.RealmsLabel(wrapperContained.addLabel(label.wrapperContained)); }

}