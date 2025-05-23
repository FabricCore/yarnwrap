package yarnwrap.client.render.debug;
public class DebugRenderer { public net.minecraft.client.render.debug.DebugRenderer wrapperContained; public DebugRenderer(net.minecraft.client.render.debug.DebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

public Object blockOutlineDebugRenderer() { return wrapperContained.blockOutlineDebugRenderer; }
// // public void blockOutlineDebugRenderer(Object value) { wrapperContained.blockOutlineDebugRenderer = value; }
// // public static Object blockOutlineDebugRenderer() { return net.minecraft.client.render.debug.DebugRenderer.blockOutlineDebugRenderer; }
// // public static void blockOutlineDebugRenderer(Object value, ) { net.minecraft.client.render.debug.DebugRenderer.blockOutlineDebugRenderer = value; }

public yarnwrap.client.render.debug.PathfindingDebugRenderer pathfindingDebugRenderer() { return new yarnwrap.client.render.debug.PathfindingDebugRenderer(wrapperContained.pathfindingDebugRenderer); }
// public void pathfindingDebugRenderer(yarnwrap.client.render.debug.PathfindingDebugRenderer value) { wrapperContained.pathfindingDebugRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.debug.PathfindingDebugRenderer pathfindingDebugRenderer() { return new yarnwrap.client.render.debug.PathfindingDebugRenderer(net.minecraft.client.render.debug.DebugRenderer.pathfindingDebugRenderer); }
// public static void pathfindingDebugRenderer(yarnwrap.client.render.debug.PathfindingDebugRenderer value, ) { net.minecraft.client.render.debug.DebugRenderer.pathfindingDebugRenderer = value.wrapperContained; }

public Object waterDebugRenderer() { return wrapperContained.waterDebugRenderer; }
// // public void waterDebugRenderer(Object value) { wrapperContained.waterDebugRenderer = value; }
// // public static Object waterDebugRenderer() { return net.minecraft.client.render.debug.DebugRenderer.waterDebugRenderer; }
// // public static void waterDebugRenderer(Object value, ) { net.minecraft.client.render.debug.DebugRenderer.waterDebugRenderer = value; }

// public boolean showChunkBorder() { return wrapperContained.showChunkBorder; }
// public void showChunkBorder(boolean value) { wrapperContained.showChunkBorder = value; }
// public static boolean showChunkBorder() { return net.minecraft.client.render.debug.DebugRenderer.showChunkBorder; }
// public static void showChunkBorder(boolean value, ) { net.minecraft.client.render.debug.DebugRenderer.showChunkBorder = value; }

public Object chunkBorderDebugRenderer() { return wrapperContained.chunkBorderDebugRenderer; }
// // public void chunkBorderDebugRenderer(Object value) { wrapperContained.chunkBorderDebugRenderer = value; }
// // public static Object chunkBorderDebugRenderer() { return net.minecraft.client.render.debug.DebugRenderer.chunkBorderDebugRenderer; }
// // public static void chunkBorderDebugRenderer(Object value, ) { net.minecraft.client.render.debug.DebugRenderer.chunkBorderDebugRenderer = value; }

public Object chunkLoadingDebugRenderer() { return wrapperContained.chunkLoadingDebugRenderer; }
// // public void chunkLoadingDebugRenderer(Object value) { wrapperContained.chunkLoadingDebugRenderer = value; }
// // public static Object chunkLoadingDebugRenderer() { return net.minecraft.client.render.debug.DebugRenderer.chunkLoadingDebugRenderer; }
// // public static void chunkLoadingDebugRenderer(Object value, ) { net.minecraft.client.render.debug.DebugRenderer.chunkLoadingDebugRenderer = value; }

public Object collisionDebugRenderer() { return wrapperContained.collisionDebugRenderer; }
// // public void collisionDebugRenderer(Object value) { wrapperContained.collisionDebugRenderer = value; }
// // public static Object collisionDebugRenderer() { return net.minecraft.client.render.debug.DebugRenderer.collisionDebugRenderer; }
// // public static void collisionDebugRenderer(Object value, ) { net.minecraft.client.render.debug.DebugRenderer.collisionDebugRenderer = value; }

public yarnwrap.client.render.debug.NeighborUpdateDebugRenderer neighborUpdateDebugRenderer() { return new yarnwrap.client.render.debug.NeighborUpdateDebugRenderer(wrapperContained.neighborUpdateDebugRenderer); }
// public void neighborUpdateDebugRenderer(yarnwrap.client.render.debug.NeighborUpdateDebugRenderer value) { wrapperContained.neighborUpdateDebugRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.debug.NeighborUpdateDebugRenderer neighborUpdateDebugRenderer() { return new yarnwrap.client.render.debug.NeighborUpdateDebugRenderer(net.minecraft.client.render.debug.DebugRenderer.neighborUpdateDebugRenderer); }
// public static void neighborUpdateDebugRenderer(yarnwrap.client.render.debug.NeighborUpdateDebugRenderer value, ) { net.minecraft.client.render.debug.DebugRenderer.neighborUpdateDebugRenderer = value.wrapperContained; }

public Object skyLightDebugRenderer() { return wrapperContained.skyLightDebugRenderer; }
// // public void skyLightDebugRenderer(Object value) { wrapperContained.skyLightDebugRenderer = value; }
// // public static Object skyLightDebugRenderer() { return net.minecraft.client.render.debug.DebugRenderer.skyLightDebugRenderer; }
// // public static void skyLightDebugRenderer(Object value, ) { net.minecraft.client.render.debug.DebugRenderer.skyLightDebugRenderer = value; }

public Object worldGenAttemptDebugRenderer() { return wrapperContained.worldGenAttemptDebugRenderer; }
// // public void worldGenAttemptDebugRenderer(Object value) { wrapperContained.worldGenAttemptDebugRenderer = value; }
// // public static Object worldGenAttemptDebugRenderer() { return net.minecraft.client.render.debug.DebugRenderer.worldGenAttemptDebugRenderer; }
// // public static void worldGenAttemptDebugRenderer(Object value, ) { net.minecraft.client.render.debug.DebugRenderer.worldGenAttemptDebugRenderer = value; }

public Object heightmapDebugRenderer() { return wrapperContained.heightmapDebugRenderer; }
// // public void heightmapDebugRenderer(Object value) { wrapperContained.heightmapDebugRenderer = value; }
// // public static Object heightmapDebugRenderer() { return net.minecraft.client.render.debug.DebugRenderer.heightmapDebugRenderer; }
// // public static void heightmapDebugRenderer(Object value, ) { net.minecraft.client.render.debug.DebugRenderer.heightmapDebugRenderer = value; }

public yarnwrap.client.render.debug.StructureDebugRenderer structureDebugRenderer() { return new yarnwrap.client.render.debug.StructureDebugRenderer(wrapperContained.structureDebugRenderer); }
// public void structureDebugRenderer(yarnwrap.client.render.debug.StructureDebugRenderer value) { wrapperContained.structureDebugRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.debug.StructureDebugRenderer structureDebugRenderer() { return new yarnwrap.client.render.debug.StructureDebugRenderer(net.minecraft.client.render.debug.DebugRenderer.structureDebugRenderer); }
// public static void structureDebugRenderer(yarnwrap.client.render.debug.StructureDebugRenderer value, ) { net.minecraft.client.render.debug.DebugRenderer.structureDebugRenderer = value.wrapperContained; }

public yarnwrap.client.render.debug.VillageDebugRenderer villageDebugRenderer() { return new yarnwrap.client.render.debug.VillageDebugRenderer(wrapperContained.villageDebugRenderer); }
// public void villageDebugRenderer(yarnwrap.client.render.debug.VillageDebugRenderer value) { wrapperContained.villageDebugRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.debug.VillageDebugRenderer villageDebugRenderer() { return new yarnwrap.client.render.debug.VillageDebugRenderer(net.minecraft.client.render.debug.DebugRenderer.villageDebugRenderer); }
// public static void villageDebugRenderer(yarnwrap.client.render.debug.VillageDebugRenderer value, ) { net.minecraft.client.render.debug.DebugRenderer.villageDebugRenderer = value.wrapperContained; }

public yarnwrap.client.render.debug.GoalSelectorDebugRenderer goalSelectorDebugRenderer() { return new yarnwrap.client.render.debug.GoalSelectorDebugRenderer(wrapperContained.goalSelectorDebugRenderer); }
// public void goalSelectorDebugRenderer(yarnwrap.client.render.debug.GoalSelectorDebugRenderer value) { wrapperContained.goalSelectorDebugRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.debug.GoalSelectorDebugRenderer goalSelectorDebugRenderer() { return new yarnwrap.client.render.debug.GoalSelectorDebugRenderer(net.minecraft.client.render.debug.DebugRenderer.goalSelectorDebugRenderer); }
// public static void goalSelectorDebugRenderer(yarnwrap.client.render.debug.GoalSelectorDebugRenderer value, ) { net.minecraft.client.render.debug.DebugRenderer.goalSelectorDebugRenderer = value.wrapperContained; }

public yarnwrap.client.render.debug.RaidCenterDebugRenderer raidCenterDebugRenderer() { return new yarnwrap.client.render.debug.RaidCenterDebugRenderer(wrapperContained.raidCenterDebugRenderer); }
// public void raidCenterDebugRenderer(yarnwrap.client.render.debug.RaidCenterDebugRenderer value) { wrapperContained.raidCenterDebugRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.debug.RaidCenterDebugRenderer raidCenterDebugRenderer() { return new yarnwrap.client.render.debug.RaidCenterDebugRenderer(net.minecraft.client.render.debug.DebugRenderer.raidCenterDebugRenderer); }
// public static void raidCenterDebugRenderer(yarnwrap.client.render.debug.RaidCenterDebugRenderer value, ) { net.minecraft.client.render.debug.DebugRenderer.raidCenterDebugRenderer = value.wrapperContained; }

public yarnwrap.client.render.debug.GameTestDebugRenderer gameTestDebugRenderer() { return new yarnwrap.client.render.debug.GameTestDebugRenderer(wrapperContained.gameTestDebugRenderer); }
// public void gameTestDebugRenderer(yarnwrap.client.render.debug.GameTestDebugRenderer value) { wrapperContained.gameTestDebugRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.debug.GameTestDebugRenderer gameTestDebugRenderer() { return new yarnwrap.client.render.debug.GameTestDebugRenderer(net.minecraft.client.render.debug.DebugRenderer.gameTestDebugRenderer); }
// public static void gameTestDebugRenderer(yarnwrap.client.render.debug.GameTestDebugRenderer value, ) { net.minecraft.client.render.debug.DebugRenderer.gameTestDebugRenderer = value.wrapperContained; }

public yarnwrap.client.render.debug.BeeDebugRenderer beeDebugRenderer() { return new yarnwrap.client.render.debug.BeeDebugRenderer(wrapperContained.beeDebugRenderer); }
// public void beeDebugRenderer(yarnwrap.client.render.debug.BeeDebugRenderer value) { wrapperContained.beeDebugRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.debug.BeeDebugRenderer beeDebugRenderer() { return new yarnwrap.client.render.debug.BeeDebugRenderer(net.minecraft.client.render.debug.DebugRenderer.beeDebugRenderer); }
// public static void beeDebugRenderer(yarnwrap.client.render.debug.BeeDebugRenderer value, ) { net.minecraft.client.render.debug.DebugRenderer.beeDebugRenderer = value.wrapperContained; }

public yarnwrap.client.render.debug.VillageSectionsDebugRenderer villageSectionsDebugRenderer() { return new yarnwrap.client.render.debug.VillageSectionsDebugRenderer(wrapperContained.villageSectionsDebugRenderer); }
// public void villageSectionsDebugRenderer(yarnwrap.client.render.debug.VillageSectionsDebugRenderer value) { wrapperContained.villageSectionsDebugRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.debug.VillageSectionsDebugRenderer villageSectionsDebugRenderer() { return new yarnwrap.client.render.debug.VillageSectionsDebugRenderer(net.minecraft.client.render.debug.DebugRenderer.villageSectionsDebugRenderer); }
// public static void villageSectionsDebugRenderer(yarnwrap.client.render.debug.VillageSectionsDebugRenderer value, ) { net.minecraft.client.render.debug.DebugRenderer.villageSectionsDebugRenderer = value.wrapperContained; }

public yarnwrap.client.render.debug.GameEventDebugRenderer gameEventDebugRenderer() { return new yarnwrap.client.render.debug.GameEventDebugRenderer(wrapperContained.gameEventDebugRenderer); }
// public void gameEventDebugRenderer(yarnwrap.client.render.debug.GameEventDebugRenderer value) { wrapperContained.gameEventDebugRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.debug.GameEventDebugRenderer gameEventDebugRenderer() { return new yarnwrap.client.render.debug.GameEventDebugRenderer(net.minecraft.client.render.debug.DebugRenderer.gameEventDebugRenderer); }
// public static void gameEventDebugRenderer(yarnwrap.client.render.debug.GameEventDebugRenderer value, ) { net.minecraft.client.render.debug.DebugRenderer.gameEventDebugRenderer = value.wrapperContained; }

public yarnwrap.client.render.debug.LightDebugRenderer lightDebugRenderer() { return new yarnwrap.client.render.debug.LightDebugRenderer(wrapperContained.lightDebugRenderer); }
// public void lightDebugRenderer(yarnwrap.client.render.debug.LightDebugRenderer value) { wrapperContained.lightDebugRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.debug.LightDebugRenderer lightDebugRenderer() { return new yarnwrap.client.render.debug.LightDebugRenderer(net.minecraft.client.render.debug.DebugRenderer.lightDebugRenderer); }
// public static void lightDebugRenderer(yarnwrap.client.render.debug.LightDebugRenderer value, ) { net.minecraft.client.render.debug.DebugRenderer.lightDebugRenderer = value.wrapperContained; }

public Object supportingBlockDebugRenderer() { return wrapperContained.supportingBlockDebugRenderer; }
// // public void supportingBlockDebugRenderer(Object value) { wrapperContained.supportingBlockDebugRenderer = value; }
// // public static Object supportingBlockDebugRenderer() { return net.minecraft.client.render.debug.DebugRenderer.supportingBlockDebugRenderer; }
// // public static void supportingBlockDebugRenderer(Object value, ) { net.minecraft.client.render.debug.DebugRenderer.supportingBlockDebugRenderer = value; }

public yarnwrap.client.render.debug.BreezeDebugRenderer breezeDebugRenderer() { return new yarnwrap.client.render.debug.BreezeDebugRenderer(wrapperContained.breezeDebugRenderer); }
// public void breezeDebugRenderer(yarnwrap.client.render.debug.BreezeDebugRenderer value) { wrapperContained.breezeDebugRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.debug.BreezeDebugRenderer breezeDebugRenderer() { return new yarnwrap.client.render.debug.BreezeDebugRenderer(net.minecraft.client.render.debug.DebugRenderer.breezeDebugRenderer); }
// public static void breezeDebugRenderer(yarnwrap.client.render.debug.BreezeDebugRenderer value, ) { net.minecraft.client.render.debug.DebugRenderer.breezeDebugRenderer = value.wrapperContained; }

public yarnwrap.client.render.debug.RedstoneUpdateOrderDebugRenderer redstoneUpdateOrderDebugRenderer() { return new yarnwrap.client.render.debug.RedstoneUpdateOrderDebugRenderer(wrapperContained.redstoneUpdateOrderDebugRenderer); }
// public void redstoneUpdateOrderDebugRenderer(yarnwrap.client.render.debug.RedstoneUpdateOrderDebugRenderer value) { wrapperContained.redstoneUpdateOrderDebugRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.debug.RedstoneUpdateOrderDebugRenderer redstoneUpdateOrderDebugRenderer() { return new yarnwrap.client.render.debug.RedstoneUpdateOrderDebugRenderer(net.minecraft.client.render.debug.DebugRenderer.redstoneUpdateOrderDebugRenderer); }
// public static void redstoneUpdateOrderDebugRenderer(yarnwrap.client.render.debug.RedstoneUpdateOrderDebugRenderer value, ) { net.minecraft.client.render.debug.DebugRenderer.redstoneUpdateOrderDebugRenderer = value.wrapperContained; }

public yarnwrap.client.render.debug.ChunkDebugRenderer chunkDebugRenderer() { return new yarnwrap.client.render.debug.ChunkDebugRenderer(wrapperContained.chunkDebugRenderer); }
// public void chunkDebugRenderer(yarnwrap.client.render.debug.ChunkDebugRenderer value) { wrapperContained.chunkDebugRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.debug.ChunkDebugRenderer chunkDebugRenderer() { return new yarnwrap.client.render.debug.ChunkDebugRenderer(net.minecraft.client.render.debug.DebugRenderer.chunkDebugRenderer); }
// public static void chunkDebugRenderer(yarnwrap.client.render.debug.ChunkDebugRenderer value, ) { net.minecraft.client.render.debug.DebugRenderer.chunkDebugRenderer = value.wrapperContained; }

public yarnwrap.client.render.debug.OctreeDebugRenderer octreeDebugRenderer() { return new yarnwrap.client.render.debug.OctreeDebugRenderer(wrapperContained.octreeDebugRenderer); }
// public void octreeDebugRenderer(yarnwrap.client.render.debug.OctreeDebugRenderer value) { wrapperContained.octreeDebugRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.debug.OctreeDebugRenderer octreeDebugRenderer() { return new yarnwrap.client.render.debug.OctreeDebugRenderer(net.minecraft.client.render.debug.DebugRenderer.octreeDebugRenderer); }
// public static void octreeDebugRenderer(yarnwrap.client.render.debug.OctreeDebugRenderer value, ) { net.minecraft.client.render.debug.DebugRenderer.octreeDebugRenderer = value.wrapperContained; }

// public boolean showOctree() { return wrapperContained.showOctree; }
// public void showOctree(boolean value) { wrapperContained.showOctree = value; }
// public static boolean showOctree() { return net.minecraft.client.render.debug.DebugRenderer.showOctree; }
// public static void showOctree(boolean value, ) { net.minecraft.client.render.debug.DebugRenderer.showOctree = value; }

public DebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.DebugRenderer(client.wrapperContained); }
public boolean toggleShowChunkBorder() { return wrapperContained.toggleShowChunkBorder(); }
// public static boolean toggleShowChunkBorder() { return net.minecraft.client.render.debug.DebugRenderer.toggleShowChunkBorder(); }
public void reset() { wrapperContained.reset(); }
// public static void reset() { net.minecraft.client.render.debug.DebugRenderer.reset(); }
// public void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double minX,double minY,double minZ,double maxX,double maxY,double maxZ,float red,float green,float blue,float alpha) { wrapperContained.drawBox(matrices.wrapperContained,vertexConsumers.wrapperContained,minX,minY,minZ,maxX,maxY,maxZ,red,green,blue,alpha); }
// public static void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double minX,double minY,double minZ,double maxX,double maxY,double maxZ,float red,float green,float blue,float alpha, ) { net.minecraft.client.render.debug.DebugRenderer.drawBox(matrices.wrapperContained,vertexConsumers.wrapperContained,minX,minY,minZ,maxX,maxY,maxZ,red,green,blue,alpha); }
// public void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.Frustum frustum,Object vertexConsumers,double cameraX,double cameraY,double cameraZ) { wrapperContained.render(matrices.wrapperContained,frustum.wrapperContained,vertexConsumers,cameraX,cameraY,cameraZ); }
// public static void render(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.Frustum frustum,Object vertexConsumers,double cameraX,double cameraY,double cameraZ, ) { net.minecraft.client.render.debug.DebugRenderer.render(matrices.wrapperContained,frustum.wrapperContained,vertexConsumers,cameraX,cameraY,cameraZ); }
// public java.util.Optional getTargetedEntity(yarnwrap.entity.Entity entity,int maxDistance) { return wrapperContained.getTargetedEntity(entity.wrapperContained,maxDistance); }
// public static java.util.Optional getTargetedEntity(yarnwrap.entity.Entity entity,int maxDistance, ) { return net.minecraft.client.render.debug.DebugRenderer.getTargetedEntity(entity.wrapperContained,maxDistance); }
// public void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.Box box,float red,float green,float blue,float alpha) { wrapperContained.drawBox(matrices.wrapperContained,vertexConsumers.wrapperContained,box.wrapperContained,red,green,blue,alpha); }
// public static void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.Box box,float red,float green,float blue,float alpha, ) { net.minecraft.client.render.debug.DebugRenderer.drawBox(matrices.wrapperContained,vertexConsumers.wrapperContained,box.wrapperContained,red,green,blue,alpha); }
// public void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos,float expand,float red,float green,float blue,float alpha) { wrapperContained.drawBox(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained,expand,red,green,blue,alpha); }
// public static void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos,float expand,float red,float green,float blue,float alpha, ) { net.minecraft.client.render.debug.DebugRenderer.drawBox(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained,expand,red,green,blue,alpha); }
// public void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos1,yarnwrap.util.math.BlockPos pos2,float red,float green,float blue,float alpha) { wrapperContained.drawBox(matrices.wrapperContained,vertexConsumers.wrapperContained,pos1.wrapperContained,pos2.wrapperContained,red,green,blue,alpha); }
// public static void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos1,yarnwrap.util.math.BlockPos pos2,float red,float green,float blue,float alpha, ) { net.minecraft.client.render.debug.DebugRenderer.drawBox(matrices.wrapperContained,vertexConsumers.wrapperContained,pos1.wrapperContained,pos2.wrapperContained,red,green,blue,alpha); }
// public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,double x,double y,double z,int color) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,x,y,z,color); }
// public static void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,double x,double y,double z,int color, ) { net.minecraft.client.render.debug.DebugRenderer.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,x,y,z,color); }
// public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,double x,double y,double z,int color,float size) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,x,y,z,color,size); }
// public static void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,double x,double y,double z,int color,float size, ) { net.minecraft.client.render.debug.DebugRenderer.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,x,y,z,color,size); }
// public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,double x,double y,double z,int color,float size,boolean center,float offset,boolean visibleThroughObjects) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,x,y,z,color,size,center,offset,visibleThroughObjects); }
// public static void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,double x,double y,double z,int color,float size,boolean center,float offset,boolean visibleThroughObjects, ) { net.minecraft.client.render.debug.DebugRenderer.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,x,y,z,color,size,center,offset,visibleThroughObjects); }
// public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,int x,int y,int z,int color) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,x,y,z,color); }
// public static void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,int x,int y,int z,int color, ) { net.minecraft.client.render.debug.DebugRenderer.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,x,y,z,color); }
// public void drawBlockBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos,float red,float green,float blue,float alpha) { wrapperContained.drawBlockBox(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained,red,green,blue,alpha); }
// public static void drawBlockBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos,float red,float green,float blue,float alpha, ) { net.minecraft.client.render.debug.DebugRenderer.drawBlockBox(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained,red,green,blue,alpha); }
// public yarnwrap.util.math.Vec3d hueToRgb(float hue) { return new yarnwrap.util.math.Vec3d(wrapperContained.hueToRgb(hue)); }
// public static yarnwrap.util.math.Vec3d hueToRgb(float hue, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.debug.DebugRenderer.hueToRgb(hue)); }
// public yarnwrap.util.math.Vec3d shiftHue(float r,float g,float b,float dHue) { return new yarnwrap.util.math.Vec3d(wrapperContained.shiftHue(r,g,b,dHue)); }
// public static yarnwrap.util.math.Vec3d shiftHue(float r,float g,float b,float dHue, ) { return new yarnwrap.util.math.Vec3d(net.minecraft.client.render.debug.DebugRenderer.shiftHue(r,g,b,dHue)); }
// public void drawVoxelShapeOutlines(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.shape.VoxelShape shape,double offsetX,double offsetY,double offsetZ,float red,float green,float blue,float alpha) { wrapperContained.drawVoxelShapeOutlines(matrices.wrapperContained,vertexConsumer.wrapperContained,shape.wrapperContained,offsetX,offsetY,offsetZ,red,green,blue,alpha); }
// public static void drawVoxelShapeOutlines(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumer vertexConsumer,yarnwrap.util.shape.VoxelShape shape,double offsetX,double offsetY,double offsetZ,float red,float green,float blue,float alpha, ) { net.minecraft.client.render.debug.DebugRenderer.drawVoxelShapeOutlines(matrices.wrapperContained,vertexConsumer.wrapperContained,shape.wrapperContained,offsetX,offsetY,offsetZ,red,green,blue,alpha); }
// public void renderLate(yarnwrap.client.util.math.MatrixStack matrices,Object vertexConsumers,double cameraX,double cameraY,double cameraZ) { wrapperContained.renderLate(matrices.wrapperContained,vertexConsumers,cameraX,cameraY,cameraZ); }
// public static void renderLate(yarnwrap.client.util.math.MatrixStack matrices,Object vertexConsumers,double cameraX,double cameraY,double cameraZ, ) { net.minecraft.client.render.debug.DebugRenderer.renderLate(matrices.wrapperContained,vertexConsumers,cameraX,cameraY,cameraZ); }
public boolean toggleShowOctree() { return wrapperContained.toggleShowOctree(); }
// public static boolean toggleShowOctree() { return net.minecraft.client.render.debug.DebugRenderer.toggleShowOctree(); }

}