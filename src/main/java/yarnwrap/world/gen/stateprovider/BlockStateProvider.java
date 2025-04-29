package yarnwrap.world.gen.stateprovider;
public class BlockStateProvider { public net.minecraft.world.gen.stateprovider.BlockStateProvider wrapperContained; public BlockStateProvider(net.minecraft.world.gen.stateprovider.BlockStateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
// public void TYPE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TYPE_CODEC = value; }
public static com.mojang.serialization.Codec TYPE_CODEC() { return net.minecraft.world.gen.stateprovider.BlockStateProvider.TYPE_CODEC; }
// public static void TYPE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.stateprovider.BlockStateProvider.TYPE_CODEC = value; }

public yarnwrap.block.BlockState get(yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.get(random.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.block.BlockState get(yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.BlockState(net.minecraft.world.gen.stateprovider.BlockStateProvider.get(random.wrapperContained,pos.wrapperContained)); }
// public yarnwrap.world.gen.stateprovider.BlockStateProviderType getType() { return new yarnwrap.world.gen.stateprovider.BlockStateProviderType(wrapperContained.getType()); }
// public static yarnwrap.world.gen.stateprovider.BlockStateProviderType getType() { return new yarnwrap.world.gen.stateprovider.BlockStateProviderType(net.minecraft.world.gen.stateprovider.BlockStateProvider.getType()); }
// public yarnwrap.world.gen.stateprovider.SimpleBlockStateProvider of(yarnwrap.block.Block block) { return new yarnwrap.world.gen.stateprovider.SimpleBlockStateProvider(wrapperContained.of(block.wrapperContained)); }
// public static yarnwrap.world.gen.stateprovider.SimpleBlockStateProvider of(yarnwrap.block.Block block, ) { return new yarnwrap.world.gen.stateprovider.SimpleBlockStateProvider(net.minecraft.world.gen.stateprovider.BlockStateProvider.of(block.wrapperContained)); }
// public yarnwrap.world.gen.stateprovider.SimpleBlockStateProvider of(yarnwrap.block.BlockState state) { return new yarnwrap.world.gen.stateprovider.SimpleBlockStateProvider(wrapperContained.of(state.wrapperContained)); }
// public static yarnwrap.world.gen.stateprovider.SimpleBlockStateProvider of(yarnwrap.block.BlockState state, ) { return new yarnwrap.world.gen.stateprovider.SimpleBlockStateProvider(net.minecraft.world.gen.stateprovider.BlockStateProvider.of(state.wrapperContained)); }

}