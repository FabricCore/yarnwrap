package yarnwrap.test;
public class FunctionTestInstance { public net.minecraft.test.FunctionTestInstance wrapperContained; public FunctionTestInstance(net.minecraft.test.FunctionTestInstance wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.test.FunctionTestInstance.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.test.FunctionTestInstance.CODEC = value; }

// public yarnwrap.registry.RegistryKey function() { return new yarnwrap.registry.RegistryKey(wrapperContained.function); }
// public void function(yarnwrap.registry.RegistryKey value) { wrapperContained.function = value.wrapperContained; }
// public static yarnwrap.registry.RegistryKey function() { return new yarnwrap.registry.RegistryKey(net.minecraft.test.FunctionTestInstance.function); }
// public static void function(yarnwrap.registry.RegistryKey value, ) { net.minecraft.test.FunctionTestInstance.function = value.wrapperContained; }

public FunctionTestInstance(yarnwrap.registry.RegistryKey function,yarnwrap.test.TestData data) { this.wrapperContained = new net.minecraft.test.FunctionTestInstance(function.wrapperContained,data.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_66921(Object instance) { return wrapperContained.method_66921(instance); }
// public static com.mojang.datafixers.kinds.App method_66921(Object instance, ) { return net.minecraft.test.FunctionTestInstance.method_66921(instance); }
// public yarnwrap.registry.RegistryKey getFunction() { return new yarnwrap.registry.RegistryKey(wrapperContained.getFunction()); }
// public static yarnwrap.registry.RegistryKey getFunction() { return new yarnwrap.registry.RegistryKey(net.minecraft.test.FunctionTestInstance.getFunction()); }

}