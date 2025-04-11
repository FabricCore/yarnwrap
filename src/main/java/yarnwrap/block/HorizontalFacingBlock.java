package yarnwrap.block;
public class HorizontalFacingBlock { public net.minecraft.block.HorizontalFacingBlock wrapperContained; public HorizontalFacingBlock(net.minecraft.block.HorizontalFacingBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }

}