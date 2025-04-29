package yarnwrap.entity.ai.brain;
public class BlockPosLookTarget { public net.minecraft.entity.ai.brain.BlockPosLookTarget wrapperContained; public BlockPosLookTarget(net.minecraft.entity.ai.brain.BlockPosLookTarget wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos blockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.blockPos); }
// public void blockPos(yarnwrap.util.math.BlockPos value) { wrapperContained.blockPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos blockPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.entity.ai.brain.BlockPosLookTarget.blockPos); }
// public static void blockPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.entity.ai.brain.BlockPosLookTarget.blockPos = value.wrapperContained; }

// public yarnwrap.util.math.Vec3d pos() { return new yarnwrap.util.math.Vec3d(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.Vec3d value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.Vec3d pos() { return new yarnwrap.util.math.Vec3d(net.minecraft.entity.ai.brain.BlockPosLookTarget.pos); }
// public static void pos(yarnwrap.util.math.Vec3d value, ) { net.minecraft.entity.ai.brain.BlockPosLookTarget.pos = value.wrapperContained; }

public BlockPosLookTarget(yarnwrap.util.math.BlockPos blockPos) { this.wrapperContained = new net.minecraft.entity.ai.brain.BlockPosLookTarget(blockPos.wrapperContained); }
public BlockPosLookTarget(yarnwrap.util.math.Vec3d pos) { this.wrapperContained = new net.minecraft.entity.ai.brain.BlockPosLookTarget(pos.wrapperContained); }

}