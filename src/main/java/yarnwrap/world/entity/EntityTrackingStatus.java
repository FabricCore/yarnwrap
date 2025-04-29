package yarnwrap.world.entity;
public class EntityTrackingStatus { public net.minecraft.world.entity.EntityTrackingStatus wrapperContained; public EntityTrackingStatus(net.minecraft.world.entity.EntityTrackingStatus wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean tracked() { return wrapperContained.tracked; }
// public void tracked(boolean value) { wrapperContained.tracked = value; }
// public static boolean tracked() { return net.minecraft.world.entity.EntityTrackingStatus.tracked; }
// public static void tracked(boolean value, ) { net.minecraft.world.entity.EntityTrackingStatus.tracked = value; }

// public boolean tick() { return wrapperContained.tick; }
// public void tick(boolean value) { wrapperContained.tick = value; }
// public static boolean tick() { return net.minecraft.world.entity.EntityTrackingStatus.tick; }
// public static void tick(boolean value, ) { net.minecraft.world.entity.EntityTrackingStatus.tick = value; }

// // public EntityTrackingStatus(java.lang.String tracked,int tick) { this.wrapperContained = new net.minecraft.world.entity.EntityTrackingStatus(tracked,tick); }
public boolean shouldTick() { return wrapperContained.shouldTick(); }
// public static boolean shouldTick() { return net.minecraft.world.entity.EntityTrackingStatus.shouldTick(); }
// public yarnwrap.world.entity.EntityTrackingStatus fromLevelType(yarnwrap.server.world.ChunkLevelType levelType) { return new yarnwrap.world.entity.EntityTrackingStatus(wrapperContained.fromLevelType(levelType.wrapperContained)); }
// public static yarnwrap.world.entity.EntityTrackingStatus fromLevelType(yarnwrap.server.world.ChunkLevelType levelType, ) { return new yarnwrap.world.entity.EntityTrackingStatus(net.minecraft.world.entity.EntityTrackingStatus.fromLevelType(levelType.wrapperContained)); }
public boolean shouldTrack() { return wrapperContained.shouldTrack(); }
// public static boolean shouldTrack() { return net.minecraft.world.entity.EntityTrackingStatus.shouldTrack(); }

}