package yarnwrap.datafixer.fix;
public class OptionsKeyLwjgl3Fix { public net.minecraft.datafixer.fix.OptionsKeyLwjgl3Fix wrapperContained; public OptionsKeyLwjgl3Fix(net.minecraft.datafixer.fix.OptionsKeyLwjgl3Fix wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String KEY_UNKNOWN() { return wrapperContained.KEY_UNKNOWN; }
// public void KEY_UNKNOWN(java.lang.String value) { wrapperContained.KEY_UNKNOWN = value; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap NUMERICAL_KEY_IDS_TO_KEY_NAMES() { return wrapperContained.NUMERICAL_KEY_IDS_TO_KEY_NAMES; }
// public void NUMERICAL_KEY_IDS_TO_KEY_NAMES(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.NUMERICAL_KEY_IDS_TO_KEY_NAMES = value; }
public OptionsKeyLwjgl3Fix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.OptionsKeyLwjgl3Fix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic method_28235(com.mojang.serialization.Dynamic optionsDynamic) { return wrapperContained.method_28235(optionsDynamic); }
// public com.mojang.serialization.Dynamic method_28236(com.mojang.serialization.Dynamic optionsMap) { return wrapperContained.method_28236(optionsMap); }
// public void method_5118(it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap map) { wrapperContained.method_5118(map); }
// public com.mojang.datafixers.Typed method_5121(com.mojang.datafixers.Typed optionsTyped) { return wrapperContained.method_5121(optionsTyped); }

}