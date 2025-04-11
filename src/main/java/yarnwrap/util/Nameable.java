package yarnwrap.util;
public class Nameable { public net.minecraft.util.Nameable wrapperContained; public Nameable(net.minecraft.util.Nameable wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean hasCustomName() { return wrapperContained.hasCustomName(); }
public yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(wrapperContained.getDisplayName()); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
public yarnwrap.text.Text getCustomName() { return new yarnwrap.text.Text(wrapperContained.getCustomName()); }

}