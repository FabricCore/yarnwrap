package yarnwrap.block.enums;
public class Tilt { public net.minecraft.block.enums.Tilt wrapperContained; public Tilt(net.minecraft.block.enums.Tilt wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.block.enums.Tilt.name; }
// public static void name(java.lang.String value, ) { net.minecraft.block.enums.Tilt.name = value; }

// public boolean stable() { return wrapperContained.stable; }
// public void stable(boolean value) { wrapperContained.stable = value; }
// public static boolean stable() { return net.minecraft.block.enums.Tilt.stable; }
// public static void stable(boolean value, ) { net.minecraft.block.enums.Tilt.stable = value; }

// // public Tilt(java.lang.String name,int stable) { this.wrapperContained = new net.minecraft.block.enums.Tilt(name,stable); }
public boolean isStable() { return wrapperContained.isStable(); }
// public static boolean isStable() { return net.minecraft.block.enums.Tilt.isStable(); }

}