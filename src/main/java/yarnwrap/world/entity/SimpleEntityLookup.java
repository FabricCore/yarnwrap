package yarnwrap.world.entity;
public class SimpleEntityLookup { public net.minecraft.world.entity.SimpleEntityLookup wrapperContained; public SimpleEntityLookup(net.minecraft.world.entity.SimpleEntityLookup wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.entity.EntityIndex index() { return new yarnwrap.world.entity.EntityIndex(wrapperContained.index); }
// public void index(yarnwrap.world.entity.EntityIndex value) { wrapperContained.index = value.wrapperContained; }
// public yarnwrap.world.entity.SectionedEntityCache cache() { return new yarnwrap.world.entity.SectionedEntityCache(wrapperContained.cache); }
// public void cache(yarnwrap.world.entity.SectionedEntityCache value) { wrapperContained.cache = value.wrapperContained; }

}