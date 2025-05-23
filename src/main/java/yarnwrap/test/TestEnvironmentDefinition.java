package yarnwrap.test;
public class TestEnvironmentDefinition { public net.minecraft.test.TestEnvironmentDefinition wrapperContained; public TestEnvironmentDefinition(net.minecraft.test.TestEnvironmentDefinition wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.test.TestEnvironmentDefinition.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.test.TestEnvironmentDefinition.CODEC = value; }

// public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public static com.mojang.serialization.Codec ENTRY_CODEC() { return net.minecraft.test.TestEnvironmentDefinition.ENTRY_CODEC; }
// public static void ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.test.TestEnvironmentDefinition.ENTRY_CODEC = value; }

public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.test.TestEnvironmentDefinition.getCodec(); }
public void setup(yarnwrap.server.world.ServerWorld world) { wrapperContained.setup(world.wrapperContained); }
// public static void setup(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.test.TestEnvironmentDefinition.setup(world.wrapperContained); }
// public com.mojang.serialization.MapCodec method_67052(com.mojang.serialization.MapCodec codec) { return wrapperContained.method_67052(codec); }
// public static com.mojang.serialization.MapCodec method_67052(com.mojang.serialization.MapCodec codec, ) { return net.minecraft.test.TestEnvironmentDefinition.method_67052(codec); }
// public com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry) { return wrapperContained.registerAndGetDefault(registry.wrapperContained); }
// public static com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry, ) { return net.minecraft.test.TestEnvironmentDefinition.registerAndGetDefault(registry.wrapperContained); }
public void teardown(yarnwrap.server.world.ServerWorld world) { wrapperContained.teardown(world.wrapperContained); }
// public static void teardown(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.test.TestEnvironmentDefinition.teardown(world.wrapperContained); }

}