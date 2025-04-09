package yarnwrap.block;
public class EndPortalBlock { public net.minecraft.block.EndPortalBlock wrapperContained; public EndPortalBlock(net.minecraft.block.EndPortalBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}