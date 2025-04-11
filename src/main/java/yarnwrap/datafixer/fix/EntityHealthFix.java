package yarnwrap.datafixer.fix;
public class EntityHealthFix { public net.minecraft.datafixer.fix.EntityHealthFix wrapperContained; public EntityHealthFix(net.minecraft.datafixer.fix.EntityHealthFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set ENTITIES() { return wrapperContained.ENTITIES; }
// public void ENTITIES(java.util.Set value) { wrapperContained.ENTITIES = value; }
public com.mojang.serialization.Dynamic fixHealth(com.mojang.serialization.Dynamic entityDynamic) { return wrapperContained.fixHealth(entityDynamic); }

}