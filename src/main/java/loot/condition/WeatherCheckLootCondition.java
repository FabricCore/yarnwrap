package yarnwrap.loot.condition;
public class WeatherCheckLootCondition { public net.minecraft.loot.condition.WeatherCheckLootCondition wrapperContained; public WeatherCheckLootCondition(net.minecraft.loot.condition.WeatherCheckLootCondition wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Optional raining() { return wrapperContained.raining; }
// public java.util.Optional thundering() { return wrapperContained.thundering; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public java.util.Optional raining() { return wrapperContained.raining(); }
// public java.util.Optional thundering() { return wrapperContained.thundering(); }
public Object create() { return wrapperContained.create(); }

}