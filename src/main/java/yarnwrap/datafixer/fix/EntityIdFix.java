package yarnwrap.datafixer.fix;
public class EntityIdFix { public net.minecraft.datafixer.fix.EntityIdFix wrapperContained; public EntityIdFix(net.minecraft.datafixer.fix.EntityIdFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map RENAMED_ENTITIES() { return wrapperContained.RENAMED_ENTITIES; }
// public void RENAMED_ENTITIES(java.util.Map value) { wrapperContained.RENAMED_ENTITIES = value; }
public EntityIdFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityIdFix(outputSchema,changesType); }
// public void method_15708(java.util.HashMap map) { wrapperContained.method_15708(map); }

}