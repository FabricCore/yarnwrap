package yarnwrap.datafixer.fix;
public class OptionsKeyTranslationFix { public net.minecraft.datafixer.fix.OptionsKeyTranslationFix wrapperContained; public OptionsKeyTranslationFix(net.minecraft.datafixer.fix.OptionsKeyTranslationFix wrapperContained) { this.wrapperContained = wrapperContained; }

public OptionsKeyTranslationFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.OptionsKeyTranslationFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic method_28237(com.mojang.serialization.Dynamic optionsDynamic) { return wrapperContained.method_28237(optionsDynamic); }
// public com.mojang.serialization.Dynamic method_28239(com.mojang.serialization.Dynamic optionsMap) { return wrapperContained.method_28239(optionsMap); }
// public com.mojang.datafixers.Typed method_5130(com.mojang.datafixers.Typed optionsTyped) { return wrapperContained.method_5130(optionsTyped); }

}