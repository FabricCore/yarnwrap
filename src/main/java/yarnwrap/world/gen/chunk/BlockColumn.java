package yarnwrap.world.gen.chunk;
public class BlockColumn { public net.minecraft.world.gen.chunk.BlockColumn wrapperContained; public BlockColumn(net.minecraft.world.gen.chunk.BlockColumn wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.BlockState getState(int y) { return new yarnwrap.block.BlockState(wrapperContained.getState(y)); }
public void setState(int y,yarnwrap.block.BlockState state) { wrapperContained.setState(y,state.wrapperContained); }

}