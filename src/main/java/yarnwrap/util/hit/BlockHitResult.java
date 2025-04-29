package yarnwrap.util.hit;
public class BlockHitResult { public net.minecraft.util.hit.BlockHitResult wrapperContained; public BlockHitResult(net.minecraft.util.hit.BlockHitResult wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.Direction side() { return new yarnwrap.util.math.Direction(wrapperContained.side); }
// public void side(yarnwrap.util.math.Direction value) { wrapperContained.side = value.wrapperContained; }
// public static yarnwrap.util.math.Direction side() { return new yarnwrap.util.math.Direction(net.minecraft.util.hit.BlockHitResult.side); }
// public static void side(yarnwrap.util.math.Direction value, ) { net.minecraft.util.hit.BlockHitResult.side = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos blockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.blockPos); }
// public void blockPos(yarnwrap.util.math.BlockPos value) { wrapperContained.blockPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos blockPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.util.hit.BlockHitResult.blockPos); }
// public static void blockPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.util.hit.BlockHitResult.blockPos = value.wrapperContained; }

// public boolean missed() { return wrapperContained.missed; }
// public void missed(boolean value) { wrapperContained.missed = value; }
// public static boolean missed() { return net.minecraft.util.hit.BlockHitResult.missed; }
// public static void missed(boolean value, ) { net.minecraft.util.hit.BlockHitResult.missed = value; }

// public boolean insideBlock() { return wrapperContained.insideBlock; }
// public void insideBlock(boolean value) { wrapperContained.insideBlock = value; }
// public static boolean insideBlock() { return net.minecraft.util.hit.BlockHitResult.insideBlock; }
// public static void insideBlock(boolean value, ) { net.minecraft.util.hit.BlockHitResult.insideBlock = value; }

public BlockHitResult(yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Direction side,yarnwrap.util.math.BlockPos blockPos,boolean insideBlock) { this.wrapperContained = new net.minecraft.util.hit.BlockHitResult(pos.wrapperContained,side.wrapperContained,blockPos.wrapperContained,insideBlock); }
// public BlockHitResult(boolean missed,yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Direction side,yarnwrap.util.math.BlockPos blockPos,boolean insideBlock) { this.wrapperContained = new net.minecraft.util.hit.BlockHitResult(missed,pos.wrapperContained,side.wrapperContained,blockPos.wrapperContained,insideBlock); }
public yarnwrap.util.math.BlockPos getBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getBlockPos()); }
// public static yarnwrap.util.math.BlockPos getBlockPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.util.hit.BlockHitResult.getBlockPos()); }
// public yarnwrap.util.hit.BlockHitResult createMissed(yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Direction side,yarnwrap.util.math.BlockPos blockPos) { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.createMissed(pos.wrapperContained,side.wrapperContained,blockPos.wrapperContained)); }
// public static yarnwrap.util.hit.BlockHitResult createMissed(yarnwrap.util.math.Vec3d pos,yarnwrap.util.math.Direction side,yarnwrap.util.math.BlockPos blockPos, ) { return new yarnwrap.util.hit.BlockHitResult(net.minecraft.util.hit.BlockHitResult.createMissed(pos.wrapperContained,side.wrapperContained,blockPos.wrapperContained)); }
public yarnwrap.util.hit.BlockHitResult withSide(yarnwrap.util.math.Direction side) { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.withSide(side.wrapperContained)); }
// public static yarnwrap.util.hit.BlockHitResult withSide(yarnwrap.util.math.Direction side, ) { return new yarnwrap.util.hit.BlockHitResult(net.minecraft.util.hit.BlockHitResult.withSide(side.wrapperContained)); }
public yarnwrap.util.math.Direction getSide() { return new yarnwrap.util.math.Direction(wrapperContained.getSide()); }
// public static yarnwrap.util.math.Direction getSide() { return new yarnwrap.util.math.Direction(net.minecraft.util.hit.BlockHitResult.getSide()); }
public boolean isInsideBlock() { return wrapperContained.isInsideBlock(); }
// public static boolean isInsideBlock() { return net.minecraft.util.hit.BlockHitResult.isInsideBlock(); }
public yarnwrap.util.hit.BlockHitResult withBlockPos(yarnwrap.util.math.BlockPos blockPos) { return new yarnwrap.util.hit.BlockHitResult(wrapperContained.withBlockPos(blockPos.wrapperContained)); }
// public static yarnwrap.util.hit.BlockHitResult withBlockPos(yarnwrap.util.math.BlockPos blockPos, ) { return new yarnwrap.util.hit.BlockHitResult(net.minecraft.util.hit.BlockHitResult.withBlockPos(blockPos.wrapperContained)); }

}