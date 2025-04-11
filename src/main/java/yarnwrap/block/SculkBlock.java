package yarnwrap.block;
public class SculkBlock { public net.minecraft.block.SculkBlock wrapperContained; public SculkBlock(net.minecraft.block.SculkBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public boolean shouldNotDecay(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.shouldNotDecay(world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.block.BlockState getExtraBlockState(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random,boolean allowShrieker) { return new yarnwrap.block.BlockState(wrapperContained.getExtraBlockState(world.wrapperContained,pos.wrapperContained,random.wrapperContained,allowShrieker)); }
// public int getDecay(yarnwrap.block.entity.SculkSpreadManager spreadManager,yarnwrap.util.math.BlockPos cursorPos,yarnwrap.util.math.BlockPos catalystPos,int charge) { return wrapperContained.getDecay(spreadManager.wrapperContained,cursorPos.wrapperContained,catalystPos.wrapperContained,charge); }

}