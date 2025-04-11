package yarnwrap.client.gui;
public class Selectable { public net.minecraft.client.gui.Selectable wrapperContained; public Selectable(net.minecraft.client.gui.Selectable wrapperContained) { this.wrapperContained = wrapperContained; }

public Object getType() { return wrapperContained.getType(); }
public boolean isNarratable() { return wrapperContained.isNarratable(); }

}