package yarnwrap.datafixer.fix;
public class BiomeFormatFix { public net.minecraft.datafixer.fix.BiomeFormatFix wrapperContained; public BiomeFormatFix(net.minecraft.datafixer.fix.BiomeFormatFix wrapperContained) { this.wrapperContained = wrapperContained; }

public BiomeFormatFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.BiomeFormatFix(outputSchema,changesType); }

}