package yarnwrap.client.gui.widget;
public class NarratedMultilineTextWidget { public net.minecraft.client.gui.widget.NarratedMultilineTextWidget wrapperContained; public NarratedMultilineTextWidget(net.minecraft.client.gui.widget.NarratedMultilineTextWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_MARGIN() { return wrapperContained.DEFAULT_MARGIN; }
// public boolean alwaysShowBorders() { return wrapperContained.alwaysShowBorders; }
// public int margin() { return wrapperContained.margin; }
public void initMaxWidth(int baseWidth) { wrapperContained.initMaxWidth(baseWidth); }

}