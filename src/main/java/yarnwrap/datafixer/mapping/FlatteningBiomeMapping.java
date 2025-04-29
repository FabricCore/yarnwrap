package yarnwrap.datafixer.mapping;
public class FlatteningBiomeMapping { public net.minecraft.datafixer.mapping.FlatteningBiomeMapping wrapperContained; public FlatteningBiomeMapping(net.minecraft.datafixer.mapping.FlatteningBiomeMapping wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map RENAMED_BIOMES() { return wrapperContained.RENAMED_BIOMES; }
// public void RENAMED_BIOMES(java.util.Map value) { wrapperContained.RENAMED_BIOMES = value; }
public static java.util.Map RENAMED_BIOMES() { return net.minecraft.datafixer.mapping.FlatteningBiomeMapping.RENAMED_BIOMES; }
// public static void RENAMED_BIOMES(java.util.Map value, ) { net.minecraft.datafixer.mapping.FlatteningBiomeMapping.RENAMED_BIOMES = value; }


}