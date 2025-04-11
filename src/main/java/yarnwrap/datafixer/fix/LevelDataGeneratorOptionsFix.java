package yarnwrap.datafixer.fix;
public class LevelDataGeneratorOptionsFix { public net.minecraft.datafixer.fix.LevelDataGeneratorOptionsFix wrapperContained; public LevelDataGeneratorOptionsFix(net.minecraft.datafixer.fix.LevelDataGeneratorOptionsFix wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String GENERATOR_OPTIONS_KEY() { return wrapperContained.GENERATOR_OPTIONS_KEY; }
// public void GENERATOR_OPTIONS_KEY(java.lang.String value) { wrapperContained.GENERATOR_OPTIONS_KEY = value; }
// public java.util.Map NUMERICAL_IDS_TO_BIOME_IDS() { return wrapperContained.NUMERICAL_IDS_TO_BIOME_IDS; }
// public void NUMERICAL_IDS_TO_BIOME_IDS(java.util.Map value) { wrapperContained.NUMERICAL_IDS_TO_BIOME_IDS = value; }
public LevelDataGeneratorOptionsFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.LevelDataGeneratorOptionsFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic method_28209(com.mojang.serialization.Dynamic levelDynamic) { return wrapperContained.method_28209(levelDynamic); }
// public com.mojang.datafixers.Typed method_5096(com.mojang.datafixers.types.Type levelTyped) { return wrapperContained.method_5096(levelTyped); }
// public com.mojang.datafixers.util.Pair parseFlatLayer(java.lang.String layer) { return wrapperContained.parseFlatLayer(layer); }
// public com.mojang.serialization.Dynamic fixGeneratorOptions(java.lang.String generatorOptions,com.mojang.serialization.DynamicOps levelDynamicOps) { return wrapperContained.fixGeneratorOptions(generatorOptions,levelDynamicOps); }
// public void method_5101(java.util.HashMap map) { wrapperContained.method_5101(map); }
// public java.util.List parseFlatLayers(java.lang.String layers) { return wrapperContained.parseFlatLayers(layers); }

}