package yarnwrap.util;
public class Nameable { public net.minecraft.util.Nameable wrapperContained; public Nameable(net.minecraft.util.Nameable wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(wrapperContained.getDisplayName()); }
// public static yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(net.minecraft.util.Nameable.getDisplayName()); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
// public static yarnwrap.text.Text getName() { return new yarnwrap.text.Text(net.minecraft.util.Nameable.getName()); }
public yarnwrap.text.Text getCustomName() { return new yarnwrap.text.Text(wrapperContained.getCustomName()); }
// public static yarnwrap.text.Text getCustomName() { return new yarnwrap.text.Text(net.minecraft.util.Nameable.getCustomName()); }
public boolean hasCustomName() { return wrapperContained.hasCustomName(); }
// public static boolean hasCustomName() { return net.minecraft.util.Nameable.hasCustomName(); }

}