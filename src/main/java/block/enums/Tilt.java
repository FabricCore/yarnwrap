package yarnwrap.block.enums;
public class Tilt { public net.minecraft.block.enums.Tilt wrapperContained; public Tilt(net.minecraft.block.enums.Tilt wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public boolean stable() { return wrapperContained.stable; }
public boolean isStable() { return wrapperContained.isStable(); }

}