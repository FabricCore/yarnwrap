package yarnwrap.client.render.debug;
public class DebugRenderer { public net.minecraft.client.render.debug.DebugRenderer wrapperContained; public DebugRenderer(net.minecraft.client.render.debug.DebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.debug.VillageDebugRenderer villageDebugRenderer() { return new yarnwrap.client.render.debug.VillageDebugRenderer(wrapperContained.villageDebugRenderer); }
public yarnwrap.client.render.debug.GoalSelectorDebugRenderer goalSelectorDebugRenderer() { return new yarnwrap.client.render.debug.GoalSelectorDebugRenderer(wrapperContained.goalSelectorDebugRenderer); }
public yarnwrap.client.render.debug.RaidCenterDebugRenderer raidCenterDebugRenderer() { return new yarnwrap.client.render.debug.RaidCenterDebugRenderer(wrapperContained.raidCenterDebugRenderer); }
public yarnwrap.client.render.debug.GameTestDebugRenderer gameTestDebugRenderer() { return new yarnwrap.client.render.debug.GameTestDebugRenderer(wrapperContained.gameTestDebugRenderer); }
public yarnwrap.client.render.debug.BeeDebugRenderer beeDebugRenderer() { return new yarnwrap.client.render.debug.BeeDebugRenderer(wrapperContained.beeDebugRenderer); }
public yarnwrap.client.render.debug.VillageSectionsDebugRenderer villageSectionsDebugRenderer() { return new yarnwrap.client.render.debug.VillageSectionsDebugRenderer(wrapperContained.villageSectionsDebugRenderer); }
public yarnwrap.client.render.debug.GameEventDebugRenderer gameEventDebugRenderer() { return new yarnwrap.client.render.debug.GameEventDebugRenderer(wrapperContained.gameEventDebugRenderer); }
public yarnwrap.client.render.debug.LightDebugRenderer lightDebugRenderer() { return new yarnwrap.client.render.debug.LightDebugRenderer(wrapperContained.lightDebugRenderer); }
public Object supportingBlockDebugRenderer() { return wrapperContained.supportingBlockDebugRenderer; }
public Object blockOutlineDebugRenderer() { return wrapperContained.blockOutlineDebugRenderer; }
public yarnwrap.client.render.debug.PathfindingDebugRenderer pathfindingDebugRenderer() { return new yarnwrap.client.render.debug.PathfindingDebugRenderer(wrapperContained.pathfindingDebugRenderer); }
public Object waterDebugRenderer() { return wrapperContained.waterDebugRenderer; }
// public boolean showChunkBorder() { return wrapperContained.showChunkBorder; }
public Object chunkBorderDebugRenderer() { return wrapperContained.chunkBorderDebugRenderer; }
public Object chunkLoadingDebugRenderer() { return wrapperContained.chunkLoadingDebugRenderer; }
public Object collisionDebugRenderer() { return wrapperContained.collisionDebugRenderer; }
public Object neighborUpdateDebugRenderer() { return wrapperContained.neighborUpdateDebugRenderer; }
public Object skyLightDebugRenderer() { return wrapperContained.skyLightDebugRenderer; }
public Object worldGenAttemptDebugRenderer() { return wrapperContained.worldGenAttemptDebugRenderer; }
public Object heightmapDebugRenderer() { return wrapperContained.heightmapDebugRenderer; }
public yarnwrap.client.render.debug.StructureDebugRenderer structureDebugRenderer() { return new yarnwrap.client.render.debug.StructureDebugRenderer(wrapperContained.structureDebugRenderer); }
public yarnwrap.client.render.debug.BreezeDebugRenderer breezeDebugRenderer() { return new yarnwrap.client.render.debug.BreezeDebugRenderer(wrapperContained.breezeDebugRenderer); }
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