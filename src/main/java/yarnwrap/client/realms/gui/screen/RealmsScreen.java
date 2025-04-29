package yarnwrap.client.realms.gui.screen;
public class RealmsScreen { public net.minecraft.client.realms.gui.screen.RealmsScreen wrapperContained; public RealmsScreen(net.minecraft.client.realms.gui.screen.RealmsScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public long MAX_FILE_SIZE() { return wrapperContained.MAX_FILE_SIZE; }
// public void MAX_FILE_SIZE(long value) { wrapperContained.MAX_FILE_SIZE = value; }
// public static long MAX_FILE_SIZE() { return net.minecraft.client.realms.gui.screen.RealmsScreen.MAX_FILE_SIZE; }
// public static void MAX_FILE_SIZE(long value, ) { net.minecraft.client.realms.gui.screen.RealmsScreen.MAX_FILE_SIZE = value; }

// public java.util.List labels() { return wrapperContained.labels; }
// public void labels(java.util.List value) { wrapperContained.labels = value; }
// public static java.util.List labels() { return net.minecraft.client.realms.gui.screen.RealmsScreen.labels; }
// public static void labels(java.util.List value, ) { net.minecraft.client.realms.gui.screen.RealmsScreen.labels = value; }

// public int row(int index) { return wrapperContained.row(index); }
// public static int row(int index, ) { return net.minecraft.client.realms.gui.screen.RealmsScreen.row(index); }
public yarnwrap.text.Text narrateLabels() { return new yarnwrap.text.Text(wrapperContained.narrateLabels()); }
// public static yarnwrap.text.Text narrateLabels() { return new yarnwrap.text.Text(net.minecraft.client.realms.gui.screen.RealmsScreen.narrateLabels()); }
// public yarnwrap.client.realms.RealmsLabel addLabel(yarnwrap.client.realms.RealmsLabel label) { return new yarnwrap.client.realms.RealmsLabel(wrapperContained.addLabel(label.wrapperContained)); }
// public static yarnwrap.client.realms.RealmsLabel addLabel(yarnwrap.client.realms.RealmsLabel label, ) { return new yarnwrap.client.realms.RealmsLabel(net.minecraft.client.realms.gui.screen.RealmsScreen.addLabel(label.wrapperContained)); }

}