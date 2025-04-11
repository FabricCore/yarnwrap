package yarnwrap.client.gui.screen;
public class LoadingDisplay { public net.minecraft.client.gui.screen.LoadingDisplay wrapperContained; public LoadingDisplay(net.minecraft.client.gui.screen.LoadingDisplay wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String[] TEXTS() { return wrapperContained.TEXTS; }
// public void TEXTS(java.lang.String[] value) { wrapperContained.TEXTS = value; }
// public long INTERVAL() { return wrapperContained.INTERVAL; }
// public void INTERVAL(long value) { wrapperContained.INTERVAL = value; }
public java.lang.String get(long tick) { return wrapperContained.get(tick); }

}