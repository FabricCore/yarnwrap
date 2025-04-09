package yarnwrap.block;
public class WallSignBlock { public net.minecraft.block.WallSignBlock wrapperContained; public WallSignBlock(net.minecraft.block.WallSignBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public java.util.Map FACING_TO_SHAPE() { return wrapperContained.FACING_TO_SHAPE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}