package yarnwrap.util.math;
public class BlockPointer { public net.minecraft.util.math.BlockPointer wrapperContained; public BlockPointer(net.minecraft.util.math.BlockPointer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world); }
// public void world(yarnwrap.server.world.ServerWorld value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(net.minecraft.util.math.BlockPointer.world); }
// public static void world(yarnwrap.server.world.ServerWorld value, ) { net.minecraft.util.math.BlockPointer.world = value.wrapperContained; }

// public yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(wrapperContained.world()); }
// // public static yarnwrap.server.world.ServerWorld world() { return new yarnwrap.server.world.ServerWorld(net.minecraft.util.math.BlockPointer.world()); }
public yarnwrap.util.math.Vec3d centerPos() { return new yarnwrap.util.math.Vec3d(wrapperContained.centerPos()); }
// public static yarnwrap.util.math.Vec3d centerPos() { return new yarnwrap.util.math.Vec3d(net.minecraft.util.math.BlockPointer.centerPos()); }

}