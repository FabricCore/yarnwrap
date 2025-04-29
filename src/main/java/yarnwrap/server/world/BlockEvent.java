package yarnwrap.server.world;
public class BlockEvent { public net.minecraft.server.world.BlockEvent wrapperContained; public BlockEvent(net.minecraft.server.world.BlockEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.server.world.BlockEvent.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.server.world.BlockEvent.pos = value.wrapperContained; }

// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
// public void block(yarnwrap.block.Block value) { wrapperContained.block = value.wrapperContained; }
// public static yarnwrap.block.Block block() { return new yarnwrap.block.Block(net.minecraft.server.world.BlockEvent.block); }
// public static void block(yarnwrap.block.Block value, ) { net.minecraft.server.world.BlockEvent.block = value.wrapperContained; }

// public int type() { return wrapperContained.type; }
// public void type(int value) { wrapperContained.type = value; }
// public static int type() { return net.minecraft.server.world.BlockEvent.type; }
// public static void type(int value, ) { net.minecraft.server.world.BlockEvent.type = value; }

// public int data() { return wrapperContained.data; }
// public void data(int value) { wrapperContained.data = value; }
// public static int data() { return net.minecraft.server.world.BlockEvent.data; }
// public static void data(int value, ) { net.minecraft.server.world.BlockEvent.data = value; }

public BlockEvent(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block block,int type,int data) { this.wrapperContained = new net.minecraft.server.world.BlockEvent(pos.wrapperContained,block.wrapperContained,type,data); }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos()); }
// // public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.server.world.BlockEvent.pos()); }
// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block()); }
// // public static yarnwrap.block.Block block() { return new yarnwrap.block.Block(net.minecraft.server.world.BlockEvent.block()); }
// public int type() { return wrapperContained.type(); }
// // public static int type() { return net.minecraft.server.world.BlockEvent.type(); }
// public int data() { return wrapperContained.data(); }
// // public static int data() { return net.minecraft.server.world.BlockEvent.data(); }

}