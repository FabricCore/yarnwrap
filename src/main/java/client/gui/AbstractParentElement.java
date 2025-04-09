package yarnwrap.client.gui;
public class AbstractParentElement { public net.minecraft.client.gui.AbstractParentElement wrapperContained; public AbstractParentElement(net.minecraft.client.gui.AbstractParentElement wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.Element focused() { return new yarnwrap.client.gui.Element(wrapperContained.focused); }
// public boolean dragging() { return wrapperContained.dragging; }

}