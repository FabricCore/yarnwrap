package yarnwrap.world.timer;
public class FunctionTimerCallback { public net.minecraft.world.timer.FunctionTimerCallback wrapperContained; public FunctionTimerCallback(net.minecraft.world.timer.FunctionTimerCallback wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(wrapperContained.name); }
// public void name(yarnwrap.util.Identifier value) { wrapperContained.name = value.wrapperContained; }
// public static yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(net.minecraft.world.timer.FunctionTimerCallback.name); }
// public static void name(yarnwrap.util.Identifier value, ) { net.minecraft.world.timer.FunctionTimerCallback.name = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.timer.FunctionTimerCallback.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.timer.FunctionTimerCallback.CODEC = value; }

public FunctionTimerCallback(yarnwrap.util.Identifier name) { this.wrapperContained = new net.minecraft.world.timer.FunctionTimerCallback(name.wrapperContained); }
// public yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(wrapperContained.name()); }
// // public static yarnwrap.util.Identifier name() { return new yarnwrap.util.Identifier(net.minecraft.world.timer.FunctionTimerCallback.name()); }
// public void method_17938(yarnwrap.server.function.CommandFunctionManager function) { wrapperContained.method_17938(function.wrapperContained); }
// public static void method_17938(yarnwrap.server.function.CommandFunctionManager function, ) { net.minecraft.world.timer.FunctionTimerCallback.method_17938(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_67705(Object instance) { return wrapperContained.method_67705(instance); }
// public static com.mojang.datafixers.kinds.App method_67705(Object instance, ) { return net.minecraft.world.timer.FunctionTimerCallback.method_67705(instance); }

}