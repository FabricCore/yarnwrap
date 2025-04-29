package yarnwrap.world.gen.chunk;
public class VerticalBlockSample { public net.minecraft.world.gen.chunk.VerticalBlockSample wrapperContained; public VerticalBlockSample(net.minecraft.world.gen.chunk.VerticalBlockSample wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.block.BlockState[] states() { return wrapperContained.states; }
// public void states(net.minecraft.block.BlockState[] value) { wrapperContained.states = value; }
// public static net.minecraft.block.BlockState[] states() { return net.minecraft.world.gen.chunk.VerticalBlockSample.states; }
// public static void states(net.minecraft.block.BlockState[] value, ) { net.minecraft.world.gen.chunk.VerticalBlockSample.states = value; }

// public int startY() { return wrapperContained.startY; }
// public void startY(int value) { wrapperContained.startY = value; }
// public static int startY() { return net.minecraft.world.gen.chunk.VerticalBlockSample.startY; }
// public static void startY(int value, ) { net.minecraft.world.gen.chunk.VerticalBlockSample.startY = value; }

public VerticalBlockSample(int startY,net.minecraft.block.BlockState[] states) { this.wrapperContained = new net.minecraft.world.gen.chunk.VerticalBlockSample(startY,states); }

}