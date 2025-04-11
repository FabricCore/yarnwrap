package yarnwrap.world.entity;
public class ClientEntityManager { public net.minecraft.world.entity.ClientEntityManager wrapperContained; public ClientEntityManager(net.minecraft.world.entity.ClientEntityManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.world.entity.EntityHandler handler() { return new yarnwrap.world.entity.EntityHandler(wrapperContained.handler); }
// public void handler(yarnwrap.world.entity.EntityHandler value) { wrapperContained.handler = value.wrapperContained; }
// public yarnwrap.world.entity.EntityIndex index() { return new yarnwrap.world.entity.EntityIndex(wrapperContained.index); }
// public void index(yarnwrap.world.entity.EntityIndex value) { wrapperContained.index = value.wrapperContained; }
// public yarnwrap.world.entity.SectionedEntityCache cache() { return new yarnwrap.world.entity.SectionedEntityCache(wrapperContained.cache); }
// public void cache(yarnwrap.world.entity.SectionedEntityCache value) { wrapperContained.cache = value.wrapperContained; }
// public it.unimi.dsi.fastutil.longs.LongSet tickingChunkSections() { return wrapperContained.tickingChunkSections; }
// public void tickingChunkSections(it.unimi.dsi.fastutil.longs.LongSet value) { wrapperContained.tickingChunkSections = value; }
// public yarnwrap.world.entity.EntityLookup lookup() { return new yarnwrap.world.entity.EntityLookup(wrapperContained.lookup); }
// public void lookup(yarnwrap.world.entity.EntityLookup value) { wrapperContained.lookup = value.wrapperContained; }
public ClientEntityManager(java.lang.Class entityClass,yarnwrap.world.entity.EntityHandler handler) { this.wrapperContained = new net.minecraft.world.entity.ClientEntityManager(entityClass,handler.wrapperContained); }
public yarnwrap.world.entity.EntityLookup getLookup() { return new yarnwrap.world.entity.EntityLookup(wrapperContained.getLookup()); }
// public yarnwrap.world.entity.EntityTrackingStatus method_31867(long pos) { return new yarnwrap.world.entity.EntityTrackingStatus(wrapperContained.method_31867(pos)); }
// public void removeIfEmpty(long packedChunkSection,yarnwrap.world.entity.EntityTrackingSection entities) { wrapperContained.removeIfEmpty(packedChunkSection,entities.wrapperContained); }
public void startTicking(yarnwrap.util.math.ChunkPos pos) { wrapperContained.startTicking(pos.wrapperContained); }
public void addEntity(yarnwrap.world.entity.EntityLike entity) { wrapperContained.addEntity(entity.wrapperContained); }
// public void method_31871(yarnwrap.world.entity.EntityTrackingSection sections) { wrapperContained.method_31871(sections.wrapperContained); }
public int getEntityCount() { return wrapperContained.getEntityCount(); }
public void stopTicking(yarnwrap.util.math.ChunkPos pos) { wrapperContained.stopTicking(pos.wrapperContained); }
// public boolean method_31876(yarnwrap.world.entity.EntityLike e) { return wrapperContained.method_31876(e.wrapperContained); }
// public void method_31877(yarnwrap.world.entity.EntityTrackingSection sections) { wrapperContained.method_31877(sections.wrapperContained); }
public java.lang.String getDebugString() { return wrapperContained.getDebugString(); }
// public boolean method_31880(yarnwrap.world.entity.EntityLike e) { return wrapperContained.method_31880(e.wrapperContained); }

}