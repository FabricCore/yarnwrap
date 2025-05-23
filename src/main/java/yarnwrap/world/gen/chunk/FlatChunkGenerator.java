package yarnwrap.world.gen.chunk;
public class FlatChunkGenerator { public net.minecraft.world.gen.chunk.FlatChunkGenerator wrapperContained; public FlatChunkGenerator(net.minecraft.world.gen.chunk.FlatChunkGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config() { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(wrapperContained.config); }
// public void config(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig value) { wrapperContained.config = value.wrapperContained; }
// public static yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config() { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(net.minecraft.world.gen.chunk.FlatChunkGenerator.config); }
// public static void config(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig value, ) { net.minecraft.world.gen.chunk.FlatChunkGenerator.config = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.gen.chunk.FlatChunkGenerator.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.chunk.FlatChunkGenerator.CODEC = value; }

public FlatChunkGenerator(yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig config) { this.wrapperContained = new net.minecraft.world.gen.chunk.FlatChunkGenerator(config.wrapperContained); }
// public yarnwrap.block.BlockState method_28002(yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.method_28002(state.wrapperContained)); }
// public static yarnwrap.block.BlockState method_28002(yarnwrap.block.BlockState state, ) { return new yarnwrap.block.BlockState(net.minecraft.world.gen.chunk.FlatChunkGenerator.method_28002(state.wrapperContained)); }
public yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig getConfig() { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(wrapperContained.getConfig()); }
// public static yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig getConfig() { return new yarnwrap.world.gen.chunk.FlatChunkGeneratorConfig(net.minecraft.world.gen.chunk.FlatChunkGenerator.getConfig()); }
// public com.mojang.datafixers.kinds.App method_40158(Object instance) { return wrapperContained.method_40158(instance); }
// public static com.mojang.datafixers.kinds.App method_40158(Object instance, ) { return net.minecraft.world.gen.chunk.FlatChunkGenerator.method_40158(instance); }
// public yarnwrap.registry.entry.RegistryEntry method_46718(Object structureEntry) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_46718(structureEntry)); }
// public static yarnwrap.registry.entry.RegistryEntry method_46718(Object structureEntry, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.gen.chunk.FlatChunkGenerator.method_46718(structureEntry)); }

}