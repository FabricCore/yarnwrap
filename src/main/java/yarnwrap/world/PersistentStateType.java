package yarnwrap.world;
public class PersistentStateType { public net.minecraft.world.PersistentStateType wrapperContained; public PersistentStateType(net.minecraft.world.PersistentStateType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.world.PersistentStateType.id; }
// public static void id(java.lang.String value, ) { net.minecraft.world.PersistentStateType.id = value; }

// public java.util.function.Function constructor() { return wrapperContained.constructor; }
// public void constructor(java.util.function.Function value) { wrapperContained.constructor = value; }
// public static java.util.function.Function constructor() { return net.minecraft.world.PersistentStateType.constructor; }
// public static void constructor(java.util.function.Function value, ) { net.minecraft.world.PersistentStateType.constructor = value; }

// public java.util.function.Function codec() { return wrapperContained.codec; }
// public void codec(java.util.function.Function value) { wrapperContained.codec = value; }
// public static java.util.function.Function codec() { return net.minecraft.world.PersistentStateType.codec; }
// public static void codec(java.util.function.Function value, ) { net.minecraft.world.PersistentStateType.codec = value; }

// public yarnwrap.datafixer.DataFixTypes dataFixType() { return new yarnwrap.datafixer.DataFixTypes(wrapperContained.dataFixType); }
// public void dataFixType(yarnwrap.datafixer.DataFixTypes value) { wrapperContained.dataFixType = value.wrapperContained; }
// public static yarnwrap.datafixer.DataFixTypes dataFixType() { return new yarnwrap.datafixer.DataFixTypes(net.minecraft.world.PersistentStateType.dataFixType); }
// public static void dataFixType(yarnwrap.datafixer.DataFixTypes value, ) { net.minecraft.world.PersistentStateType.dataFixType = value.wrapperContained; }

public PersistentStateType(java.lang.String id,java.util.function.Supplier constructor,com.mojang.serialization.Codec codec,yarnwrap.datafixer.DataFixTypes dataFixType) { this.wrapperContained = new net.minecraft.world.PersistentStateType(id,constructor,codec,dataFixType.wrapperContained); }
// public java.lang.String id() { return wrapperContained.id(); }
// // public static java.lang.String id() { return net.minecraft.world.PersistentStateType.id(); }
// public java.util.function.Function constructor() { return wrapperContained.constructor(); }
// // public static java.util.function.Function constructor() { return net.minecraft.world.PersistentStateType.constructor(); }
// public java.util.function.Function codec() { return wrapperContained.codec(); }
// // public static java.util.function.Function codec() { return net.minecraft.world.PersistentStateType.codec(); }
// public yarnwrap.datafixer.DataFixTypes dataFixType() { return new yarnwrap.datafixer.DataFixTypes(wrapperContained.dataFixType()); }
// // public static yarnwrap.datafixer.DataFixTypes dataFixType() { return new yarnwrap.datafixer.DataFixTypes(net.minecraft.world.PersistentStateType.dataFixType()); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.world.PersistentStateType.equals(o); }
// public com.mojang.serialization.Codec method_67418(com.mojang.serialization.Codec context) { return wrapperContained.method_67418(context); }
// public static com.mojang.serialization.Codec method_67418(com.mojang.serialization.Codec context, ) { return net.minecraft.world.PersistentStateType.method_67418(context); }
// public yarnwrap.world.PersistentState method_67419(java.util.function.Supplier context) { return new yarnwrap.world.PersistentState(wrapperContained.method_67419(context)); }
// public static yarnwrap.world.PersistentState method_67419(java.util.function.Supplier context, ) { return new yarnwrap.world.PersistentState(net.minecraft.world.PersistentStateType.method_67419(context)); }

}