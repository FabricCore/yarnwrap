package yarnwrap.world.entity;
public class EntityTrackingStatus { public net.minecraft.world.entity.EntityTrackingStatus wrapperContained; public EntityTrackingStatus(net.minecraft.world.entity.EntityTrackingStatus wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean tracked() { return wrapperContained.tracked; }
// public void tracked(boolean value) { wrapperContained.tracked = value; }
// public boolean tick() { return wrapperContained.tick; }
// public void tick(boolean value) { wrapperContained.tick = value; }
// // public EntityTrackingStatus(java.lang.String tracked,int tick) { this.wrapperContained = new net.minecraft.world.entity.EntityTrackingStatus(tracked,tick); }
public boolean shouldTick() { return wrapperContained.shouldTick(); }
public yarnwrap.world.entity.EntityTrackingStatus fromLevelType(yarnwrap.server.world.ChunkLevelType levelType) { return new yarnwrap.world.entity.EntityTrackingStatus(wrapperContained.fromLevelType(levelType.wrapperContained)); }
public boolean shouldTrack() { return wrapperContained.shouldTrack(); }

}