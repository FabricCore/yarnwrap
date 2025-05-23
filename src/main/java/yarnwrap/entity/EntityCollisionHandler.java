package yarnwrap.entity;
public class EntityCollisionHandler { public net.minecraft.entity.EntityCollisionHandler wrapperContained; public EntityCollisionHandler(net.minecraft.entity.EntityCollisionHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityCollisionHandler DUMMY() { return new yarnwrap.entity.EntityCollisionHandler(wrapperContained.DUMMY); }
// public void DUMMY(yarnwrap.entity.EntityCollisionHandler value) { wrapperContained.DUMMY = value.wrapperContained; }
public static yarnwrap.entity.EntityCollisionHandler DUMMY() { return new yarnwrap.entity.EntityCollisionHandler(net.minecraft.entity.EntityCollisionHandler.DUMMY); }
// public static void DUMMY(yarnwrap.entity.EntityCollisionHandler value, ) { net.minecraft.entity.EntityCollisionHandler.DUMMY = value.wrapperContained; }

public void addEvent(yarnwrap.entity.CollisionEvent event) { wrapperContained.addEvent(event.wrapperContained); }
// public static void addEvent(yarnwrap.entity.CollisionEvent event, ) { net.minecraft.entity.EntityCollisionHandler.addEvent(event.wrapperContained); }
public void addPreCallback(yarnwrap.entity.CollisionEvent event,java.util.function.Consumer callback) { wrapperContained.addPreCallback(event.wrapperContained,callback); }
// public static void addPreCallback(yarnwrap.entity.CollisionEvent event,java.util.function.Consumer callback, ) { net.minecraft.entity.EntityCollisionHandler.addPreCallback(event.wrapperContained,callback); }
public void addPostCallback(yarnwrap.entity.CollisionEvent event,java.util.function.Consumer callback) { wrapperContained.addPostCallback(event.wrapperContained,callback); }
// public static void addPostCallback(yarnwrap.entity.CollisionEvent event,java.util.function.Consumer callback, ) { net.minecraft.entity.EntityCollisionHandler.addPostCallback(event.wrapperContained,callback); }

}