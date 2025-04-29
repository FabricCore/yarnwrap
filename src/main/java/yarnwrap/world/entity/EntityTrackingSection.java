package yarnwrap.world.entity;
public class EntityTrackingSection { public net.minecraft.world.entity.EntityTrackingSection wrapperContained; public EntityTrackingSection(net.minecraft.world.entity.EntityTrackingSection wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.world.entity.EntityTrackingSection.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.world.entity.EntityTrackingSection.LOGGER = value; }

// public yarnwrap.util.collection.TypeFilterableList collection() { return new yarnwrap.util.collection.TypeFilterableList(wrapperContained.collection); }
// public void collection(yarnwrap.util.collection.TypeFilterableList value) { wrapperContained.collection = value.wrapperContained; }
// public static yarnwrap.util.collection.TypeFilterableList collection() { return new yarnwrap.util.collection.TypeFilterableList(net.minecraft.world.entity.EntityTrackingSection.collection); }
// public static void collection(yarnwrap.util.collection.TypeFilterableList value, ) { net.minecraft.world.entity.EntityTrackingSection.collection = value.wrapperContained; }

// public yarnwrap.world.entity.EntityTrackingStatus status() { return new yarnwrap.world.entity.EntityTrackingStatus(wrapperContained.status); }
// public void status(yarnwrap.world.entity.EntityTrackingStatus value) { wrapperContained.status = value.wrapperContained; }
// public static yarnwrap.world.entity.EntityTrackingStatus status() { return new yarnwrap.world.entity.EntityTrackingStatus(net.minecraft.world.entity.EntityTrackingSection.status); }
// public static void status(yarnwrap.world.entity.EntityTrackingStatus value, ) { net.minecraft.world.entity.EntityTrackingSection.status = value.wrapperContained; }

public EntityTrackingSection(java.lang.Class entityClass,yarnwrap.world.entity.EntityTrackingStatus status) { this.wrapperContained = new net.minecraft.world.entity.EntityTrackingSection(entityClass,status.wrapperContained); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.world.entity.EntityTrackingSection.isEmpty(); }
public Object forEach(yarnwrap.util.TypeFilter type,yarnwrap.util.math.Box box,yarnwrap.util.function.LazyIterationConsumer consumer) { return wrapperContained.forEach(type.wrapperContained,box.wrapperContained,consumer.wrapperContained); }
// public static Object forEach(yarnwrap.util.TypeFilter type,yarnwrap.util.math.Box box,yarnwrap.util.function.LazyIterationConsumer consumer, ) { return net.minecraft.world.entity.EntityTrackingSection.forEach(type.wrapperContained,box.wrapperContained,consumer.wrapperContained); }
public yarnwrap.world.entity.EntityTrackingStatus swapStatus(yarnwrap.world.entity.EntityTrackingStatus status) { return new yarnwrap.world.entity.EntityTrackingStatus(wrapperContained.swapStatus(status.wrapperContained)); }
// public static yarnwrap.world.entity.EntityTrackingStatus swapStatus(yarnwrap.world.entity.EntityTrackingStatus status, ) { return new yarnwrap.world.entity.EntityTrackingStatus(net.minecraft.world.entity.EntityTrackingSection.swapStatus(status.wrapperContained)); }
public void add(yarnwrap.world.entity.EntityLike entity) { wrapperContained.add(entity.wrapperContained); }
// public static void add(yarnwrap.world.entity.EntityLike entity, ) { net.minecraft.world.entity.EntityTrackingSection.add(entity.wrapperContained); }
public Object forEach(yarnwrap.util.math.Box box,yarnwrap.util.function.LazyIterationConsumer consumer) { return wrapperContained.forEach(box.wrapperContained,consumer.wrapperContained); }
// public static Object forEach(yarnwrap.util.math.Box box,yarnwrap.util.function.LazyIterationConsumer consumer, ) { return net.minecraft.world.entity.EntityTrackingSection.forEach(box.wrapperContained,consumer.wrapperContained); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
// public static java.util.stream.Stream stream() { return net.minecraft.world.entity.EntityTrackingSection.stream(); }
public boolean remove(yarnwrap.world.entity.EntityLike entity) { return wrapperContained.remove(entity.wrapperContained); }
// public static boolean remove(yarnwrap.world.entity.EntityLike entity, ) { return net.minecraft.world.entity.EntityTrackingSection.remove(entity.wrapperContained); }
public yarnwrap.world.entity.EntityTrackingStatus getStatus() { return new yarnwrap.world.entity.EntityTrackingStatus(wrapperContained.getStatus()); }
// public static yarnwrap.world.entity.EntityTrackingStatus getStatus() { return new yarnwrap.world.entity.EntityTrackingStatus(net.minecraft.world.entity.EntityTrackingSection.getStatus()); }
public int size() { return wrapperContained.size(); }
// public static int size() { return net.minecraft.world.entity.EntityTrackingSection.size(); }

}