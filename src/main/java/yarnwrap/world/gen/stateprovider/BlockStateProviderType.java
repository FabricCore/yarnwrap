package yarnwrap.world.gen.stateprovider;
public class BlockStateProviderType { public net.minecraft.world.gen.stateprovider.BlockStateProviderType wrapperContained; public BlockStateProviderType(net.minecraft.world.gen.stateprovider.BlockStateProviderType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.MapCodec value) { wrapperContained.codec = value; }
// public static com.mojang.serialization.MapCodec codec() { return net.minecraft.world.gen.stateprovider.BlockStateProviderType.codec; }
// public static void codec(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.stateprovider.BlockStateProviderType.codec = value; }

public BlockStateProviderType(com.mojang.serialization.MapCodec codec) { this.wrapperContained = new net.minecraft.world.gen.stateprovider.BlockStateProviderType(codec); }
// public yarnwrap.world.gen.stateprovider.BlockStateProviderType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.world.gen.stateprovider.BlockStateProviderType(wrapperContained.register(id,codec)); }
// public static yarnwrap.world.gen.stateprovider.BlockStateProviderType register(java.lang.String id,com.mojang.serialization.MapCodec codec, ) { return new yarnwrap.world.gen.stateprovider.BlockStateProviderType(net.minecraft.world.gen.stateprovider.BlockStateProviderType.register(id,codec)); }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.world.gen.stateprovider.BlockStateProviderType.getCodec(); }

}