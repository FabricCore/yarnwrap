package yarnwrap.world.chunk;
public class BlockEntityTickInvoker { public net.minecraft.world.chunk.BlockEntityTickInvoker wrapperContained; public BlockEntityTickInvoker(net.minecraft.world.chunk.BlockEntityTickInvoker wrapperContained) { this.wrapperContained = wrapperContained; }

public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.world.chunk.BlockEntityTickInvoker.tick(); }
public boolean isRemoved() { return wrapperContained.isRemoved(); }
// public static boolean isRemoved() { return net.minecraft.world.chunk.BlockEntityTickInvoker.isRemoved(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.world.chunk.BlockEntityTickInvoker.getPos()); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.world.chunk.BlockEntityTickInvoker.getName(); }

}