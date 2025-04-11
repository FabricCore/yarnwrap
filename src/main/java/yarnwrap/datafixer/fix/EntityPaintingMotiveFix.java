package yarnwrap.datafixer.fix;
public class EntityPaintingMotiveFix { public net.minecraft.datafixer.fix.EntityPaintingMotiveFix wrapperContained; public EntityPaintingMotiveFix(net.minecraft.datafixer.fix.EntityPaintingMotiveFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map RENAMED_MOTIVES() { return wrapperContained.RENAMED_MOTIVES; }
// public void RENAMED_MOTIVES(java.util.Map value) { wrapperContained.RENAMED_MOTIVES = value; }
public com.mojang.serialization.Dynamic renameMotive(com.mojang.serialization.Dynamic paintingdynamic) { return wrapperContained.renameMotive(paintingdynamic); }

}