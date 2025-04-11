package yarnwrap.world.chunk;
public class BlockEntityTickInvoker { public net.minecraft.world.chunk.BlockEntityTickInvoker wrapperContained; public BlockEntityTickInvoker(net.minecraft.world.chunk.BlockEntityTickInvoker wrapperContained) { this.wrapperContained = wrapperContained; }

public void tick() { wrapperContained.tick(); }
public boolean isRemoved() { return wrapperContained.isRemoved(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public java.lang.String getName() { return wrapperContained.getName(); }

}