package yarnwrap.world.gen.carver;
public class CarvingMask { public net.minecraft.world.gen.carver.CarvingMask wrapperContained; public CarvingMask(net.minecraft.world.gen.carver.CarvingMask wrapperContained) { this.wrapperContained = wrapperContained; }

// public int bottomY() { return wrapperContained.bottomY; }
// public void bottomY(int value) { wrapperContained.bottomY = value; }
// public java.util.BitSet mask() { return wrapperContained.mask; }
// public void mask(java.util.BitSet value) { wrapperContained.mask = value; }
// public Object maskPredicate() { return wrapperContained.maskPredicate; }
// // public void maskPredicate(Object value) { wrapperContained.maskPredicate = value; }
public long[] getMask() { return wrapperContained.getMask(); }
public void set(int offsetX,int y,int offsetZ) { wrapperContained.set(offsetX,y,offsetZ); }
public java.util.stream.Stream streamBlockPos(yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.streamBlockPos(chunkPos.wrapperContained); }
public boolean get(int offsetX,int y,int offsetZ) { return wrapperContained.get(offsetX,y,offsetZ); }
// public int getIndex(int offsetX,int y,int offsetZ) { return wrapperContained.getIndex(offsetX,y,offsetZ); }
// public void setMaskPredicate(Object maskPredicate) { wrapperContained.setMaskPredicate(maskPredicate); }

}