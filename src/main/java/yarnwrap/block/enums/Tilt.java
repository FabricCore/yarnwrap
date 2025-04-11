package yarnwrap.block.enums;
public class Tilt { public net.minecraft.block.enums.Tilt wrapperContained; public Tilt(net.minecraft.block.enums.Tilt wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public boolean stable() { return wrapperContained.stable; }
// public void stable(boolean value) { wrapperContained.stable = value; }
public boolean isStable() { return wrapperContained.isStable(); }

}