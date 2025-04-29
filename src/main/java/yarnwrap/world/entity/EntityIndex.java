package yarnwrap.world.entity;
public class EntityIndex { public net.minecraft.world.entity.EntityIndex wrapperContained; public EntityIndex(net.minecraft.world.entity.EntityIndex wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.entity.EntityIndex.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.entity.EntityIndex.LOGGER = value; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap idToEntity() { return wrapperContained.idToEntity; }
// public void idToEntity(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.idToEntity = value; }
// public static it.unimi.dsi.fastutil.ints.Int2ObjectMap idToEntity() { return net.minecraft.world.entity.EntityIndex.idToEntity; }
// public static void idToEntity(it.unimi.dsi.fastutil.ints.Int2ObjectMap value, ) { net.minecraft.world.entity.EntityIndex.idToEntity = value; }

// public java.util.Map uuidToEntity() { return wrapperContained.uuidToEntity; }
// public void uuidToEntity(java.util.Map value) { wrapperContained.uuidToEntity = value; }
// public static java.util.Map uuidToEntity() { return net.minecraft.world.entity.EntityIndex.uuidToEntity; }
// public static void uuidToEntity(java.util.Map value, ) { net.minecraft.world.entity.EntityIndex.uuidToEntity = value; }

public java.lang.Iterable iterate() { return wrapperContained.iterate(); }
// public static java.lang.Iterable iterate() { return net.minecraft.world.entity.EntityIndex.iterate(); }
public yarnwrap.world.entity.EntityLike get(int id) { return new yarnwrap.world.entity.EntityLike(wrapperContained.get(id)); }
// public static yarnwrap.world.entity.EntityLike get(int id, ) { return new yarnwrap.world.entity.EntityLike(net.minecraft.world.entity.EntityIndex.get(id)); }
public void add(yarnwrap.world.entity.EntityLike entity) { wrapperContained.add(entity.wrapperContained); }
// public static void add(yarnwrap.world.entity.EntityLike entity, ) { net.minecraft.world.entity.EntityIndex.add(entity.wrapperContained); }
public void forEach(yarnwrap.util.TypeFilter filter,yarnwrap.util.function.LazyIterationConsumer consumer) { wrapperContained.forEach(filter.wrapperContained,consumer.wrapperContained); }
// public static void forEach(yarnwrap.util.TypeFilter filter,yarnwrap.util.function.LazyIterationConsumer consumer, ) { net.minecraft.world.entity.EntityIndex.forEach(filter.wrapperContained,consumer.wrapperContained); }
public yarnwrap.world.entity.EntityLike get(java.util.UUID uuid) { return new yarnwrap.world.entity.EntityLike(wrapperContained.get(uuid)); }
// public static yarnwrap.world.entity.EntityLike get(java.util.UUID uuid, ) { return new yarnwrap.world.entity.EntityLike(net.minecraft.world.entity.EntityIndex.get(uuid)); }
public int size() { return wrapperContained.size(); }
// public static int size() { return net.minecraft.world.entity.EntityIndex.size(); }
public void remove(yarnwrap.world.entity.EntityLike entity) { wrapperContained.remove(entity.wrapperContained); }
// public static void remove(yarnwrap.world.entity.EntityLike entity, ) { net.minecraft.world.entity.EntityIndex.remove(entity.wrapperContained); }

}