package yarnwrap.datafixer.fix;
public class LevelLegacyWorldGenSettingsFix { public net.minecraft.datafixer.fix.LevelLegacyWorldGenSettingsFix wrapperContained; public LevelLegacyWorldGenSettingsFix(net.minecraft.datafixer.fix.LevelLegacyWorldGenSettingsFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String WORLD_GEN_SETTINGS_KEY() { return wrapperContained.WORLD_GEN_SETTINGS_KEY; }
// public void WORLD_GEN_SETTINGS_KEY(java.lang.String value) { wrapperContained.WORLD_GEN_SETTINGS_KEY = value; }
// public java.util.List SETTINGS_TO_FIX() { return wrapperContained.SETTINGS_TO_FIX; }
// public void SETTINGS_TO_FIX(java.util.List value) { wrapperContained.SETTINGS_TO_FIX = value; }
public LevelLegacyWorldGenSettingsFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.LevelLegacyWorldGenSettingsFix(outputSchema); }
// public com.mojang.datafixers.Typed method_54443(com.mojang.datafixers.Typed typed) { return wrapperContained.method_54443(typed); }
// public com.mojang.serialization.Dynamic method_54444(com.mojang.serialization.Dynamic data) { return wrapperContained.method_54444(data); }

}