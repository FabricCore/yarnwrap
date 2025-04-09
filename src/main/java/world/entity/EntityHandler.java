package yarnwrap.world.entity;
public class EntityHandler { public net.minecraft.world.entity.EntityHandler wrapperContained; public EntityHandler(net.minecraft.world.entity.EntityHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public void stopTracking(java.lang.Object entity) { wrapperContained.stopTracking(entity); }
public void startTracking(java.lang.Object entity) { wrapperContained.startTracking(entity); }
public void stopTicking(java.lang.Object entity) { wrapperContained.stopTicking(entity); }
public void startTicking(java.lang.Object entity) { wrapperContained.startTicking(entity); }
public void destroy(java.lang.Object entity) { wrapperContained.destroy(entity); }
public void create(java.lang.Object entity) { wrapperContained.create(entity); }
public void updateLoadStatus(java.lang.Object entity) { wrapperContained.updateLoadStatus(entity); }

}