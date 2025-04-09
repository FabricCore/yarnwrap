package yarnwrap.world.entity;
public class EntityIndex { public net.minecraft.world.entity.EntityIndex wrapperContained; public EntityIndex(net.minecraft.world.entity.EntityIndex wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap idToEntity() { return wrapperContained.idToEntity; }
// public java.util.Map uuidToEntity() { return wrapperContained.uuidToEntity; }
public java.lang.Iterable iterate() { return wrapperContained.iterate(); }
public yarnwrap.world.entity.EntityLike get(int id) { return new yarnwrap.world.entity.EntityLike(wrapperContained.get(id)); }
public void add(yarnwrap.world.entity.EntityLike entity) { wrapperContained.add(entity.wrapperContained); }
public void forEach(yarnwrap.util.TypeFilter filter,yarnwrap.util.function.LazyIterationConsumer consumer) { wrapperContained.forEach(filter.wrapperContained,consumer.wrapperContained); }
public yarnwrap.world.entity.EntityLike get(java.util.UUID uuid) { return new yarnwrap.world.entity.EntityLike(wrapperContained.get(uuid)); }
public int size() { return wrapperContained.size(); }
public void remove(yarnwrap.world.entity.EntityLike entity) { wrapperContained.remove(entity.wrapperContained); }

}