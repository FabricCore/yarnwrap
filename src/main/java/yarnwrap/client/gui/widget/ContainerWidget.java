package yarnwrap.client.gui.widget;
public class ContainerWidget { public net.minecraft.client.gui.widget.ContainerWidget wrapperContained; public ContainerWidget(net.minecraft.client.gui.widget.ContainerWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.Element focusedElement() { return new yarnwrap.client.gui.Element(wrapperContained.focusedElement); }
// public void focusedElement(yarnwrap.client.gui.Element value) { wrapperContained.focusedElement = value.wrapperContained; }
// public static yarnwrap.client.gui.Element focusedElement() { return new yarnwrap.client.gui.Element(net.minecraft.client.gui.widget.ContainerWidget.focusedElement); }
// public static void focusedElement(yarnwrap.client.gui.Element value, ) { net.minecraft.client.gui.widget.ContainerWidget.focusedElement = value.wrapperContained; }

// public boolean dragging() { return wrapperContained.dragging; }
// public void dragging(boolean value) { wrapperContained.dragging = value; }
// public static boolean dragging() { return net.minecraft.client.gui.widget.ContainerWidget.dragging; }
// public static void dragging(boolean value, ) { net.minecraft.client.gui.widget.ContainerWidget.dragging = value; }


}