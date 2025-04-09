package yarnwrap.block;
public class DecoratedPotBlock { public net.minecraft.block.DecoratedPotBlock wrapperContained; public DecoratedPotBlock(net.minecraft.block.DecoratedPotBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
public yarnwrap.util.Identifier SHERDS_DYNAMIC_DROP_ID() { return new yarnwrap.util.Identifier(wrapperContained.SHERDS_DYNAMIC_DROP_ID); }
public yarnwrap.state.property.BooleanProperty CRACKED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.CRACKED); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}