package yarnwrap.world.event.listener;
public class EntityGameEventHandler { public net.minecraft.world.event.listener.EntityGameEventHandler wrapperContained; public EntityGameEventHandler(net.minecraft.world.event.listener.EntityGameEventHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.event.listener.GameEventListener listener() { return new yarnwrap.world.event.listener.GameEventListener(wrapperContained.listener); }
// public void listener(yarnwrap.world.event.listener.GameEventListener value) { wrapperContained.listener = value.wrapperContained; }
// public static yarnwrap.world.event.listener.GameEventListener listener() { return new yarnwrap.world.event.listener.GameEventListener(net.minecraft.world.event.listener.EntityGameEventHandler.listener); }
// public static void listener(yarnwrap.world.event.listener.GameEventListener value, ) { net.minecraft.world.event.listener.EntityGameEventHandler.listener = value.wrapperContained; }

// public yarnwrap.util.math.ChunkSectionPos sectionPos() { return new yarnwrap.util.math.ChunkSectionPos(wrapperContained.sectionPos); }
// public void sectionPos(yarnwrap.util.math.ChunkSectionPos value) { wrapperContained.sectionPos = value.wrapperContained; }
// public static yarnwrap.util.math.ChunkSectionPos sectionPos() { return new yarnwrap.util.math.ChunkSectionPos(net.minecraft.world.event.listener.EntityGameEventHandler.sectionPos); }
// public static void sectionPos(yarnwrap.util.math.ChunkSectionPos value, ) { net.minecraft.world.event.listener.EntityGameEventHandler.sectionPos = value.wrapperContained; }

public EntityGameEventHandler(yarnwrap.world.event.listener.GameEventListener listener) { this.wrapperContained = new net.minecraft.world.event.listener.EntityGameEventHandler(listener.wrapperContained); }
public void onEntityRemoval(yarnwrap.server.world.ServerWorld world) { wrapperContained.onEntityRemoval(world.wrapperContained); }
// public static void onEntityRemoval(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.world.event.listener.EntityGameEventHandler.onEntityRemoval(world.wrapperContained); }
// public void updateDispatcher(yarnwrap.world.WorldView world,yarnwrap.util.math.ChunkSectionPos sectionPos,java.util.function.Consumer dispatcherConsumer) { wrapperContained.updateDispatcher(world.wrapperContained,sectionPos.wrapperContained,dispatcherConsumer); }
// public static void updateDispatcher(yarnwrap.world.WorldView world,yarnwrap.util.math.ChunkSectionPos sectionPos,java.util.function.Consumer dispatcherConsumer, ) { net.minecraft.world.event.listener.EntityGameEventHandler.updateDispatcher(world.wrapperContained,sectionPos.wrapperContained,dispatcherConsumer); }
// public void method_32951(yarnwrap.world.event.listener.GameEventDispatcher dispatcher) { wrapperContained.method_32951(dispatcher.wrapperContained); }
// public static void method_32951(yarnwrap.world.event.listener.GameEventDispatcher dispatcher, ) { net.minecraft.world.event.listener.EntityGameEventHandler.method_32951(dispatcher.wrapperContained); }
public void onEntitySetPos(yarnwrap.server.world.ServerWorld world) { wrapperContained.onEntitySetPos(world.wrapperContained); }
// public static void onEntitySetPos(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.world.event.listener.EntityGameEventHandler.onEntitySetPos(world.wrapperContained); }
// public void method_32953(yarnwrap.world.event.listener.GameEventDispatcher dispatcher) { wrapperContained.method_32953(dispatcher.wrapperContained); }
// public static void method_32953(yarnwrap.world.event.listener.GameEventDispatcher dispatcher, ) { net.minecraft.world.event.listener.EntityGameEventHandler.method_32953(dispatcher.wrapperContained); }
// public void method_32954(yarnwrap.world.event.listener.GameEventDispatcher dispatcher) { wrapperContained.method_32954(dispatcher.wrapperContained); }
// public static void method_32954(yarnwrap.world.event.listener.GameEventDispatcher dispatcher, ) { net.minecraft.world.event.listener.EntityGameEventHandler.method_32954(dispatcher.wrapperContained); }
public void onEntitySetPosCallback(yarnwrap.server.world.ServerWorld world) { wrapperContained.onEntitySetPosCallback(world.wrapperContained); }
// public static void onEntitySetPosCallback(yarnwrap.server.world.ServerWorld world, ) { net.minecraft.world.event.listener.EntityGameEventHandler.onEntitySetPosCallback(world.wrapperContained); }
// public void method_42336(yarnwrap.server.world.ServerWorld sectionPos) { wrapperContained.method_42336(sectionPos.wrapperContained); }
// public static void method_42336(yarnwrap.server.world.ServerWorld sectionPos, ) { net.minecraft.world.event.listener.EntityGameEventHandler.method_42336(sectionPos.wrapperContained); }
public yarnwrap.world.event.listener.GameEventListener getListener() { return new yarnwrap.world.event.listener.GameEventListener(wrapperContained.getListener()); }
// public static yarnwrap.world.event.listener.GameEventListener getListener() { return new yarnwrap.world.event.listener.GameEventListener(net.minecraft.world.event.listener.EntityGameEventHandler.getListener()); }

}