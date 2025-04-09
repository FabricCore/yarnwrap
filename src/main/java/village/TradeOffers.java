package yarnwrap.village;
public class TradeOffers { public net.minecraft.village.TradeOffers wrapperContained; public TradeOffers(net.minecraft.village.TradeOffers wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map PROFESSION_TO_LEVELED_TRADE() { return wrapperContained.PROFESSION_TO_LEVELED_TRADE; }
public it.unimi.dsi.fastutil.ints.Int2ObjectMap WANDERING_TRADER_TRADES() { return wrapperContained.WANDERING_TRADER_TRADES; }
// public int DEFAULT_MAX_USES() { return wrapperContained.DEFAULT_MAX_USES; }
// public int COMMON_MAX_USES() { return wrapperContained.COMMON_MAX_USES; }
// public int RARE_MAX_USES() { return wrapperContained.RARE_MAX_USES; }
// public int NOVICE_SELL_XP() { return wrapperContained.NOVICE_SELL_XP; }
// public int NOVICE_BUY_XP() { return wrapperContained.NOVICE_BUY_XP; }
// public int APPRENTICE_SELL_XP() { return wrapperContained.APPRENTICE_SELL_XP; }
// public int APPRENTICE_BUY_XP() { return wrapperContained.APPRENTICE_BUY_XP; }
// public int JOURNEYMAN_SELL_XP() { return wrapperContained.JOURNEYMAN_SELL_XP; }
// public int JOURNEYMAN_BUY_XP() { return wrapperContained.JOURNEYMAN_BUY_XP; }
// public int EXPERT_SELL_XP() { return wrapperContained.EXPERT_SELL_XP; }
// public int EXPERT_BUY_XP() { return wrapperContained.EXPERT_BUY_XP; }
// public int MASTER_TRADE_XP() { return wrapperContained.MASTER_TRADE_XP; }
// public float LOW_PRICE_MULTIPLIER() { return wrapperContained.LOW_PRICE_MULTIPLIER; }
// public float HIGH_PRICE_MULTIPLIER() { return wrapperContained.HIGH_PRICE_MULTIPLIER; }
public java.util.Map REBALANCED_PROFESSION_TO_LEVELED_TRADE() { return wrapperContained.REBALANCED_PROFESSION_TO_LEVELED_TRADE; }
public java.util.List REBALANCED_WANDERING_TRADER_TRADES() { return wrapperContained.REBALANCED_WANDERING_TRADER_TRADES; }
// public Object SELL_DESERT_VILLAGE_MAP_TRADE() { return wrapperContained.SELL_DESERT_VILLAGE_MAP_TRADE; }
// public Object SELL_SAVANNA_VILLAGE_MAP_TRADE() { return wrapperContained.SELL_SAVANNA_VILLAGE_MAP_TRADE; }
// public Object SELL_PLAINS_VILLAGE_MAP_TRADE() { return wrapperContained.SELL_PLAINS_VILLAGE_MAP_TRADE; }
// public Object SELL_TAIGA_VILLAGE_MAP_TRADE() { return wrapperContained.SELL_TAIGA_VILLAGE_MAP_TRADE; }
// public Object SELL_SNOWY_VILLAGE_MAP_TRADE() { return wrapperContained.SELL_SNOWY_VILLAGE_MAP_TRADE; }
// public Object SELL_JUNGLE_TEMPLE_MAP_TRADE() { return wrapperContained.SELL_JUNGLE_TEMPLE_MAP_TRADE; }
// public Object SELL_SWAMP_HUT_MAP_TRADE() { return wrapperContained.SELL_SWAMP_HUT_MAP_TRADE; }
// public it.unimi.dsi.fastutil.ints.Int2ObjectMap copyToFastUtilMap(com.google.common.collect.ImmutableMap map) { return wrapperContained.copyToFastUtilMap(map); }
// public Object createMasterLibrarianTradeFactory() { return wrapperContained.createMasterLibrarianTradeFactory(); }
// public Object createLibrarianTradeFactory(int experience) { return wrapperContained.createLibrarianTradeFactory(experience); }
// public yarnwrap.item.ItemStack createPotionStack(yarnwrap.registry.entry.RegistryEntry potion) { return new yarnwrap.item.ItemStack(wrapperContained.createPotionStack(potion.wrapperContained)); }
// public yarnwrap.village.TradedItem createPotion(yarnwrap.registry.entry.RegistryEntry potion) { return new yarnwrap.village.TradedItem(wrapperContained.createPotion(potion.wrapperContained)); }

}