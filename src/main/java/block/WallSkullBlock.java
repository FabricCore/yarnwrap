package yarnwrap.block;
public class WallSkullBlock { public net.minecraft.block.WallSkullBlock wrapperContained; public WallSkullBlock(net.minecraft.block.WallSkullBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public java.util.Map FACING_TO_SHAPE() { return wrapperContained.FACING_TO_SHAPE; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}