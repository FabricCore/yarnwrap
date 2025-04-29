package yarnwrap.structure;
public class SwampHutGenerator { public net.minecraft.structure.SwampHutGenerator wrapperContained; public SwampHutGenerator(net.minecraft.structure.SwampHutGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean hasWitch() { return wrapperContained.hasWitch; }
// public void hasWitch(boolean value) { wrapperContained.hasWitch = value; }
// public static boolean hasWitch() { return net.minecraft.structure.SwampHutGenerator.hasWitch; }
// public static void hasWitch(boolean value, ) { net.minecraft.structure.SwampHutGenerator.hasWitch = value; }

// public boolean hasCat() { return wrapperContained.hasCat; }
// public void hasCat(boolean value) { wrapperContained.hasCat = value; }
// public static boolean hasCat() { return net.minecraft.structure.SwampHutGenerator.hasCat; }
// public static void hasCat(boolean value, ) { net.minecraft.structure.SwampHutGenerator.hasCat = value; }

public SwampHutGenerator(yarnwrap.nbt.NbtCompound nbt) { this.wrapperContained = new net.minecraft.structure.SwampHutGenerator(nbt.wrapperContained); }
public SwampHutGenerator(yarnwrap.util.math.random.Random random,int x,int z) { this.wrapperContained = new net.minecraft.structure.SwampHutGenerator(random.wrapperContained,x,z); }
// public void spawnCat(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.BlockBox box) { wrapperContained.spawnCat(world.wrapperContained,box.wrapperContained); }
// public static void spawnCat(yarnwrap.world.ServerWorldAccess world,yarnwrap.util.math.BlockBox box, ) { net.minecraft.structure.SwampHutGenerator.spawnCat(world.wrapperContained,box.wrapperContained); }

}