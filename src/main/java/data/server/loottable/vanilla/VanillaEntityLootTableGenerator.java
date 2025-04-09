package yarnwrap.data.server.loottable.vanilla;
public class VanillaEntityLootTableGenerator { public net.minecraft.data.server.loottable.vanilla.VanillaEntityLootTableGenerator wrapperContained; public VanillaEntityLootTableGenerator(net.minecraft.data.server.loottable.vanilla.VanillaEntityLootTableGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

public Object createElderGuardianTableBuilder() { return wrapperContained.createElderGuardianTableBuilder(); }

}