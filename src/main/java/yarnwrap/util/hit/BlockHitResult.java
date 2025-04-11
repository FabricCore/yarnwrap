package yarnwrap.util.hit;
public class BlockHitResult { public net.minecraft.util.hit.BlockHitResult wrapperContained; public BlockHitResult(net.minecraft.util.hit.BlockHitResult wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Direction side() { return new yarnwrap.util.math.Direction(wrapperContained.side); }
// public void side(yarnwrap.util.math.Direction value) { wrapperContained.side = value.wrapperContained; }
// public yarnwrap.util.math.BlockPos blockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.blockPos); }
// public void blockPos(yarnwrap.util.math.BlockPos value) { wrapperContained.blockPos = value.wrapperContained; }
// public boolean missed() { return wrapperContained.missed; }
// public void missed(boolean value) { wrapperContained.missed = value; }
// public boolean insideBlock() { return wrapperContained.insideBlock; }
// public void insideBlock(boolean value) { wrapperContained.insideBlock = value; }
public yarnwrap.util.math.BlockPos getBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getBlockPos()); }
public yarnwrap.util.hit.BlockHitResult createMissed(yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Direction side,yarnwrap.util.math.BlockPos blockPos) { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.createMissed(pos.wrapperContained,side.wrapperContained,blockPos.wrapperContained)); }
public yarnwrap.util.hit.BlockHitResult withSide(yarnwrap.util.math.Direction side) { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.withSide(side.wrapperContained)); }
public yarnwrap.util.math.Direction getSide() { return new yarnwrap.util.math.Direction(wrapperContained.getSide()); }
public boolean isInsideBlock() { return wrapperContained.isInsideBlock(); }
public yarnwrap.util.hit.BlockHitResult withBlockPos(yarnwrap.util.math.BlockPos blockPos) { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.withBlockPos(blockPos.wrapperContained)); }

}