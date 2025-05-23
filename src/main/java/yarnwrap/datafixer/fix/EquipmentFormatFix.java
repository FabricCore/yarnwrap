package yarnwrap.datafixer.fix;
public class EquipmentFormatFix { public net.minecraft.datafixer.fix.EquipmentFormatFix wrapperContained; public EquipmentFormatFix(net.minecraft.datafixer.fix.EquipmentFormatFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EquipmentFormatFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.EquipmentFormatFix(outputSchema); }

}