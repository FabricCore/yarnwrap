package yarnwrap.block;
public class PistonExtensionBlock { public net.minecraft.block.PistonExtensionBlock wrapperContained; public PistonExtensionBlock(net.minecraft.block.PistonExtensionBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
public yarnwrap.state.property.EnumProperty TYPE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.TYPE); }
// public void TYPE(yarnwrap.state.property.EnumProperty value) { wrapperContained.TYPE = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.block.entity.PistonBlockEntity getPistonBlockEntity(yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.block.entity.PistonBlockEntity(wrapperContained.getPistonBlockEntity(world.wrapperContained,pos.wrapperContained)); }
public yarnwrap.block.entity.BlockEntity createBlockEntityPiston(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.BlockState pushedBlock,yarnwrap.util.math.Direction facing,boolean extending,boolean source) { return new yarnwrap.block.entity.BlockEntity(wrapperContained.createBlockEntityPiston(pos.wrapperContained,state.wrapperContained,pushedBlock.wrapperContained,facing.wrapperContained,extending,source)); }

}