package yarnwrap.client.gui;
public class AbstractParentElement { public net.minecraft.client.gui.AbstractParentElement wrapperContained; public AbstractParentElement(net.minecraft.client.gui.AbstractParentElement wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.Element focused() { return new yarnwrap.client.gui.Element(wrapperContained.focused); }
// public void focused(yarnwrap.client.gui.Element value) { wrapperContained.focused = value.wrapperContained; }
// public static yarnwrap.client.gui.Element focused() { return new yarnwrap.client.gui.Element(net.minecraft.client.gui.AbstractParentElement.focused); }
// public static void focused(yarnwrap.client.gui.Element value, ) { net.minecraft.client.gui.AbstractParentElement.focused = value.wrapperContained; }

// public boolean dragging() { return wrapperContained.dragging; }
// public void dragging(boolean value) { wrapperContained.dragging = value; }
// public static boolean dragging() { return net.minecraft.client.gui.AbstractParentElement.dragging; }
// public static void dragging(boolean value, ) { net.minecraft.client.gui.AbstractParentElement.dragging = value; }


}