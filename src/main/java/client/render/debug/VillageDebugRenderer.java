package yarnwrap.client.render.debug;
public class VillageDebugRenderer { public net.minecraft.client.render.debug.VillageDebugRenderer wrapperContained; public VillageDebugRenderer(net.minecraft.client.render.debug.VillageDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public java.util.Map pointsOfInterest() { return wrapperContained.pointsOfInterest; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.util.Map brains() { return wrapperContained.brains; }
// public java.util.UUID targetedEntity() { return wrapperContained.targetedEntity; }
// public int YELLOW() { return wrapperContained.YELLOW; }
// public int AQUA() { return wrapperContained.AQUA; }
// public int GREEN() { return wrapperContained.GREEN; }
// public int GRAY() { return wrapperContained.GRAY; }
// public int PINK() { return wrapperContained.PINK; }
// public int RED() { return wrapperContained.RED; }
// public int ORANGE() { return wrapperContained.ORANGE; }
// public int POI_RANGE() { return wrapperContained.POI_RANGE; }
// public int BRAIN_RANGE() { return wrapperContained.BRAIN_RANGE; }
// public int TARGET_ENTITY_RANGE() { return wrapperContained.TARGET_ENTITY_RANGE; }
// public float DEFAULT_DRAWN_STRING_SIZE() { return wrapperContained.DEFAULT_DRAWN_STRING_SIZE; }
// public int WHITE() { return wrapperContained.WHITE; }
// public void addBrain(Object brain) { wrapperContained.addBrain(brain); }
public void removePointOfInterest(yarnwrap.util.math.BlockPos pos) { wrapperContained.removePointOfInterest(pos.wrapperContained); }
// public void addPointOfInterest(Object poi) { wrapperContained.addPointOfInterest(poi); }
public void setFreeTicketCount(yarnwrap.util.math.BlockPos pos,int freeTicketCount) { wrapperContained.setFreeTicketCount(pos.wrapperContained,freeTicketCount); }
// public void drawGhostPointOfInterest(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos,java.util.List brains) { wrapperContained.drawGhostPointOfInterest(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained,brains); }
// public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.Position pos,int offsetY,java.lang.String string,int color,float size) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained,offsetY,string,color,size); }
// public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,Object pointOfInterest,int offsetY,int color) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,pointOfInterest,offsetY,color); }
// public void drawString(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,java.lang.String string,yarnwrap.util.math.BlockPos pos,int offsetY,int color) { wrapperContained.drawString(matrices.wrapperContained,vertexConsumers.wrapperContained,string,pos.wrapperContained,offsetY,color); }
// public void draw(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,double x,double y,double z) { wrapperContained.draw(matrices.wrapperContained,vertexConsumers.wrapperContained,x,y,z); }
// public void drawPath(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object brain,double cameraX,double cameraY,double cameraZ) { wrapperContained.drawPath(matrices.wrapperContained,vertexConsumers.wrapperContained,brain,cameraX,cameraY,cameraZ); }
// public void drawPointOfInterestInfo(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object pointOfInterest) { wrapperContained.drawPointOfInterestInfo(matrices.wrapperContained,vertexConsumers.wrapperContained,pointOfInterest); }
// public void drawPointOfInterest(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,yarnwrap.util.math.BlockPos pos) { wrapperContained.drawPointOfInterest(matrices.wrapperContained,vertexConsumers.wrapperContained,pos.wrapperContained); }
// public void drawBrain(yarnwrap.client.util.math.MatrixStack matrices,yarnwrap.client.render.VertexConsumerProvider vertexConsumers,Object brain,double cameraX,double cameraY,double cameraZ) { wrapperContained.drawBrain(matrices.wrapperContained,vertexConsumers.wrapperContained,brain,cameraX,cameraY,cameraZ); }
// public java.util.Set getNamesOfPointOfInterestTicketHolders(Object pointOfInterest) { return wrapperContained.getNamesOfPointOfInterestTicketHolders(pointOfInterest); }
// public java.util.Collection getBrainsContainingPointOfInterest(yarnwrap.util.math.BlockPos pointOfInterest) { return wrapperContained.getBrainsContainingPointOfInterest(pointOfInterest.wrapperContained); }
// public java.util.Map getGhostPointsOfInterest() { return wrapperContained.getGhostPointsOfInterest(); }
// public boolean isTargeted(Object brain) { return wrapperContained.isTargeted(brain); }
// public void updateTargetedEntity() { wrapperContained.updateTargetedEntity(); }
// public boolean isClose(Object brain) { return wrapperContained.isClose(brain); }
// public void removeRemovedBrains() { wrapperContained.removeRemovedBrains(); }
// public java.util.Set getNamesOfJobSitePotentialOwners(Object potentialJobSite) { return wrapperContained.getNamesOfJobSitePotentialOwners(potentialJobSite); }
// public java.util.Collection getBrainsContainingPotentialJobSite(yarnwrap.util.math.BlockPos potentialJobSite) { return wrapperContained.getBrainsContainingPotentialJobSite(potentialJobSite.wrapperContained); }
public void removeBrain(int entityId) { wrapperContained.removeBrain(entityId); }

}