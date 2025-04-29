package yarnwrap.block;
public class ChorusPlantBlock { public net.minecraft.block.ChorusPlantBlock wrapperContained; public ChorusPlantBlock(net.minecraft.block.ChorusPlantBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.ChorusPlantBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.ChorusPlantBlock.CODEC = value; }

// public yarnwrap.block.BlockState withConnectionProperties(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.withConnectionProperties(world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }
// public static yarnwrap.block.BlockState withConnectionProperties(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { return new yarnwrap.block.BlockState(net.minecraft.block.ChorusPlantBlock.withConnectionProperties(world.wrapperContained,pos.wrapperContained,state.wrapperContained)); }

}