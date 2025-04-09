package yarnwrap.world.gen.stateprovider;
public class BlockStateProvider { public net.minecraft.world.gen.stateprovider.BlockStateProvider wrapperContained; public BlockStateProvider(net.minecraft.world.gen.stateprovider.BlockStateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec TYPE_CODEC() { return wrapperContained.TYPE_CODEC; }
public yarnwrap.block.BlockState get(yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.get(random.wrapperContained,pos.wrapperContained)); }
// public yarnwrap.world.gen.stateprovider.BlockStateProviderType getType() { return new yarnwrap.world.gen.stateprovider.BlockStateProviderType(wrapperContained.getType()); }
public yarnwrap.world.gen.stateprovider.SimpleBlockStateProvider of(yarnwrap.block.Block block) { return new yarnwrap.world.gen.stateprovider.SimpleBlockStateProvider(wrapperContained.of(block.wrapperContained)); }
public yarnwrap.world.gen.stateprovider.SimpleBlockStateProvider of(yarnwrap.block.BlockState state) { return new yarnwrap.world.gen.stateprovider.SimpleBlockStateProvider(wrapperContained.of(state.wrapperContained)); }

}