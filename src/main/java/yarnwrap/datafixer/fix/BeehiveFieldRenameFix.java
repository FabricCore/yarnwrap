package yarnwrap.datafixer.fix;
public class BeehiveFieldRenameFix { public net.minecraft.datafixer.fix.BeehiveFieldRenameFix wrapperContained; public BeehiveFieldRenameFix(net.minecraft.datafixer.fix.BeehiveFieldRenameFix wrapperContained) { this.wrapperContained = wrapperContained; }

public BeehiveFieldRenameFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.BeehiveFieldRenameFix(outputSchema); }
// public com.mojang.serialization.Dynamic removeBeesField() { return wrapperContained.removeBeesField(); }
// public com.mojang.serialization.Dynamic renameFields() { return wrapperContained.renameFields(); }

}