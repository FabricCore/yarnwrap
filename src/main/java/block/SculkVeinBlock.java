package yarnwrap.block;
public class SculkVeinBlock { public net.minecraft.block.SculkVeinBlock wrapperContained; public SculkVeinBlock(net.minecraft.block.SculkVeinBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public yarnwrap.block.LichenGrower allGrowTypeGrower() { return new yarnwrap.block.LichenGrower(wrapperContained.allGrowTypeGrower); }
// public yarnwrap.block.LichenGrower samePositionOnlyGrower() { return new yarnwrap.block.LichenGrower(wrapperContained.samePositionOnlyGrower); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public boolean veinCoversSculkReplaceable(yarnwrap.world.WorldAccess world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos) { return wrapperContained.veinCoversSculkReplaceable(world.wrapperContained,state.wrapperContained,pos.wrapperContained); }
public boolean place(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,java.util.Collection directions) { return wrapperContained.place(world.wrapperContained,pos.wrapperContained,state.wrapperContained,directions); }
// public boolean convertToBlock(yarnwrap.block.entity.SculkSpreadManager spreadManager,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.convertToBlock(spreadManager.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public yarnwrap.block.LichenGrower getSamePositionOnlyGrower() { return new yarnwrap.block.LichenGrower(wrapperContained.getSamePositionOnlyGrower()); }

}