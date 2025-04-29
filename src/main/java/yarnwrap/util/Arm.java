package yarnwrap.util;
public class Arm { public net.minecraft.util.Arm wrapperContained; public Arm(net.minecraft.util.Arm wrapperContained) { this.wrapperContained = wrapperContained; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public static int id() { return net.minecraft.util.Arm.id; }
// public static void id(int value, ) { net.minecraft.util.Arm.id = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.Arm.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.Arm.CODEC = value; }

// public java.lang.String translationKey() { return wrapperContained.translationKey; }
// public void translationKey(java.lang.String value) { wrapperContained.translationKey = value; }
// public static java.lang.String translationKey() { return net.minecraft.util.Arm.translationKey; }
// public static void translationKey(java.lang.String value, ) { net.minecraft.util.Arm.translationKey = value; }

// public java.util.function.IntFunction BY_ID() { return wrapperContained.BY_ID; }
// public void BY_ID(java.util.function.IntFunction value) { wrapperContained.BY_ID = value; }
public static java.util.function.IntFunction BY_ID() { return net.minecraft.util.Arm.BY_ID; }
// public static void BY_ID(java.util.function.IntFunction value, ) { net.minecraft.util.Arm.BY_ID = value; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.util.Arm.name; }
// public static void name(java.lang.String value, ) { net.minecraft.util.Arm.name = value; }

// // public Arm(java.lang.String id,int name,int translationKey) { this.wrapperContained = new net.minecraft.util.Arm(id,name,translationKey); }
public yarnwrap.util.Arm getOpposite() { return new yarnwrap.util.Arm(wrapperContained.getOpposite()); }
// public static yarnwrap.util.Arm getOpposite() { return new yarnwrap.util.Arm(net.minecraft.util.Arm.getOpposite()); }

}