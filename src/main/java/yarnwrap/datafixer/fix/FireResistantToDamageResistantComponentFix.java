package yarnwrap.datafixer.fix;
public class FireResistantToDamageResistantComponentFix { public net.minecraft.datafixer.fix.FireResistantToDamageResistantComponentFix wrapperContained; public FireResistantToDamageResistantComponentFix(net.minecraft.datafixer.fix.FireResistantToDamageResistantComponentFix wrapperContained) { this.wrapperContained = wrapperContained; }

public FireResistantToDamageResistantComponentFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.FireResistantToDamageResistantComponentFix(outputSchema); }

}