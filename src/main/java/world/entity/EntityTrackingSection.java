package yarnwrap.world.entity;
public class EntityTrackingSection { public net.minecraft.world.entity.EntityTrackingSection wrapperContained; public EntityTrackingSection(net.minecraft.world.entity.EntityTrackingSection wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.util.collection.TypeFilterableList collection() { return new yarnwrap.util.collection.TypeFilterableList(wrapperContained.collection); }
// public yarnwrap.world.entity.EntityTrackingStatus status() { return new yarnwrap.world.entity.EntityTrackingStatus(wrapperContained.status); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public Object forEach(yarnwrap.util.TypeFilter type,yarnwrap.util.math.Box box,yarnwrap.util.function.LazyIterationConsumer consumer) { return wrapperContained.forEach(type.wrapperContained,box.wrapperContained,consumer.wrapperContained); }
public yarnwrap.world.entity.EntityTrackingStatus swapStatus(yarnwrap.world.entity.EntityTrackingStatus status) { return new yarnwrap.world.entity.EntityTrackingStatus(wrapperContained.swapStatus(status.wrapperContained)); }
public void add(yarnwrap.world.entity.EntityLike entity) { wrapperContained.add(entity.wrapperContained); }
public Object forEach(yarnwrap.util.math.Box box,yarnwrap.util.function.LazyIterationConsumer consumer) { return wrapperContained.forEach(box.wrapperContained,consumer.wrapperContained); }
public java.util.stream.Stream stream() { return wrapperContained.stream(); }
public boolean remove(yarnwrap.world.entity.EntityLike entity) { return wrapperContained.remove(entity.wrapperContained); }
public yarnwrap.world.entity.EntityTrackingStatus getStatus() { return new yarnwrap.world.entity.EntityTrackingStatus(wrapperContained.getStatus()); }
public int size() { return wrapperContained.size(); }

}