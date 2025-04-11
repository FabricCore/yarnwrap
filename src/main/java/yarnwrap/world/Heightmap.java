package yarnwrap.world;
public class Heightmap { public net.minecraft.world.Heightmap wrapperContained; public Heightmap(net.minecraft.world.Heightmap wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.Chunk chunk() { return new yarnwrap.world.chunk.Chunk(wrapperContained.chunk); }
// public void chunk(yarnwrap.world.chunk.Chunk value) { wrapperContained.chunk = value.wrapperContained; }
// public yarnwrap.util.collection.PaletteStorage storage() { return new yarnwrap.util.collection.PaletteStorage(wrapperContained.storage); }
// public void storage(yarnwrap.util.collection.PaletteStorage value) { wrapperContained.storage = value.wrapperContained; }
// public java.util.function.Predicate blockPredicate() { return wrapperContained.blockPredicate; }
// public void blockPredicate(java.util.function.Predicate value) { wrapperContained.blockPredicate = value; }
// public java.util.function.Predicate NOT_AIR() { return wrapperContained.NOT_AIR; }
// public void NOT_AIR(java.util.function.Predicate value) { wrapperContained.NOT_AIR = value; }
// public java.util.function.Predicate SUFFOCATES() { return wrapperContained.SUFFOCATES; }
// public void SUFFOCATES(java.util.function.Predicate value) { wrapperContained.SUFFOCATES = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public int toIndex(int x,int z) { return wrapperContained.toIndex(x,z); }
public boolean trackUpdate(int x,int y,int z,yarnwrap.block.BlockState state) { return wrapperContained.trackUpdate(x,y,z,state.wrapperContained); }
public long[] asLongArray() { return wrapperContained.asLongArray(); }
// public void setTo(yarnwrap.world.chunk.Chunk chunk,Object type,long values) { wrapperContained.setTo(chunk.wrapperContained,type,values); }
// public int get(int index) { return wrapperContained.get(index); }
// public void set(int x,int z,int height) { wrapperContained.set(x,z,height); }
public int get(int x,int z) { return wrapperContained.get(x,z); }
public void populateHeightmaps(yarnwrap.world.chunk.Chunk chunk,java.util.Set types) { wrapperContained.populateHeightmaps(chunk.wrapperContained,types); }

}