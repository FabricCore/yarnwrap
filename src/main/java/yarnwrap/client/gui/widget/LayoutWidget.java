package yarnwrap.client.gui.widget;
public class LayoutWidget { public net.minecraft.client.gui.widget.LayoutWidget wrapperContained; public LayoutWidget(net.minecraft.client.gui.widget.LayoutWidget wrapperContained) { this.wrapperContained = wrapperContained; }

public void refreshPositions() { wrapperContained.refreshPositions(); }
public void forEachElement(java.util.function.Consumer consumer) { wrapperContained.forEachElement(consumer); }

}