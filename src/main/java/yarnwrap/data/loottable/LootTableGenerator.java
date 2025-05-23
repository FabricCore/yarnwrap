package yarnwrap.data.loottable;
public class LootTableGenerator { public net.minecraft.data.loottable.LootTableGenerator wrapperContained; public LootTableGenerator(net.minecraft.data.loottable.LootTableGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

public void accept(java.util.function.BiConsumer lootTableBiConsumer) { wrapperContained.accept(lootTableBiConsumer); }
// public static void accept(java.util.function.BiConsumer lootTableBiConsumer, ) { net.minecraft.data.loottable.LootTableGenerator.accept(lootTableBiConsumer); }

}