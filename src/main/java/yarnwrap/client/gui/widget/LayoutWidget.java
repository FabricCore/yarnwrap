package yarnwrap.client.gui.widget;
public class LayoutWidget { public net.minecraft.client.gui.widget.LayoutWidget wrapperContained; public LayoutWidget(net.minecraft.client.gui.widget.LayoutWidget wrapperContained) { this.wrapperContained = wrapperContained; }

public void refreshPositions() { wrapperContained.refreshPositions(); }
public void forEachElement(java.util.function.Consumer consumer) { wrapperContained.forEachElement(consumer); }
// public void method_49004(yarnwrap.client.gui.widget.Widget element) { wrapperContained.method_49004(element.wrapperContained); }
// public void method_49005(java.util.function.Consumer element) { wrapperContained.method_49005(element); }

}