package yarnwrap.datafixer.fix;
public class AdvancementsFix { public net.minecraft.datafixer.fix.AdvancementsFix wrapperContained; public AdvancementsFix(net.minecraft.datafixer.fix.AdvancementsFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map RENAMED_ADVANCEMENTS() { return wrapperContained.RENAMED_ADVANCEMENTS; }
// public void RENAMED_ADVANCEMENTS(java.util.Map value) { wrapperContained.RENAMED_ADVANCEMENTS = value; }
public AdvancementsFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.AdvancementsFix(outputSchema,changesType); }

}