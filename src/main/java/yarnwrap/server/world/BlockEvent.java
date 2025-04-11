package yarnwrap.server.world;
public class BlockEvent { public net.minecraft.server.world.BlockEvent wrapperContained; public BlockEvent(net.minecraft.server.world.BlockEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
// public void block(yarnwrap.block.Block value) { wrapperContained.block = value.wrapperContained; }
// public int type() { return wrapperContained.type; }
// public void type(int value) { wrapperContained.type = value; }
// public int data() { return wrapperContained.data; }
// public void data(int value) { wrapperContained.data = value; }
public BlockEvent(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block block,int type,int data) { this.wrapperContained = new net.minecraft.server.world.BlockEvent(pos.wrapperContained,block.wrapperContained,type,data); }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos()); }
// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block()); }
// public int type() { return wrapperContained.type(); }
// public int data() { return wrapperContained.data(); }

}