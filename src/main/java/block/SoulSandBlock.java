package yarnwrap.block;
public class SoulSandBlock { public net.minecraft.block.SoulSandBlock wrapperContained; public SoulSandBlock(net.minecraft.block.SoulSandBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape COLLISION_SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.COLLISION_SHAPE); }
// public int SCHEDULED_TICK_DELAY() { return wrapperContained.SCHEDULED_TICK_DELAY; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}