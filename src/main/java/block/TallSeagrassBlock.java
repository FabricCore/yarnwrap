package yarnwrap.block;
public class TallSeagrassBlock { public net.minecraft.block.TallSeagrassBlock wrapperContained; public TallSeagrassBlock(net.minecraft.block.TallSeagrassBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public yarnwrap.state.property.EnumProperty HALF() { return new yarnwrap.state.property.EnumProperty(wrapperContained.HALF); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}