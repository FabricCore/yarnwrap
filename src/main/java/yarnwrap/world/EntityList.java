package yarnwrap.world;
public class EntityList { public net.minecraft.world.EntityList wrapperContained; public EntityList(net.minecraft.world.EntityList wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap entities() { return wrapperContained.entities; }
// public void entities(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.entities = value; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap temp() { return wrapperContained.temp; }
// public void temp(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.temp = value; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap iterating() { return wrapperContained.iterating; }
// public void iterating(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.iterating = value; }
// public void ensureSafe() { wrapperContained.ensureSafe(); }
public void add(yarnwrap.entity.Entity entity) { wrapperContained.add(entity.wrapperContained); }
public void forEach(java.util.function.Consumer action) { wrapperContained.forEach(action); }
public void remove(yarnwrap.entity.Entity entity) { wrapperContained.remove(entity.wrapperContained); }
public boolean has(yarnwrap.entity.Entity entity) { return wrapperContained.has(entity.wrapperContained); }

}