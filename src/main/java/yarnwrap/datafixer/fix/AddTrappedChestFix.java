package yarnwrap.datafixer.fix;
public class AddTrappedChestFix { public net.minecraft.datafixer.fix.AddTrappedChestFix wrapperContained; public AddTrappedChestFix(net.minecraft.datafixer.fix.AddTrappedChestFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public AddTrappedChestFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.AddTrappedChestFix(outputSchema,changesType); }

}