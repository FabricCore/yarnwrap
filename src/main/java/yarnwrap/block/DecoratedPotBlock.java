package yarnwrap.block;
public class DecoratedPotBlock { public net.minecraft.block.DecoratedPotBlock wrapperContained; public DecoratedPotBlock(net.minecraft.block.DecoratedPotBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
// public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
public yarnwrap.util.Identifier SHERDS_DYNAMIC_DROP_ID() { return new yarnwrap.util.Identifier(wrapperContained.SHERDS_DYNAMIC_DROP_ID); }
// public void SHERDS_DYNAMIC_DROP_ID(yarnwrap.util.Identifier value) { wrapperContained.SHERDS_DYNAMIC_DROP_ID = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty CRACKED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.CRACKED); }
// public void CRACKED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.CRACKED = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}