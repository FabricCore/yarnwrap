package yarnwrap.util;
public class ClickType { public net.minecraft.util.ClickType wrapperContained; public ClickType(net.minecraft.util.ClickType wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.ClickType LEFT() { return new yarnwrap.util.ClickType(wrapperContained.LEFT); }
public yarnwrap.util.ClickType RIGHT() { return new yarnwrap.util.ClickType(wrapperContained.RIGHT); }

}