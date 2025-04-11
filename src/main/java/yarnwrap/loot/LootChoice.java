package yarnwrap.loot;
public class LootChoice { public net.minecraft.loot.LootChoice wrapperContained; public LootChoice(net.minecraft.loot.LootChoice wrapperContained) { this.wrapperContained = wrapperContained; }

public void generateLoot(java.util.function.Consumer lootConsumer,yarnwrap.loot.context.LootContext context) { wrapperContained.generateLoot(lootConsumer,context.wrapperContained); }
public int getWeight(float luck) { return wrapperContained.getWeight(luck); }

}