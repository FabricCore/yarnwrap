package yarnwrap.world.gen;
public class HeightContext { public net.minecraft.world.gen.HeightContext wrapperContained; public HeightContext(net.minecraft.world.gen.HeightContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public int minY() { return wrapperContained.minY; }
// public void minY(int value) { wrapperContained.minY = value; }
// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
public HeightContext(yarnwrap.world.gen.chunk.ChunkGenerator generator,yarnwrap.world.HeightLimitView world) { this.wrapperContained = new net.minecraft.world.gen.HeightContext(generator.wrapperContained,world.wrapperContained); }
public int getHeight() { return wrapperContained.getHeight(); }
public int getMinY() { return wrapperContained.getMinY(); }

}