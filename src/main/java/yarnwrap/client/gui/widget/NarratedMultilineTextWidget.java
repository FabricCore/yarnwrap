package yarnwrap.client.gui.widget;
public class NarratedMultilineTextWidget { public net.minecraft.client.gui.widget.NarratedMultilineTextWidget wrapperContained; public NarratedMultilineTextWidget(net.minecraft.client.gui.widget.NarratedMultilineTextWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_MARGIN() { return wrapperContained.DEFAULT_MARGIN; }
// public void DEFAULT_MARGIN(int value) { wrapperContained.DEFAULT_MARGIN = value; }
// public boolean alwaysShowBorders() { return wrapperContained.alwaysShowBorders; }
// public void alwaysShowBorders(boolean value) { wrapperContained.alwaysShowBorders = value; }
// public int margin() { return wrapperContained.margin; }
// public void margin(int value) { wrapperContained.margin = value; }
public void initMaxWidth(int baseWidth) { wrapperContained.initMaxWidth(baseWidth); }

}