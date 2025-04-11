package yarnwrap.client.render.debug;
public class VillageDebugRenderer { public net.minecraft.client.render.debug.VillageDebugRenderer wrapperContained; public VillageDebugRenderer(net.minecraft.client.render.debug.VillageDebugRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public java.util.Map pointsOfInterest() { return wrapperContained.pointsOfInterest; }
// public void pointsOfInterest(java.util.Map value) { wrapperContained.pointsOfInterest = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.util.Map brains() { return wrapperContained.brains; }
// public void brains(java.util.Map value) { wrapperContained.brains = value; }
// public java.util.UUID targetedEntity() { return wrapperContained.targetedEntity; }
// public void targetedEntity(java.util.UUID value) { wrapperContained.targetedEntity = value; }
// public int YELLOW() { return wrapperContained.YELLOW; }
// public void YELLOW(int value) { wrapperContained.YELLOW = value; }
// public int AQUA() { return wrapperContained.AQUA; }
// public void AQUA(int value) { wrapperContained.AQUA = value; }
// public int GREEN() { return wrapperContained.GREEN; }
// public void GREEN(int value) { wrapperContained.GREEN = value; }
// public int GRAY() { return wrapperContained.GRAY; }
// public void GRAY(int value) { wrapperContained.GRAY = value; }
// public int PINK() { return wrapperContained.PINK; }
// public void PINK(int value) { wrapperContained.PINK = value; }
// public int RED() { return wrapperContained.RED; }
// public void RED(int value) { wrapperContained.RED = value; }
// public int ORANGE() { return wrapperContained.ORANGE; }
// public void ORANGE(int value) { wrapperContained.ORANGE = value; }
// public int POI_RANGE() { return wrapperContained.POI_RANGE; }
// public void POI_RANGE(int value) { wrapperContained.POI_RANGE = value; }
// public int BRAIN_RANGE() { return wrapperContained.BRAIN_RANGE; }
// public void BRAIN_RANGE(int value) { wrapperContained.BRAIN_RANGE = value; }
// public int TARGET_ENTITY_RANGE() { return wrapperContained.TARGET_ENTITY_RANGE; }
// public void TARGET_ENTITY_RANGE(int value) { wrapperContained.TARGET_ENTITY_RANGE = value; }
// public float DEFAULT_DRAWN_STRING_SIZE() { return wrapperContained.DEFAULT_DRAWN_STRING_SIZE; }
// public void DEFAULT_DRAWN_STRING_SIZE(float value) { wrapperContained.DEFAULT_DRAWN_STRING_SIZE = value; }
// public int WHITE() { return wrapperContained.WHITE; }
// public void WHITE(int value) { wrapperContained.WHITE = value; }
public VillageDebugRenderer(yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.render.debug.VillageDebugRenderer(client.wrapperContained); }
// public void addBrain(Object brain) { wrapperContained.addBrain(brain); }
public void removePointOfInterest(yarnwrap.util.math.BlockPos pos) { wrapperContained.removePointOfInterest(pos.wrapperContained); }
// public void addPointOfInterest(Object poi) { wrapperContained.addPointOfInterest(poi); }
public void setFreeTicketCount(yarnwrap.util.math.BlockPos pos,int freeTicketCount) { wrapperContained.setFreeTicketCount(pos.wrapperContained,freeTicketCount); }
// public void method_23126(yarnwrap.entity.Entity entity) { wrapperContained.method_23126(entity.wrapperContained); }
// public boolean method_23127(yarnwrap.util.math.BlockPos brain) { return wrapperContained.method_23127(brain.wrapperContained); }
// public void method_23128(yarnwrap.util.math.BlockPos poi) { wrapperContained.method_23128(poi.wrapperContained); }
// public void method_23129(yarnwrap.util.math.BlockPos pos,yarnwrap.client.util.math.MatrixStack brains) { wrapperContained.method_23129(pos.wrapperContained,brains.wrapperContained); }
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
// public void method_23148(yarnwrap.client.util.math.MatrixStack brain) { wrapperContained.method_23148(brain.wrapperContained); }
// public boolean method_24804(Object entry) { return wrapperContained.method_24804(entry); }
// public void removeRemovedBrains() { wrapperContained.removeRemovedBrains(); }
// public boolean method_29384(yarnwrap.util.math.BlockPos brain) { return wrapperContained.method_29384(brain.wrapperContained); }
// public java.util.Set getNamesOfJobSitePotentialOwners(Object potentialJobSite) { return wrapperContained.getNamesOfJobSitePotentialOwners(potentialJobSite); }
// public java.util.Collection getBrainsContainingPotentialJobSite(yarnwrap.util.math.BlockPos potentialJobSite) { return wrapperContained.getBrainsContainingPotentialJobSite(potentialJobSite.wrapperContained); }
// public java.util.List method_30112(yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_30112(pos.wrapperContained); }
public void removeBrain(int entityId) { wrapperContained.removeBrain(entityId); }
// public boolean method_35798(int brain) { return wrapperContained.method_35798(brain); }

}