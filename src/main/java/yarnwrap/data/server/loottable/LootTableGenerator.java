package yarnwrap.data.server.loottable;
public class LootTableGenerator { public net.minecraft.data.server.loottable.LootTableGenerator wrapperContained; public LootTableGenerator(net.minecraft.data.server.loottable.LootTableGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

public void accept(java.util.function.BiConsumer lootTableBiConsumer) { wrapperContained.accept(lootTableBiConsumer); }

}