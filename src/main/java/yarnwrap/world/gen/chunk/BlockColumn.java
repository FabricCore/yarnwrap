package yarnwrap.world.gen.chunk;
public class BlockColumn { public net.minecraft.world.gen.chunk.BlockColumn wrapperContained; public BlockColumn(net.minecraft.world.gen.chunk.BlockColumn wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.BlockState getState(int y) { return new yarnwrap.block.BlockState(wrapperContained.getState(y)); }
// public static yarnwrap.block.BlockState getState(int y, ) { return new yarnwrap.block.BlockState(net.minecraft.world.gen.chunk.BlockColumn.getState(y)); }
public void setState(int y,yarnwrap.block.BlockState state) { wrapperContained.setState(y,state.wrapperContained); }
// public static void setState(int y,yarnwrap.block.BlockState state, ) { net.minecraft.world.gen.chunk.BlockColumn.setState(y,state.wrapperContained); }

}