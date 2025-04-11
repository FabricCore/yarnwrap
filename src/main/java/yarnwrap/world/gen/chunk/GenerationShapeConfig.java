package yarnwrap.world.gen.chunk;
public class GenerationShapeConfig { public net.minecraft.world.gen.chunk.GenerationShapeConfig wrapperContained; public GenerationShapeConfig(net.minecraft.world.gen.chunk.GenerationShapeConfig wrapperContained) { this.wrapperContained = wrapperContained; }

// public int minimumY() { return wrapperContained.minimumY; }
// public void minimumY(int value) { wrapperContained.minimumY = value; }
// public int height() { return wrapperContained.height; }
// public void height(int value) { wrapperContained.height = value; }
// public int horizontalSize() { return wrapperContained.horizontalSize; }
// public void horizontalSize(int value) { wrapperContained.horizontalSize = value; }
// public int verticalSize() { return wrapperContained.verticalSize; }
// public void verticalSize(int value) { wrapperContained.verticalSize = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public yarnwrap.world.gen.chunk.GenerationShapeConfig NETHER() { return new yarnwrap.world.gen.chunk.GenerationShapeConfig(wrapperContained.NETHER); }
// public void NETHER(yarnwrap.world.gen.chunk.GenerationShapeConfig value) { wrapperContained.NETHER = value.wrapperContained; }
// public yarnwrap.world.gen.chunk.GenerationShapeConfig END() { return new yarnwrap.world.gen.chunk.GenerationShapeConfig(wrapperContained.END); }
// public void END(yarnwrap.world.gen.chunk.GenerationShapeConfig value) { wrapperContained.END = value.wrapperContained; }
// public yarnwrap.world.gen.chunk.GenerationShapeConfig CAVES() { return new yarnwrap.world.gen.chunk.GenerationShapeConfig(wrapperContained.CAVES); }
// public void CAVES(yarnwrap.world.gen.chunk.GenerationShapeConfig value) { wrapperContained.CAVES = value.wrapperContained; }
// public yarnwrap.world.gen.chunk.GenerationShapeConfig FLOATING_ISLANDS() { return new yarnwrap.world.gen.chunk.GenerationShapeConfig(wrapperContained.FLOATING_ISLANDS); }
// public void FLOATING_ISLANDS(yarnwrap.world.gen.chunk.GenerationShapeConfig value) { wrapperContained.FLOATING_ISLANDS = value.wrapperContained; }
// public yarnwrap.world.gen.chunk.GenerationShapeConfig SURFACE() { return new yarnwrap.world.gen.chunk.GenerationShapeConfig(wrapperContained.SURFACE); }
// public void SURFACE(yarnwrap.world.gen.chunk.GenerationShapeConfig value) { wrapperContained.SURFACE = value.wrapperContained; }
// public int minimumY() { return wrapperContained.minimumY(); }
// public int height() { return wrapperContained.height(); }
// public int horizontalSize() { return wrapperContained.horizontalSize(); }
// public int verticalSize() { return wrapperContained.verticalSize(); }
public yarnwrap.world.gen.chunk.GenerationShapeConfig create(int minimumY,int height,int horizontalSize,int verticalSize) { return new yarnwrap.world.gen.chunk.GenerationShapeConfig(wrapperContained.create(minimumY,height,horizontalSize,verticalSize)); }
// public com.mojang.serialization.DataResult checkHeight(yarnwrap.world.gen.chunk.GenerationShapeConfig config) { return wrapperContained.checkHeight(config.wrapperContained); }
public int verticalCellBlockCount() { return wrapperContained.verticalCellBlockCount(); }
public int horizontalCellBlockCount() { return wrapperContained.horizontalCellBlockCount(); }
public yarnwrap.world.gen.chunk.GenerationShapeConfig trimHeight(yarnwrap.world.HeightLimitView world) { return new yarnwrap.world.gen.chunk.GenerationShapeConfig(wrapperContained.trimHeight(world.wrapperContained)); }

}