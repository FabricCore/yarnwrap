package yarnwrap.world.gen.stateprovider;
public class PredicatedStateProvider { public net.minecraft.world.gen.stateprovider.PredicatedStateProvider wrapperContained; public PredicatedStateProvider(net.minecraft.world.gen.stateprovider.PredicatedStateProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.stateprovider.PredicatedStateProvider.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.stateprovider.PredicatedStateProvider.CODEC = value; }

public yarnwrap.block.BlockState getBlockState(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.BlockState(wrapperContained.getBlockState(world.wrapperContained,random.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.block.BlockState getBlockState(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.block.BlockState(net.minecraft.world.gen.stateprovider.PredicatedStateProvider.getBlockState(world.wrapperContained,random.wrapperContained,pos.wrapperContained)); }
// public yarnwrap.world.gen.stateprovider.PredicatedStateProvider of(yarnwrap.block.Block block) { return new yarnwrap.world.gen.stateprovider.PredicatedStateProvider(wrapperContained.of(block.wrapperContained)); }
// public static yarnwrap.world.gen.stateprovider.PredicatedStateProvider of(yarnwrap.block.Block block, ) { return new yarnwrap.world.gen.stateprovider.PredicatedStateProvider(net.minecraft.world.gen.stateprovider.PredicatedStateProvider.of(block.wrapperContained)); }
// public yarnwrap.world.gen.stateprovider.PredicatedStateProvider of(yarnwrap.world.gen.stateprovider.BlockStateProvider stateProvider) { return new yarnwrap.world.gen.stateprovider.PredicatedStateProvider(wrapperContained.of(stateProvider.wrapperContained)); }
// public static yarnwrap.world.gen.stateprovider.PredicatedStateProvider of(yarnwrap.world.gen.stateprovider.BlockStateProvider stateProvider, ) { return new yarnwrap.world.gen.stateprovider.PredicatedStateProvider(net.minecraft.world.gen.stateprovider.PredicatedStateProvider.of(stateProvider.wrapperContained)); }

}