package yarnwrap.world.gen.stateprovider;
public class BlockStateProviderType { public net.minecraft.world.gen.stateprovider.BlockStateProviderType wrapperContained; public BlockStateProviderType(net.minecraft.world.gen.stateprovider.BlockStateProviderType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.MapCodec value) { wrapperContained.codec = value; }
// public yarnwrap.world.gen.stateprovider.BlockStateProviderType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.world.gen.stateprovider.BlockStateProviderType(wrapperContained.register(id,codec)); }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }

}