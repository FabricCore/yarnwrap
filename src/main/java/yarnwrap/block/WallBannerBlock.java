package yarnwrap.block;
public class WallBannerBlock { public net.minecraft.block.WallBannerBlock wrapperContained; public WallBannerBlock(net.minecraft.block.WallBannerBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
// public java.util.Map FACING_TO_SHAPE() { return wrapperContained.FACING_TO_SHAPE; }
// public void FACING_TO_SHAPE(java.util.Map value) { wrapperContained.FACING_TO_SHAPE = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}