package yarnwrap.datafixer.fix;
public class EntityPaintingMotiveFix { public net.minecraft.datafixer.fix.EntityPaintingMotiveFix wrapperContained; public EntityPaintingMotiveFix(net.minecraft.datafixer.fix.EntityPaintingMotiveFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map RENAMED_MOTIVES() { return wrapperContained.RENAMED_MOTIVES; }
// public void RENAMED_MOTIVES(java.util.Map value) { wrapperContained.RENAMED_MOTIVES = value; }
public EntityPaintingMotiveFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityPaintingMotiveFix(outputSchema,changesType); }
public com.mojang.serialization.Dynamic renameMotive(com.mojang.serialization.Dynamic paintingdynamic) { return wrapperContained.renameMotive(paintingdynamic); }
// public void method_15724(java.util.HashMap map) { wrapperContained.method_15724(map); }

}