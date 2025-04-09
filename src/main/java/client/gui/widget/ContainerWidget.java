package yarnwrap.client.gui.widget;
public class ContainerWidget { public net.minecraft.client.gui.widget.ContainerWidget wrapperContained; public ContainerWidget(net.minecraft.client.gui.widget.ContainerWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.Element focusedElement() { return new yarnwrap.client.gui.Element(wrapperContained.focusedElement); }
// public boolean dragging() { return wrapperContained.dragging; }

}