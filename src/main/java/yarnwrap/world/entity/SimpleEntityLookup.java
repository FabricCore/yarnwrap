package yarnwrap.world.entity;
public class SimpleEntityLookup { public net.minecraft.world.entity.SimpleEntityLookup wrapperContained; public SimpleEntityLookup(net.minecraft.world.entity.SimpleEntityLookup wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.entity.EntityIndex index() { return new yarnwrap.world.entity.EntityIndex(wrapperContained.index); }
// public void index(yarnwrap.world.entity.EntityIndex value) { wrapperContained.index = value.wrapperContained; }
// public static yarnwrap.world.entity.EntityIndex index() { return new yarnwrap.world.entity.EntityIndex(net.minecraft.world.entity.SimpleEntityLookup.index); }
// public static void index(yarnwrap.world.entity.EntityIndex value, ) { net.minecraft.world.entity.SimpleEntityLookup.index = value.wrapperContained; }

// public yarnwrap.world.entity.SectionedEntityCache cache() { return new yarnwrap.world.entity.SectionedEntityCache(wrapperContained.cache); }
// public void cache(yarnwrap.world.entity.SectionedEntityCache value) { wrapperContained.cache = value.wrapperContained; }
// public static yarnwrap.world.entity.SectionedEntityCache cache() { return new yarnwrap.world.entity.SectionedEntityCache(net.minecraft.world.entity.SimpleEntityLookup.cache); }
// public static void cache(yarnwrap.world.entity.SectionedEntityCache value, ) { net.minecraft.world.entity.SimpleEntityLookup.cache = value.wrapperContained; }

public SimpleEntityLookup(yarnwrap.world.entity.EntityIndex index,yarnwrap.world.entity.SectionedEntityCache cache) { this.wrapperContained = new net.minecraft.world.entity.SimpleEntityLookup(index.wrapperContained,cache.wrapperContained); }

}