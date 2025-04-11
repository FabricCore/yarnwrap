package yarnwrap.util;
public class NameGenerator { public net.minecraft.util.NameGenerator wrapperContained; public NameGenerator(net.minecraft.util.NameGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String[] PREFIX() { return wrapperContained.PREFIX; }
// public void PREFIX(java.lang.String[] value) { wrapperContained.PREFIX = value; }
// public java.lang.String[] SUFFIX() { return wrapperContained.SUFFIX; }
// public void SUFFIX(java.lang.String[] value) { wrapperContained.SUFFIX = value; }
// public java.lang.String getRandom(yarnwrap.util.math.random.Random random,java.lang.String[] options) { return wrapperContained.getRandom(random.wrapperContained,options); }
public java.lang.String name(java.util.UUID uuid) { return wrapperContained.name(uuid); }
// public yarnwrap.util.math.random.Random randomFromUuid(java.util.UUID uuid) { return new yarnwrap.util.math.random.Random(wrapperContained.randomFromUuid(uuid)); }
public java.lang.String name(yarnwrap.entity.Entity entity) { return wrapperContained.name(entity.wrapperContained); }

}