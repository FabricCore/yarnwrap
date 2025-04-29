package yarnwrap.world;
public class Heightmap { public net.minecraft.world.Heightmap wrapperContained; public Heightmap(net.minecraft.world.Heightmap wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.chunk.Chunk chunk() { return new yarnwrap.world.chunk.Chunk(wrapperContained.chunk); }
// public void chunk(yarnwrap.world.chunk.Chunk value) { wrapperContained.chunk = value.wrapperContained; }
// public static yarnwrap.world.chunk.Chunk chunk() { return new yarnwrap.world.chunk.Chunk(net.minecraft.world.Heightmap.chunk); }
// public static void chunk(yarnwrap.world.chunk.Chunk value, ) { net.minecraft.world.Heightmap.chunk = value.wrapperContained; }

// public yarnwrap.util.collection.PaletteStorage storage() { return new yarnwrap.util.collection.PaletteStorage(wrapperContained.storage); }
// public void storage(yarnwrap.util.collection.PaletteStorage value) { wrapperContained.storage = value.wrapperContained; }
// public static yarnwrap.util.collection.PaletteStorage storage() { return new yarnwrap.util.collection.PaletteStorage(net.minecraft.world.Heightmap.storage); }
// public static void storage(yarnwrap.util.collection.PaletteStorage value, ) { net.minecraft.world.Heightmap.storage = value.wrapperContained; }

// public java.util.function.Predicate blockPredicate() { return wrapperContained.blockPredicate; }
// public void blockPredicate(java.util.function.Predicate value) { wrapperContained.blockPredicate = value; }
// public static java.util.function.Predicate blockPredicate() { return net.minecraft.world.Heightmap.blockPredicate; }
// public static void blockPredicate(java.util.function.Predicate value, ) { net.minecraft.world.Heightmap.blockPredicate = value; }

// public java.util.function.Predicate NOT_AIR() { return wrapperContained.NOT_AIR; }
// public void NOT_AIR(java.util.function.Predicate value) { wrapperContained.NOT_AIR = value; }
// public static java.util.function.Predicate NOT_AIR() { return net.minecraft.world.Heightmap.NOT_AIR; }
// public static void NOT_AIR(java.util.function.Predicate value, ) { net.minecraft.world.Heightmap.NOT_AIR = value; }

// public java.util.function.Predicate SUFFOCATES() { return wrapperContained.SUFFOCATES; }
// public void SUFFOCATES(java.util.function.Predicate value) { wrapperContained.SUFFOCATES = value; }
// public static java.util.function.Predicate SUFFOCATES() { return net.minecraft.world.Heightmap.SUFFOCATES; }
// public static void SUFFOCATES(java.util.function.Predicate value, ) { net.minecraft.world.Heightmap.SUFFOCATES = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.Heightmap.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.Heightmap.LOGGER = value; }

// public Heightmap(yarnwrap.world.chunk.Chunk chunk,Object type) { this.wrapperContained = new net.minecraft.world.Heightmap(chunk.wrapperContained,type); }
// public int toIndex(int x,int z) { return wrapperContained.toIndex(x,z); }
// public static int toIndex(int x,int z, ) { return net.minecraft.world.Heightmap.toIndex(x,z); }
public boolean trackUpdate(int x,int y,int z,yarnwrap.block.BlockState state) { return wrapperContained.trackUpdate(x,y,z,state.wrapperContained); }
// public static boolean trackUpdate(int x,int y,int z,yarnwrap.block.BlockState state, ) { return net.minecraft.world.Heightmap.trackUpdate(x,y,z,state.wrapperContained); }
public long[] asLongArray() { return wrapperContained.asLongArray(); }
// public static long[] asLongArray() { return net.minecraft.world.Heightmap.asLongArray(); }
// public void setTo(yarnwrap.world.chunk.Chunk chunk,Object type,long values) { wrapperContained.setTo(chunk.wrapperContained,type,values); }
// public static void setTo(yarnwrap.world.chunk.Chunk chunk,Object type,long values, ) { net.minecraft.world.Heightmap.setTo(chunk.wrapperContained,type,values); }
// public int get(int index) { return wrapperContained.get(index); }
// public static int get(int index, ) { return net.minecraft.world.Heightmap.get(index); }
// public void set(int x,int z,int height) { wrapperContained.set(x,z,height); }
// public static void set(int x,int z,int height, ) { net.minecraft.world.Heightmap.set(x,z,height); }
public int get(int x,int z) { return wrapperContained.get(x,z); }
// public static int get(int x,int z, ) { return net.minecraft.world.Heightmap.get(x,z); }
// public boolean method_16682(yarnwrap.block.BlockState state) { return wrapperContained.method_16682(state.wrapperContained); }
// public static boolean method_16682(yarnwrap.block.BlockState state, ) { return net.minecraft.world.Heightmap.method_16682(state.wrapperContained); }
// public void populateHeightmaps(yarnwrap.world.chunk.Chunk chunk,java.util.Set types) { wrapperContained.populateHeightmaps(chunk.wrapperContained,types); }
// public static void populateHeightmaps(yarnwrap.world.chunk.Chunk chunk,java.util.Set types, ) { net.minecraft.world.Heightmap.populateHeightmaps(chunk.wrapperContained,types); }
public int method_35334(int x,int z) { return wrapperContained.method_35334(x,z); }
// public static int method_35334(int x,int z, ) { return net.minecraft.world.Heightmap.method_35334(x,z); }

}