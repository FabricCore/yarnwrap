package yarnwrap.datafixer.fix;
public class OptionsMenuBlurrinessFix { public net.minecraft.datafixer.fix.OptionsMenuBlurrinessFix wrapperContained; public OptionsMenuBlurrinessFix(net.minecraft.datafixer.fix.OptionsMenuBlurrinessFix wrapperContained) { this.wrapperContained = wrapperContained; }

public OptionsMenuBlurrinessFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.OptionsMenuBlurrinessFix(outputSchema); }
// public com.mojang.datafixers.Typed method_60600(com.mojang.datafixers.Typed optionsTyped) { return wrapperContained.method_60600(optionsTyped); }
// public com.mojang.serialization.Dynamic method_60601(com.mojang.serialization.Dynamic optionsDynamic) { return wrapperContained.method_60601(optionsDynamic); }
// public int update(java.lang.String value) { return wrapperContained.update(value); }
// public com.mojang.serialization.Dynamic method_60603(com.mojang.serialization.Dynamic menuBackgroundBlurriness) { return wrapperContained.method_60603(menuBackgroundBlurriness); }

}