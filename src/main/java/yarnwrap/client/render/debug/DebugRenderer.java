package yarnwrap.client.render.debug;
public class DebugRenderer { public net.minecraft.client.render.debug.DebugRenderer wrapperContained; public DebugRenderer(net.minecraft.client.render.debug.DebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.debug.VillageDebugRenderer villageDebugRenderer() { return new yarnwrap.client.render.debug.VillageDebugRenderer(wrapperContained.villageDebugRenderer); }
// public void villageDebugRenderer(yarnwrap.client.render.debug.VillageDebugRenderer value) { wrapperContained.villageDebugRenderer = value.wrapperContained; }
public yarnwrap.client.render.debug.GoalSelectorDebugRenderer goalSelectorDebugRenderer() { return new yarnwrap.client.render.debug.GoalSelectorDebugRenderer(wrapperContained.goalSelectorDebugRenderer); }
// public void goalSelectorDebugRenderer(yarnwrap.client.render.debug.GoalSelectorDebugRenderer value) { wrapperContained.goalSelectorDebugRenderer = value.wrapperContained; }
public yarnwrap.client.render.debug.RaidCenterDebugRenderer raidCenterDebugRenderer() { return new yarnwrap.client.render.debug.RaidCenterDebugRenderer(wrapperContained.raidCenterDebugRenderer); }
// public void raidCenterDebugRenderer(yarnwrap.client.render.debug.RaidCenterDebugRenderer value) { wrapperContained.raidCenterDebugRenderer = value.wrapperContained; }
public yarnwrap.client.render.debug.GameTestDebugRenderer gameTestDebugRenderer() { return new yarnwrap.client.render.debug.GameTestDebugRenderer(wrapperContained.gameTestDebugRenderer); }
// public void gameTestDebugRenderer(yarnwrap.client.render.debug.GameTestDebugRenderer value) { wrapperContained.gameTestDebugRenderer = value.wrapperContained; }
public yarnwrap.client.render.debug.BeeDebugRenderer beeDebugRenderer() { return new yarnwrap.client.render.debug.BeeDebugRenderer(wrapperContained.beeDebugRenderer); }
// public void beeDebugRenderer(yarnwrap.client.render.debug.BeeDebugRenderer value) { wrapperContained.beeDebugRenderer = value.wrapperContained; }
public yarnwrap.client.render.debug.VillageSectionsDebugRenderer villageSectionsDebugRenderer() { return new yarnwrap.client.render.debug.VillageSectionsDebugRenderer(wrapperContained.villageSectionsDebugRenderer); }
// public void villageSectionsDebugRenderer(yarnwrap.client.render.debug.VillageSectionsDebugRenderer value) { wrapperContained.villageSectionsDebugRenderer = value.wrapperContained; }
public yarnwrap.client.render.debug.GameEventDebugRenderer gameEventDebugRenderer() { return new yarnwrap.client.render.debug.GameEventDebugRenderer(wrapperContained.gameEventDebugRenderer); }
// public void gameEventDebugRenderer(yarnwrap.client.render.debug.GameEventDebugRenderer value) { wrapperContained.gameEventDebugRenderer = value.wrapperContained; }
public yarnwrap.client.render.debug.LightDebugRenderer lightDebugRenderer() { return new yarnwrap.client.render.debug.LightDebugRenderer(wrapperContained.lightDebugRenderer); }
// public void lightDebugRenderer(yarnwrap.client.render.debug.LightDebugRenderer value) { wrapperContained.lightDebugRenderer = value.wrapperContained; }
public Object supportingBlockDebugRenderer() { return wrapperContained.supportingBlockDebugRenderer; }
// // public void supportingBlockDebugRenderer(Object value) { wrapperContained.supportingBlockDebugRenderer = value; }
public Object blockOutlineDebugRenderer() { return wrapperContained.blockOutlineDebugRenderer; }
// // public void blockOutlineDebugRenderer(Object value) { wrapperContained.blockOutlineDebugRenderer = value; }
public yarnwrap.client.render.debug.PathfindingDebugRenderer pathfindingDebugRenderer() { return new yarnwrap.client.render.debug.PathfindingDebugRenderer(wrapperContained.pathfindingDebugRenderer); }
// public void pathfindingDebugRenderer(yarnwrap.client.render.debug.PathfindingDebugRenderer value) { wrapperContained.pathfindingDebugRenderer = value.wrapperContained; }
public Object waterDebugRenderer() { return wrapperContained.waterDebugRenderer; }
// // public void waterDebugRenderer(Object value) { wrapperContained.waterDebugRenderer = value; }
// public boolean showChunkBorder() { return wrapperContained.showChunkBorder; }
// public void showChunkBorder(boolean value) { wrapperContained.showChunkBorder = value; }
public Object chunkBorderDebugRenderer() { return wrapperContained.chunkBorderDebugRenderer; }
// // public void chunkBorderDebugRenderer(Object value) { wrapperContained.chunkBorderDebugRenderer = value; }
public Object chunkLoadingDebugRenderer() { return wrapperContained.chunkLoadingDebugRenderer; }
// // public void chunkLoadingDebugRenderer(Object value) { wrapperContained.chunkLoadingDebugRenderer = value; }
public Object collisionDebugRenderer() { return wrapperContained.collisionDebugRenderer; }
// // public void collisionDebugRenderer(Object value) { wrapperContained.collisionDebugRenderer = value; }
public Object neighborUpdateDebugRenderer() { return wrapperContained.neighborUpdateDebugRenderer; }
// // public void neighborUpdateDebugRenderer(Object value) { wrapperContained.neighborUpdateDebugRenderer = value; }
public Object skyLightDebugRenderer() { return wrapperContained.skyLightDebugRenderer; }
// // public void skyLightDebugRenderer(Object value) { wrapperContained.skyLightDebugRenderer = value; }
public Object worldGenAttemptDebugRenderer() { return wrapperContained.worldGenAttemptDebugRenderer; }
// // public void worldGenAttemptDebugRenderer(Object value) { wrapperContained.worldGenAttemptDebugRenderer = value; }
public Object heightmapDebugRenderer() { return wrapperContained.heightmapDebugRenderer; }
// // public void heightmapDebugRenderer(Object value) { wrapperContained.heightmapDebugRenderer = value; }
public yarnwrap.client.render.debug.StructureDebugRenderer structureDebugRenderer() { return new yarnwrap.client.render.debug.StructureDebugRenderer(wrapperContained.structureDebugRenderer); }
// public void structureDebugRenderer(yarnwrap.client.render.debug.StructureDebugRenderer value) { wrapperContained.structureDebugRenderer = value.wrapperContained; }
public yarnwrap.client.render.debug.BreezeDebugRenderer breezeDebugRenderer() { return new yarnwrap.client.render.debug.BreezeDebugRenderer(wrapperContained.breezeDebugRenderer); }
// public void breezeDebugRenderer(yarnwrap.client.render.debug.BreezeDebugRenderer value) { wrapperContained.breezeDebugRenderer = value.wrapperContained; }
public void reset() { wrapperContained.reset(); }
public void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double minX,double minY,double minZ,double maxX,double maxY,double maxZ,float red,float green,float blue,float alpha) { wrapperContained.drawBox(matrices.wrapperContained,vertexConsumers.wrapperContained,minX,minY,minZ,maxX,maxY,maxZ,red,green,blue,alpha); }
// public void render(yarnwrap.client.util.math.MatrixStack matrices,Object vertexConsumers,double cameraX,double cameraY,double cameraZ) { wrapperContained.render(matrices.wrapperContained,vertexConsumers,cameraX,cameraY,cameraZ); }
public java.util.Optional getTargetedEntity(yarnwrap.entity.Entity entity,int maxDistance) { return wrapperContained.getTargetedEntity(entity.wrapperContained,maxDistance); }
public void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.Box box,float red,float green,float blue,float alpha) { wrapperContained.drawBox(matrices.wrapperContained,vertexConsumers.wrapperContained,box.wrapperContained,red,green,blue,alpha); }
public void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos,float expand,float red,float green,float blue,float alpha) { wrapperContained.drawBox(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained,expand,red,green,blue,alpha); }
public void drawBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos1,yarnwrap.util.math.BlockPos pos2,float red,float green,float blue,float alpha) { wrapperContained.drawBox(matrices.wrapperContained,vertexConsumers.wrapperContained,pos1.wrapperContained,pos2.wrapperContained,red,green,blue,alpha); }
public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,double x,double y,double z,int color) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,x,y,z,color); }
public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,double x,double y,double z,int color,float size) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,x,y,z,color,size); }
public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,double x,double y,double z,int color,float size,boolean center,float offset,boolean visibleThroughObjects) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,x,y,z,color,size,center,offset,visibleThroughObjects); }
public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,int x,int y,int z,int color) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,x,y,z,color); }
public boolean toggleShowChunkBorder() { return wrapperContained.toggleShowChunkBorder(); }
public void drawBlockBox(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos,float red,float green,float blue,float alpha) { wrapperContained.drawBlockBox(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained,red,green,blue,alpha); }

}