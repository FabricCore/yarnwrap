package yarnwrap.util.math;
public class BlockPointer { public net.minecraft.util.math.BlockPointer wrapperContained; public BlockPointer(net.minecraft.util.math.BlockPointer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world()); }
public yarnwrap.util.math.Vec3d centerPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.centerPos()); }

}