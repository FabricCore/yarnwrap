package yarnwrap.block;
public class FacingBlock { public net.minecraft.block.FacingBlock wrapperContained; public FacingBlock(net.minecraft.block.FacingBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }

}