package yarnwrap.world.entity;
public class EntityLookup { public net.minecraft.world.entity.EntityLookup wrapperContained; public EntityLookup(net.minecraft.world.entity.EntityLookup wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.Iterable iterate() { return wrapperContained.iterate(); }
// public static java.lang.Iterable iterate() { return net.minecraft.world.entity.EntityLookup.iterate(); }
public yarnwrap.world.entity.EntityLike get(int id) { return new yarnwrap.world.entity.EntityLike(wrapperContained.get(id)); }
// public static yarnwrap.world.entity.EntityLike get(int id, ) { return new yarnwrap.world.entity.EntityLike(net.minecraft.world.entity.EntityLookup.get(id)); }
public void forEachIntersects(yarnwrap.util.TypeFilter filter,yarnwrap.util.math.Box box,yarnwrap.util.function.LazyIterationConsumer consumer) { wrapperContained.forEachIntersects(filter.wrapperContained,box.wrapperContained,consumer.wrapperContained); }
// public static void forEachIntersects(yarnwrap.util.TypeFilter filter,yarnwrap.util.math.Box box,yarnwrap.util.function.LazyIterationConsumer consumer, ) { net.minecraft.world.entity.EntityLookup.forEachIntersects(filter.wrapperContained,box.wrapperContained,consumer.wrapperContained); }
public void forEach(yarnwrap.util.TypeFilter filter,yarnwrap.util.function.LazyIterationConsumer consumer) { wrapperContained.forEach(filter.wrapperContained,consumer.wrapperContained); }
// public static void forEach(yarnwrap.util.TypeFilter filter,yarnwrap.util.function.LazyIterationConsumer consumer, ) { net.minecraft.world.entity.EntityLookup.forEach(filter.wrapperContained,consumer.wrapperContained); }
public void forEachIntersects(yarnwrap.util.math.Box box,java.util.function.Consumer action) { wrapperContained.forEachIntersects(box.wrapperContained,action); }
// public static void forEachIntersects(yarnwrap.util.math.Box box,java.util.function.Consumer action, ) { net.minecraft.world.entity.EntityLookup.forEachIntersects(box.wrapperContained,action); }
public yarnwrap.world.entity.EntityLike get(java.util.UUID uuid) { return new yarnwrap.world.entity.EntityLike(wrapperContained.get(uuid)); }
// public static yarnwrap.world.entity.EntityLike get(java.util.UUID uuid, ) { return new yarnwrap.world.entity.EntityLike(net.minecraft.world.entity.EntityLookup.get(uuid)); }

}