package yarnwrap.structure;
public class DesertTempleGenerator { public net.minecraft.structure.DesertTempleGenerator wrapperContained; public DesertTempleGenerator(net.minecraft.structure.DesertTempleGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean[] hasPlacedChest() { return wrapperContained.hasPlacedChest; }
public int WIDTH() { return wrapperContained.WIDTH; }
public int DEPTH() { return wrapperContained.DEPTH; }
// public java.util.List potentialSuspiciousSandPositions() { return wrapperContained.potentialSuspiciousSandPositions; }
// public yarnwrap.util.math.BlockPos basementMarkerPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.basementMarkerPos); }
// public void addPotentialSuspiciousSandPosition(int x,int y,int z) { wrapperContained.addPotentialSuspiciousSandPosition(x,y,z); }
// public void addSandOrSandstone(yarnwrap.world.StructureWorldAccess world,int x,int y,int z,yarnwrap.util.math.BlockBox chunkBox) { wrapperContained.addSandOrSandstone(world.wrapperContained,x,y,z,chunkBox.wrapperContained); }
// public void generateBasement(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox chunkBox) { wrapperContained.generateBasement(world.wrapperContained,chunkBox.wrapperContained); }
// public void generateBasementRoof(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox chunkBox,int startX,int y,int startZ,int endX,int endZ) { wrapperContained.generateBasementRoof(world.wrapperContained,chunkBox.wrapperContained,startX,y,startZ,endX,endZ); }
// public void addPotentialSuspiciousSandArea(int startX,int startY,int startZ,int endX,int endY,int endZ) { wrapperContained.addPotentialSuspiciousSandArea(startX,startY,startZ,endX,endY,endZ); }
// public void generateBasementStairs(yarnwrap.util.math.BlockPos pos,yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox chunkBox) { wrapperContained.generateBasementStairs(pos.wrapperContained,world.wrapperContained,chunkBox.wrapperContained); }
public java.util.List getPotentialSuspiciousSandPositions() { return wrapperContained.getPotentialSuspiciousSandPositions(); }
// public void generateSuspiciousSandRoom(yarnwrap.util.math.BlockPos pos,yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockBox chunkBox) { wrapperContained.generateSuspiciousSandRoom(pos.wrapperContained,world.wrapperContained,chunkBox.wrapperContained); }
public yarnwrap.util.math.BlockPos getBasementMarkerPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getBasementMarkerPos()); }

}