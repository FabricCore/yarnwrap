package yarnwrap.block;
public class DeadCoralWallFanBlock { public net.minecraft.block.DeadCoralWallFanBlock wrapperContained; public DeadCoralWallFanBlock(net.minecraft.block.DeadCoralWallFanBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public java.util.Map FACING_TO_SHAPE() { return wrapperContained.FACING_TO_SHAPE; }

}