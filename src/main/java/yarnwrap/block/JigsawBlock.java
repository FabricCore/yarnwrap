package yarnwrap.block;
public class JigsawBlock { public net.minecraft.block.JigsawBlock wrapperContained; public JigsawBlock(net.minecraft.block.JigsawBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.EnumProperty ORIENTATION() { return new yarnwrap.state.property.EnumProperty(wrapperContained.ORIENTATION); }
// public void ORIENTATION(yarnwrap.state.property.EnumProperty value) { wrapperContained.ORIENTATION = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public boolean attachmentMatches(Object info1,Object info2) { return wrapperContained.attachmentMatches(info1,info2); }
public yarnwrap.util.math.Direction getFacing(yarnwrap.block.BlockState state) { return new yarnwrap.util.math.Direction(wrapperContained.getFacing(state.wrapperContained)); }
public yarnwrap.util.math.Direction getRotation(yarnwrap.block.BlockState state) { return new yarnwrap.util.math.Direction(wrapperContained.getRotation(state.wrapperContained)); }

}