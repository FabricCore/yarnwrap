package yarnwrap.data.server.loottable.vanilla;
public class VanillaEntityLootTableGenerator { public net.minecraft.data.server.loottable.vanilla.VanillaEntityLootTableGenerator wrapperContained; public VanillaEntityLootTableGenerator(net.minecraft.data.server.loottable.vanilla.VanillaEntityLootTableGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public VanillaEntityLootTableGenerator(Object registryLookup) { this.wrapperContained = new net.minecraft.data.server.loottable.vanilla.VanillaEntityLootTableGenerator(registryLookup); }
public Object createElderGuardianTableBuilder() { return wrapperContained.createElderGuardianTableBuilder(); }
// public static Object createElderGuardianTableBuilder() { return net.minecraft.data.server.loottable.vanilla.VanillaEntityLootTableGenerator.createElderGuardianTableBuilder(); }

}