package yarnwrap.world.timer;
public class FunctionTagTimerCallback { public net.minecraft.world.timer.FunctionTagTimerCallback wrapperContained; public FunctionTagTimerCallback(net.minecraft.world.timer.FunctionTagTimerCallback wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(wrapperContained.name); }
// public void name(yarnwrap.util.Identifier value) { wrapperContained.name = value.wrapperContained; }
// public static yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(net.minecraft.world.timer.FunctionTagTimerCallback.name); }
// public static void name(yarnwrap.util.Identifier value, ) { net.minecraft.world.timer.FunctionTagTimerCallback.name = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.timer.FunctionTagTimerCallback.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.timer.FunctionTagTimerCallback.CODEC = value; }

public FunctionTagTimerCallback(yarnwrap.util.Identifier name) { this.wrapperContained = new net.minecraft.world.timer.FunctionTagTimerCallback(name.wrapperContained); }
// public yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(wrapperContained.name()); }
// // public static yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(net.minecraft.world.timer.FunctionTagTimerCallback.name()); }
// public com.mojang.datafixers.kinds.App method_67706(Object instance) { return wrapperContained.method_67706(instance); }
// public static com.mojang.datafixers.kinds.App method_67706(Object instance, ) { return net.minecraft.world.timer.FunctionTagTimerCallback.method_67706(instance); }

}