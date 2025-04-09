package yarnwrap.block;
public class SculkShriekerBlock { public net.minecraft.block.SculkShriekerBlock wrapperContained; public SculkShriekerBlock(net.minecraft.block.SculkShriekerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.BooleanProperty SHRIEKING() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.SHRIEKING); }
public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public double TOP() { return wrapperContained.TOP; }
public yarnwrap.state.property.BooleanProperty CAN_SUMMON() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.CAN_SUMMON); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}