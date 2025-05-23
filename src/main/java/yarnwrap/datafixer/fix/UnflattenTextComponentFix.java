package yarnwrap.datafixer.fix;
public class UnflattenTextComponentFix { public net.minecraft.datafixer.fix.UnflattenTextComponentFix wrapperContained; public UnflattenTextComponentFix(net.minecraft.datafixer.fix.UnflattenTextComponentFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.datafixer.fix.UnflattenTextComponentFix.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.datafixer.fix.UnflattenTextComponentFix.LOGGER = value; }

public UnflattenTextComponentFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.UnflattenTextComponentFix(outputSchema); }

}