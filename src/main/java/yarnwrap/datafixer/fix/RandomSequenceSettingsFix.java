package yarnwrap.datafixer.fix;
public class RandomSequenceSettingsFix { public net.minecraft.datafixer.fix.RandomSequenceSettingsFix wrapperContained; public RandomSequenceSettingsFix(net.minecraft.datafixer.fix.RandomSequenceSettingsFix wrapperContained) { this.wrapperContained = wrapperContained; }

public RandomSequenceSettingsFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.RandomSequenceSettingsFix(outputSchema); }
// public com.mojang.datafixers.Typed method_52479(com.mojang.datafixers.Typed typed) { return wrapperContained.method_52479(typed); }
// public com.mojang.serialization.Dynamic method_52480(com.mojang.serialization.Dynamic randomSequencesData) { return wrapperContained.method_52480(randomSequencesData); }
// public com.mojang.serialization.Dynamic method_52481(com.mojang.serialization.Dynamic data) { return wrapperContained.method_52481(data); }

}