package yarnwrap.block;
public class HorizontalFacingBlock { public net.minecraft.block.HorizontalFacingBlock wrapperContained; public HorizontalFacingBlock(net.minecraft.block.HorizontalFacingBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.HorizontalFacingBlock.FACING); }
// public static void FACING(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.HorizontalFacingBlock.FACING = value.wrapperContained; }


}