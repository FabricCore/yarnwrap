package yarnwrap.structure;
public class DesertTempleGenerator { public net.minecraft.structure.DesertTempleGenerator wrapperContained; public DesertTempleGenerator(net.minecraft.structure.DesertTempleGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean[] hasPlacedChest() { return wrapperContained.hasPlacedChest; }
// public void hasPlacedChest(boolean[] value) { wrapperContained.hasPlacedChest = value; }
// public static boolean[] hasPlacedChest() { return net.minecraft.structure.DesertTempleGenerator.hasPlacedChest; }
// public static void hasPlacedChest(boolean[] value, ) { net.minecraft.structure.DesertTempleGenerator.hasPlacedChest = value; }

// public int WIDTH() { return wrapperContained.WIDTH; }
// public void WIDTH(int value) { wrapperContained.WIDTH = value; }
public static int WIDTH() { return net.minecraft.structure.DesertTempleGenerator.WIDTH; }
// public static void WIDTH(int value, ) { net.minecraft.structure.DesertTempleGenerator.WIDTH = value; }

// public int DEPTH() { return wrapperContained.DEPTH; }
// public void DEPTH(int value) { wrapperContained.DEPTH = value; }
public static int DEPTH() { return net.minecraft.structure.DesertTempleGenerator.DEPTH; }
// public static void DEPTH(int value, ) { net.minecraft.structure.DesertTempleGenerator.DEPTH = value; }

// public java.util.List potentialSuspiciousSandPositions() { return wrapperContained.potentialSuspiciousSandPositions; }
// public void potentialSuspiciousSandPositions(java.util.List value) { wrapperContained.potentialSuspiciousSandPositions = value; }
// public static java.util.List potentialSuspiciousSandPositions() { return net.minecraft.structure.DesertTempleGenerator.potentialSuspiciousSandPositions; }
// public static void potentialSuspiciousSandPositions(java.util.List value, ) { net.minecraft.structure.DesertTempleGenerator.potentialSuspiciousSandPositions = value; }

// public yarnwrap.util.math.BlockPos basementMarkerPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.basementMarkerPos); }
// public void basementMarkerPos(yarnwrap.util.math.BlockPos value) { wrapperContained.basementMarkerPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos basementMarkerPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.structure.DesertTempleGenerator.basementMarkerPos); }
// public static void basementMarkerPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.structure.DesertTempleGenerator.basementMarkerPos = value.wrapperContained; }

public DesertTempleGenerator(yarnwrap.nbt.NbtCompound nbt) { this.wrapperContained = new net.minecraft.structure.DesertTempleGenerator(nbt.wrapperContained); }
public DesertTempleGenerator(yarnwrap.util.math.random.Random random,int x,int z) { this.wrapperContained = new net.minecraft.structure.DesertTempleGenerator(random.wrapperContained,x,z); }
// public void addPotentialSuspiciousSandPosition(int x,int y,int z) { wrapperContained.addPotentialSuspiciousSandPosition(x,y,z); }
// public static void addPotentialSuspiciousSandPosition(int x,int y,int z, ) { net.minecraft.structure.DesertTempleGenerator.addPotentialSuspiciousSandPosition(x,y,z); }
// public void addSandOrSandstone(yarnwrap.world.StructureWorldAccess world,int x,int y,int z,yarnwrap.util.math.BlockBox chunkBox) { wrapperContained.addSandOrSandstone(world.wrapperContained,x,y,z,chunkBox.wrapperContained); }
// public static void addSandOrSandstone(yarnwrap.world.StructureWorldAccess world,int x,int y,int z,yarnwrap.util.math.BlockBox chunkBox, ) { net.minecraft.structure.DesertTempleGenerator.addSandOrSandstone(world.wrapperContained,x,y,z,chunkBox.wrapperContained); }
// public void generateBasement(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox chunkBox) { wrapperContained.generateBasement(world.wrapperContained,chunkBox.wrapperContained); }
// public static void generateBasement(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox chunkBox, ) { net.minecraft.structure.DesertTempleGenerator.generateBasement(world.wrapperContained,chunkBox.wrapperContained); }
// public void generateBasementRoof(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox chunkBox,int startX,int y,int startZ,int endX,int endZ) { wrapperContained.generateBasementRoof(world.wrapperContained,chunkBox.wrapperContained,startX,y,startZ,endX,endZ); }
// public static void generateBasementRoof(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox chunkBox,int startX,int y,int startZ,int endX,int endZ, ) { net.minecraft.structure.DesertTempleGenerator.generateBasementRoof(world.wrapperContained,chunkBox.wrapperContained,startX,y,startZ,endX,endZ); }
// public void addPotentialSuspiciousSandArea(int startX,int startY,int startZ,int endX,int endY,int endZ) { wrapperContained.addPotentialSuspiciousSandArea(startX,startY,startZ,endX,endY,endZ); }
// public static void addPotentialSuspiciousSandArea(int startX,int startY,int startZ,int endX,int endY,int endZ, ) { net.minecraft.structure.DesertTempleGenerator.addPotentialSuspiciousSandArea(startX,startY,startZ,endX,endY,endZ); }
// public void generateBasementStairs(yarnwrap.util.math.BlockPos pos,yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox chunkBox) { wrapperContained.generateBasementStairs(pos.wrapperContained,world.wrapperContained,chunkBox.wrapperContained); }
// public static void generateBasementStairs(yarnwrap.util.math.BlockPos pos,yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox chunkBox, ) { net.minecraft.structure.DesertTempleGenerator.generateBasementStairs(pos.wrapperContained,world.wrapperContained,chunkBox.wrapperContained); }
public java.util.List getPotentialSuspiciousSandPositions() { return wrapperContained.getPotentialSuspiciousSandPositions(); }
// public static java.util.List getPotentialSuspiciousSandPositions() { return net.minecraft.structure.DesertTempleGenerator.getPotentialSuspiciousSandPositions(); }
// public void generateSuspiciousSandRoom(yarnwrap.util.math.BlockPos pos,yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox chunkBox) { wrapperContained.generateSuspiciousSandRoom(pos.wrapperContained,world.wrapperContained,chunkBox.wrapperContained); }
// public static void generateSuspiciousSandRoom(yarnwrap.util.math.BlockPos pos,yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox chunkBox, ) { net.minecraft.structure.DesertTempleGenerator.generateSuspiciousSandRoom(pos.wrapperContained,world.wrapperContained,chunkBox.wrapperContained); }
public yarnwrap.util.math.BlockPos getBasementMarkerPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getBasementMarkerPos()); }
// public static yarnwrap.util.math.BlockPos getBasementMarkerPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.structure.DesertTempleGenerator.getBasementMarkerPos()); }

}